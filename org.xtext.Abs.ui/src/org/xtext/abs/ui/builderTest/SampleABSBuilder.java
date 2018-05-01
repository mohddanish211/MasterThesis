package org.xtext.abs.ui.builderTest;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IOConsoleInputStream;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.xtext.abs.Constants;
import org.xtext.abs.plugin.console.ConsoleManager;
import org.xtext.abs.plugin.console.ConsoleManager.MessageType;
import org.xtext.abs.plugin.console.MsgConsole;
import org.xtext.abs.plugin.internal.IncrementalModelBuilder;
import org.xtext.ui.CustomProjectPage;

import abs.backend.common.InternalBackendException;
import abs.common.WrongProgramArgumentException;
import abs.frontend.ast.Model;
import abs.frontend.delta.DeltaModellingException;

import static org.xtext.abs.UtilityFunctions.getSampleABSNature;
import static org.xtext.abs.UtilityFunctions.deleteRecursive;
import static org.xtext.abs.UtilityFunctions.isABSFile;
import static org.xtext.abs.Constants.MARKER_TYPE;
import static org.xtext.abs.Constants.JAVA_SOURCE_PATH;
import static org.xtext.abs.Constants.MAUDE_PATH;
//import static org.xtext.abs.Constants.PLUGIN_ID;
import static org.xtext.abs.CoreControlUnit.notifyBuildListener;

public class SampleABSBuilder extends IncrementalProjectBuilder {

	class SampleDeltaVisitor implements IResourceDeltaVisitor {

		final private HashSet<String> changedFiles;
		final private IProgressMonitor monitor;
		private final IncrementalModelBuilder modelbuilder = new IncrementalModelBuilder();

		public SampleDeltaVisitor(HashSet<String> changedFiles, IProgressMonitor monitor){
			this.changedFiles = changedFiles;
			this.monitor = monitor;
		}



		@Override
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			SampleABSNature nature = getSampleABSNature(resource);
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				if (nature.toIncludeInScope(resource)) {
					nature.parseABSFile(resource,false,monitor);
					changedFiles.add(resource.getFullPath().toString());
				}
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				if (nature.toIncludeInScope(resource)) {
					nature.parseABSFile(resource,false,monitor);
					changedFiles.add(resource.getFullPath().toString());
				}
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class SampleResourceVisitor implements IResourceVisitor {
		private final HashSet<String> changedFiles;
		private final IProgressMonitor monitor;
		public SampleResourceVisitor(IProgressMonitor monitor, HashSet<String> changedFiles){
			this.monitor = monitor;
			this.changedFiles = changedFiles;
		}

		@Override
		public boolean visit(IResource resource) throws CoreException{
			SampleABSNature nature = getSampleABSNature(resource);
			synchronized (nature.modelLock) {
				if(isABSFile(resource) && nature.toIncludeInScope(resource)){
					nature.parseABSFile(resource,false,monitor);
					changedFiles.add(resource.getFullPath().toString());
				}
			}
			return true;
		}
	}

	/*
	 * Eclipse Implementation of addMarker
	 * 
	 * private void addMarker(IFile file, String message, int lineNumber,
			int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
		}
	}

	 */

	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor)
			throws CoreException {

		
		final SampleABSNature nature = getSampleABSNature(getProject());
		synchronized (nature.modelLock) {
			nature.cleanModel();
			try {
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor monitor) throws CoreException,
					InvocationTargetException, InterruptedException {
						HashSet<String> changedFiles = new HashSet<String>();
						ConsoleManager.getDefault().clear();
						fullBuild(monitor, changedFiles);
						nature.typeCheckModel(monitor);
						notifyBuildListener(changedFiles);
						if (monitor != null)
							monitor.done();
						/*
						 * General Implementation
						 * 
						 * if (kind == IncrementalProjectBuilder.FULL_BUILD) {
					         fullBuild(monitor,changedFiles);
					      } else {
					         IResourceDelta delta = getDelta(getProject());
					         if (delta == null) {
					            fullBuild(monitor,changedFiles);
					         } else {
					            incrementalBuild(delta, monitor,changedFiles);
					         }
					      }*/
					}
				}.run(monitor);
			} catch (InvocationTargetException e) {
				throw new CoreException(new Status(IStatus.ERROR, Constants.PLUGIN_ID, "Build", e));
			} catch (InterruptedException e) {
			}
			return null;
		}
	}

	protected void clean(IProgressMonitor monitor) throws CoreException {
		/*Original Code delete markers set and files created
		//getProject().deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);*/
		SampleABSNature nature = getSampleABSNature(getProject());
		synchronized (nature.modelLock) {
			getProject().deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_INFINITE);
			nature.cleanModel();
			
			// delete all Java files and classes
			String javaPathString = nature.getProjectPreferenceStore().getString(JAVA_SOURCE_PATH);
			cleanGeneratedFiles(javaPathString);
			
			// delete all Maude files and classes
			String maudePathString = nature.getProjectPreferenceStore().getString(MAUDE_PATH);
			cleanGeneratedFiles(maudePathString);
			
			getProject().refreshLocal(IProject.DEPTH_INFINITE, monitor);
		}
	}
	
	
	private void cleanGeneratedFiles(String pathstring) {
		if(pathstring!=null){
			IPath path = new Path(pathstring);
			File dir;
			if (path.isAbsolute()){
				dir = new File(path.toOSString());
			} else {
				path=getProject().getLocation().append(path);
				dir=path.toFile();
			}
			if(dir.exists()){
				deleteRecursive(dir);
			}
		}
	}

	
	public static boolean isIdentifierChar(char c){
		return Character.isLetterOrDigit(c) || c=='_';
	}
	

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}
	
	protected void fullBuild(final IProgressMonitor monitor,HashSet<String> changedFiles)
			throws CoreException {
		try {
			getProject().accept(new SampleResourceVisitor(monitor,changedFiles));
			//abs.frontend.parser.Main compiler = new abs.frontend.parser.Main();
			/*compiler.mainMethod("/mnt/13bfdb9b-a7d7-4b10-876b-8940ff09b47e/Data_Drive/ICH_TUCAN_SUBJECTS/Thesis/SoftwareEngg/eclipse/runtime-EclipseApplication/AbsPlugin/src/Demopack/Delta.abs");;
			compiler.parseArgs(new String[] {});
			Model m = compiler.parse(changedFiles.toArray(new String[0]));*/
			
			//String [] args= {};
			
			//MessageConsoleStream out = myConsole			
			//Model m = compiler.parse(args);
			//out.println("Parsing Files!!!");
            //if (m.hasParserErrors() || m.hasErrors() || m.hasTypeErrors()) {
             // myConsole.activate();
            //}

		} catch (DeltaModellingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}

	
	protected void incrementalBuild(IResourceDelta delta,
		IProgressMonitor monitor,HashSet<String> changedFiles) throws CoreException {
		// the visitor does the work.
		System.out.println("Inside Incremental Build");
		delta.accept(new SampleDeltaVisitor(changedFiles, monitor));
		
	}

	protected void startupOnInitialize() {
		
	}


}

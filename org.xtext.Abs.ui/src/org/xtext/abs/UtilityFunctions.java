package org.xtext.abs;

import org.apache.log4j.Logger;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPersistentPreferenceStore;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;
import org.xtext.Abs.ui.internal.AbsActivator;
import org.xtext.abs.outline.ABSContentOutlineConstants.AnnotationType;
import org.xtext.abs.outline.PackageAbsFile;
import org.xtext.abs.outline.PackageEntry;
import org.xtext.abs.plugin.console.ConsoleManager;
import org.xtext.abs.plugin.console.ConsoleManager.MessageType;
import org.xtext.abs.plugin.console.MsgConsole;
import org.xtext.abs.outline.PackageContainer;
import org.xtext.abs.outline.PackageAbsFileEditorInput;
import org.xtext.abs.ui.builderTest.SampleABSNature;

import abs.frontend.ast.ASTNode;
import abs.frontend.ast.ClassDecl;
import abs.frontend.ast.Annotation;
import abs.frontend.ast.DataConstructorExp;
import abs.frontend.ast.ModuleDecl;
import abs.frontend.parser.ABSPackageFile;

import static org.xtext.abs.Constants.ABS_FILE_EXTENSION;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.rmi.activation.Activator;

public class UtilityFunctions {
	
	private static final Logger logger = Logger.getLogger(AbsActivator.class);
	
	public static class EditorPosition{
		private int linestart;
		private int colstart;
		private int lineend;
		private int colend;
		private IPath path;
		
		public int getLinestart() {
			return linestart;
		}
	
		public int getColstart() {
			return colstart;
		}
	
		public int getLineend() {
			return lineend;
		}
	
		public int getColend() {
			return colend;
		}
		
		public IFile getFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
		}
	
		public IPath getPath() {
			return path;
		}
	
		public EditorPosition(IPath path, int linestart, int colstart, int lineend, int colend) {
			this.path      = path;
			this.linestart = linestart;
			this.colstart  = colstart;
			this.lineend   = lineend;
			this.colend    = colend;
		}
	}

	public static SampleABSNature getSampleABSNature(IResource file){
		if(file==null)
			return null;
		return getAbsNature(file.getProject());
	}
	
	public static SampleABSNature getAbsNature(IProject project){
		try {
			if (project != null && project.isAccessible()){
				return (SampleABSNature)project.getNature(Constants.NATURE_ID);
			}
		} catch (CoreException e) {
			standardExceptionHandling(e);
			return null;
		}
		
		return null;
	}
	
	/**
	 * Wrapper method for {@link #getAbsNature(IProject)}
	 * 
	 * @param file
	 * @see #getAbsNature(IProject)
	 * @return The corresponding AbsNature of the file is returned, or null if
	 *         file is null
	 */
	public static SampleABSNature getAbsNature(IResource file){
		if(file==null)
			return null;
		return getAbsNature(file.getProject());
	}

	
	public static void standardExceptionHandling(Exception e){
		Logger.getLogger(Activator.class).error(e);
	}
	
	public static boolean isABSFile(IResource file){
		if (file != null && file instanceof IFile){ // TODO: IResource?
			return hasABSFileExtension(file) || isABSPackage((IFile)file);
		}
		
		return false;
	}
	
	
	public static boolean isABSSourceFile(IResource file){
	    if (file != null && file instanceof IFile) // TODO: IResource?
	       return hasABSFileExtension(file);
	    return false;
	}
	
	public static boolean hasABSFileExtension(IResource file){
		return file != null && ABS_FILE_EXTENSION.equals(file.getFileExtension());
	}
	
	
	public static boolean isABSPackage(File file) throws IOException {
		return file.exists() && new ABSPackageFile(file).isABSPackage();
	}
	
	// assumes file != null
		public static boolean isABSPackage(IFile file) {
			if (! "jar".equals(file.getFileExtension()))
				return false;

			try {
				return isABSPackage(file.getLocation().toFile());
			} catch (IOException e) {
				System.out.println("standardExceptionHandling(e)");
						//standardExceptionHandling(e);
				logger.error(e.getMessage(), e);
				return false;
			}
		}
		
		
		public static boolean deleteRecursive(File dir){
			if (dir.isDirectory()) {
				String[] children = dir.list();
				for (int i=0; i<children.length; i++) {
					boolean success = deleteRecursive(new File(dir, children[i]));
					if (!success) {
						return false;
					}
				}
			}
			// The directory is now empty so delete it 
			return dir.delete(); 
		}
		
		public static IPreferenceStore getDefaultPreferenceStore(){
			return ABSChildActivator.getDefault().getPreferenceStore();
		}
		
		
		public static void syncPreferenceStore(IPersistentPreferenceStore prefstore) {
			try {
				prefstore.save();
			} catch (IOException e) {
				standardExceptionHandling(e);
			}
		}

		
		/**
		 * Checks, whether a ModuleDecl has declarations
		 * @param m
		 * @return TRUE if a module declaration has
		 * <ul>
		 *  <li>Exports</li>
		 *  <li>Imports</li>
		 *  <li>MainBlock</li>
		 * </ul>
		 *  declarations,<br/>
		 * FALSE if m is null or the the module declarations
		 */
		public static boolean hasDecls(ModuleDecl m){
			if (m!=null){
				return (m.getNumDecl() > 0) ||
							(m.getNumExport() > 0) ||
							(m.getNumImport() > 1) ||
							(m.hasBlock());
			}else{
				return false;
			}
		}
		
		public static ITextEditor openABSEditorForFile(PackageAbsFile file){
			try {
				return (ITextEditor) IDE.openEditor(getActiveWorkbenchPage(),new PackageAbsFileEditorInput(file), Constants.EDITOR_ID);
			} catch (PartInitException e) {
				assert false : e;
			}
			return null;
		}
		
		
		public static IProject getAbsProjectFromWorkspace(String name) {
			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
			if (getAbsNature(p) != null) {
				return p;
			}
			return null;
		}
		
		
		/**
		 * A convenient method to reconstruct a {@link PackageAbsFile} from the absolute
		 * path to the ABS package and the name to the specific entry in the package.
		 * @param proj the project which the package belongs to
		 * @param pak
		 * @param entry
		 * @return 
		 */
		public static PackageAbsFile getPackageAbsFile(IProject proj, String pak, String entry) {
			File file = new File(pak);
			try {
				if (new ABSPackageFile(file).isABSPackage()) {
					
					PackageEntry pentry = null;
					if (proj != null) {
						SampleABSNature nature = getAbsNature(proj);
						for (PackageEntry e : nature.getPackages().getPackages()) {
							if (e.getPath().equals(file.getAbsolutePath())) {
								pentry = e;
								break;
							}
						}
					}
					
					if (pentry == null) {
						PackageContainer container = new PackageContainer();
						container.setProject(proj);
						
						pentry = new PackageEntry(
									container, 
									file.getName(), 
									file.getAbsolutePath(), 
									true);
					}
					
					return new PackageAbsFile(pentry, entry);
				}
			} catch (IOException e) {
				
			}
			return null;
		}
		
		private static IWorkbenchPage getActiveWorkbenchPage() {
			return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		}
		
		public static ITextEditor openABSEditorForFile(IPath path, IProject project){
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(path);
			if (!fileStore.fetchInfo().isDirectory() && fileStore.fetchInfo().exists()) {
			    try {
			        IEditorPart part = IDE.openEditorOnFileStore(getActiveWorkbenchPage(), fileStore);
			        // Could be an ErrorEditorPart:
			        if (part instanceof ITextEditor) {
			        	return (ITextEditor) part;
			        } else {
			        	throw new PartInitException("Couldn't open editor, sorry.");
			        }
			    } catch (PartInitException e) {
			    	standardExceptionHandling(e);
			    }
			} else if (path.toPortableString().startsWith("jar:file:") // works for windows systems
					|| path.segment(0).equals("jar:file:")) { // works for linux systems
				// TODO make conditions above cross platform.
				// a jar file
				try {
					String parts = new URI(path.toString()).getRawSchemeSpecificPart();
					String pak = new URI(parts.split("!/")[0]).getSchemeSpecificPart();
					String entry = parts.split("!/")[1];
					return openABSEditorForFile(getPackageAbsFile(project, pak, entry));
				} catch (URISyntaxException e) {
					standardExceptionHandling(e);
				}
			}
			return null;
		}
		
		public static EditorPosition getPosition(ASTNode<?> node){
			if (node != null){
				//Get the start position	
				int startLine = node.getStartLine() - 1;
				int startCol = node.getStartColumn() - 1;
				//Get the end position
				int endLine = node.getEndLine() - 1;
				int endCol = node.getEndColumn();
				return new EditorPosition(null,startLine,startCol,endLine,endCol);
			}
			
			return null;	
		}
		
		
		/**
		 * Returns the IPath of a ModuleDecl's compilation unit
		 * @param mDecl 
		 * @return IPath of a ModuleDecl's compilation unit
		 */
		public static IPath getPathOfModuleDecl(InternalASTNode<ModuleDecl> mDecl) {
			if (mDecl != null){
				IPath path = new Path(mDecl.getASTNode().getCompilationUnit().getFileName());
				return path;
			}
			return null;
		}
		
		 /**
	     * prints a message to the default console
	     */
		public static void printToConsole(String msg) {
		    MsgConsole c = ConsoleManager.getDefault();
		    c.println(msg, MessageType.MESSAGE_INFO);
		}
		
		public static boolean saveEditors(IProject project, boolean withConfirmation){
			IEditorPart[] dirtyEditors = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getDirtyEditors();
			if(dirtyEditors.length>0 && withConfirmation){
				boolean doit = MessageDialog.openQuestion(Display.getDefault().getActiveShell(), "Save modified files", "Should the modified files be saved?");
				if(!doit)
					return false;
			}
			boolean allsaved = true;
			for(IEditorPart iep : dirtyEditors){
				IResource editorFile = (IResource)iep.getEditorInput().getAdapter(IResource.class);
				if(editorFile!=null && editorFile.getProject().equals(project)){
					allsaved = allsaved && PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().saveEditor(iep, false);
				}
			}
			try {
				project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, null);
			} catch (CoreException e) {
				standardExceptionHandling(e);
			}
			return allsaved;
		}
		
		public static boolean saveEditor(IFile file, boolean withConfirmation){
			IEditorPart[] dirtyEditors = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getDirtyEditors();
			for(IEditorPart iep : dirtyEditors){
				IResource editorFile = (IResource)iep.getEditorInput().getAdapter(IResource.class);
				if(editorFile!=null && editorFile.equals(file)){
					return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().saveEditor(iep, withConfirmation);
				}
			}
			return true; //file was not dirty
		}

		
		/**
		 * Convenience method showing an error dialog with the given error message.
		 */
		public static void showErrorMessage(final String errorMessage){
			MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error", errorMessage);
		}

		/**
		 * shows an error dialog using asyncExec
		 */
		public static void showErrorMessageAsync(final String errorMessage){
		    Display.getDefault().asyncExec(new Runnable() {
	            @Override
	            public void run() {
	                MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error", errorMessage);
	            }
		    });
	    }
		
		
		/**
		 * Checks whether a class declaration has a <code>[...]</code> annotation
		 * with a specific content
		 * 
		 * @param cd
		 *            The classDecl to be checked
		 * @param type
		 *            the type of the annotation
		 * @return TRUE if cd has the respective annotation, FALSE else
		 */
		public static boolean hasClassAnnotation(ClassDecl cd, AnnotationType type) {

			for (Annotation ant : cd.getAnnotationList()) {
				if (ant.getNumChild() > 0) {

					if (ant.getChild(0) instanceof DataConstructorExp) {
						DataConstructorExp exp = (DataConstructorExp) ant.getChild(0);
						if (exp.getConstructor().equals(type.getAnnotationString())) {
							return true;
						}
					}

				}
			}
			return false;
		}
		
		
		public static IFile getFileOfModuleDecl(ModuleDecl m) {
			if (m != null) {
				Path path = new Path(m.getFileName());
				path.makeRelative();
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
				return file;
			}
			return null;
		}

}
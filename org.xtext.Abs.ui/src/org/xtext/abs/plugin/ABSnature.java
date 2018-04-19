package org.xtext.abs.plugin;
import org.eclipse.xtext.ui.editor.XtextEditor;

import abs.frontend.ast.CompilationUnit;
import abs.frontend.parser.ABSPackageFile;
import abs.frontend.parser.Main;
import abs.frontend.parser.ParserError;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtext.builder.nature.Messages;
import org.eclipse.xtext.builder.nature.NatureAddingEditorCallback;
import org.eclipse.xtext.builder.nature.ToggleXtextNatureCommand;
import org.eclipse.xtext.builder.nature.XtextNature;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback.NullImpl;
import org.eclipse.xtext.ui.util.DontAskAgainDialogs;
import org.xtext.abs.plugin.exceptions.*;
import org.xtext.abs.plugin.internal.IncrementalModelBuilder;
import org.xtext.abs.plugin.internal.NoModelException;

import com.google.inject.Inject;


@SuppressWarnings("restriction")
public class ABSnature extends NatureAddingEditorCallback implements IProjectNature {

	public static final String NATURE_ID = "absnature";
	private IProject project;
	@Inject
	private ToggleXtextNatureCommand toggleNature;
	private static final String ADD_XTEXT_NATURE = "add_xtext_nature";
	private static final String BUILDER_ID = "org.xtext.Abs.ui.sampleABSBuilder";
	private @Inject DontAskAgainDialogs dialogs;
	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		System.out.println("Running Inside");
		IResource resource = editor.getResource();
		if (resource != null && !toggleNature.hasNature(resource.getProject()) && resource.getProject().isAccessible()
				&& !resource.getProject().isHidden()) {
			String title = Messages.NatureAddingEditorCallback_MessageDialog_Title;
			String message = Messages.NatureAddingEditorCallback_MessageDialog_Msg0 + resource.getProject().getName()
					+ Messages.NatureAddingEditorCallback_MessageDialog_Msg1;
			boolean addNature = false;
			if (MessageDialogWithToggle.PROMPT.equals(dialogs.getUserDecision(ADD_XTEXT_NATURE))) {
				int userAnswer = dialogs.askUser(message, title, ADD_XTEXT_NATURE, editor.getEditorSite().getShell());
				if (userAnswer == IDialogConstants.YES_ID) {
					addNature = true;
				} else if (userAnswer == IDialogConstants.CANCEL_ID) {
					return;
				}
			} else if (MessageDialogWithToggle.ALWAYS.equals(dialogs.getUserDecision(ADD_XTEXT_NATURE))) {
				addNature = true;
			}
			if (addNature) {
				toggleNature.toggleNature(resource.getProject());
			}
		}
	}
	
	private final IncrementalModelBuilder modelbuilder = new IncrementalModelBuilder();
	
	
	
	
	public static XtextNature getAbsNature(IResource file){
		if(file==null)
			return null;
		return getAbsNature(file.getProject());
	}
	

	public void parseABSFile(IResource resource, final boolean withincomplete, IProgressMonitor monitor) {
		if (resource.exists()) {
			final IFile file = (IFile) resource;
			assert file.exists();
			try {
				// Markers modify the workspace:
				new WorkspaceModifyOperation() {

					@Override
					protected void execute(IProgressMonitor monitor) throws CoreException,
					InvocationTargetException, InterruptedException {
						/* Only delete PARSE-markers first: if we've just been launched,
						 * we don't want to erase persistent markers, since type-errors etc.
						 * only come back through an explicit build, which doesn't happen
						 * on launching Eclipse even with auto-build. [stolz] 
						 */
						file.deleteMarkers("", true, IResource.DEPTH_ZERO);
						try {
							if (!file.isSynchronized(IResource.DEPTH_ZERO)) {
								file.refreshLocal(IResource.DEPTH_ZERO, monitor);
							}

							Main m = new Main();
							m.setWithStdLib(true);

							List<CompilationUnit> units = new ArrayList<CompilationUnit>();
							if (isABSPackage(file)) {
								units.addAll(m.parseABSPackageFile(file.getLocation().toFile()));
							} else {
								CompilationUnit cu = m.parseUnit(file.getLocation().toFile(), null, new InputStreamReader(file.getContents()));
								cu.setName(file.getLocation().toFile().getAbsolutePath());
								units.add(cu);
							}
							modelbuilder.addCompilationUnits(units);

							for (CompilationUnit cu : units) {
								if(cu.hasParserErrors()){
									for(ParserError err : cu.getParserErrors()){
										// Check addMarker(file, err);
									}
								}
							}
						} catch(NoModelException e){
							//ignore
						} catch (CoreException e) {
							throw e;
						}catch (Exception e) {
							throw new InvocationTargetException(e);
						}
					}
				}.run(monitor);
			} catch (InvocationTargetException e) {
				System.out.println(e);
			} catch (InterruptedException e) {
			}
		} else
			assert false : resource;
	}
	
	
	
	
	public void parseABSFile(File file, boolean withincomplete,
			Object monitor) {
		Main m = new Main();
		m.setWithStdLib(true);

		List<CompilationUnit> units = new ArrayList<CompilationUnit>();
		try {
			final File f = new File(file.getAbsolutePath());
			assert f.exists();
			units.addAll(m.parseABSPackageFile(f));
			modelbuilder.addCompilationUnits(units);
		} catch (IOException e) {
			System.out.println("Exception in ABSNature parseAbsFile"+e);
		} catch (NoModelException e) {
		}
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
				return false;
			}
		}


		@Override
		public void configure() throws CoreException {
			System.out.println("Inside nature");
			IProjectDescription desc = project.getDescription();
			ICommand[] commands = desc.getBuildSpec();

			for (int i = 0; i < commands.length; ++i) {
				if (commands[i].getBuilderName().equals(BUILDER_ID)) {
					return;
				}
			}

			ICommand[] newCommands = new ICommand[commands.length + 1];
			System.arraycopy(commands, 0, newCommands, 0, commands.length);
			ICommand command = desc.newCommand();
			command.setBuilderName(BUILDER_ID);
			newCommands[newCommands.length - 1] = command;
			desc.setBuildSpec(newCommands);
			project.setDescription(desc, null);
			
		}


		@Override
		public void deconfigure() throws CoreException {
			System.out.println("Inside nature");
			// TODO Auto-generated method stub
			
		}


		@Override
		public IProject getProject() {
			System.out.println("Inside nature");
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public void setProject(IProject project) {
			System.out.println("Inside nature");
			// TODO Auto-generated method stub
			
		}

}

package org.xtext.ui;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.xtext.abs.Constants;
import org.xtext.ui.wizard.AbsNewProjectWizardInitialContents;
//import org.xtext.ui.wizard.AbsProjectCreator;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;

public class CustomProjectPage{ //extends AbsProjectCreator {
	
	/*@Inject
	private AbsNewProjectWizardInitialContents initialContents;
	@Inject
	private IOutputConfigurationProvider outputConfigurationProvider;
	
/*	public static MsgConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MsgConsole) existing[i];
		//no console found, so create a new one
		MsgConsole myConsole = new MsgConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		System.setOut(new PrintStream(myConsole.getOutputStream(MessageType.MESSAGE_INFO)));
		
//		try {
			IOConsoleInputStream str = myConsole.getInputStream();
			//str.reset();
			System.setIn(str);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//defaultConsole = mc;
		return myConsole;
	}

	//@Override
	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		//IFileSystemAccess2 access = getFileSystemAccess(project, monitor);
		//initialContents.generateInitialContents(access);
		try {
		      IProjectDescription description = project.getDescription();
		      String[] natures = description.getNatureIds();
		      String[] newNatures = new String[natures.length + 1];
		      System.arraycopy(natures, 0, newNatures, 0, natures.length);
		      System.out.println("..................");
		      for(String s: newNatures) {
		    	  System.out.println(s);
		      }
		      newNatures[natures.length] = Constants.NATURE_ID;
		      description.setNatureIds(newNatures);
		      project.setDescription(description, null);
		   } catch (CoreException e) {
			   System.out.println("error in nature");
		      // Something went wrong
		   }
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
	
	@Override
	protected List<String> getAllFolders() {
		Set<OutputConfiguration> outputConfigurations = outputConfigurationProvider.getOutputConfigurations();
		String outputFolder = "gen";
		for (OutputConfiguration outputConfiguration : outputConfigurations) {
			if (IFileSystemAccess.DEFAULT_OUTPUT.equals(outputConfiguration.getName())) {
				outputFolder = outputConfiguration.getOutputDirectory();
				break;
			}
		}
		//return ImmutableList.of(getModelFolderName(), outputFolder);
	}*/

}

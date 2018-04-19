package org.xtext.abs.wizards;

import org.xtext.abs.ui.builderTest.SampleABSNature;
import org.xtext.abs.editor.ABSEditor;
import org.xtext.abs.navigator.ModulePath;
import org.xtext.abs.outline.ABSContentOutlineUtils;
import org.xtext.abs.Constants;
import org.xtext.abs.InternalASTNode;
import org.xtext.abs.UtilityFunctions;
import org.xtext.abs.wizards.WizardUtil.InsertType;
import org.xtext.abs.wizards.pages.NewModuleWizardPage;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.texteditor.ITextEditor;

import abs.frontend.ast.ModuleDecl;

/**
 * Wizard for creating modules on existing files
 * @author cseise	
 */
public class NewModuleWizard extends ABSNewWizard implements INewWizard {
	
	private NewModuleWizardPage page;
	private IProject project;
	private Object firstSelection;
	
	public NewModuleWizard() {
		insertType = InsertType.INSERT_MODULE;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle("New ABS class");
		firstSelection = selection.getFirstElement();
		SampleABSNature nature = ABSContentOutlineUtils.getNatureForObject(firstSelection);
		if (nature != null){
			project = nature.getProject();
		}
			
	}
	
	@Override
	public void addPages(){
		page = new NewModuleWizardPage("New Module",project);
		setInitialInput();
		page.setDescription("Create a new ABS Module in an existing ABS file");
		page.setTitle("New ABS Module");
		addPage(page);
		
	}
	
	private void setInitialInput(){
		if (firstSelection instanceof IFile){
			IFile file = (IFile) firstSelection;
			if (file.getName().endsWith("." + Constants.ABS_FILE_EXTENSION)){
				page.setInitialFileResource(file);
			}
		}else if (firstSelection instanceof InternalASTNode<?>){
			InternalASTNode<?> node = (InternalASTNode<?>) firstSelection;
			if (node.hasASTNodeOfType(ModuleDecl.class)){
				ModuleDecl m = (ModuleDecl) node.getASTNode();
				page.setInitialValue(m.getName() + ".");
				IFile file = UtilityFunctions.getFileOfModuleDecl(m);
				page.setInitialFileResource(file);	
			}
		}else if (firstSelection instanceof ModulePath){
			ModulePath mp = (ModulePath) firstSelection;
			page.setInitialValue(mp.getModulePath() + ".");
			InternalASTNode<ModuleDecl> moduleDecl = mp.getModuleDecl();
			if (moduleDecl.hasASTNodeOfType(ModuleDecl.class)){
				IFile fileOfModuleDecl = UtilityFunctions.getFileOfModuleDecl(mp.getModuleDecl().getASTNode());
				page.setInitialFileResource(fileOfModuleDecl);
			}
		}
	}
	
	@Override
	public boolean performFinish() {
			IFile resultFile = page.getResultFile();
			if (resultFile != null){
				ITextEditor editor = UtilityFunctions.openABSEditorForFile(resultFile.getLocation(), resultFile.getProject());
				IDocument document = editor.getDocumentProvider().getDocument(editor.getEditorInput());
				
				//modules are always added the the end of the document
				final int off = document.getLength();
				
				try {
					document.replace(off, 0, insertType.getInsertionString(page.getResult()));
					final int insertOffset = insertType.getInsertOffset(page.getResult());
					
					WizardUtil.saveEditorAndGotoOffset(editor, insertOffset);
					
					return true;
				} catch (BadLocationException e) {
					MessageDialog.openError(getShell(), "Error", "Fatal error: The insertion position for the new module does not longer exist. Please save the target file and try again.");
					e.printStackTrace();
					return false;
				}							
			}else{
					MessageDialog.openError(getShell(), "Error", "Fatal error: No file reference was passed by the wizard. Please try again to use the wizard and select a valid file.");
					return false;
			}
	}

}
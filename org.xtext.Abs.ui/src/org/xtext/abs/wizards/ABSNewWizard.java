package org.xtext.abs.wizards;

//import org.xtext.abs.WizardUtil.InsertType;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.xtext.abs.wizards.WizardUtil.InsertType;


/**
 * Class for providing common functionality to ABS wizards.
 *
 */
public abstract class ABSNewWizard extends Wizard implements INewWizard {

	protected String INSERT_STRING1 = "";
	protected String INSERT_STRING2 = "";
	protected int INSERT_OFFSET = 0;
	
	protected IWorkbench workbench;
	
	protected InsertType insertType;
	
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection){
		this.workbench = workbench;
	}

	@Override
	public abstract boolean performFinish();

}
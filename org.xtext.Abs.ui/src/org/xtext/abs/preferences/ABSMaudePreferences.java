package org.xtext.abs.preferences;

import static org.xtext.abs.Constants.MAUDE_EXEC_PATH;
import static org.xtext.abs.UtilityFunctions.getDefaultPreferenceStore;

import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Preference page for global Maude preferences, i.e. the path of the Maude executable
 * @author tfischer
 */
public class ABSMaudePreferences extends PreferencePage implements IWorkbenchPreferencePage{

	private FileFieldEditor maudePath;

	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(getDefaultPreferenceStore());		
		setDescription("Choose Maude preferences here");
	}

	@Override
	protected Control createContents(Composite parent) {
		GridLayout gridLayout = new GridLayout(1, false);
		parent.setLayout(gridLayout);
		
		final Composite maudePathContainer   = new Composite(parent, SWT.NONE);
		
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		maudePathContainer.setLayoutData(gridData);

		maudePath = new FileFieldEditor(MAUDE_EXEC_PATH, "MaudePath", maudePathContainer);
		maudePath.setPreferenceStore(getDefaultPreferenceStore());
		maudePath.load();

		return parent;
	}
	
	@Override
	public void performDefaults(){
		maudePath.loadDefault();
		super.performDefaults();
	}
	
	@Override
	public boolean performOk(){
		maudePath.store();
		return super.performOk();
	}
}
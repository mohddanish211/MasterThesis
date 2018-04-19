package org.xtext.abs.preferences;

import static org.xtext.abs.Constants.MAVEN_EXEC_PATH;
import static org.xtext.abs.UtilityFunctions.getDefaultPreferenceStore;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * 
 * @author pwong
 *
 */
public class ABSMavenPreferences extends PreferencePage implements
		IWorkbenchPreferencePage {

	private DirectoryFieldEditor mavenPath;

	public void init(IWorkbench workbench) {
		setPreferenceStore(getDefaultPreferenceStore());		
		setDescription("Choose Maven preferences here");
	}

	protected Control createContents(Composite parent) {
		GridLayout gridLayout = new GridLayout(1, false);
		parent.setLayout(gridLayout);
		
		final Composite mavenPathContainer   = new Composite(parent, SWT.NONE);
		
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		mavenPathContainer.setLayoutData(gridData);

		mavenPath = new DirectoryFieldEditor(MAVEN_EXEC_PATH, "Maven Installation", mavenPathContainer);
		mavenPath.setPreferenceStore(getDefaultPreferenceStore());
		mavenPath.load();

		return parent;
	}
	
	@Override
	public void performDefaults(){
		mavenPath.loadDefault();
		super.performDefaults();
	}
	
	@Override
	public boolean performOk(){
		mavenPath.store();
		return super.performOk();
	}

}
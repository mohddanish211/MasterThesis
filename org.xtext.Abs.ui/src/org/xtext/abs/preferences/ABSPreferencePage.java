package org.xtext.abs.preferences;

import static org.xtext.abs.UtilityFunctions.*;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Preference page for global ABS preferences. This page contains no entries.
 * 
 */
public class ABSPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage{
	
	@Override
	public void init(IWorkbench workbench) {
		setDescription("Please select a subentry to modify global preferences");
		setPreferenceStore(getDefaultPreferenceStore());
		noDefaultAndApplyButton();
	}

	@Override
	protected void createFieldEditors() {
		//reserved for future use
	}
}
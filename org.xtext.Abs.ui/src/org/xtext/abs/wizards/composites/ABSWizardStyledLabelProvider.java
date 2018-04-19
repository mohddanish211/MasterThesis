package org.xtext.abs.wizards.composites;

import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;

import static org.xtext.abs.Constants.STYLER_BLACK;

import org.xtext.abs.navigator.ABSNavigatorStyledLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledString;

import abs.frontend.ast.ModuleDecl;

/**
 * Slightly altered version of the {@link ABSNavigatorStyledLabelProvider} that
 * prints the full name of ModuleDecls
 * 
 * @author cseise
 * 
 */
public class ABSWizardStyledLabelProvider extends ABSNavigatorStyledLabelProvider implements ILabelProvider {

	@Override
	protected StyledString getStyledString(Object obj) {
		StyledString styledString;
		if (obj instanceof ModuleDecl) {
			String name = ((ModuleDecl) obj).getName();

			styledString = new StyledString(name, STYLER_BLACK);
		} else {
			styledString = super.getStyledString(obj);
		}
		return styledString;
	}
}
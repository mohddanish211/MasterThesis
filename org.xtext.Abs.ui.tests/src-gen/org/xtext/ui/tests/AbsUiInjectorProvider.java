/*
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.Abs.ui.internal.AbsActivator;

public class AbsUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AbsActivator.getInstance().getInjector("org.xtext.Abs");
	}

}

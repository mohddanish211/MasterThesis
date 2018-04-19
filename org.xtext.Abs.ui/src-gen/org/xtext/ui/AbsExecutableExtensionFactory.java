/*
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.Abs.ui.internal.AbsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AbsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(AbsActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		AbsActivator activator = AbsActivator.getInstance();
		return activator != null ? activator.getInjector(AbsActivator.ORG_XTEXT_ABS) : null;
	}

}

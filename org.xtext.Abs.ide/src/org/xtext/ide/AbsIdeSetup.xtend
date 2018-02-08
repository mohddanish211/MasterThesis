/*
 * generated by Xtext 2.13.0
 */
package org.xtext.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.AbsRuntimeModule
import org.xtext.AbsStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class AbsIdeSetup extends AbsStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new AbsRuntimeModule, new AbsIdeModule))
	}
	
}

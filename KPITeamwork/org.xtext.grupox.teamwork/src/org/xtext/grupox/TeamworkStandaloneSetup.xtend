/*
 * generated by Xtext 2.10.0
 */
package org.xtext.grupox


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TeamworkStandaloneSetup extends TeamworkStandaloneSetupGenerated {

	def static void doSetup() {
		new TeamworkStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}

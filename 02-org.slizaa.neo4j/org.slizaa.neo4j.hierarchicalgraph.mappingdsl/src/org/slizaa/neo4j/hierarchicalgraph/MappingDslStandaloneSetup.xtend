/*
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.hierarchicalgraph


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MappingDslStandaloneSetup extends MappingDslStandaloneSetupGenerated {

	def static void doSetup() {
		new MappingDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}

/*
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.tests

import org.junit.Test
import org.junit.Ignore

class DependencyQueriesTest extends AbstractMappingDslParsingTest {

	@Test
	@Ignore
	def void loadModel() {
		test('''
			mapping org.slizza.jqassistant.java.HierachicalPackagesMapping {
				structure {
					
					topLevelNodeQueries {
						"MATCH (n) RETURN n"
					}
					
					dependencyQueries {
						
						"MATCH (n) RETURN n"
						
						aggregatedDependencyQuery {
							"MATCH (n) RETURN n"
							onResolve {
								"MATCH (n) RETURN n"
							}
						}
						
					}
				}
			}
		''')
	}
}

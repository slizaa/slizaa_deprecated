/**
 */
package org.slizaa.neo4j.hierarchicalgraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage
 * @generated
 */
public interface Neo4jHierarchicalgraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Neo4jHierarchicalgraphFactory eINSTANCE = org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Neo4 JBacked Node Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo4 JBacked Node Source</em>'.
	 * @generated
	 */
	Neo4JBackedNodeSource createNeo4JBackedNodeSource();

	/**
	 * Returns a new object of class '<em>Neo4 JBacked Root Node Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo4 JBacked Root Node Source</em>'.
	 * @generated
	 */
	Neo4JBackedRootNodeSource createNeo4JBackedRootNodeSource();

	/**
	 * Returns a new object of class '<em>Neo4 JRemote Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo4 JRemote Repository</em>'.
	 * @generated
	 */
	Neo4JRemoteRepository createNeo4JRemoteRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Neo4jHierarchicalgraphPackage getNeo4jHierarchicalgraphPackage();

} //Neo4jHierarchicalgraphFactory

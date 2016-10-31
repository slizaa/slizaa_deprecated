/**
 */
package org.slizaa.neo4j.restclient;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.restclient.Neo4jRestClientPackage
 * @generated
 */
public interface Neo4jRestClientFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Neo4jRestClientFactory eINSTANCE = org.slizaa.neo4j.restclient.impl.Neo4jRestClientFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Neo4j Rest Client</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neo4j Rest Client</em>'.
   * @generated
   */
  Neo4jRestClient createNeo4jRestClient();

  /**
   * Returns a new object of class '<em>Registry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Registry</em>'.
   * @generated
   */
  Neo4jRestClientRegistry createNeo4jRestClientRegistry();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Neo4jRestClientPackage getNeo4jRestClientPackage();

} //Neo4jRestClientFactory

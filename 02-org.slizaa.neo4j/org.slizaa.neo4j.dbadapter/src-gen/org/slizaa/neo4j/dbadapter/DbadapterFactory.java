/**
 */
package org.slizaa.neo4j.dbadapter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage
 * @generated
 */
public interface DbAdapterFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DbAdapterFactory eINSTANCE = org.slizaa.neo4j.dbadapter.impl.DbAdapterFactoryImpl.init();

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
  DbAdapterRegistry createDbAdapterRegistry();

  /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
  DbAdapterContainer createDbAdapterContainer();

  /**
   * Returns a new object of class '<em>Managed Neo4j Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Managed Neo4j Instance</em>'.
   * @generated
   */
  ManagedNeo4jInstance createManagedNeo4jInstance();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DbAdapterPackage getDbAdapterPackage();

} //DbAdapterFactory

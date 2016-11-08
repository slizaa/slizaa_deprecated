/**
 */
package org.slizaa.neo4j.dbadapter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.dbadapter.DbadapterPackage
 * @generated
 */
public interface DbadapterFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DbadapterFactory eINSTANCE = org.slizaa.neo4j.dbadapter.impl.DbadapterFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Neo4j Rest Client</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neo4j Rest Client</em>'.
   * @generated
   */
  Neo4jRestClient createNeo4jRestClient();

  /**
   * Returns a new object of class '<em>Db Adapter Registry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Db Adapter Registry</em>'.
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
  DbadapterContainer createDbadapterContainer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DbadapterPackage getDbadapterPackage();

} //DbadapterFactory

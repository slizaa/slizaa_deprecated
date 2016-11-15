/**
 */
package org.slizaa.neo4j.dbadapter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getManaged <em>Managed</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getUnmanaged <em>Unmanaged</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterRegistry()
 * @model
 * @generated
 */
public interface DbAdapterRegistry extends EObject {
  /**
   * Returns the value of the '<em><b>Managed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Managed</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Managed</em>' containment reference.
   * @see #setManaged(DbAdapterContainer)
   * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterRegistry_Managed()
   * @model containment="true" required="true"
   * @generated
   */
  DbAdapterContainer<ManagedNeo4jInstance> getManaged();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getManaged <em>Managed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Managed</em>' containment reference.
   * @see #getManaged()
   * @generated
   */
  void setManaged(DbAdapterContainer<ManagedNeo4jInstance> value);

  /**
   * Returns the value of the '<em><b>Unmanaged</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unmanaged</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unmanaged</em>' containment reference.
   * @see #setUnmanaged(DbAdapterContainer)
   * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterRegistry_Unmanaged()
   * @model containment="true" required="true"
   * @generated
   */
  DbAdapterContainer<Neo4jRestClient> getUnmanaged();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getUnmanaged <em>Unmanaged</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unmanaged</em>' containment reference.
   * @see #getUnmanaged()
   * @generated
   */
  void setUnmanaged(DbAdapterContainer<Neo4jRestClient> value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model required="true"
   * @generated
   */
  boolean hasHierarchicalGraph();

} // DbAdapterRegistry

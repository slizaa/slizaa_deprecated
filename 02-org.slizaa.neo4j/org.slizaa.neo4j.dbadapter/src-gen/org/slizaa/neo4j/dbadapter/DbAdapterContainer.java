/**
 */
package org.slizaa.neo4j.dbadapter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getChildren <em>Children</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterContainer()
 * @model
 * @generated
 */
public interface DbAdapterContainer<T extends Neo4jRestClient> extends EObject {
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterContainer_Children()
   * @model containment="true"
   * @generated
   */
  EList<T> getChildren();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterContainer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // DbAdapterContainer

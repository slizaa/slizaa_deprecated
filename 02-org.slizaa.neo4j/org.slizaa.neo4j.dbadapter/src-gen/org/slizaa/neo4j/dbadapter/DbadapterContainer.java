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
 *   <li>{@link org.slizaa.neo4j.dbadapter.DbadapterContainer#getClients <em>Clients</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.DbadapterContainer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getDbadapterContainer()
 * @model
 * @generated
 */
public interface DbadapterContainer extends EObject {
  /**
   * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clients</em>' containment reference list.
   * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getDbadapterContainer_Clients()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getClients();

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
   * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getDbadapterContainer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.DbadapterContainer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // DbadapterContainer

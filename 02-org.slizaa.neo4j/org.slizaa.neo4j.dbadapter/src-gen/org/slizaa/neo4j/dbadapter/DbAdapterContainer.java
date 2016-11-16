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
 *   <li>{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getType <em>Type</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getParent <em>Parent</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterContainer()
 * @model
 * @generated
 */
public interface DbAdapterContainer extends EObject {
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.slizaa.neo4j.dbadapter.ContainerType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.slizaa.neo4j.dbadapter.ContainerType
   * @see #setType(ContainerType)
   * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterContainer_Type()
   * @model
   * @generated
   */
  ContainerType getType();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.slizaa.neo4j.dbadapter.ContainerType
   * @see #getType()
   * @generated
   */
  void setType(ContainerType value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.slizaa.neo4j.dbadapter.Neo4jRestClient}.
   * It is bidirectional and its opposite is '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterContainer_Children()
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<Neo4jRestClient> getChildren();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(DbAdapterRegistry)
   * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage#getDbAdapterContainer_Parent()
   * @see org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getChildren
   * @model opposite="children" transient="false"
   * @generated
   */
  DbAdapterRegistry getParent();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(DbAdapterRegistry value);

} // DbAdapterContainer

/**
 */
package org.slizaa.neo4j.restclient;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Client Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.restclient.RestClientContainer#getClients <em>Clients</em>}</li>
 *   <li>{@link org.slizaa.neo4j.restclient.RestClientContainer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.restclient.Neo4jRestClientPackage#getRestClientContainer()
 * @model
 * @generated
 */
public interface RestClientContainer extends EObject {
  /**
   * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
   * The list contents are of type {@link org.slizaa.neo4j.restclient.Neo4jRestClient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clients</em>' containment reference list.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClientPackage#getRestClientContainer_Clients()
   * @model containment="true"
   * @generated
   */
  EList<Neo4jRestClient> getClients();

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
   * @see org.slizaa.neo4j.restclient.Neo4jRestClientPackage#getRestClientContainer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.restclient.RestClientContainer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // RestClientContainer

/**
 */
package org.slizaa.neo4j.restclient;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.slizaa.neo4j.restclient.Neo4jRestClientRegistry#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.restclient.Neo4jRestClientPackage#getNeo4jRestClientRegistry()
 * @model
 * @generated
 */
public interface Neo4jRestClientRegistry extends EObject {
  /**
   * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
   * The list contents are of type {@link org.slizaa.neo4j.restclient.Neo4jRestClient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clients</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clients</em>' containment reference list.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClientPackage#getNeo4jRestClientRegistry_Clients()
   * @model containment="true"
   * @generated
   */
  EList<Neo4jRestClient> getClients();

} // Neo4jRestClientRegistry

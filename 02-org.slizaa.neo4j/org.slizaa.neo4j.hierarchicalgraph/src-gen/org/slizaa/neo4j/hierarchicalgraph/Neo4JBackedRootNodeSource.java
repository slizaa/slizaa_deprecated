/**
 */
package org.slizaa.neo4j.hierarchicalgraph;

import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo4 JBacked Root Node Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JBackedRootNodeSource()
 * @model
 * @generated
 */
public interface Neo4JBackedRootNodeSource extends Neo4JBackedNodeSource {
  /**
   * Returns the value of the '<em><b>Repository</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository</em>' reference.
   * @see #setRepository(Neo4jRestClient)
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JBackedRootNodeSource_Repository()
   * @model required="true"
   * @generated
   */
  Neo4jRestClient getRepository();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource#getRepository <em>Repository</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository</em>' reference.
   * @see #getRepository()
   * @generated
   */
  void setRepository(Neo4jRestClient value);

} // Neo4JBackedRootNodeSource

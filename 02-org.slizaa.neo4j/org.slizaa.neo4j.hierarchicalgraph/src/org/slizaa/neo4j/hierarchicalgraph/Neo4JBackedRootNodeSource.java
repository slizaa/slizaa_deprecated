/**
 */
package org.slizaa.neo4j.hierarchicalgraph;


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
   * Returns the value of the '<em><b>Repository</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Repository</em>' attribute.
   * @see #setRepository(Object)
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getNeo4JBackedRootNodeSource_Repository()
   * @model
   * @generated
   */
	Object getRepository();

	/**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource#getRepository <em>Repository</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository</em>' attribute.
   * @see #getRepository()
   * @generated
   */
	void setRepository(Object value);

} // Neo4JBackedRootNodeSource

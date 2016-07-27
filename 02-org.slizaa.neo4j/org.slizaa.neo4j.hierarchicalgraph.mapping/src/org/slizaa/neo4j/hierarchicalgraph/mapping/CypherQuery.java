/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cypher Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.CypherQuery#getCypherQuery <em>Cypher Query</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getCypherQuery()
 * @model
 * @generated
 */
public interface CypherQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Cypher Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cypher Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cypher Query</em>' attribute.
	 * @see #setCypherQuery(String)
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getCypherQuery_CypherQuery()
	 * @model required="true"
	 * @generated
	 */
	String getCypherQuery();

	/**
	 * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.CypherQuery#getCypherQuery <em>Cypher Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cypher Query</em>' attribute.
	 * @see #getCypherQuery()
	 * @generated
	 */
	void setCypherQuery(String value);

} // CypherQuery

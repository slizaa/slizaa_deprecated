/**
 */
package org.slizaa.neo4j.hierarchicalgraph;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.Map;

import java.util.concurrent.Future;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INeo4 JRepository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository#getHierarchicalGraphs <em>Hierarchical Graphs</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getINeo4JRepository()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface INeo4JRepository extends EObject {
	/**
   * Returns the value of the '<em><b>Hierarchical Graphs</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGRootNode}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchical Graphs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Hierarchical Graphs</em>' reference list.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#getINeo4JRepository_HierarchicalGraphs()
   * @model transient="true"
   * @generated
   */
	EList<HGRootNode> getHierarchicalGraphs();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.hierarchicalgraph.JsonArray" nodeIdRequired="true"
   * @generated
   */
	JsonArray getNodeLabels(long nodeId);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.hierarchicalgraph.JsonObject" nodeIdRequired="true"
   * @generated
   */
	JsonObject getNodeProperties(long nodeId);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.hierarchicalgraph.Future<org.slizaa.neo4j.hierarchicalgraph.JsonObject>"
   * @generated
   */
	Future<JsonObject> executeCypherQuery(String cypherQuery);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.hierarchicalgraph.Future<org.slizaa.neo4j.hierarchicalgraph.JsonObject>"
   * @generated
   */
	Future<JsonObject> executeCypherQuery(String cypherQuery, Map<String, String> params);

} // INeo4JRepository

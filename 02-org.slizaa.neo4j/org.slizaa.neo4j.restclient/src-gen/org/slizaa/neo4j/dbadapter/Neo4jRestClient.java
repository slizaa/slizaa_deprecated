/**
 */
package org.slizaa.neo4j.dbadapter;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.Map;

import java.util.concurrent.Future;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo4j Rest Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getThreadPoolSize <em>Thread Pool Size</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getNeo4jRestClient()
 * @model
 * @generated
 */
public interface Neo4jRestClient extends EObject {
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
   * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getNeo4jRestClient_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Base URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base URI</em>' attribute.
   * @see #setBaseURI(String)
   * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getNeo4jRestClient_BaseURI()
   * @model
   * @generated
   */
  String getBaseURI();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getBaseURI <em>Base URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base URI</em>' attribute.
   * @see #getBaseURI()
   * @generated
   */
  void setBaseURI(String value);

  /**
   * Returns the value of the '<em><b>Thread Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thread Pool Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thread Pool Size</em>' attribute.
   * @see #setThreadPoolSize(int)
   * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#getNeo4jRestClient_ThreadPoolSize()
   * @model
   * @generated
   */
  int getThreadPoolSize();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getThreadPoolSize <em>Thread Pool Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thread Pool Size</em>' attribute.
   * @see #getThreadPoolSize()
   * @generated
   */
  void setThreadPoolSize(int value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void init();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void dispose();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<String> getAllRelationshipTypes();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<String> getAllPropertyKeys();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  EList<String> getAllLabels();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.dbadapter.JsonArray" nodeIdRequired="true"
   * @generated
   */
  JsonArray getLabelsForNode(long nodeId);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.dbadapter.JsonObject" nodeIdRequired="true"
   * @generated
   */
  JsonObject getPropertiesForNode(long nodeId);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.dbadapter.JsonObject" nodeIdRequired="true"
   * @generated
   */
  JsonObject getPropertiesForRelationship(long nodeId);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.dbadapter.Future<org.slizaa.neo4j.dbadapter.JsonObject>"
   * @generated
   */
  Future<JsonObject> executeCypherQuery(String cypherQuery);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.dbadapter.Future<org.slizaa.neo4j.dbadapter.JsonObject>"
   * @generated
   */
  Future<JsonObject> executeCypherQuery(String cypherQuery, Map<String, String> params);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.dbadapter.Future<?>" consumerDataType="org.slizaa.neo4j.dbadapter.Consumer<org.slizaa.neo4j.dbadapter.JsonObject>"
   * @generated
   */
  Future<?> executeCypherQuery(String cypherQuery, Consumer<JsonObject> consumer);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="org.slizaa.neo4j.dbadapter.Future<?>" consumerDataType="org.slizaa.neo4j.dbadapter.Consumer<org.slizaa.neo4j.dbadapter.JsonObject>"
   * @generated
   */
  Future<?> executeCypherQuery(String cypherQuery, Map<String, String> params, Consumer<JsonObject> consumer);

} // Neo4jRestClient

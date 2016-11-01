/**
 */
package org.slizaa.neo4j.restclient;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.restclient.Neo4jRestClientFactory
 * @model kind="package"
 * @generated
 */
public interface Neo4jRestClientPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "restclient";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org/slizaa/neo4j/restclient";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.slizaa.neo4j.restclient";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Neo4jRestClientPackage eINSTANCE = org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl.init();

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.restclient.impl.Neo4jRestClientImpl <em>Neo4j Rest Client</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientImpl
   * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getNeo4jRestClient()
   * @generated
   */
  int NEO4J_REST_CLIENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Base URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT__BASE_URI = 1;

  /**
   * The feature id for the '<em><b>Thread Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT__THREAD_POOL_SIZE = 2;

  /**
   * The number of structural features of the '<em>Neo4j Rest Client</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_FEATURE_COUNT = 3;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___INIT = 0;

  /**
   * The operation id for the '<em>Dispose</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___DISPOSE = 1;

  /**
   * The operation id for the '<em>Get All Relationship Types</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_ALL_RELATIONSHIP_TYPES = 2;

  /**
   * The operation id for the '<em>Get All Property Keys</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_ALL_PROPERTY_KEYS = 3;

  /**
   * The operation id for the '<em>Get All Labels</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_ALL_LABELS = 4;

  /**
   * The operation id for the '<em>Get Labels For Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_LABELS_FOR_NODE__LONG = 5;

  /**
   * The operation id for the '<em>Get Properties For Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_NODE__LONG = 6;

  /**
   * The operation id for the '<em>Get Properties For Relationship</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_RELATIONSHIP__LONG = 7;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING = 8;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP = 9;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_CONSUMER = 10;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP_CONSUMER = 11;

  /**
   * The operation id for the '<em>Has Extension</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___HAS_EXTENSION__CLASS = 12;

  /**
   * The operation id for the '<em>Get Extension</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_EXTENSION__CLASS = 13;

  /**
   * The operation id for the '<em>Register Extension</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___REGISTER_EXTENSION__CLASS = 14;

  /**
   * The number of operations of the '<em>Neo4j Rest Client</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_OPERATION_COUNT = 15;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.restclient.impl.Neo4jRestClientContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientContainerImpl
   * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getNeo4jRestClientContainer()
   * @generated
   */
  int NEO4J_REST_CLIENT_CONTAINER = 2;

  /**
   * The feature id for the '<em><b>Clients</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_CONTAINER__CLIENTS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_CONTAINER__NAME = 1;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_CONTAINER_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_CONTAINER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.restclient.impl.Neo4jRestClientRegistryImpl <em>Registry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientRegistryImpl
   * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getNeo4jRestClientRegistry()
   * @generated
   */
  int NEO4J_REST_CLIENT_REGISTRY = 1;

  /**
   * The feature id for the '<em><b>Clients</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_REGISTRY__CLIENTS = NEO4J_REST_CLIENT_CONTAINER__CLIENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_REGISTRY__NAME = NEO4J_REST_CLIENT_CONTAINER__NAME;

  /**
   * The number of structural features of the '<em>Registry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_REGISTRY_FEATURE_COUNT = NEO4J_REST_CLIENT_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Registry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_REGISTRY_OPERATION_COUNT = NEO4J_REST_CLIENT_CONTAINER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '<em>Future</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.concurrent.Future
   * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getFuture()
   * @generated
   */
  int FUTURE = 3;

  /**
   * The meta object id for the '<em>Consumer</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.function.Consumer
   * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getConsumer()
   * @generated
   */
  int CONSUMER = 4;

  /**
   * The meta object id for the '<em>Json Array</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.google.gson.JsonArray
   * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getJsonArray()
   * @generated
   */
  int JSON_ARRAY = 5;

  /**
   * The meta object id for the '<em>Json Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.google.gson.JsonObject
   * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getJsonObject()
   * @generated
   */
  int JSON_OBJECT = 6;


  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.restclient.Neo4jRestClient <em>Neo4j Rest Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neo4j Rest Client</em>'.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient
   * @generated
   */
  EClass getNeo4jRestClient();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#getName()
   * @see #getNeo4jRestClient()
   * @generated
   */
  EAttribute getNeo4jRestClient_Name();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#getBaseURI <em>Base URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base URI</em>'.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#getBaseURI()
   * @see #getNeo4jRestClient()
   * @generated
   */
  EAttribute getNeo4jRestClient_BaseURI();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#getThreadPoolSize <em>Thread Pool Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thread Pool Size</em>'.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#getThreadPoolSize()
   * @see #getNeo4jRestClient()
   * @generated
   */
  EAttribute getNeo4jRestClient_ThreadPoolSize();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#init()
   * @generated
   */
  EOperation getNeo4jRestClient__Init();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#dispose() <em>Dispose</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Dispose</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#dispose()
   * @generated
   */
  EOperation getNeo4jRestClient__Dispose();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#getAllRelationshipTypes() <em>Get All Relationship Types</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get All Relationship Types</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#getAllRelationshipTypes()
   * @generated
   */
  EOperation getNeo4jRestClient__GetAllRelationshipTypes();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#getAllPropertyKeys() <em>Get All Property Keys</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get All Property Keys</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#getAllPropertyKeys()
   * @generated
   */
  EOperation getNeo4jRestClient__GetAllPropertyKeys();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#getAllLabels() <em>Get All Labels</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get All Labels</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#getAllLabels()
   * @generated
   */
  EOperation getNeo4jRestClient__GetAllLabels();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#getLabelsForNode(long) <em>Get Labels For Node</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Labels For Node</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#getLabelsForNode(long)
   * @generated
   */
  EOperation getNeo4jRestClient__GetLabelsForNode__long();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#getPropertiesForNode(long) <em>Get Properties For Node</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Properties For Node</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#getPropertiesForNode(long)
   * @generated
   */
  EOperation getNeo4jRestClient__GetPropertiesForNode__long();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#getPropertiesForRelationship(long) <em>Get Properties For Relationship</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Properties For Relationship</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#getPropertiesForRelationship(long)
   * @generated
   */
  EOperation getNeo4jRestClient__GetPropertiesForRelationship__long();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#executeCypherQuery(java.lang.String) <em>Execute Cypher Query</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Execute Cypher Query</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#executeCypherQuery(java.lang.String)
   * @generated
   */
  EOperation getNeo4jRestClient__ExecuteCypherQuery__String();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.Map) <em>Execute Cypher Query</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Execute Cypher Query</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.Map)
   * @generated
   */
  EOperation getNeo4jRestClient__ExecuteCypherQuery__String_Map();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.function.Consumer) <em>Execute Cypher Query</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Execute Cypher Query</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.function.Consumer)
   * @generated
   */
  EOperation getNeo4jRestClient__ExecuteCypherQuery__String_Consumer();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.Map, java.util.function.Consumer) <em>Execute Cypher Query</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Execute Cypher Query</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.Map, java.util.function.Consumer)
   * @generated
   */
  EOperation getNeo4jRestClient__ExecuteCypherQuery__String_Map_Consumer();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#hasExtension(java.lang.Class) <em>Has Extension</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Has Extension</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#hasExtension(java.lang.Class)
   * @generated
   */
  EOperation getNeo4jRestClient__HasExtension__Class();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#getExtension(java.lang.Class) <em>Get Extension</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Extension</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#getExtension(java.lang.Class)
   * @generated
   */
  EOperation getNeo4jRestClient__GetExtension__Class();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.restclient.Neo4jRestClient#registerExtension(java.lang.Class) <em>Register Extension</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Register Extension</em>' operation.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClient#registerExtension(java.lang.Class)
   * @generated
   */
  EOperation getNeo4jRestClient__RegisterExtension__Class();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.restclient.Neo4jRestClientRegistry <em>Registry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Registry</em>'.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClientRegistry
   * @generated
   */
  EClass getNeo4jRestClientRegistry();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.restclient.Neo4jRestClientContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClientContainer
   * @generated
   */
  EClass getNeo4jRestClientContainer();

  /**
   * Returns the meta object for the containment reference list '{@link org.slizaa.neo4j.restclient.Neo4jRestClientContainer#getClients <em>Clients</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clients</em>'.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClientContainer#getClients()
   * @see #getNeo4jRestClientContainer()
   * @generated
   */
  EReference getNeo4jRestClientContainer_Clients();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.restclient.Neo4jRestClientContainer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.slizaa.neo4j.restclient.Neo4jRestClientContainer#getName()
   * @see #getNeo4jRestClientContainer()
   * @generated
   */
  EAttribute getNeo4jRestClientContainer_Name();

  /**
   * Returns the meta object for data type '{@link java.util.concurrent.Future <em>Future</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Future</em>'.
   * @see java.util.concurrent.Future
   * @model instanceClass="java.util.concurrent.Future" typeParameters="T"
   * @generated
   */
  EDataType getFuture();

  /**
   * Returns the meta object for data type '{@link java.util.function.Consumer <em>Consumer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Consumer</em>'.
   * @see java.util.function.Consumer
   * @model instanceClass="java.util.function.Consumer" typeParameters="T"
   * @generated
   */
  EDataType getConsumer();

  /**
   * Returns the meta object for data type '{@link com.google.gson.JsonArray <em>Json Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Json Array</em>'.
   * @see com.google.gson.JsonArray
   * @model instanceClass="com.google.gson.JsonArray"
   * @generated
   */
  EDataType getJsonArray();

  /**
   * Returns the meta object for data type '{@link com.google.gson.JsonObject <em>Json Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Json Object</em>'.
   * @see com.google.gson.JsonObject
   * @model instanceClass="com.google.gson.JsonObject"
   * @generated
   */
  EDataType getJsonObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Neo4jRestClientFactory getNeo4jRestClientFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.restclient.impl.Neo4jRestClientImpl <em>Neo4j Rest Client</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientImpl
     * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getNeo4jRestClient()
     * @generated
     */
    EClass NEO4J_REST_CLIENT = eINSTANCE.getNeo4jRestClient();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4J_REST_CLIENT__NAME = eINSTANCE.getNeo4jRestClient_Name();

    /**
     * The meta object literal for the '<em><b>Base URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4J_REST_CLIENT__BASE_URI = eINSTANCE.getNeo4jRestClient_BaseURI();

    /**
     * The meta object literal for the '<em><b>Thread Pool Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4J_REST_CLIENT__THREAD_POOL_SIZE = eINSTANCE.getNeo4jRestClient_ThreadPoolSize();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___INIT = eINSTANCE.getNeo4jRestClient__Init();

    /**
     * The meta object literal for the '<em><b>Dispose</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___DISPOSE = eINSTANCE.getNeo4jRestClient__Dispose();

    /**
     * The meta object literal for the '<em><b>Get All Relationship Types</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___GET_ALL_RELATIONSHIP_TYPES = eINSTANCE.getNeo4jRestClient__GetAllRelationshipTypes();

    /**
     * The meta object literal for the '<em><b>Get All Property Keys</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___GET_ALL_PROPERTY_KEYS = eINSTANCE.getNeo4jRestClient__GetAllPropertyKeys();

    /**
     * The meta object literal for the '<em><b>Get All Labels</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___GET_ALL_LABELS = eINSTANCE.getNeo4jRestClient__GetAllLabels();

    /**
     * The meta object literal for the '<em><b>Get Labels For Node</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___GET_LABELS_FOR_NODE__LONG = eINSTANCE.getNeo4jRestClient__GetLabelsForNode__long();

    /**
     * The meta object literal for the '<em><b>Get Properties For Node</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_NODE__LONG = eINSTANCE.getNeo4jRestClient__GetPropertiesForNode__long();

    /**
     * The meta object literal for the '<em><b>Get Properties For Relationship</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_RELATIONSHIP__LONG = eINSTANCE.getNeo4jRestClient__GetPropertiesForRelationship__long();

    /**
     * The meta object literal for the '<em><b>Execute Cypher Query</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING = eINSTANCE.getNeo4jRestClient__ExecuteCypherQuery__String();

    /**
     * The meta object literal for the '<em><b>Execute Cypher Query</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP = eINSTANCE.getNeo4jRestClient__ExecuteCypherQuery__String_Map();

    /**
     * The meta object literal for the '<em><b>Execute Cypher Query</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_CONSUMER = eINSTANCE.getNeo4jRestClient__ExecuteCypherQuery__String_Consumer();

    /**
     * The meta object literal for the '<em><b>Execute Cypher Query</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP_CONSUMER = eINSTANCE.getNeo4jRestClient__ExecuteCypherQuery__String_Map_Consumer();

    /**
     * The meta object literal for the '<em><b>Has Extension</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___HAS_EXTENSION__CLASS = eINSTANCE.getNeo4jRestClient__HasExtension__Class();

    /**
     * The meta object literal for the '<em><b>Get Extension</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___GET_EXTENSION__CLASS = eINSTANCE.getNeo4jRestClient__GetExtension__Class();

    /**
     * The meta object literal for the '<em><b>Register Extension</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation NEO4J_REST_CLIENT___REGISTER_EXTENSION__CLASS = eINSTANCE.getNeo4jRestClient__RegisterExtension__Class();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.restclient.impl.Neo4jRestClientRegistryImpl <em>Registry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientRegistryImpl
     * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getNeo4jRestClientRegistry()
     * @generated
     */
    EClass NEO4J_REST_CLIENT_REGISTRY = eINSTANCE.getNeo4jRestClientRegistry();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.restclient.impl.Neo4jRestClientContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientContainerImpl
     * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getNeo4jRestClientContainer()
     * @generated
     */
    EClass NEO4J_REST_CLIENT_CONTAINER = eINSTANCE.getNeo4jRestClientContainer();

    /**
     * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEO4J_REST_CLIENT_CONTAINER__CLIENTS = eINSTANCE.getNeo4jRestClientContainer_Clients();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4J_REST_CLIENT_CONTAINER__NAME = eINSTANCE.getNeo4jRestClientContainer_Name();

    /**
     * The meta object literal for the '<em>Future</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.concurrent.Future
     * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getFuture()
     * @generated
     */
    EDataType FUTURE = eINSTANCE.getFuture();

    /**
     * The meta object literal for the '<em>Consumer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.function.Consumer
     * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getConsumer()
     * @generated
     */
    EDataType CONSUMER = eINSTANCE.getConsumer();

    /**
     * The meta object literal for the '<em>Json Array</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.google.gson.JsonArray
     * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getJsonArray()
     * @generated
     */
    EDataType JSON_ARRAY = eINSTANCE.getJsonArray();

    /**
     * The meta object literal for the '<em>Json Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.google.gson.JsonObject
     * @see org.slizaa.neo4j.restclient.impl.Neo4jRestClientPackageImpl#getJsonObject()
     * @generated
     */
    EDataType JSON_OBJECT = eINSTANCE.getJsonObject();

  }

} //Neo4jRestClientPackage

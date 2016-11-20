/**
 */
package org.slizaa.neo4j.dbadapter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.slizaa.neo4j.dbadapter.DbAdapterFactory
 * @model kind="package"
 * @generated
 */
public interface DbAdapterPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dbadapter";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org/slizaa/neo4j/dbadapter";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.slizaa.neo4j.dbadapter";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DbAdapterPackage eINSTANCE = org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl.init();

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl <em>Neo4j Rest Client</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getNeo4jRestClient()
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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Base URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT__BASE_URI = 2;

  /**
   * The feature id for the '<em><b>Defining Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT__DEFINING_RESOURCE = 3;

  /**
   * The feature id for the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT__ACTIVE = 4;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT__PARENT = 5;

  /**
   * The feature id for the '<em><b>Hierarchical Graph</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT__HIERARCHICAL_GRAPH = 6;

  /**
   * The number of structural features of the '<em>Neo4j Rest Client</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_FEATURE_COUNT = 7;

  /**
   * The operation id for the '<em>Get All Relationship Types</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_ALL_RELATIONSHIP_TYPES = 0;

  /**
   * The operation id for the '<em>Get All Property Keys</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_ALL_PROPERTY_KEYS = 1;

  /**
   * The operation id for the '<em>Get All Labels</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_ALL_LABELS = 2;

  /**
   * The operation id for the '<em>Get Labels For Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_LABELS_FOR_NODE__LONG = 3;

  /**
   * The operation id for the '<em>Get Properties For Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_NODE__LONG = 4;

  /**
   * The operation id for the '<em>Get Properties For Relationship</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_RELATIONSHIP__LONG = 5;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING = 6;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP = 7;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_CONSUMER = 8;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP_CONSUMER = 9;

  /**
   * The number of operations of the '<em>Neo4j Rest Client</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4J_REST_CLIENT_OPERATION_COUNT = 10;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.dbadapter.impl.DbAdapterRegistryImpl <em>Registry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterRegistryImpl
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getDbAdapterRegistry()
   * @generated
   */
  int DB_ADAPTER_REGISTRY = 1;

  /**
   * The feature id for the '<em><b>Active Db Adapter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_REGISTRY__ACTIVE_DB_ADAPTER = 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_REGISTRY__CHILDREN = 1;

  /**
   * The number of structural features of the '<em>Registry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_REGISTRY_FEATURE_COUNT = 2;

  /**
   * The operation id for the '<em>Get Db Adapter Container</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_REGISTRY___GET_DB_ADAPTER_CONTAINER__CONTAINERTYPE = 0;

  /**
   * The number of operations of the '<em>Registry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_REGISTRY_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.dbadapter.impl.DbAdapterContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterContainerImpl
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getDbAdapterContainer()
   * @generated
   */
  int DB_ADAPTER_CONTAINER = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_CONTAINER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_CONTAINER__PARENT = 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_CONTAINER__CHILDREN = 2;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_CONTAINER_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_CONTAINER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl <em>Managed Neo4j Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getManagedNeo4jInstance()
   * @generated
   */
  int MANAGED_NEO4J_INSTANCE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE__NAME = NEO4J_REST_CLIENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE__DESCRIPTION = NEO4J_REST_CLIENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Base URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE__BASE_URI = NEO4J_REST_CLIENT__BASE_URI;

  /**
   * The feature id for the '<em><b>Defining Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE__DEFINING_RESOURCE = NEO4J_REST_CLIENT__DEFINING_RESOURCE;

  /**
   * The feature id for the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE__ACTIVE = NEO4J_REST_CLIENT__ACTIVE;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE__PARENT = NEO4J_REST_CLIENT__PARENT;

  /**
   * The feature id for the '<em><b>Hierarchical Graph</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE__HIERARCHICAL_GRAPH = NEO4J_REST_CLIENT__HIERARCHICAL_GRAPH;

  /**
   * The feature id for the '<em><b>Running</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE__RUNNING = NEO4J_REST_CLIENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Storage Area</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE__STORAGE_AREA = NEO4J_REST_CLIENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Directories To Scan</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN = NEO4J_REST_CLIENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Launch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE__LAUNCH = NEO4J_REST_CLIENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Managed Neo4j Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE_FEATURE_COUNT = NEO4J_REST_CLIENT_FEATURE_COUNT + 4;

  /**
   * The operation id for the '<em>Get All Relationship Types</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___GET_ALL_RELATIONSHIP_TYPES = NEO4J_REST_CLIENT___GET_ALL_RELATIONSHIP_TYPES;

  /**
   * The operation id for the '<em>Get All Property Keys</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___GET_ALL_PROPERTY_KEYS = NEO4J_REST_CLIENT___GET_ALL_PROPERTY_KEYS;

  /**
   * The operation id for the '<em>Get All Labels</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___GET_ALL_LABELS = NEO4J_REST_CLIENT___GET_ALL_LABELS;

  /**
   * The operation id for the '<em>Get Labels For Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___GET_LABELS_FOR_NODE__LONG = NEO4J_REST_CLIENT___GET_LABELS_FOR_NODE__LONG;

  /**
   * The operation id for the '<em>Get Properties For Node</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___GET_PROPERTIES_FOR_NODE__LONG = NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_NODE__LONG;

  /**
   * The operation id for the '<em>Get Properties For Relationship</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___GET_PROPERTIES_FOR_RELATIONSHIP__LONG = NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_RELATIONSHIP__LONG;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___EXECUTE_CYPHER_QUERY__STRING = NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___EXECUTE_CYPHER_QUERY__STRING_MAP = NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___EXECUTE_CYPHER_QUERY__STRING_CONSUMER = NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_CONSUMER;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___EXECUTE_CYPHER_QUERY__STRING_MAP_CONSUMER = NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP_CONSUMER;

  /**
   * The operation id for the '<em>Scan</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___SCAN = NEO4J_REST_CLIENT_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Is Scanned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___IS_SCANNED = NEO4J_REST_CLIENT_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Start</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___START = NEO4J_REST_CLIENT_OPERATION_COUNT + 2;

  /**
   * The operation id for the '<em>Stop</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___STOP = NEO4J_REST_CLIENT_OPERATION_COUNT + 3;

  /**
   * The operation id for the '<em>Delete</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE___DELETE = NEO4J_REST_CLIENT_OPERATION_COUNT + 4;

  /**
   * The number of operations of the '<em>Managed Neo4j Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_NEO4J_INSTANCE_OPERATION_COUNT = NEO4J_REST_CLIENT_OPERATION_COUNT + 5;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.dbadapter.ContainerType <em>Container Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.dbadapter.ContainerType
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getContainerType()
   * @generated
   */
  int CONTAINER_TYPE = 4;

  /**
   * The meta object id for the '<em>Future</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.concurrent.Future
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getFuture()
   * @generated
   */
  int FUTURE = 5;

  /**
   * The meta object id for the '<em>Consumer</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.function.Consumer
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getConsumer()
   * @generated
   */
  int CONSUMER = 6;

  /**
   * The meta object id for the '<em>Json Array</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.google.gson.JsonArray
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getJsonArray()
   * @generated
   */
  int JSON_ARRAY = 7;

  /**
   * The meta object id for the '<em>Json Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.google.gson.JsonObject
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getJsonObject()
   * @generated
   */
  int JSON_OBJECT = 8;

  /**
   * The meta object id for the '<em>ILaunch</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.debug.core.ILaunch
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getILaunch()
   * @generated
   */
  int ILAUNCH = 9;

  /**
   * The meta object id for the '<em>IFile</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.core.resources.IFile
   * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getIFile()
   * @generated
   */
  int IFILE = 10;


  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient <em>Neo4j Rest Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neo4j Rest Client</em>'.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient
   * @generated
   */
  EClass getNeo4jRestClient();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getName()
   * @see #getNeo4jRestClient()
   * @generated
   */
  EAttribute getNeo4jRestClient_Name();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getDescription()
   * @see #getNeo4jRestClient()
   * @generated
   */
  EAttribute getNeo4jRestClient_Description();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getBaseURI <em>Base URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base URI</em>'.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getBaseURI()
   * @see #getNeo4jRestClient()
   * @generated
   */
  EAttribute getNeo4jRestClient_BaseURI();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getDefiningResource <em>Defining Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defining Resource</em>'.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getDefiningResource()
   * @see #getNeo4jRestClient()
   * @generated
   */
  EAttribute getNeo4jRestClient_DefiningResource();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#isActive <em>Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Active</em>'.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#isActive()
   * @see #getNeo4jRestClient()
   * @generated
   */
  EAttribute getNeo4jRestClient_Active();

  /**
   * Returns the meta object for the container reference '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getParent()
   * @see #getNeo4jRestClient()
   * @generated
   */
  EReference getNeo4jRestClient_Parent();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getHierarchicalGraph <em>Hierarchical Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Hierarchical Graph</em>'.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getHierarchicalGraph()
   * @see #getNeo4jRestClient()
   * @generated
   */
  EReference getNeo4jRestClient_HierarchicalGraph();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getAllRelationshipTypes() <em>Get All Relationship Types</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get All Relationship Types</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getAllRelationshipTypes()
   * @generated
   */
  EOperation getNeo4jRestClient__GetAllRelationshipTypes();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getAllPropertyKeys() <em>Get All Property Keys</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get All Property Keys</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getAllPropertyKeys()
   * @generated
   */
  EOperation getNeo4jRestClient__GetAllPropertyKeys();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getAllLabels() <em>Get All Labels</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get All Labels</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getAllLabels()
   * @generated
   */
  EOperation getNeo4jRestClient__GetAllLabels();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getLabelsForNode(long) <em>Get Labels For Node</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Labels For Node</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getLabelsForNode(long)
   * @generated
   */
  EOperation getNeo4jRestClient__GetLabelsForNode__long();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getPropertiesForNode(long) <em>Get Properties For Node</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Properties For Node</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getPropertiesForNode(long)
   * @generated
   */
  EOperation getNeo4jRestClient__GetPropertiesForNode__long();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#getPropertiesForRelationship(long) <em>Get Properties For Relationship</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Properties For Relationship</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#getPropertiesForRelationship(long)
   * @generated
   */
  EOperation getNeo4jRestClient__GetPropertiesForRelationship__long();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#executeCypherQuery(java.lang.String) <em>Execute Cypher Query</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Execute Cypher Query</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#executeCypherQuery(java.lang.String)
   * @generated
   */
  EOperation getNeo4jRestClient__ExecuteCypherQuery__String();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.Map) <em>Execute Cypher Query</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Execute Cypher Query</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.Map)
   * @generated
   */
  EOperation getNeo4jRestClient__ExecuteCypherQuery__String_Map();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.function.Consumer) <em>Execute Cypher Query</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Execute Cypher Query</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.function.Consumer)
   * @generated
   */
  EOperation getNeo4jRestClient__ExecuteCypherQuery__String_Consumer();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.Map, java.util.function.Consumer) <em>Execute Cypher Query</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Execute Cypher Query</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient#executeCypherQuery(java.lang.String, java.util.Map, java.util.function.Consumer)
   * @generated
   */
  EOperation getNeo4jRestClient__ExecuteCypherQuery__String_Map_Consumer();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry <em>Registry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Registry</em>'.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterRegistry
   * @generated
   */
  EClass getDbAdapterRegistry();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getActiveDbAdapter <em>Active Db Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Active Db Adapter</em>'.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getActiveDbAdapter()
   * @see #getDbAdapterRegistry()
   * @generated
   */
  EReference getDbAdapterRegistry_ActiveDbAdapter();

  /**
   * Returns the meta object for the containment reference list '{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getChildren()
   * @see #getDbAdapterRegistry()
   * @generated
   */
  EReference getDbAdapterRegistry_Children();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getDbAdapterContainer(org.slizaa.neo4j.dbadapter.ContainerType) <em>Get Db Adapter Container</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Db Adapter Container</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterRegistry#getDbAdapterContainer(org.slizaa.neo4j.dbadapter.ContainerType)
   * @generated
   */
  EOperation getDbAdapterRegistry__GetDbAdapterContainer__ContainerType();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterContainer
   * @generated
   */
  EClass getDbAdapterContainer();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterContainer#getType()
   * @see #getDbAdapterContainer()
   * @generated
   */
  EAttribute getDbAdapterContainer_Type();

  /**
   * Returns the meta object for the container reference '{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterContainer#getParent()
   * @see #getDbAdapterContainer()
   * @generated
   */
  EReference getDbAdapterContainer_Parent();

  /**
   * Returns the meta object for the containment reference list '{@link org.slizaa.neo4j.dbadapter.DbAdapterContainer#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterContainer#getChildren()
   * @see #getDbAdapterContainer()
   * @generated
   */
  EReference getDbAdapterContainer_Children();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance <em>Managed Neo4j Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Managed Neo4j Instance</em>'.
   * @see org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance
   * @generated
   */
  EClass getManagedNeo4jInstance();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#isRunning <em>Running</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Running</em>'.
   * @see org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#isRunning()
   * @see #getManagedNeo4jInstance()
   * @generated
   */
  EAttribute getManagedNeo4jInstance_Running();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#getStorageArea <em>Storage Area</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Storage Area</em>'.
   * @see org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#getStorageArea()
   * @see #getManagedNeo4jInstance()
   * @generated
   */
  EAttribute getManagedNeo4jInstance_StorageArea();

  /**
   * Returns the meta object for the attribute list '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#getDirectoriesToScan <em>Directories To Scan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Directories To Scan</em>'.
   * @see org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#getDirectoriesToScan()
   * @see #getManagedNeo4jInstance()
   * @generated
   */
  EAttribute getManagedNeo4jInstance_DirectoriesToScan();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#getLaunch <em>Launch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Launch</em>'.
   * @see org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#getLaunch()
   * @see #getManagedNeo4jInstance()
   * @generated
   */
  EAttribute getManagedNeo4jInstance_Launch();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#scan() <em>Scan</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Scan</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#scan()
   * @generated
   */
  EOperation getManagedNeo4jInstance__Scan();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#isScanned() <em>Is Scanned</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Is Scanned</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#isScanned()
   * @generated
   */
  EOperation getManagedNeo4jInstance__IsScanned();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#start() <em>Start</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Start</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#start()
   * @generated
   */
  EOperation getManagedNeo4jInstance__Start();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#stop() <em>Stop</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Stop</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#stop()
   * @generated
   */
  EOperation getManagedNeo4jInstance__Stop();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#delete() <em>Delete</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Delete</em>' operation.
   * @see org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance#delete()
   * @generated
   */
  EOperation getManagedNeo4jInstance__Delete();

  /**
   * Returns the meta object for enum '{@link org.slizaa.neo4j.dbadapter.ContainerType <em>Container Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Container Type</em>'.
   * @see org.slizaa.neo4j.dbadapter.ContainerType
   * @generated
   */
  EEnum getContainerType();

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
   * Returns the meta object for data type '{@link org.eclipse.debug.core.ILaunch <em>ILaunch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>ILaunch</em>'.
   * @see org.eclipse.debug.core.ILaunch
   * @model instanceClass="org.eclipse.debug.core.ILaunch" serializeable="false"
   * @generated
   */
  EDataType getILaunch();

  /**
   * Returns the meta object for data type '{@link org.eclipse.core.resources.IFile <em>IFile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>IFile</em>'.
   * @see org.eclipse.core.resources.IFile
   * @model instanceClass="org.eclipse.core.resources.IFile" serializeable="false"
   * @generated
   */
  EDataType getIFile();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DbAdapterFactory getDbAdapterFactory();

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
     * The meta object literal for the '{@link org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl <em>Neo4j Rest Client</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getNeo4jRestClient()
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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4J_REST_CLIENT__DESCRIPTION = eINSTANCE.getNeo4jRestClient_Description();

    /**
     * The meta object literal for the '<em><b>Base URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4J_REST_CLIENT__BASE_URI = eINSTANCE.getNeo4jRestClient_BaseURI();

    /**
     * The meta object literal for the '<em><b>Defining Resource</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4J_REST_CLIENT__DEFINING_RESOURCE = eINSTANCE.getNeo4jRestClient_DefiningResource();

    /**
     * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4J_REST_CLIENT__ACTIVE = eINSTANCE.getNeo4jRestClient_Active();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEO4J_REST_CLIENT__PARENT = eINSTANCE.getNeo4jRestClient_Parent();

    /**
     * The meta object literal for the '<em><b>Hierarchical Graph</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEO4J_REST_CLIENT__HIERARCHICAL_GRAPH = eINSTANCE.getNeo4jRestClient_HierarchicalGraph();

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
     * The meta object literal for the '{@link org.slizaa.neo4j.dbadapter.impl.DbAdapterRegistryImpl <em>Registry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterRegistryImpl
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getDbAdapterRegistry()
     * @generated
     */
    EClass DB_ADAPTER_REGISTRY = eINSTANCE.getDbAdapterRegistry();

    /**
     * The meta object literal for the '<em><b>Active Db Adapter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DB_ADAPTER_REGISTRY__ACTIVE_DB_ADAPTER = eINSTANCE.getDbAdapterRegistry_ActiveDbAdapter();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DB_ADAPTER_REGISTRY__CHILDREN = eINSTANCE.getDbAdapterRegistry_Children();

    /**
     * The meta object literal for the '<em><b>Get Db Adapter Container</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DB_ADAPTER_REGISTRY___GET_DB_ADAPTER_CONTAINER__CONTAINERTYPE = eINSTANCE.getDbAdapterRegistry__GetDbAdapterContainer__ContainerType();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.dbadapter.impl.DbAdapterContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterContainerImpl
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getDbAdapterContainer()
     * @generated
     */
    EClass DB_ADAPTER_CONTAINER = eINSTANCE.getDbAdapterContainer();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DB_ADAPTER_CONTAINER__TYPE = eINSTANCE.getDbAdapterContainer_Type();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DB_ADAPTER_CONTAINER__PARENT = eINSTANCE.getDbAdapterContainer_Parent();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DB_ADAPTER_CONTAINER__CHILDREN = eINSTANCE.getDbAdapterContainer_Children();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl <em>Managed Neo4j Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getManagedNeo4jInstance()
     * @generated
     */
    EClass MANAGED_NEO4J_INSTANCE = eINSTANCE.getManagedNeo4jInstance();

    /**
     * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANAGED_NEO4J_INSTANCE__RUNNING = eINSTANCE.getManagedNeo4jInstance_Running();

    /**
     * The meta object literal for the '<em><b>Storage Area</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANAGED_NEO4J_INSTANCE__STORAGE_AREA = eINSTANCE.getManagedNeo4jInstance_StorageArea();

    /**
     * The meta object literal for the '<em><b>Directories To Scan</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN = eINSTANCE.getManagedNeo4jInstance_DirectoriesToScan();

    /**
     * The meta object literal for the '<em><b>Launch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANAGED_NEO4J_INSTANCE__LAUNCH = eINSTANCE.getManagedNeo4jInstance_Launch();

    /**
     * The meta object literal for the '<em><b>Scan</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MANAGED_NEO4J_INSTANCE___SCAN = eINSTANCE.getManagedNeo4jInstance__Scan();

    /**
     * The meta object literal for the '<em><b>Is Scanned</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MANAGED_NEO4J_INSTANCE___IS_SCANNED = eINSTANCE.getManagedNeo4jInstance__IsScanned();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MANAGED_NEO4J_INSTANCE___START = eINSTANCE.getManagedNeo4jInstance__Start();

    /**
     * The meta object literal for the '<em><b>Stop</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MANAGED_NEO4J_INSTANCE___STOP = eINSTANCE.getManagedNeo4jInstance__Stop();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation MANAGED_NEO4J_INSTANCE___DELETE = eINSTANCE.getManagedNeo4jInstance__Delete();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.dbadapter.ContainerType <em>Container Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.dbadapter.ContainerType
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getContainerType()
     * @generated
     */
    EEnum CONTAINER_TYPE = eINSTANCE.getContainerType();

    /**
     * The meta object literal for the '<em>Future</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.concurrent.Future
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getFuture()
     * @generated
     */
    EDataType FUTURE = eINSTANCE.getFuture();

    /**
     * The meta object literal for the '<em>Consumer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.function.Consumer
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getConsumer()
     * @generated
     */
    EDataType CONSUMER = eINSTANCE.getConsumer();

    /**
     * The meta object literal for the '<em>Json Array</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.google.gson.JsonArray
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getJsonArray()
     * @generated
     */
    EDataType JSON_ARRAY = eINSTANCE.getJsonArray();

    /**
     * The meta object literal for the '<em>Json Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.google.gson.JsonObject
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getJsonObject()
     * @generated
     */
    EDataType JSON_OBJECT = eINSTANCE.getJsonObject();

    /**
     * The meta object literal for the '<em>ILaunch</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.debug.core.ILaunch
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getILaunch()
     * @generated
     */
    EDataType ILAUNCH = eINSTANCE.getILaunch();

    /**
     * The meta object literal for the '<em>IFile</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.core.resources.IFile
     * @see org.slizaa.neo4j.dbadapter.impl.DbAdapterPackageImpl#getIFile()
     * @generated
     */
    EDataType IFILE = eINSTANCE.getIFile();

  }

} //DbAdapterPackage

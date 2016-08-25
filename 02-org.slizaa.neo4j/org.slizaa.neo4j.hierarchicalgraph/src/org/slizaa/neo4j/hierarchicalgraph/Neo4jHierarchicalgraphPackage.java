/**
 */
package org.slizaa.neo4j.hierarchicalgraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

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
 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory
 * @model kind="package"
 * @generated
 */
public interface Neo4jHierarchicalgraphPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "hierarchicalgraph";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://org/slizaa/neo4j/hierarchicalgraph";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "org.slizaa.neo4j.hierarchicalgraph";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	Neo4jHierarchicalgraphPackage eINSTANCE = org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl.init();

	/**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl <em>Neo4 JBacked Node Source</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedNodeSource()
   * @generated
   */
	int NEO4_JBACKED_NODE_SOURCE = 0;

	/**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_NODE_SOURCE__IDENTIFIER = HierarchicalgraphPackage.HG_NODE_SOURCE__IDENTIFIER;

	/**
   * The feature id for the '<em><b>Node</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_NODE_SOURCE__NODE = HierarchicalgraphPackage.HG_NODE_SOURCE__NODE;

	/**
   * The feature id for the '<em><b>Auto Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE__AUTO_EXPAND = HierarchicalgraphPackage.HG_NODE_SOURCE__AUTO_EXPAND;

  /**
   * The feature id for the '<em><b>Properties</b></em>' map.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_NODE_SOURCE__PROPERTIES = HierarchicalgraphPackage.HG_NODE_SOURCE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Labels</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_NODE_SOURCE__LABELS = HierarchicalgraphPackage.HG_NODE_SOURCE_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Neo4 JBacked Node Source</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_NODE_SOURCE_FEATURE_COUNT = HierarchicalgraphPackage.HG_NODE_SOURCE_FEATURE_COUNT + 2;

	/**
   * The operation id for the '<em>On Expand</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE___ON_EXPAND = HierarchicalgraphPackage.HG_NODE_SOURCE___ON_EXPAND;

  /**
   * The operation id for the '<em>On Collapse</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_NODE_SOURCE___ON_COLLAPSE = HierarchicalgraphPackage.HG_NODE_SOURCE___ON_COLLAPSE;

  /**
   * The number of operations of the '<em>Neo4 JBacked Node Source</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_NODE_SOURCE_OPERATION_COUNT = HierarchicalgraphPackage.HG_NODE_SOURCE_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedRootNodeSourceImpl <em>Neo4 JBacked Root Node Source</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedRootNodeSourceImpl
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedRootNodeSource()
   * @generated
   */
	int NEO4_JBACKED_ROOT_NODE_SOURCE = 1;

	/**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_ROOT_NODE_SOURCE__IDENTIFIER = NEO4_JBACKED_NODE_SOURCE__IDENTIFIER;

	/**
   * The feature id for the '<em><b>Node</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_ROOT_NODE_SOURCE__NODE = NEO4_JBACKED_NODE_SOURCE__NODE;

	/**
   * The feature id for the '<em><b>Auto Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE__AUTO_EXPAND = NEO4_JBACKED_NODE_SOURCE__AUTO_EXPAND;

  /**
   * The feature id for the '<em><b>Properties</b></em>' map.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_ROOT_NODE_SOURCE__PROPERTIES = NEO4_JBACKED_NODE_SOURCE__PROPERTIES;

	/**
   * The feature id for the '<em><b>Labels</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_ROOT_NODE_SOURCE__LABELS = NEO4_JBACKED_NODE_SOURCE__LABELS;

	/**
   * The feature id for the '<em><b>Repository</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY = NEO4_JBACKED_NODE_SOURCE_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Neo4 JBacked Root Node Source</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_ROOT_NODE_SOURCE_FEATURE_COUNT = NEO4_JBACKED_NODE_SOURCE_FEATURE_COUNT + 1;

	/**
   * The operation id for the '<em>On Expand</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE___ON_EXPAND = NEO4_JBACKED_NODE_SOURCE___ON_EXPAND;

  /**
   * The operation id for the '<em>On Collapse</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_ROOT_NODE_SOURCE___ON_COLLAPSE = NEO4_JBACKED_NODE_SOURCE___ON_COLLAPSE;

  /**
   * The number of operations of the '<em>Neo4 JBacked Root Node Source</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JBACKED_ROOT_NODE_SOURCE_OPERATION_COUNT = NEO4_JBACKED_NODE_SOURCE_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository <em>INeo4 JRepository</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getINeo4JRepository()
   * @generated
   */
	int INEO4_JREPOSITORY = 3;

	/**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JRemoteRepositoryImpl <em>Neo4 JRemote Repository</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JRemoteRepositoryImpl
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JRemoteRepository()
   * @generated
   */
	int NEO4_JREMOTE_REPOSITORY = 4;

	/**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl <em>Neo4 JBacked Dependency Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedDependencySource()
   * @generated
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE = 2;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE__IDENTIFIER = HierarchicalgraphPackage.HG_DEPENDENCY_SOURCE__IDENTIFIER;

  /**
   * The feature id for the '<em><b>Dependency</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE__DEPENDENCY = HierarchicalgraphPackage.HG_DEPENDENCY_SOURCE__DEPENDENCY;

  /**
   * The feature id for the '<em><b>Properties</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE__PROPERTIES = HierarchicalgraphPackage.HG_DEPENDENCY_SOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE__TYPE = HierarchicalgraphPackage.HG_DEPENDENCY_SOURCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Neo4 JBacked Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE_FEATURE_COUNT = HierarchicalgraphPackage.HG_DEPENDENCY_SOURCE_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>On Resolve Aggregated Core Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE___ON_RESOLVE_AGGREGATED_CORE_DEPENDENCY = HierarchicalgraphPackage.HG_DEPENDENCY_SOURCE___ON_RESOLVE_AGGREGATED_CORE_DEPENDENCY;

  /**
   * The number of operations of the '<em>Neo4 JBacked Dependency Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEO4_JBACKED_DEPENDENCY_SOURCE_OPERATION_COUNT = HierarchicalgraphPackage.HG_DEPENDENCY_SOURCE_OPERATION_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hierarchical Graphs</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INEO4_JREPOSITORY__HIERARCHICAL_GRAPHS = 0;

  /**
   * The number of structural features of the '<em>INeo4 JRepository</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INEO4_JREPOSITORY_FEATURE_COUNT = 1;

  /**
   * The operation id for the '<em>Get Node Labels</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INEO4_JREPOSITORY___GET_NODE_LABELS__LONG = 0;

  /**
   * The operation id for the '<em>Get Node Properties</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INEO4_JREPOSITORY___GET_NODE_PROPERTIES__LONG = 1;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INEO4_JREPOSITORY___EXECUTE_CYPHER_QUERY__STRING = 2;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INEO4_JREPOSITORY___EXECUTE_CYPHER_QUERY__STRING_MAP = 3;

  /**
   * The number of operations of the '<em>INeo4 JRepository</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INEO4_JREPOSITORY_OPERATION_COUNT = 4;

  /**
   * The feature id for the '<em><b>Hierarchical Graphs</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY__HIERARCHICAL_GRAPHS = INEO4_JREPOSITORY__HIERARCHICAL_GRAPHS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY__NAME = INEO4_JREPOSITORY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Base URI</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY__BASE_URI = INEO4_JREPOSITORY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Thread Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY__THREAD_POOL_SIZE = INEO4_JREPOSITORY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Neo4 JRemote Repository</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY_FEATURE_COUNT = INEO4_JREPOSITORY_FEATURE_COUNT + 3;

  /**
   * The operation id for the '<em>Get Node Labels</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY___GET_NODE_LABELS__LONG = INEO4_JREPOSITORY___GET_NODE_LABELS__LONG;

  /**
   * The operation id for the '<em>Get Node Properties</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY___GET_NODE_PROPERTIES__LONG = INEO4_JREPOSITORY___GET_NODE_PROPERTIES__LONG;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY___EXECUTE_CYPHER_QUERY__STRING = INEO4_JREPOSITORY___EXECUTE_CYPHER_QUERY__STRING;

  /**
   * The operation id for the '<em>Execute Cypher Query</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY___EXECUTE_CYPHER_QUERY__STRING_MAP = INEO4_JREPOSITORY___EXECUTE_CYPHER_QUERY__STRING_MAP;

  /**
   * The operation id for the '<em>Init</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY___INIT = INEO4_JREPOSITORY_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Dispose</em>' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY___DISPOSE = INEO4_JREPOSITORY_OPERATION_COUNT + 1;

  /**
   * The number of operations of the '<em>Neo4 JRemote Repository</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEO4_JREMOTE_REPOSITORY_OPERATION_COUNT = INEO4_JREPOSITORY_OPERATION_COUNT + 2;

  /**
   * The meta object id for the '<em>Future</em>' data type.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see java.util.concurrent.Future
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getFuture()
   * @generated
   */
	int FUTURE = 5;

	/**
   * The meta object id for the '<em>Json Array</em>' data type.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see com.google.gson.JsonArray
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getJsonArray()
   * @generated
   */
	int JSON_ARRAY = 6;

	/**
   * The meta object id for the '<em>Json Object</em>' data type.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see com.google.gson.JsonObject
   * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getJsonObject()
   * @generated
   */
	int JSON_OBJECT = 7;


	/**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource <em>Neo4 JBacked Node Source</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neo4 JBacked Node Source</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource
   * @generated
   */
	EClass getNeo4JBackedNodeSource();

	/**
   * Returns the meta object for the map '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Properties</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource#getProperties()
   * @see #getNeo4JBackedNodeSource()
   * @generated
   */
	EReference getNeo4JBackedNodeSource_Properties();

	/**
   * Returns the meta object for the attribute list '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Labels</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource#getLabels()
   * @see #getNeo4JBackedNodeSource()
   * @generated
   */
	EAttribute getNeo4JBackedNodeSource_Labels();

	/**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource <em>Neo4 JBacked Root Node Source</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neo4 JBacked Root Node Source</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource
   * @generated
   */
	EClass getNeo4JBackedRootNodeSource();

	/**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource#getRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repository</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource#getRepository()
   * @see #getNeo4JBackedRootNodeSource()
   * @generated
   */
	EAttribute getNeo4JBackedRootNodeSource_Repository();

	/**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository <em>INeo4 JRepository</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>INeo4 JRepository</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository
   * @generated
   */
	EClass getINeo4JRepository();

	/**
   * Returns the meta object for the reference list '{@link org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository#getHierarchicalGraphs <em>Hierarchical Graphs</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Hierarchical Graphs</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository#getHierarchicalGraphs()
   * @see #getINeo4JRepository()
   * @generated
   */
	EReference getINeo4JRepository_HierarchicalGraphs();

	/**
   * Returns the meta object for the '{@link org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository#getNodeLabels(long) <em>Get Node Labels</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Node Labels</em>' operation.
   * @see org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository#getNodeLabels(long)
   * @generated
   */
	EOperation getINeo4JRepository__GetNodeLabels__long();

	/**
   * Returns the meta object for the '{@link org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository#getNodeProperties(long) <em>Get Node Properties</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Node Properties</em>' operation.
   * @see org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository#getNodeProperties(long)
   * @generated
   */
	EOperation getINeo4JRepository__GetNodeProperties__long();

	/**
   * Returns the meta object for the '{@link org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository#executeCypherQuery(java.lang.String) <em>Execute Cypher Query</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the '<em>Execute Cypher Query</em>' operation.
   * @see org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository#executeCypherQuery(java.lang.String)
   * @generated
   */
	EOperation getINeo4JRepository__ExecuteCypherQuery__String();

	/**
   * Returns the meta object for the '{@link org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository#executeCypherQuery(java.lang.String, java.util.Map) <em>Execute Cypher Query</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the '<em>Execute Cypher Query</em>' operation.
   * @see org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository#executeCypherQuery(java.lang.String, java.util.Map)
   * @generated
   */
	EOperation getINeo4JRepository__ExecuteCypherQuery__String_Map();

	/**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository <em>Neo4 JRemote Repository</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neo4 JRemote Repository</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository
   * @generated
   */
	EClass getNeo4JRemoteRepository();

	/**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getName()
   * @see #getNeo4JRemoteRepository()
   * @generated
   */
	EAttribute getNeo4JRemoteRepository_Name();

	/**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getBaseURI <em>Base URI</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base URI</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getBaseURI()
   * @see #getNeo4JRemoteRepository()
   * @generated
   */
	EAttribute getNeo4JRemoteRepository_BaseURI();

	/**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getThreadPoolSize <em>Thread Pool Size</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thread Pool Size</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#getThreadPoolSize()
   * @see #getNeo4JRemoteRepository()
   * @generated
   */
	EAttribute getNeo4JRemoteRepository_ThreadPoolSize();

	/**
   * Returns the meta object for the '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#init() <em>Init</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the '<em>Init</em>' operation.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#init()
   * @generated
   */
	EOperation getNeo4JRemoteRepository__Init();

	/**
   * Returns the meta object for the '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#dispose() <em>Dispose</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the '<em>Dispose</em>' operation.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository#dispose()
   * @generated
   */
	EOperation getNeo4JRemoteRepository__Dispose();

	/**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource <em>Neo4 JBacked Dependency Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neo4 JBacked Dependency Source</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource
   * @generated
   */
  EClass getNeo4JBackedDependencySource();

  /**
   * Returns the meta object for the map '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Properties</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getProperties()
   * @see #getNeo4JBackedDependencySource()
   * @generated
   */
  EReference getNeo4JBackedDependencySource_Properties();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource#getType()
   * @see #getNeo4JBackedDependencySource()
   * @generated
   */
  EAttribute getNeo4JBackedDependencySource_Type();

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
	Neo4jHierarchicalgraphFactory getNeo4jHierarchicalgraphFactory();

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
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl <em>Neo4 JBacked Node Source</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedNodeSourceImpl
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedNodeSource()
     * @generated
     */
		EClass NEO4_JBACKED_NODE_SOURCE = eINSTANCE.getNeo4JBackedNodeSource();

		/**
     * The meta object literal for the '<em><b>Properties</b></em>' map feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference NEO4_JBACKED_NODE_SOURCE__PROPERTIES = eINSTANCE.getNeo4JBackedNodeSource_Properties();

		/**
     * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NEO4_JBACKED_NODE_SOURCE__LABELS = eINSTANCE.getNeo4JBackedNodeSource_Labels();

		/**
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedRootNodeSourceImpl <em>Neo4 JBacked Root Node Source</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedRootNodeSourceImpl
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedRootNodeSource()
     * @generated
     */
		EClass NEO4_JBACKED_ROOT_NODE_SOURCE = eINSTANCE.getNeo4JBackedRootNodeSource();

		/**
     * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY = eINSTANCE.getNeo4JBackedRootNodeSource_Repository();

		/**
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository <em>INeo4 JRepository</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getINeo4JRepository()
     * @generated
     */
		EClass INEO4_JREPOSITORY = eINSTANCE.getINeo4JRepository();

		/**
     * The meta object literal for the '<em><b>Hierarchical Graphs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference INEO4_JREPOSITORY__HIERARCHICAL_GRAPHS = eINSTANCE.getINeo4JRepository_HierarchicalGraphs();

		/**
     * The meta object literal for the '<em><b>Get Node Labels</b></em>' operation.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EOperation INEO4_JREPOSITORY___GET_NODE_LABELS__LONG = eINSTANCE.getINeo4JRepository__GetNodeLabels__long();

		/**
     * The meta object literal for the '<em><b>Get Node Properties</b></em>' operation.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EOperation INEO4_JREPOSITORY___GET_NODE_PROPERTIES__LONG = eINSTANCE.getINeo4JRepository__GetNodeProperties__long();

		/**
     * The meta object literal for the '<em><b>Execute Cypher Query</b></em>' operation.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EOperation INEO4_JREPOSITORY___EXECUTE_CYPHER_QUERY__STRING = eINSTANCE.getINeo4JRepository__ExecuteCypherQuery__String();

		/**
     * The meta object literal for the '<em><b>Execute Cypher Query</b></em>' operation.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EOperation INEO4_JREPOSITORY___EXECUTE_CYPHER_QUERY__STRING_MAP = eINSTANCE.getINeo4JRepository__ExecuteCypherQuery__String_Map();

		/**
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JRemoteRepositoryImpl <em>Neo4 JRemote Repository</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JRemoteRepositoryImpl
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JRemoteRepository()
     * @generated
     */
		EClass NEO4_JREMOTE_REPOSITORY = eINSTANCE.getNeo4JRemoteRepository();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NEO4_JREMOTE_REPOSITORY__NAME = eINSTANCE.getNeo4JRemoteRepository_Name();

		/**
     * The meta object literal for the '<em><b>Base URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NEO4_JREMOTE_REPOSITORY__BASE_URI = eINSTANCE.getNeo4JRemoteRepository_BaseURI();

		/**
     * The meta object literal for the '<em><b>Thread Pool Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NEO4_JREMOTE_REPOSITORY__THREAD_POOL_SIZE = eINSTANCE.getNeo4JRemoteRepository_ThreadPoolSize();

		/**
     * The meta object literal for the '<em><b>Init</b></em>' operation.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EOperation NEO4_JREMOTE_REPOSITORY___INIT = eINSTANCE.getNeo4JRemoteRepository__Init();

		/**
     * The meta object literal for the '<em><b>Dispose</b></em>' operation.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EOperation NEO4_JREMOTE_REPOSITORY___DISPOSE = eINSTANCE.getNeo4JRemoteRepository__Dispose();

		/**
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl <em>Neo4 JBacked Dependency Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedDependencySourceImpl
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getNeo4JBackedDependencySource()
     * @generated
     */
    EClass NEO4_JBACKED_DEPENDENCY_SOURCE = eINSTANCE.getNeo4JBackedDependencySource();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEO4_JBACKED_DEPENDENCY_SOURCE__PROPERTIES = eINSTANCE.getNeo4JBackedDependencySource_Properties();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEO4_JBACKED_DEPENDENCY_SOURCE__TYPE = eINSTANCE.getNeo4JBackedDependencySource_Type();

    /**
     * The meta object literal for the '<em>Future</em>' data type.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see java.util.concurrent.Future
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getFuture()
     * @generated
     */
		EDataType FUTURE = eINSTANCE.getFuture();

		/**
     * The meta object literal for the '<em>Json Array</em>' data type.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see com.google.gson.JsonArray
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getJsonArray()
     * @generated
     */
		EDataType JSON_ARRAY = eINSTANCE.getJsonArray();

		/**
     * The meta object literal for the '<em>Json Object</em>' data type.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see com.google.gson.JsonObject
     * @see org.slizaa.neo4j.hierarchicalgraph.impl.Neo4jHierarchicalgraphPackageImpl#getJsonObject()
     * @generated
     */
		EDataType JSON_OBJECT = eINSTANCE.getJsonObject();

	}

} //Neo4jHierarchicalgraphPackage

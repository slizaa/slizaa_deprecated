/**
 */
package org.slizaa.neo4j.hierarchicalgraph.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.concurrent.Future;

import java.util.function.Consumer;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

import org.slizaa.neo4j.hierarchicalgraph.IAggregatedDependencyResolver;
import org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Neo4jHierarchicalgraphPackageImpl extends EPackageImpl implements Neo4jHierarchicalgraphPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass neo4JBackedNodeSourceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass neo4JBackedRootNodeSourceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass iNeo4JRepositoryEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass neo4JRemoteRepositoryEClass = null;

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass neo4JBackedDependencySourceEClass = null;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EDataType futureEDataType = null;

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType consumerEDataType = null;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EDataType jsonArrayEDataType = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EDataType jsonObjectEDataType = null;

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType iAggregatedDependencyResolverEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private Neo4jHierarchicalgraphPackageImpl() {
    super(eNS_URI, Neo4jHierarchicalgraphFactory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Neo4jHierarchicalgraphPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static Neo4jHierarchicalgraphPackage init() {
    if (isInited) return (Neo4jHierarchicalgraphPackage)EPackage.Registry.INSTANCE.getEPackage(Neo4jHierarchicalgraphPackage.eNS_URI);

    // Obtain or create and register package
    Neo4jHierarchicalgraphPackageImpl theNeo4jHierarchicalgraphPackage = (Neo4jHierarchicalgraphPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Neo4jHierarchicalgraphPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Neo4jHierarchicalgraphPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    HierarchicalgraphPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theNeo4jHierarchicalgraphPackage.createPackageContents();

    // Initialize created meta-data
    theNeo4jHierarchicalgraphPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theNeo4jHierarchicalgraphPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Neo4jHierarchicalgraphPackage.eNS_URI, theNeo4jHierarchicalgraphPackage);
    return theNeo4jHierarchicalgraphPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNeo4JBackedNodeSource() {
    return neo4JBackedNodeSourceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getNeo4JBackedNodeSource_Properties() {
    return (EReference)neo4JBackedNodeSourceEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNeo4JBackedNodeSource_Labels() {
    return (EAttribute)neo4JBackedNodeSourceEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNeo4JBackedRootNodeSource() {
    return neo4JBackedRootNodeSourceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNeo4JBackedRootNodeSource_Repository() {
    return (EAttribute)neo4JBackedRootNodeSourceEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNeo4JBackedRootNodeSource_AggregatedDependencyResolver() {
    return (EAttribute)neo4JBackedRootNodeSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getINeo4JRepository() {
    return iNeo4JRepositoryEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getINeo4JRepository_HierarchicalGraphs() {
    return (EReference)iNeo4JRepositoryEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EOperation getINeo4JRepository__GetNodeLabels__long() {
    return iNeo4JRepositoryEClass.getEOperations().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EOperation getINeo4JRepository__GetNodeProperties__long() {
    return iNeo4JRepositoryEClass.getEOperations().get(1);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getINeo4JRepository__GetRelationshipProperties__long() {
    return iNeo4JRepositoryEClass.getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EOperation getINeo4JRepository__ExecuteCypherQuery__String() {
    return iNeo4JRepositoryEClass.getEOperations().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EOperation getINeo4JRepository__ExecuteCypherQuery__String_Map() {
    return iNeo4JRepositoryEClass.getEOperations().get(4);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getINeo4JRepository__ExecuteCypherQuery__String_Consumer() {
    return iNeo4JRepositoryEClass.getEOperations().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getINeo4JRepository__ExecuteCypherQuery__String_Map_Consumer() {
    return iNeo4JRepositoryEClass.getEOperations().get(6);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNeo4JRemoteRepository() {
    return neo4JRemoteRepositoryEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNeo4JRemoteRepository_Name() {
    return (EAttribute)neo4JRemoteRepositoryEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNeo4JRemoteRepository_BaseURI() {
    return (EAttribute)neo4JRemoteRepositoryEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNeo4JRemoteRepository_ThreadPoolSize() {
    return (EAttribute)neo4JRemoteRepositoryEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EOperation getNeo4JRemoteRepository__Init() {
    return neo4JRemoteRepositoryEClass.getEOperations().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EOperation getNeo4JRemoteRepository__Dispose() {
    return neo4JRemoteRepositoryEClass.getEOperations().get(1);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIAggregatedDependencyResolver() {
    return iAggregatedDependencyResolverEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNeo4JBackedDependencySource() {
    return neo4JBackedDependencySourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNeo4JBackedDependencySource_Properties() {
    return (EReference)neo4JBackedDependencySourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNeo4JBackedDependencySource_Type() {
    return (EAttribute)neo4JBackedDependencySourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNeo4JBackedDependencySource_Resolved() {
    return (EAttribute)neo4JBackedDependencySourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EDataType getFuture() {
    return futureEDataType;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getConsumer() {
    return consumerEDataType;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EDataType getJsonArray() {
    return jsonArrayEDataType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EDataType getJsonObject() {
    return jsonObjectEDataType;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Neo4jHierarchicalgraphFactory getNeo4jHierarchicalgraphFactory() {
    return (Neo4jHierarchicalgraphFactory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isCreated = false;

	/**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    neo4JBackedNodeSourceEClass = createEClass(NEO4_JBACKED_NODE_SOURCE);
    createEReference(neo4JBackedNodeSourceEClass, NEO4_JBACKED_NODE_SOURCE__PROPERTIES);
    createEAttribute(neo4JBackedNodeSourceEClass, NEO4_JBACKED_NODE_SOURCE__LABELS);

    neo4JBackedRootNodeSourceEClass = createEClass(NEO4_JBACKED_ROOT_NODE_SOURCE);
    createEAttribute(neo4JBackedRootNodeSourceEClass, NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY);
    createEAttribute(neo4JBackedRootNodeSourceEClass, NEO4_JBACKED_ROOT_NODE_SOURCE__AGGREGATED_DEPENDENCY_RESOLVER);

    neo4JBackedDependencySourceEClass = createEClass(NEO4_JBACKED_DEPENDENCY_SOURCE);
    createEReference(neo4JBackedDependencySourceEClass, NEO4_JBACKED_DEPENDENCY_SOURCE__PROPERTIES);
    createEAttribute(neo4JBackedDependencySourceEClass, NEO4_JBACKED_DEPENDENCY_SOURCE__TYPE);
    createEAttribute(neo4JBackedDependencySourceEClass, NEO4_JBACKED_DEPENDENCY_SOURCE__RESOLVED);

    iNeo4JRepositoryEClass = createEClass(INEO4_JREPOSITORY);
    createEReference(iNeo4JRepositoryEClass, INEO4_JREPOSITORY__HIERARCHICAL_GRAPHS);
    createEOperation(iNeo4JRepositoryEClass, INEO4_JREPOSITORY___GET_NODE_LABELS__LONG);
    createEOperation(iNeo4JRepositoryEClass, INEO4_JREPOSITORY___GET_NODE_PROPERTIES__LONG);
    createEOperation(iNeo4JRepositoryEClass, INEO4_JREPOSITORY___GET_RELATIONSHIP_PROPERTIES__LONG);
    createEOperation(iNeo4JRepositoryEClass, INEO4_JREPOSITORY___EXECUTE_CYPHER_QUERY__STRING);
    createEOperation(iNeo4JRepositoryEClass, INEO4_JREPOSITORY___EXECUTE_CYPHER_QUERY__STRING_MAP);
    createEOperation(iNeo4JRepositoryEClass, INEO4_JREPOSITORY___EXECUTE_CYPHER_QUERY__STRING_CONSUMER);
    createEOperation(iNeo4JRepositoryEClass, INEO4_JREPOSITORY___EXECUTE_CYPHER_QUERY__STRING_MAP_CONSUMER);

    neo4JRemoteRepositoryEClass = createEClass(NEO4_JREMOTE_REPOSITORY);
    createEAttribute(neo4JRemoteRepositoryEClass, NEO4_JREMOTE_REPOSITORY__NAME);
    createEAttribute(neo4JRemoteRepositoryEClass, NEO4_JREMOTE_REPOSITORY__BASE_URI);
    createEAttribute(neo4JRemoteRepositoryEClass, NEO4_JREMOTE_REPOSITORY__THREAD_POOL_SIZE);
    createEOperation(neo4JRemoteRepositoryEClass, NEO4_JREMOTE_REPOSITORY___INIT);
    createEOperation(neo4JRemoteRepositoryEClass, NEO4_JREMOTE_REPOSITORY___DISPOSE);

    // Create data types
    futureEDataType = createEDataType(FUTURE);
    consumerEDataType = createEDataType(CONSUMER);
    jsonArrayEDataType = createEDataType(JSON_ARRAY);
    jsonObjectEDataType = createEDataType(JSON_OBJECT);
    iAggregatedDependencyResolverEDataType = createEDataType(IAGGREGATED_DEPENDENCY_RESOLVER);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    HierarchicalgraphPackage theHierarchicalgraphPackage = (HierarchicalgraphPackage)EPackage.Registry.INSTANCE.getEPackage(HierarchicalgraphPackage.eNS_URI);

    // Create type parameters
    addETypeParameter(futureEDataType, "T");
    addETypeParameter(consumerEDataType, "T");

    // Set bounds for type parameters

    // Add supertypes to classes
    neo4JBackedNodeSourceEClass.getESuperTypes().add(theHierarchicalgraphPackage.getHGNodeSource());
    neo4JBackedRootNodeSourceEClass.getESuperTypes().add(this.getNeo4JBackedNodeSource());
    neo4JBackedDependencySourceEClass.getESuperTypes().add(theHierarchicalgraphPackage.getHGDependencySource());
    neo4JRemoteRepositoryEClass.getESuperTypes().add(this.getINeo4JRepository());

    // Initialize classes, features, and operations; add parameters
    initEClass(neo4JBackedNodeSourceEClass, Neo4JBackedNodeSource.class, "Neo4JBackedNodeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNeo4JBackedNodeSource_Properties(), theHierarchicalgraphPackage.getStringToStringMap(), null, "properties", null, 0, -1, Neo4JBackedNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4JBackedNodeSource_Labels(), ecorePackage.getEString(), "labels", null, 0, -1, Neo4JBackedNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(neo4JBackedRootNodeSourceEClass, Neo4JBackedRootNodeSource.class, "Neo4JBackedRootNodeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNeo4JBackedRootNodeSource_Repository(), ecorePackage.getEJavaObject(), "repository", null, 1, 1, Neo4JBackedRootNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4JBackedRootNodeSource_AggregatedDependencyResolver(), this.getIAggregatedDependencyResolver(), "aggregatedDependencyResolver", null, 1, 1, Neo4JBackedRootNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(neo4JBackedDependencySourceEClass, Neo4JBackedDependencySource.class, "Neo4JBackedDependencySource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNeo4JBackedDependencySource_Properties(), theHierarchicalgraphPackage.getStringToStringMap(), null, "properties", null, 0, -1, Neo4JBackedDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4JBackedDependencySource_Type(), ecorePackage.getEString(), "type", null, 1, 1, Neo4JBackedDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4JBackedDependencySource_Resolved(), ecorePackage.getEBoolean(), "resolved", null, 1, 1, Neo4JBackedDependencySource.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iNeo4JRepositoryEClass, INeo4JRepository.class, "INeo4JRepository", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getINeo4JRepository_HierarchicalGraphs(), theHierarchicalgraphPackage.getHGRootNode(), null, "hierarchicalGraphs", null, 0, -1, INeo4JRepository.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = initEOperation(getINeo4JRepository__GetNodeLabels__long(), this.getJsonArray(), "getNodeLabels", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getELong(), "nodeId", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getINeo4JRepository__GetNodeProperties__long(), this.getJsonObject(), "getNodeProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getELong(), "nodeId", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getINeo4JRepository__GetRelationshipProperties__long(), this.getJsonObject(), "getRelationshipProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getELong(), "nodeId", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getINeo4JRepository__ExecuteCypherQuery__String(), null, "executeCypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEString(), "cypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(this.getFuture());
    EGenericType g2 = createEGenericType(this.getJsonObject());
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = initEOperation(getINeo4JRepository__ExecuteCypherQuery__String_Map(), null, "executeCypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEString(), "cypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEString());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEString());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "params", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getFuture());
    g2 = createEGenericType(this.getJsonObject());
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = initEOperation(getINeo4JRepository__ExecuteCypherQuery__String_Consumer(), null, "executeCypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEString(), "cypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getConsumer());
    g2 = createEGenericType(this.getJsonObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "consumer", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getFuture());
    g2 = createEGenericType();
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = initEOperation(getINeo4JRepository__ExecuteCypherQuery__String_Map_Consumer(), null, "executeCypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEString(), "cypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEString());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEString());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "params", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getConsumer());
    g2 = createEGenericType(this.getJsonObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "consumer", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getFuture());
    g2 = createEGenericType();
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    initEClass(neo4JRemoteRepositoryEClass, Neo4JRemoteRepository.class, "Neo4JRemoteRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNeo4JRemoteRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, Neo4JRemoteRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4JRemoteRepository_BaseURI(), ecorePackage.getEString(), "baseURI", null, 0, 1, Neo4JRemoteRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4JRemoteRepository_ThreadPoolSize(), ecorePackage.getEInt(), "threadPoolSize", null, 0, 1, Neo4JRemoteRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getNeo4JRemoteRepository__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getNeo4JRemoteRepository__Dispose(), null, "dispose", 0, 1, IS_UNIQUE, IS_ORDERED);

    // Initialize data types
    initEDataType(futureEDataType, Future.class, "Future", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(consumerEDataType, Consumer.class, "Consumer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(jsonArrayEDataType, JsonArray.class, "JsonArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(jsonObjectEDataType, JsonObject.class, "JsonObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(iAggregatedDependencyResolverEDataType, IAggregatedDependencyResolver.class, "IAggregatedDependencyResolver", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //Neo4jHierarchicalgraphPackageImpl

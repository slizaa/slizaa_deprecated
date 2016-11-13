/**
 */
package org.slizaa.neo4j.dbadapter.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.concurrent.Future;

import java.util.function.Consumer;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.DbadapterContainer;
import org.slizaa.neo4j.dbadapter.DbadapterFactory;
import org.slizaa.neo4j.dbadapter.DbadapterPackage;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbadapterPackageImpl extends EPackageImpl implements DbadapterPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass neo4jRestClientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dbAdapterRegistryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dbadapterContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass managedNeo4jInstanceEClass = null;

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
  private EDataType iLaunchEDataType = null;

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
   * @see org.slizaa.neo4j.dbadapter.DbadapterPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DbadapterPackageImpl() {
    super(eNS_URI, DbadapterFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DbadapterPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DbadapterPackage init() {
    if (isInited) return (DbadapterPackage)EPackage.Registry.INSTANCE.getEPackage(DbadapterPackage.eNS_URI);

    // Obtain or create and register package
    DbadapterPackageImpl theDbadapterPackage = (DbadapterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DbadapterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DbadapterPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDbadapterPackage.createPackageContents();

    // Initialize created meta-data
    theDbadapterPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDbadapterPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DbadapterPackage.eNS_URI, theDbadapterPackage);
    return theDbadapterPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNeo4jRestClient() {
    return neo4jRestClientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNeo4jRestClient_Name() {
    return (EAttribute)neo4jRestClientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNeo4jRestClient_BaseURI() {
    return (EAttribute)neo4jRestClientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNeo4jRestClient_ThreadPoolSize() {
    return (EAttribute)neo4jRestClientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__Init() {
    return neo4jRestClientEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__Dispose() {
    return neo4jRestClientEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__GetAllRelationshipTypes() {
    return neo4jRestClientEClass.getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__GetAllPropertyKeys() {
    return neo4jRestClientEClass.getEOperations().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__GetAllLabels() {
    return neo4jRestClientEClass.getEOperations().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__GetLabelsForNode__long() {
    return neo4jRestClientEClass.getEOperations().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__GetPropertiesForNode__long() {
    return neo4jRestClientEClass.getEOperations().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__GetPropertiesForRelationship__long() {
    return neo4jRestClientEClass.getEOperations().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__ExecuteCypherQuery__String() {
    return neo4jRestClientEClass.getEOperations().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__ExecuteCypherQuery__String_Map() {
    return neo4jRestClientEClass.getEOperations().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__ExecuteCypherQuery__String_Consumer() {
    return neo4jRestClientEClass.getEOperations().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__ExecuteCypherQuery__String_Map_Consumer() {
    return neo4jRestClientEClass.getEOperations().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDbAdapterRegistry() {
    return dbAdapterRegistryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDbadapterContainer() {
    return dbadapterContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDbadapterContainer_Identifier() {
    return (EAttribute)dbadapterContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDbadapterContainer_Clients() {
    return (EReference)dbadapterContainerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDbadapterContainer_Name() {
    return (EAttribute)dbadapterContainerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManagedNeo4jInstance() {
    return managedNeo4jInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManagedNeo4jInstance_Running() {
    return (EAttribute)managedNeo4jInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManagedNeo4jInstance_StorageArea() {
    return (EAttribute)managedNeo4jInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManagedNeo4jInstance_DirectoriesToScan() {
    return (EAttribute)managedNeo4jInstanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManagedNeo4jInstance_Launch() {
    return (EAttribute)managedNeo4jInstanceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getManagedNeo4jInstance__Scan() {
    return managedNeo4jInstanceEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getManagedNeo4jInstance__IsScanned() {
    return managedNeo4jInstanceEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getManagedNeo4jInstance__Start() {
    return managedNeo4jInstanceEClass.getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getManagedNeo4jInstance__Stop() {
    return managedNeo4jInstanceEClass.getEOperations().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getManagedNeo4jInstance__Delete() {
    return managedNeo4jInstanceEClass.getEOperations().get(4);
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
  public EDataType getILaunch() {
    return iLaunchEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbadapterFactory getDbadapterFactory() {
    return (DbadapterFactory)getEFactoryInstance();
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
    neo4jRestClientEClass = createEClass(NEO4J_REST_CLIENT);
    createEAttribute(neo4jRestClientEClass, NEO4J_REST_CLIENT__NAME);
    createEAttribute(neo4jRestClientEClass, NEO4J_REST_CLIENT__BASE_URI);
    createEAttribute(neo4jRestClientEClass, NEO4J_REST_CLIENT__THREAD_POOL_SIZE);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___INIT);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___DISPOSE);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___GET_ALL_RELATIONSHIP_TYPES);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___GET_ALL_PROPERTY_KEYS);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___GET_ALL_LABELS);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___GET_LABELS_FOR_NODE__LONG);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_NODE__LONG);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_RELATIONSHIP__LONG);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_CONSUMER);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP_CONSUMER);

    dbAdapterRegistryEClass = createEClass(DB_ADAPTER_REGISTRY);

    dbadapterContainerEClass = createEClass(DBADAPTER_CONTAINER);
    createEAttribute(dbadapterContainerEClass, DBADAPTER_CONTAINER__IDENTIFIER);
    createEReference(dbadapterContainerEClass, DBADAPTER_CONTAINER__CLIENTS);
    createEAttribute(dbadapterContainerEClass, DBADAPTER_CONTAINER__NAME);

    managedNeo4jInstanceEClass = createEClass(MANAGED_NEO4J_INSTANCE);
    createEAttribute(managedNeo4jInstanceEClass, MANAGED_NEO4J_INSTANCE__RUNNING);
    createEAttribute(managedNeo4jInstanceEClass, MANAGED_NEO4J_INSTANCE__STORAGE_AREA);
    createEAttribute(managedNeo4jInstanceEClass, MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN);
    createEAttribute(managedNeo4jInstanceEClass, MANAGED_NEO4J_INSTANCE__LAUNCH);
    createEOperation(managedNeo4jInstanceEClass, MANAGED_NEO4J_INSTANCE___SCAN);
    createEOperation(managedNeo4jInstanceEClass, MANAGED_NEO4J_INSTANCE___IS_SCANNED);
    createEOperation(managedNeo4jInstanceEClass, MANAGED_NEO4J_INSTANCE___START);
    createEOperation(managedNeo4jInstanceEClass, MANAGED_NEO4J_INSTANCE___STOP);
    createEOperation(managedNeo4jInstanceEClass, MANAGED_NEO4J_INSTANCE___DELETE);

    // Create data types
    futureEDataType = createEDataType(FUTURE);
    consumerEDataType = createEDataType(CONSUMER);
    jsonArrayEDataType = createEDataType(JSON_ARRAY);
    jsonObjectEDataType = createEDataType(JSON_OBJECT);
    iLaunchEDataType = createEDataType(ILAUNCH);
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

    // Create type parameters
    addETypeParameter(futureEDataType, "T");
    addETypeParameter(consumerEDataType, "T");

    // Set bounds for type parameters

    // Add supertypes to classes
    dbAdapterRegistryEClass.getESuperTypes().add(this.getDbadapterContainer());
    managedNeo4jInstanceEClass.getESuperTypes().add(this.getNeo4jRestClient());

    // Initialize classes, features, and operations; add parameters
    initEClass(neo4jRestClientEClass, Neo4jRestClient.class, "Neo4jRestClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNeo4jRestClient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Neo4jRestClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4jRestClient_BaseURI(), ecorePackage.getEString(), "baseURI", null, 0, 1, Neo4jRestClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4jRestClient_ThreadPoolSize(), ecorePackage.getEInt(), "threadPoolSize", null, 0, 1, Neo4jRestClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getNeo4jRestClient__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getNeo4jRestClient__Dispose(), null, "dispose", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getNeo4jRestClient__GetAllRelationshipTypes(), ecorePackage.getEString(), "getAllRelationshipTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getNeo4jRestClient__GetAllPropertyKeys(), ecorePackage.getEString(), "getAllPropertyKeys", 0, -1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getNeo4jRestClient__GetAllLabels(), ecorePackage.getEString(), "getAllLabels", 0, -1, IS_UNIQUE, IS_ORDERED);

    EOperation op = initEOperation(getNeo4jRestClient__GetLabelsForNode__long(), this.getJsonArray(), "getLabelsForNode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getELong(), "nodeId", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getNeo4jRestClient__GetPropertiesForNode__long(), this.getJsonObject(), "getPropertiesForNode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getELong(), "nodeId", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getNeo4jRestClient__GetPropertiesForRelationship__long(), this.getJsonObject(), "getPropertiesForRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getELong(), "nodeId", 1, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getNeo4jRestClient__ExecuteCypherQuery__String(), null, "executeCypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEString(), "cypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(this.getFuture());
    EGenericType g2 = createEGenericType(this.getJsonObject());
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = initEOperation(getNeo4jRestClient__ExecuteCypherQuery__String_Map(), null, "executeCypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
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

    op = initEOperation(getNeo4jRestClient__ExecuteCypherQuery__String_Consumer(), null, "executeCypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEString(), "cypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getConsumer());
    g2 = createEGenericType(this.getJsonObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "consumer", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getFuture());
    g2 = createEGenericType();
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    op = initEOperation(getNeo4jRestClient__ExecuteCypherQuery__String_Map_Consumer(), null, "executeCypherQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
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

    initEClass(dbAdapterRegistryEClass, DbAdapterRegistry.class, "DbAdapterRegistry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dbadapterContainerEClass, DbadapterContainer.class, "DbadapterContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDbadapterContainer_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, DbadapterContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDbadapterContainer_Clients(), ecorePackage.getEObject(), null, "clients", null, 0, -1, DbadapterContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDbadapterContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, DbadapterContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(managedNeo4jInstanceEClass, ManagedNeo4jInstance.class, "ManagedNeo4jInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getManagedNeo4jInstance_Running(), ecorePackage.getEBoolean(), "running", null, 0, 1, ManagedNeo4jInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManagedNeo4jInstance_StorageArea(), ecorePackage.getEString(), "storageArea", null, 0, 1, ManagedNeo4jInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManagedNeo4jInstance_DirectoriesToScan(), ecorePackage.getEString(), "directoriesToScan", null, 1, -1, ManagedNeo4jInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManagedNeo4jInstance_Launch(), this.getILaunch(), "launch", null, 0, 1, ManagedNeo4jInstance.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getManagedNeo4jInstance__Scan(), null, "scan", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getManagedNeo4jInstance__IsScanned(), ecorePackage.getEBoolean(), "isScanned", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getManagedNeo4jInstance__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getManagedNeo4jInstance__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getManagedNeo4jInstance__Delete(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

    // Initialize data types
    initEDataType(futureEDataType, Future.class, "Future", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(consumerEDataType, Consumer.class, "Consumer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(jsonArrayEDataType, JsonArray.class, "JsonArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(jsonObjectEDataType, JsonObject.class, "JsonObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(iLaunchEDataType, ILaunch.class, "ILaunch", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //DbadapterPackageImpl

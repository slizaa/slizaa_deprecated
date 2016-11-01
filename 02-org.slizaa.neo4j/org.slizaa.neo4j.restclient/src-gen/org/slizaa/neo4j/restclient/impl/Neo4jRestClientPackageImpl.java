/**
 */
package org.slizaa.neo4j.restclient.impl;

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
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.slizaa.neo4j.restclient.Neo4jRestClient;
import org.slizaa.neo4j.restclient.Neo4jRestClientContainer;
import org.slizaa.neo4j.restclient.Neo4jRestClientFactory;
import org.slizaa.neo4j.restclient.Neo4jRestClientPackage;
import org.slizaa.neo4j.restclient.Neo4jRestClientRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Neo4jRestClientPackageImpl extends EPackageImpl implements Neo4jRestClientPackage {
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
  private EClass neo4jRestClientRegistryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass neo4jRestClientContainerEClass = null;

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
   * @see org.slizaa.neo4j.restclient.Neo4jRestClientPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Neo4jRestClientPackageImpl() {
    super(eNS_URI, Neo4jRestClientFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link Neo4jRestClientPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Neo4jRestClientPackage init() {
    if (isInited) return (Neo4jRestClientPackage)EPackage.Registry.INSTANCE.getEPackage(Neo4jRestClientPackage.eNS_URI);

    // Obtain or create and register package
    Neo4jRestClientPackageImpl theNeo4jRestClientPackage = (Neo4jRestClientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Neo4jRestClientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Neo4jRestClientPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theNeo4jRestClientPackage.createPackageContents();

    // Initialize created meta-data
    theNeo4jRestClientPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theNeo4jRestClientPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Neo4jRestClientPackage.eNS_URI, theNeo4jRestClientPackage);
    return theNeo4jRestClientPackage;
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
  public EOperation getNeo4jRestClient__HasExtension__Class() {
    return neo4jRestClientEClass.getEOperations().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__GetExtension__Class() {
    return neo4jRestClientEClass.getEOperations().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4jRestClient__RegisterExtension__Class() {
    return neo4jRestClientEClass.getEOperations().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNeo4jRestClientRegistry() {
    return neo4jRestClientRegistryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNeo4jRestClientContainer() {
    return neo4jRestClientContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNeo4jRestClientContainer_Clients() {
    return (EReference)neo4jRestClientContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNeo4jRestClientContainer_Name() {
    return (EAttribute)neo4jRestClientContainerEClass.getEStructuralFeatures().get(1);
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
  public Neo4jRestClientFactory getNeo4jRestClientFactory() {
    return (Neo4jRestClientFactory)getEFactoryInstance();
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
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___HAS_EXTENSION__CLASS);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___GET_EXTENSION__CLASS);
    createEOperation(neo4jRestClientEClass, NEO4J_REST_CLIENT___REGISTER_EXTENSION__CLASS);

    neo4jRestClientRegistryEClass = createEClass(NEO4J_REST_CLIENT_REGISTRY);

    neo4jRestClientContainerEClass = createEClass(NEO4J_REST_CLIENT_CONTAINER);
    createEReference(neo4jRestClientContainerEClass, NEO4J_REST_CLIENT_CONTAINER__CLIENTS);
    createEAttribute(neo4jRestClientContainerEClass, NEO4J_REST_CLIENT_CONTAINER__NAME);

    // Create data types
    futureEDataType = createEDataType(FUTURE);
    consumerEDataType = createEDataType(CONSUMER);
    jsonArrayEDataType = createEDataType(JSON_ARRAY);
    jsonObjectEDataType = createEDataType(JSON_OBJECT);
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
    neo4jRestClientRegistryEClass.getESuperTypes().add(this.getNeo4jRestClientContainer());

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

    op = initEOperation(getNeo4jRestClient__HasExtension__Class(), ecorePackage.getEBooleanObject(), "hasExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
    ETypeParameter t1 = addETypeParameter(op, "T");
    g1 = createEGenericType(ecorePackage.getEJavaClass());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getNeo4jRestClient__GetExtension__Class(), null, "getExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
    t1 = addETypeParameter(op, "T");
    g1 = createEGenericType(ecorePackage.getEJavaClass());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(t1);
    initEOperation(op, g1);

    op = initEOperation(getNeo4jRestClient__RegisterExtension__Class(), null, "registerExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
    t1 = addETypeParameter(op, "T");
    g1 = createEGenericType(ecorePackage.getEJavaClass());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "key", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(neo4jRestClientRegistryEClass, Neo4jRestClientRegistry.class, "Neo4jRestClientRegistry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(neo4jRestClientContainerEClass, Neo4jRestClientContainer.class, "Neo4jRestClientContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNeo4jRestClientContainer_Clients(), ecorePackage.getEObject(), null, "clients", null, 0, -1, Neo4jRestClientContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4jRestClientContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Neo4jRestClientContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(futureEDataType, Future.class, "Future", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(consumerEDataType, Consumer.class, "Consumer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(jsonArrayEDataType, JsonArray.class, "JsonArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(jsonObjectEDataType, JsonObject.class, "JsonObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //Neo4jRestClientPackageImpl

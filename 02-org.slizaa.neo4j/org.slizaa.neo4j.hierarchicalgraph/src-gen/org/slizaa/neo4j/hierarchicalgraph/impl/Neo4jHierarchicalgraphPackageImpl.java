/**
 */
package org.slizaa.neo4j.hierarchicalgraph.impl;

import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

import org.slizaa.neo4j.restclient.Neo4jRestClientPackage;

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
  private EClass neo4JBackedDependencySourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType optionalEDataType = null;

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
    Neo4jRestClientPackage.eINSTANCE.eClass();

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
  public EReference getNeo4JBackedRootNodeSource_Repository() {
    return (EReference)neo4JBackedRootNodeSourceEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getNeo4JBackedDependencySource_UserObject() {
    return (EAttribute)neo4JBackedDependencySourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getNeo4JBackedDependencySource__GetUserObject__Class() {
    return neo4JBackedDependencySourceEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOptional() {
    return optionalEDataType;
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
    createEReference(neo4JBackedRootNodeSourceEClass, NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY);

    neo4JBackedDependencySourceEClass = createEClass(NEO4_JBACKED_DEPENDENCY_SOURCE);
    createEReference(neo4JBackedDependencySourceEClass, NEO4_JBACKED_DEPENDENCY_SOURCE__PROPERTIES);
    createEAttribute(neo4JBackedDependencySourceEClass, NEO4_JBACKED_DEPENDENCY_SOURCE__TYPE);
    createEAttribute(neo4JBackedDependencySourceEClass, NEO4_JBACKED_DEPENDENCY_SOURCE__USER_OBJECT);
    createEOperation(neo4JBackedDependencySourceEClass, NEO4_JBACKED_DEPENDENCY_SOURCE___GET_USER_OBJECT__CLASS);

    // Create data types
    optionalEDataType = createEDataType(OPTIONAL);
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
    Neo4jRestClientPackage theNeo4jRestClientPackage = (Neo4jRestClientPackage)EPackage.Registry.INSTANCE.getEPackage(Neo4jRestClientPackage.eNS_URI);

    // Create type parameters
    addETypeParameter(optionalEDataType, "T");

    // Set bounds for type parameters

    // Add supertypes to classes
    neo4JBackedNodeSourceEClass.getESuperTypes().add(theHierarchicalgraphPackage.getINodeSource());
    neo4JBackedRootNodeSourceEClass.getESuperTypes().add(this.getNeo4JBackedNodeSource());
    neo4JBackedDependencySourceEClass.getESuperTypes().add(theHierarchicalgraphPackage.getIDependencySource());

    // Initialize classes, features, and operations; add parameters
    initEClass(neo4JBackedNodeSourceEClass, Neo4JBackedNodeSource.class, "Neo4JBackedNodeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNeo4JBackedNodeSource_Properties(), theHierarchicalgraphPackage.getStringToStringMap(), null, "properties", null, 0, -1, Neo4JBackedNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4JBackedNodeSource_Labels(), ecorePackage.getEString(), "labels", null, 0, -1, Neo4JBackedNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(neo4JBackedRootNodeSourceEClass, Neo4JBackedRootNodeSource.class, "Neo4JBackedRootNodeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNeo4JBackedRootNodeSource_Repository(), theNeo4jRestClientPackage.getNeo4jRestClient(), null, "repository", null, 1, 1, Neo4JBackedRootNodeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(neo4JBackedDependencySourceEClass, Neo4JBackedDependencySource.class, "Neo4JBackedDependencySource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNeo4JBackedDependencySource_Properties(), theHierarchicalgraphPackage.getStringToStringMap(), null, "properties", null, 0, -1, Neo4JBackedDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4JBackedDependencySource_Type(), ecorePackage.getEString(), "type", null, 1, 1, Neo4JBackedDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNeo4JBackedDependencySource_UserObject(), ecorePackage.getEJavaObject(), "userObject", null, 0, 1, Neo4JBackedDependencySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = initEOperation(getNeo4JBackedDependencySource__GetUserObject__Class(), null, "getUserObject", 1, 1, IS_UNIQUE, IS_ORDERED);
    ETypeParameter t1 = addETypeParameter(op, "T");
    EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
    EGenericType g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "type", 1, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(this.getOptional());
    g2 = createEGenericType(t1);
    g1.getETypeArguments().add(g2);
    initEOperation(op, g1);

    // Initialize data types
    initEDataType(optionalEDataType, Optional.class, "Optional", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //Neo4jHierarchicalgraphPackageImpl

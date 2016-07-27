/**
 */
package org.slizaa.neo4j.workbenchmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;
import org.slizaa.neo4j.workbenchmodel.Databases;
import org.slizaa.neo4j.workbenchmodel.MappedGraphs;
import org.slizaa.neo4j.workbenchmodel.WorkbenchModel;
import org.slizaa.neo4j.workbenchmodel.WorkbenchmodelFactory;
import org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkbenchmodelPackageImpl extends EPackageImpl implements WorkbenchmodelPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workbenchModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databasesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappedGraphsEClass = null;

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
   * @see org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WorkbenchmodelPackageImpl() {
    super(eNS_URI, WorkbenchmodelFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link WorkbenchmodelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WorkbenchmodelPackage init() {
    if (isInited) return (WorkbenchmodelPackage)EPackage.Registry.INSTANCE.getEPackage(WorkbenchmodelPackage.eNS_URI);

    // Obtain or create and register package
    WorkbenchmodelPackageImpl theWorkbenchmodelPackage = (WorkbenchmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkbenchmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkbenchmodelPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    Neo4jHierarchicalgraphPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theWorkbenchmodelPackage.createPackageContents();

    // Initialize created meta-data
    theWorkbenchmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theWorkbenchmodelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WorkbenchmodelPackage.eNS_URI, theWorkbenchmodelPackage);
    return theWorkbenchmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkbenchModel() {
    return workbenchModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkbenchModel_Databases() {
    return (EReference)workbenchModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkbenchModel_MappedGraphs() {
    return (EReference)workbenchModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabases() {
    return databasesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabases_Content() {
    return (EReference)databasesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappedGraphs() {
    return mappedGraphsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappedGraphs_Content() {
    return (EReference)mappedGraphsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkbenchmodelFactory getWorkbenchmodelFactory() {
    return (WorkbenchmodelFactory)getEFactoryInstance();
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
    workbenchModelEClass = createEClass(WORKBENCH_MODEL);
    createEReference(workbenchModelEClass, WORKBENCH_MODEL__DATABASES);
    createEReference(workbenchModelEClass, WORKBENCH_MODEL__MAPPED_GRAPHS);

    databasesEClass = createEClass(DATABASES);
    createEReference(databasesEClass, DATABASES__CONTENT);

    mappedGraphsEClass = createEClass(MAPPED_GRAPHS);
    createEReference(mappedGraphsEClass, MAPPED_GRAPHS__CONTENT);
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
    Neo4jHierarchicalgraphPackage theNeo4jHierarchicalgraphPackage = (Neo4jHierarchicalgraphPackage)EPackage.Registry.INSTANCE.getEPackage(Neo4jHierarchicalgraphPackage.eNS_URI);
    HierarchicalgraphPackage theHierarchicalgraphPackage = (HierarchicalgraphPackage)EPackage.Registry.INSTANCE.getEPackage(HierarchicalgraphPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(workbenchModelEClass, WorkbenchModel.class, "WorkbenchModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWorkbenchModel_Databases(), this.getDatabases(), null, "databases", null, 1, 1, WorkbenchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkbenchModel_MappedGraphs(), this.getMappedGraphs(), null, "mappedGraphs", null, 0, 1, WorkbenchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databasesEClass, Databases.class, "Databases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatabases_Content(), theNeo4jHierarchicalgraphPackage.getINeo4JRepository(), null, "content", null, 0, -1, Databases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappedGraphsEClass, MappedGraphs.class, "MappedGraphs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMappedGraphs_Content(), theHierarchicalgraphPackage.getHGRootNode(), null, "content", null, 0, -1, MappedGraphs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //WorkbenchmodelPackageImpl

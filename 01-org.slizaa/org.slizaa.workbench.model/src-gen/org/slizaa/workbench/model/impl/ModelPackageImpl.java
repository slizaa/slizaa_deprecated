/**
 */
package org.slizaa.workbench.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

import org.slizaa.hierarchicalgraph.selection.SelectionPackage;

import org.slizaa.workbench.model.ModelFactory;
import org.slizaa.workbench.model.ModelPackage;
import org.slizaa.workbench.model.SlizaaWorkbenchModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slizaaWorkbenchModelEClass = null;

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
   * @see org.slizaa.workbench.model.ModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ModelPackageImpl() {
    super(eNS_URI, ModelFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ModelPackage init() {
    if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

    // Obtain or create and register package
    ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SelectionPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theModelPackage.createPackageContents();

    // Initialize created meta-data
    theModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
    return theModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSlizaaWorkbenchModel() {
    return slizaaWorkbenchModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlizaaWorkbenchModel_RootNode() {
    return (EReference)slizaaWorkbenchModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlizaaWorkbenchModel_NodeSelection() {
    return (EReference)slizaaWorkbenchModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlizaaWorkbenchModel_MainDependencySelection() {
    return (EReference)slizaaWorkbenchModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlizaaWorkbenchModel_DetailDependencySelection() {
    return (EReference)slizaaWorkbenchModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getSlizaaWorkbenchModel__SetNodeSelection__EList() {
    return slizaaWorkbenchModelEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getSlizaaWorkbenchModel__SetMainDependencySelection__EList() {
    return slizaaWorkbenchModelEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getSlizaaWorkbenchModel__SetDetailDependencySelection__EList() {
    return slizaaWorkbenchModelEClass.getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFactory getModelFactory() {
    return (ModelFactory)getEFactoryInstance();
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
    slizaaWorkbenchModelEClass = createEClass(SLIZAA_WORKBENCH_MODEL);
    createEReference(slizaaWorkbenchModelEClass, SLIZAA_WORKBENCH_MODEL__ROOT_NODE);
    createEReference(slizaaWorkbenchModelEClass, SLIZAA_WORKBENCH_MODEL__NODE_SELECTION);
    createEReference(slizaaWorkbenchModelEClass, SLIZAA_WORKBENCH_MODEL__MAIN_DEPENDENCY_SELECTION);
    createEReference(slizaaWorkbenchModelEClass, SLIZAA_WORKBENCH_MODEL__DETAIL_DEPENDENCY_SELECTION);
    createEOperation(slizaaWorkbenchModelEClass, SLIZAA_WORKBENCH_MODEL___SET_NODE_SELECTION__ELIST);
    createEOperation(slizaaWorkbenchModelEClass, SLIZAA_WORKBENCH_MODEL___SET_MAIN_DEPENDENCY_SELECTION__ELIST);
    createEOperation(slizaaWorkbenchModelEClass, SLIZAA_WORKBENCH_MODEL___SET_DETAIL_DEPENDENCY_SELECTION__ELIST);
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
    SelectionPackage theSelectionPackage = (SelectionPackage)EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(slizaaWorkbenchModelEClass, SlizaaWorkbenchModel.class, "SlizaaWorkbenchModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlizaaWorkbenchModel_RootNode(), theHierarchicalgraphPackage.getHGRootNode(), null, "rootNode", null, 0, 1, SlizaaWorkbenchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlizaaWorkbenchModel_NodeSelection(), theSelectionPackage.getNodeSelection(), null, "nodeSelection", null, 0, 1, SlizaaWorkbenchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlizaaWorkbenchModel_MainDependencySelection(), theSelectionPackage.getDependencySelection(), null, "mainDependencySelection", null, 0, 1, SlizaaWorkbenchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlizaaWorkbenchModel_DetailDependencySelection(), theSelectionPackage.getDependencySelection(), null, "detailDependencySelection", null, 0, 1, SlizaaWorkbenchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = initEOperation(getSlizaaWorkbenchModel__SetNodeSelection__EList(), null, "setNodeSelection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theHierarchicalgraphPackage.getHGNode(), "nodes", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getSlizaaWorkbenchModel__SetMainDependencySelection__EList(), null, "setMainDependencySelection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theHierarchicalgraphPackage.getHGNode(), "dependencies", 0, -1, IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getSlizaaWorkbenchModel__SetDetailDependencySelection__EList(), null, "setDetailDependencySelection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theHierarchicalgraphPackage.getHGNode(), "dependencies", 0, -1, IS_UNIQUE, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ModelPackageImpl

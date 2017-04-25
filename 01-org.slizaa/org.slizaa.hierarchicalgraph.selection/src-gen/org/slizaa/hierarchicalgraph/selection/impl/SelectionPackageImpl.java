/**
 */
package org.slizaa.hierarchicalgraph.selection.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.NodeSelection;
import org.slizaa.hierarchicalgraph.selection.Selection;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;
import org.slizaa.hierarchicalgraph.selection.SelectionPackage;
import org.slizaa.hierarchicalgraph.selection.XReferenceSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionPackageImpl extends EPackageImpl implements SelectionPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeSelectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencySelectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xReferenceSelectionEClass = null;

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
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SelectionPackageImpl() {
    super(eNS_URI, SelectionFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SelectionPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SelectionPackage init() {
    if (isInited) return (SelectionPackage)EPackage.Registry.INSTANCE.getEPackage(SelectionPackage.eNS_URI);

    // Obtain or create and register package
    SelectionPackageImpl theSelectionPackage = (SelectionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SelectionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SelectionPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    HierarchicalgraphPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSelectionPackage.createPackageContents();

    // Initialize created meta-data
    theSelectionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSelectionPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SelectionPackage.eNS_URI, theSelectionPackage);
    return theSelectionPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeSelection() {
    return nodeSelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeSelection_Nodes() {
    return (EReference)nodeSelectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependencySelection() {
    return dependencySelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependencySelection_Dependencies() {
    return (EReference)dependencySelectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelection() {
    return selectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXReferenceSelection() {
    return xReferenceSelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXReferenceSelection_IncomingDependencies() {
    return (EReference)xReferenceSelectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXReferenceSelection_OutgoingDependencies() {
    return (EReference)xReferenceSelectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionFactory getSelectionFactory() {
    return (SelectionFactory)getEFactoryInstance();
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
    nodeSelectionEClass = createEClass(NODE_SELECTION);
    createEReference(nodeSelectionEClass, NODE_SELECTION__NODES);

    dependencySelectionEClass = createEClass(DEPENDENCY_SELECTION);
    createEReference(dependencySelectionEClass, DEPENDENCY_SELECTION__DEPENDENCIES);

    selectionEClass = createEClass(SELECTION);

    xReferenceSelectionEClass = createEClass(XREFERENCE_SELECTION);
    createEReference(xReferenceSelectionEClass, XREFERENCE_SELECTION__INCOMING_DEPENDENCIES);
    createEReference(xReferenceSelectionEClass, XREFERENCE_SELECTION__OUTGOING_DEPENDENCIES);
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

    // Set bounds for type parameters

    // Add supertypes to classes
    nodeSelectionEClass.getESuperTypes().add(this.getSelection());
    dependencySelectionEClass.getESuperTypes().add(this.getSelection());
    xReferenceSelectionEClass.getESuperTypes().add(this.getNodeSelection());

    // Initialize classes, features, and operations; add parameters
    initEClass(nodeSelectionEClass, NodeSelection.class, "NodeSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeSelection_Nodes(), theHierarchicalgraphPackage.getHGNode(), null, "nodes", null, 0, -1, NodeSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencySelectionEClass, DependencySelection.class, "DependencySelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependencySelection_Dependencies(), theHierarchicalgraphPackage.getAbstractHGDependency(), null, "dependencies", null, 0, -1, DependencySelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionEClass, Selection.class, "Selection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xReferenceSelectionEClass, XReferenceSelection.class, "XReferenceSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXReferenceSelection_IncomingDependencies(), theHierarchicalgraphPackage.getHGCoreDependency(), null, "incomingDependencies", null, 0, -1, XReferenceSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXReferenceSelection_OutgoingDependencies(), theHierarchicalgraphPackage.getHGCoreDependency(), null, "outgoingDependencies", null, 0, -1, XReferenceSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SelectionPackageImpl

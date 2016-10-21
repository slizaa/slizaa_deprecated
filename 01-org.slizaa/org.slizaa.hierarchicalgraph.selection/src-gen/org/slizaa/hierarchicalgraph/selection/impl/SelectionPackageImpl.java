/**
 */
package org.slizaa.hierarchicalgraph.selection.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

import org.slizaa.hierarchicalgraph.selection.DependencySelectionStack;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;
import org.slizaa.hierarchicalgraph.selection.SelectionPackage;

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
  private EClass dependencySelectionStackEClass = null;

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
  public EClass getDependencySelectionStack() {
    return dependencySelectionStackEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependencySelectionStack_CurrentSelection() {
    return (EReference)dependencySelectionStackEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getDependencySelectionStack__CanGoForward() {
    return dependencySelectionStackEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getDependencySelectionStack__GoForward() {
    return dependencySelectionStackEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getDependencySelectionStack__CanGoBack() {
    return dependencySelectionStackEClass.getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getDependencySelectionStack__GoBack() {
    return dependencySelectionStackEClass.getEOperations().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getDependencySelectionStack__Clear() {
    return dependencySelectionStackEClass.getEOperations().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getDependencySelectionStack__SetSelection__EList() {
    return dependencySelectionStackEClass.getEOperations().get(5);
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
    dependencySelectionStackEClass = createEClass(DEPENDENCY_SELECTION_STACK);
    createEReference(dependencySelectionStackEClass, DEPENDENCY_SELECTION_STACK__CURRENT_SELECTION);
    createEOperation(dependencySelectionStackEClass, DEPENDENCY_SELECTION_STACK___CAN_GO_FORWARD);
    createEOperation(dependencySelectionStackEClass, DEPENDENCY_SELECTION_STACK___GO_FORWARD);
    createEOperation(dependencySelectionStackEClass, DEPENDENCY_SELECTION_STACK___CAN_GO_BACK);
    createEOperation(dependencySelectionStackEClass, DEPENDENCY_SELECTION_STACK___GO_BACK);
    createEOperation(dependencySelectionStackEClass, DEPENDENCY_SELECTION_STACK___CLEAR);
    createEOperation(dependencySelectionStackEClass, DEPENDENCY_SELECTION_STACK___SET_SELECTION__ELIST);
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

    // Initialize classes, features, and operations; add parameters
    initEClass(dependencySelectionStackEClass, DependencySelectionStack.class, "DependencySelectionStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependencySelectionStack_CurrentSelection(), theHierarchicalgraphPackage.getAbstractHGDependency(), null, "currentSelection", null, 0, -1, DependencySelectionStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getDependencySelectionStack__CanGoForward(), ecorePackage.getEBoolean(), "canGoForward", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getDependencySelectionStack__GoForward(), null, "goForward", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getDependencySelectionStack__CanGoBack(), ecorePackage.getEBoolean(), "canGoBack", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getDependencySelectionStack__GoBack(), null, "goBack", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getDependencySelectionStack__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

    EOperation op = initEOperation(getDependencySelectionStack__SetSelection__EList(), null, "setSelection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theHierarchicalgraphPackage.getAbstractHGDependency(), "selection", 0, -1, IS_UNIQUE, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SelectionPackageImpl

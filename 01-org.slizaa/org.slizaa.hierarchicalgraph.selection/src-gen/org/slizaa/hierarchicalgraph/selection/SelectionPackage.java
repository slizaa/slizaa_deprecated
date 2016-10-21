/**
 */
package org.slizaa.hierarchicalgraph.selection;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.slizaa.hierarchicalgraph.selection.SelectionFactory
 * @model kind="package"
 * @generated
 */
public interface SelectionPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "selection";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org/slizaa/hierarchicalgraph/selection";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.slizaa.hierarchicalgraph.selection";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SelectionPackage eINSTANCE = org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl.init();

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.selection.impl.DependencySelectionStackImpl <em>Dependency Selection Stack</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.selection.impl.DependencySelectionStackImpl
   * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getDependencySelectionStack()
   * @generated
   */
  int DEPENDENCY_SELECTION_STACK = 0;

  /**
   * The feature id for the '<em><b>Current Selection</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION_STACK__CURRENT_SELECTION = 0;

  /**
   * The number of structural features of the '<em>Dependency Selection Stack</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION_STACK_FEATURE_COUNT = 1;

  /**
   * The operation id for the '<em>Can Go Forward</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION_STACK___CAN_GO_FORWARD = 0;

  /**
   * The operation id for the '<em>Go Forward</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION_STACK___GO_FORWARD = 1;

  /**
   * The operation id for the '<em>Can Go Back</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION_STACK___CAN_GO_BACK = 2;

  /**
   * The operation id for the '<em>Go Back</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION_STACK___GO_BACK = 3;

  /**
   * The operation id for the '<em>Clear</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION_STACK___CLEAR = 4;

  /**
   * The operation id for the '<em>Set Selection</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION_STACK___SET_SELECTION__ELIST = 5;

  /**
   * The number of operations of the '<em>Dependency Selection Stack</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION_STACK_OPERATION_COUNT = 6;


  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.selection.DependencySelectionStack <em>Dependency Selection Stack</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency Selection Stack</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.DependencySelectionStack
   * @generated
   */
  EClass getDependencySelectionStack();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#getCurrentSelection <em>Current Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Current Selection</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#getCurrentSelection()
   * @see #getDependencySelectionStack()
   * @generated
   */
  EReference getDependencySelectionStack_CurrentSelection();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#canGoForward() <em>Can Go Forward</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Can Go Forward</em>' operation.
   * @see org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#canGoForward()
   * @generated
   */
  EOperation getDependencySelectionStack__CanGoForward();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#goForward() <em>Go Forward</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Go Forward</em>' operation.
   * @see org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#goForward()
   * @generated
   */
  EOperation getDependencySelectionStack__GoForward();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#canGoBack() <em>Can Go Back</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Can Go Back</em>' operation.
   * @see org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#canGoBack()
   * @generated
   */
  EOperation getDependencySelectionStack__CanGoBack();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#goBack() <em>Go Back</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Go Back</em>' operation.
   * @see org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#goBack()
   * @generated
   */
  EOperation getDependencySelectionStack__GoBack();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#clear() <em>Clear</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Clear</em>' operation.
   * @see org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#clear()
   * @generated
   */
  EOperation getDependencySelectionStack__Clear();

  /**
   * Returns the meta object for the '{@link org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#setSelection(org.eclipse.emf.common.util.EList) <em>Set Selection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Set Selection</em>' operation.
   * @see org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#setSelection(org.eclipse.emf.common.util.EList)
   * @generated
   */
  EOperation getDependencySelectionStack__SetSelection__EList();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SelectionFactory getSelectionFactory();

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
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.selection.impl.DependencySelectionStackImpl <em>Dependency Selection Stack</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.selection.impl.DependencySelectionStackImpl
     * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getDependencySelectionStack()
     * @generated
     */
    EClass DEPENDENCY_SELECTION_STACK = eINSTANCE.getDependencySelectionStack();

    /**
     * The meta object literal for the '<em><b>Current Selection</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY_SELECTION_STACK__CURRENT_SELECTION = eINSTANCE.getDependencySelectionStack_CurrentSelection();

    /**
     * The meta object literal for the '<em><b>Can Go Forward</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DEPENDENCY_SELECTION_STACK___CAN_GO_FORWARD = eINSTANCE.getDependencySelectionStack__CanGoForward();

    /**
     * The meta object literal for the '<em><b>Go Forward</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DEPENDENCY_SELECTION_STACK___GO_FORWARD = eINSTANCE.getDependencySelectionStack__GoForward();

    /**
     * The meta object literal for the '<em><b>Can Go Back</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DEPENDENCY_SELECTION_STACK___CAN_GO_BACK = eINSTANCE.getDependencySelectionStack__CanGoBack();

    /**
     * The meta object literal for the '<em><b>Go Back</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DEPENDENCY_SELECTION_STACK___GO_BACK = eINSTANCE.getDependencySelectionStack__GoBack();

    /**
     * The meta object literal for the '<em><b>Clear</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DEPENDENCY_SELECTION_STACK___CLEAR = eINSTANCE.getDependencySelectionStack__Clear();

    /**
     * The meta object literal for the '<em><b>Set Selection</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation DEPENDENCY_SELECTION_STACK___SET_SELECTION__ELIST = eINSTANCE.getDependencySelectionStack__SetSelection__EList();

  }

} //SelectionPackage

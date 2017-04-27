/**
 */
package org.slizaa.hierarchicalgraph.selection;

import org.eclipse.emf.ecore.EClass;
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
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.selection.Selection <em>Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.selection.Selection
   * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getSelection()
   * @generated
   */
  int SELECTION = 2;

  /**
   * The number of structural features of the '<em>Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.selection.impl.NodeSelectionImpl <em>Node Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.selection.impl.NodeSelectionImpl
   * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getNodeSelection()
   * @generated
   */
  int NODE_SELECTION = 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SELECTION__NODES = SELECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SELECTION_FEATURE_COUNT = SELECTION_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Node Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SELECTION_OPERATION_COUNT = SELECTION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.selection.impl.DependencySelectionImpl <em>Dependency Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.selection.impl.DependencySelectionImpl
   * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getDependencySelection()
   * @generated
   */
  int DEPENDENCY_SELECTION = 1;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION__DEPENDENCIES = SELECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dependency Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION_FEATURE_COUNT = SELECTION_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Dependency Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_SELECTION_OPERATION_COUNT = SELECTION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.selection.impl.XReferenceSelectionImpl <em>XReference Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.selection.impl.XReferenceSelectionImpl
   * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getXReferenceSelection()
   * @generated
   */
  int XREFERENCE_SELECTION = 3;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XREFERENCE_SELECTION__NODES = NODE_SELECTION__NODES;

  /**
   * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XREFERENCE_SELECTION__INCOMING_DEPENDENCIES = NODE_SELECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoing Dependencies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XREFERENCE_SELECTION__OUTGOING_DEPENDENCIES = NODE_SELECTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XReference Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XREFERENCE_SELECTION_FEATURE_COUNT = NODE_SELECTION_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>XReference Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XREFERENCE_SELECTION_OPERATION_COUNT = NODE_SELECTION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.slizaa.hierarchicalgraph.selection.impl.SelectionHolderImpl <em>Holder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionHolderImpl
   * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getSelectionHolder()
   * @generated
   */
  int SELECTION_HOLDER = 4;

  /**
   * The feature id for the '<em><b>Selection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_HOLDER__SELECTION = 0;

  /**
   * The number of structural features of the '<em>Holder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_HOLDER_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Holder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_HOLDER_OPERATION_COUNT = 0;

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.selection.NodeSelection <em>Node Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Selection</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.NodeSelection
   * @generated
   */
  EClass getNodeSelection();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.selection.NodeSelection#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Nodes</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.NodeSelection#getNodes()
   * @see #getNodeSelection()
   * @generated
   */
  EReference getNodeSelection_Nodes();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.selection.DependencySelection <em>Dependency Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency Selection</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.DependencySelection
   * @generated
   */
  EClass getDependencySelection();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.selection.DependencySelection#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Dependencies</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.DependencySelection#getDependencies()
   * @see #getDependencySelection()
   * @generated
   */
  EReference getDependencySelection_Dependencies();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.selection.Selection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.Selection
   * @generated
   */
  EClass getSelection();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.selection.XReferenceSelection <em>XReference Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XReference Selection</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.XReferenceSelection
   * @generated
   */
  EClass getXReferenceSelection();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.selection.XReferenceSelection#getIncomingDependencies <em>Incoming Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming Dependencies</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.XReferenceSelection#getIncomingDependencies()
   * @see #getXReferenceSelection()
   * @generated
   */
  EReference getXReferenceSelection_IncomingDependencies();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.hierarchicalgraph.selection.XReferenceSelection#getOutgoingDependencies <em>Outgoing Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing Dependencies</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.XReferenceSelection#getOutgoingDependencies()
   * @see #getXReferenceSelection()
   * @generated
   */
  EReference getXReferenceSelection_OutgoingDependencies();

  /**
   * Returns the meta object for class '{@link org.slizaa.hierarchicalgraph.selection.SelectionHolder <em>Holder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Holder</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.SelectionHolder
   * @generated
   */
  EClass getSelectionHolder();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.hierarchicalgraph.selection.SelectionHolder#getSelection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Selection</em>'.
   * @see org.slizaa.hierarchicalgraph.selection.SelectionHolder#getSelection()
   * @see #getSelectionHolder()
   * @generated
   */
  EReference getSelectionHolder_Selection();

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
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.selection.impl.NodeSelectionImpl <em>Node Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.selection.impl.NodeSelectionImpl
     * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getNodeSelection()
     * @generated
     */
    EClass NODE_SELECTION = eINSTANCE.getNodeSelection();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_SELECTION__NODES = eINSTANCE.getNodeSelection_Nodes();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.selection.impl.DependencySelectionImpl <em>Dependency Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.selection.impl.DependencySelectionImpl
     * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getDependencySelection()
     * @generated
     */
    EClass DEPENDENCY_SELECTION = eINSTANCE.getDependencySelection();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY_SELECTION__DEPENDENCIES = eINSTANCE.getDependencySelection_Dependencies();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.selection.Selection <em>Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.selection.Selection
     * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getSelection()
     * @generated
     */
    EClass SELECTION = eINSTANCE.getSelection();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.selection.impl.XReferenceSelectionImpl <em>XReference Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.selection.impl.XReferenceSelectionImpl
     * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getXReferenceSelection()
     * @generated
     */
    EClass XREFERENCE_SELECTION = eINSTANCE.getXReferenceSelection();

    /**
     * The meta object literal for the '<em><b>Incoming Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XREFERENCE_SELECTION__INCOMING_DEPENDENCIES = eINSTANCE.getXReferenceSelection_IncomingDependencies();

    /**
     * The meta object literal for the '<em><b>Outgoing Dependencies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XREFERENCE_SELECTION__OUTGOING_DEPENDENCIES = eINSTANCE.getXReferenceSelection_OutgoingDependencies();

    /**
     * The meta object literal for the '{@link org.slizaa.hierarchicalgraph.selection.impl.SelectionHolderImpl <em>Holder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionHolderImpl
     * @see org.slizaa.hierarchicalgraph.selection.impl.SelectionPackageImpl#getSelectionHolder()
     * @generated
     */
    EClass SELECTION_HOLDER = eINSTANCE.getSelectionHolder();

    /**
     * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION_HOLDER__SELECTION = eINSTANCE.getSelectionHolder_Selection();

  }

} //SelectionPackage

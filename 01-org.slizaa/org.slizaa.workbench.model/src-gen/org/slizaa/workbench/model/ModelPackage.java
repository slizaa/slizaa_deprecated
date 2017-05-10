/**
 */
package org.slizaa.workbench.model;

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
 * @see org.slizaa.workbench.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "model";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org/slizaa/workbench/model";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.slizaa.workbench.model";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelPackage eINSTANCE = org.slizaa.workbench.model.impl.ModelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.slizaa.workbench.model.impl.SlizaaWorkbenchModelImpl <em>Slizaa Workbench Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.workbench.model.impl.SlizaaWorkbenchModelImpl
   * @see org.slizaa.workbench.model.impl.ModelPackageImpl#getSlizaaWorkbenchModel()
   * @generated
   */
  int SLIZAA_WORKBENCH_MODEL = 0;

  /**
   * The feature id for the '<em><b>Root Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIZAA_WORKBENCH_MODEL__ROOT_NODE = 0;

  /**
   * The feature id for the '<em><b>Node Selection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIZAA_WORKBENCH_MODEL__NODE_SELECTION = 1;

  /**
   * The feature id for the '<em><b>Main Dependency Selection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIZAA_WORKBENCH_MODEL__MAIN_DEPENDENCY_SELECTION = 2;

  /**
   * The feature id for the '<em><b>Detail Dependency Selection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIZAA_WORKBENCH_MODEL__DETAIL_DEPENDENCY_SELECTION = 3;

  /**
   * The number of structural features of the '<em>Slizaa Workbench Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIZAA_WORKBENCH_MODEL_FEATURE_COUNT = 4;

  /**
   * The operation id for the '<em>Set Node Selection</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIZAA_WORKBENCH_MODEL___SET_NODE_SELECTION__ELIST = 0;

  /**
   * The operation id for the '<em>Set Main Dependency Selection</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIZAA_WORKBENCH_MODEL___SET_MAIN_DEPENDENCY_SELECTION__ELIST = 1;

  /**
   * The operation id for the '<em>Set Detail Dependency Selection</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIZAA_WORKBENCH_MODEL___SET_DETAIL_DEPENDENCY_SELECTION__ELIST = 2;

  /**
   * The number of operations of the '<em>Slizaa Workbench Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLIZAA_WORKBENCH_MODEL_OPERATION_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel <em>Slizaa Workbench Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slizaa Workbench Model</em>'.
   * @see org.slizaa.workbench.model.SlizaaWorkbenchModel
   * @generated
   */
  EClass getSlizaaWorkbenchModel();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getRootNode <em>Root Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Root Node</em>'.
   * @see org.slizaa.workbench.model.SlizaaWorkbenchModel#getRootNode()
   * @see #getSlizaaWorkbenchModel()
   * @generated
   */
  EReference getSlizaaWorkbenchModel_RootNode();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getNodeSelection <em>Node Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Node Selection</em>'.
   * @see org.slizaa.workbench.model.SlizaaWorkbenchModel#getNodeSelection()
   * @see #getSlizaaWorkbenchModel()
   * @generated
   */
  EReference getSlizaaWorkbenchModel_NodeSelection();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getMainDependencySelection <em>Main Dependency Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Main Dependency Selection</em>'.
   * @see org.slizaa.workbench.model.SlizaaWorkbenchModel#getMainDependencySelection()
   * @see #getSlizaaWorkbenchModel()
   * @generated
   */
  EReference getSlizaaWorkbenchModel_MainDependencySelection();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getDetailDependencySelection <em>Detail Dependency Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Detail Dependency Selection</em>'.
   * @see org.slizaa.workbench.model.SlizaaWorkbenchModel#getDetailDependencySelection()
   * @see #getSlizaaWorkbenchModel()
   * @generated
   */
  EReference getSlizaaWorkbenchModel_DetailDependencySelection();

  /**
   * Returns the meta object for the '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#setNodeSelection(org.eclipse.emf.common.util.EList) <em>Set Node Selection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Set Node Selection</em>' operation.
   * @see org.slizaa.workbench.model.SlizaaWorkbenchModel#setNodeSelection(org.eclipse.emf.common.util.EList)
   * @generated
   */
  EOperation getSlizaaWorkbenchModel__SetNodeSelection__EList();

  /**
   * Returns the meta object for the '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#setMainDependencySelection(org.eclipse.emf.common.util.EList) <em>Set Main Dependency Selection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Set Main Dependency Selection</em>' operation.
   * @see org.slizaa.workbench.model.SlizaaWorkbenchModel#setMainDependencySelection(org.eclipse.emf.common.util.EList)
   * @generated
   */
  EOperation getSlizaaWorkbenchModel__SetMainDependencySelection__EList();

  /**
   * Returns the meta object for the '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#setDetailDependencySelection(org.eclipse.emf.common.util.EList) <em>Set Detail Dependency Selection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Set Detail Dependency Selection</em>' operation.
   * @see org.slizaa.workbench.model.SlizaaWorkbenchModel#setDetailDependencySelection(org.eclipse.emf.common.util.EList)
   * @generated
   */
  EOperation getSlizaaWorkbenchModel__SetDetailDependencySelection__EList();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModelFactory getModelFactory();

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
     * The meta object literal for the '{@link org.slizaa.workbench.model.impl.SlizaaWorkbenchModelImpl <em>Slizaa Workbench Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.workbench.model.impl.SlizaaWorkbenchModelImpl
     * @see org.slizaa.workbench.model.impl.ModelPackageImpl#getSlizaaWorkbenchModel()
     * @generated
     */
    EClass SLIZAA_WORKBENCH_MODEL = eINSTANCE.getSlizaaWorkbenchModel();

    /**
     * The meta object literal for the '<em><b>Root Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLIZAA_WORKBENCH_MODEL__ROOT_NODE = eINSTANCE.getSlizaaWorkbenchModel_RootNode();

    /**
     * The meta object literal for the '<em><b>Node Selection</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLIZAA_WORKBENCH_MODEL__NODE_SELECTION = eINSTANCE.getSlizaaWorkbenchModel_NodeSelection();

    /**
     * The meta object literal for the '<em><b>Main Dependency Selection</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLIZAA_WORKBENCH_MODEL__MAIN_DEPENDENCY_SELECTION = eINSTANCE.getSlizaaWorkbenchModel_MainDependencySelection();

    /**
     * The meta object literal for the '<em><b>Detail Dependency Selection</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLIZAA_WORKBENCH_MODEL__DETAIL_DEPENDENCY_SELECTION = eINSTANCE.getSlizaaWorkbenchModel_DetailDependencySelection();

    /**
     * The meta object literal for the '<em><b>Set Node Selection</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SLIZAA_WORKBENCH_MODEL___SET_NODE_SELECTION__ELIST = eINSTANCE.getSlizaaWorkbenchModel__SetNodeSelection__EList();

    /**
     * The meta object literal for the '<em><b>Set Main Dependency Selection</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SLIZAA_WORKBENCH_MODEL___SET_MAIN_DEPENDENCY_SELECTION__ELIST = eINSTANCE.getSlizaaWorkbenchModel__SetMainDependencySelection__EList();

    /**
     * The meta object literal for the '<em><b>Set Detail Dependency Selection</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SLIZAA_WORKBENCH_MODEL___SET_DETAIL_DEPENDENCY_SELECTION__ELIST = eINSTANCE.getSlizaaWorkbenchModel__SetDetailDependencySelection__EList();

  }

} //ModelPackage

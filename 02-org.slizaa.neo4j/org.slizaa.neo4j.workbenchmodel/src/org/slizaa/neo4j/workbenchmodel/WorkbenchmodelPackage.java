/**
 */
package org.slizaa.neo4j.workbenchmodel;

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
 * @see org.slizaa.neo4j.workbenchmodel.WorkbenchmodelFactory
 * @model kind="package"
 * @generated
 */
public interface WorkbenchmodelPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "workbenchmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org/slizaa/neo4j/workbenchmodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.slizaa.neo4j.workbenchmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WorkbenchmodelPackage eINSTANCE = org.slizaa.neo4j.workbenchmodel.impl.WorkbenchmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.workbenchmodel.impl.WorkbenchModelImpl <em>Workbench Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.workbenchmodel.impl.WorkbenchModelImpl
   * @see org.slizaa.neo4j.workbenchmodel.impl.WorkbenchmodelPackageImpl#getWorkbenchModel()
   * @generated
   */
  int WORKBENCH_MODEL = 0;

  /**
   * The feature id for the '<em><b>Databases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKBENCH_MODEL__DATABASES = 0;

  /**
   * The feature id for the '<em><b>Mapped Graphs</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKBENCH_MODEL__MAPPED_GRAPHS = 1;

  /**
   * The number of structural features of the '<em>Workbench Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKBENCH_MODEL_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Workbench Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKBENCH_MODEL_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.workbenchmodel.impl.DatabasesImpl <em>Databases</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.workbenchmodel.impl.DatabasesImpl
   * @see org.slizaa.neo4j.workbenchmodel.impl.WorkbenchmodelPackageImpl#getDatabases()
   * @generated
   */
  int DATABASES = 1;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASES__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Databases</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASES_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Databases</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASES_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.workbenchmodel.impl.MappedGraphsImpl <em>Mapped Graphs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.workbenchmodel.impl.MappedGraphsImpl
   * @see org.slizaa.neo4j.workbenchmodel.impl.WorkbenchmodelPackageImpl#getMappedGraphs()
   * @generated
   */
  int MAPPED_GRAPHS = 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_GRAPHS__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Mapped Graphs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_GRAPHS_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Mapped Graphs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_GRAPHS_OPERATION_COUNT = 0;

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.workbenchmodel.WorkbenchModel <em>Workbench Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workbench Model</em>'.
   * @see org.slizaa.neo4j.workbenchmodel.WorkbenchModel
   * @generated
   */
  EClass getWorkbenchModel();

  /**
   * Returns the meta object for the containment reference '{@link org.slizaa.neo4j.workbenchmodel.WorkbenchModel#getDatabases <em>Databases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Databases</em>'.
   * @see org.slizaa.neo4j.workbenchmodel.WorkbenchModel#getDatabases()
   * @see #getWorkbenchModel()
   * @generated
   */
  EReference getWorkbenchModel_Databases();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.neo4j.workbenchmodel.WorkbenchModel#getMappedGraphs <em>Mapped Graphs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mapped Graphs</em>'.
   * @see org.slizaa.neo4j.workbenchmodel.WorkbenchModel#getMappedGraphs()
   * @see #getWorkbenchModel()
   * @generated
   */
  EReference getWorkbenchModel_MappedGraphs();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.workbenchmodel.Databases <em>Databases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Databases</em>'.
   * @see org.slizaa.neo4j.workbenchmodel.Databases
   * @generated
   */
  EClass getDatabases();

  /**
   * Returns the meta object for the containment reference list '{@link org.slizaa.neo4j.workbenchmodel.Databases#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.slizaa.neo4j.workbenchmodel.Databases#getContent()
   * @see #getDatabases()
   * @generated
   */
  EReference getDatabases_Content();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.workbenchmodel.MappedGraphs <em>Mapped Graphs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapped Graphs</em>'.
   * @see org.slizaa.neo4j.workbenchmodel.MappedGraphs
   * @generated
   */
  EClass getMappedGraphs();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.neo4j.workbenchmodel.MappedGraphs#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Content</em>'.
   * @see org.slizaa.neo4j.workbenchmodel.MappedGraphs#getContent()
   * @see #getMappedGraphs()
   * @generated
   */
  EReference getMappedGraphs_Content();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WorkbenchmodelFactory getWorkbenchmodelFactory();

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
     * The meta object literal for the '{@link org.slizaa.neo4j.workbenchmodel.impl.WorkbenchModelImpl <em>Workbench Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.workbenchmodel.impl.WorkbenchModelImpl
     * @see org.slizaa.neo4j.workbenchmodel.impl.WorkbenchmodelPackageImpl#getWorkbenchModel()
     * @generated
     */
    EClass WORKBENCH_MODEL = eINSTANCE.getWorkbenchModel();

    /**
     * The meta object literal for the '<em><b>Databases</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKBENCH_MODEL__DATABASES = eINSTANCE.getWorkbenchModel_Databases();

    /**
     * The meta object literal for the '<em><b>Mapped Graphs</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKBENCH_MODEL__MAPPED_GRAPHS = eINSTANCE.getWorkbenchModel_MappedGraphs();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.workbenchmodel.impl.DatabasesImpl <em>Databases</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.workbenchmodel.impl.DatabasesImpl
     * @see org.slizaa.neo4j.workbenchmodel.impl.WorkbenchmodelPackageImpl#getDatabases()
     * @generated
     */
    EClass DATABASES = eINSTANCE.getDatabases();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASES__CONTENT = eINSTANCE.getDatabases_Content();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.workbenchmodel.impl.MappedGraphsImpl <em>Mapped Graphs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.workbenchmodel.impl.MappedGraphsImpl
     * @see org.slizaa.neo4j.workbenchmodel.impl.WorkbenchmodelPackageImpl#getMappedGraphs()
     * @generated
     */
    EClass MAPPED_GRAPHS = eINSTANCE.getMappedGraphs();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPED_GRAPHS__CONTENT = eINSTANCE.getMappedGraphs_Content();

  }

} //WorkbenchmodelPackage

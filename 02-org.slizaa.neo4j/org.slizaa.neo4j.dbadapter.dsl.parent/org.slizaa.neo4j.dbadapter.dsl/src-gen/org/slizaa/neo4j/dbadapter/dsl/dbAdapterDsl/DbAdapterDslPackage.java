/**
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDslFactory
 * @model kind="package"
 * @generated
 */
public interface DbAdapterDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dbAdapterDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.slizaa.org/neo4j/dbadapter/dsl/DbAdapterDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dbAdapterDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DbAdapterDslPackage eINSTANCE = org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.DbAdapterDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.DbAdapterDefinitionImpl <em>Db Adapter Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.DbAdapterDefinitionImpl
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.DbAdapterDslPackageImpl#getDbAdapterDefinition()
   * @generated
   */
  int DB_ADAPTER_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_DEFINITION__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Db Adapter Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_ADAPTER_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.UnmanagedRemoteDatabaseImpl <em>Unmanaged Remote Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.UnmanagedRemoteDatabaseImpl
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.DbAdapterDslPackageImpl#getUnmanagedRemoteDatabase()
   * @generated
   */
  int UNMANAGED_REMOTE_DATABASE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNMANAGED_REMOTE_DATABASE__NAME = DB_ADAPTER_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNMANAGED_REMOTE_DATABASE__DESCRIPTION = DB_ADAPTER_DEFINITION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNMANAGED_REMOTE_DATABASE__URI = DB_ADAPTER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unmanaged Remote Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNMANAGED_REMOTE_DATABASE_FEATURE_COUNT = DB_ADAPTER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.ManagedLocalDatabaseImpl <em>Managed Local Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.ManagedLocalDatabaseImpl
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.DbAdapterDslPackageImpl#getManagedLocalDatabase()
   * @generated
   */
  int MANAGED_LOCAL_DATABASE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_LOCAL_DATABASE__NAME = DB_ADAPTER_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_LOCAL_DATABASE__DESCRIPTION = DB_ADAPTER_DEFINITION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_LOCAL_DATABASE__PORT = DB_ADAPTER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Storage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_LOCAL_DATABASE__STORAGE = DB_ADAPTER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Files</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_LOCAL_DATABASE__FILES = DB_ADAPTER_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Managed Local Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_LOCAL_DATABASE_FEATURE_COUNT = DB_ADAPTER_DEFINITION_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDefinition <em>Db Adapter Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Db Adapter Definition</em>'.
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDefinition
   * @generated
   */
  EClass getDbAdapterDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDefinition#getName()
   * @see #getDbAdapterDefinition()
   * @generated
   */
  EAttribute getDbAdapterDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDefinition#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDefinition#getDescription()
   * @see #getDbAdapterDefinition()
   * @generated
   */
  EAttribute getDbAdapterDefinition_Description();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.UnmanagedRemoteDatabase <em>Unmanaged Remote Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unmanaged Remote Database</em>'.
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.UnmanagedRemoteDatabase
   * @generated
   */
  EClass getUnmanagedRemoteDatabase();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.UnmanagedRemoteDatabase#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.UnmanagedRemoteDatabase#getUri()
   * @see #getUnmanagedRemoteDatabase()
   * @generated
   */
  EAttribute getUnmanagedRemoteDatabase_Uri();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase <em>Managed Local Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Managed Local Database</em>'.
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase
   * @generated
   */
  EClass getManagedLocalDatabase();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase#getPort()
   * @see #getManagedLocalDatabase()
   * @generated
   */
  EAttribute getManagedLocalDatabase_Port();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase#getStorage <em>Storage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Storage</em>'.
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase#getStorage()
   * @see #getManagedLocalDatabase()
   * @generated
   */
  EAttribute getManagedLocalDatabase_Storage();

  /**
   * Returns the meta object for the attribute list '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase#getFiles <em>Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Files</em>'.
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase#getFiles()
   * @see #getManagedLocalDatabase()
   * @generated
   */
  EAttribute getManagedLocalDatabase_Files();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DbAdapterDslFactory getDbAdapterDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.DbAdapterDefinitionImpl <em>Db Adapter Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.DbAdapterDefinitionImpl
     * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.DbAdapterDslPackageImpl#getDbAdapterDefinition()
     * @generated
     */
    EClass DB_ADAPTER_DEFINITION = eINSTANCE.getDbAdapterDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DB_ADAPTER_DEFINITION__NAME = eINSTANCE.getDbAdapterDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DB_ADAPTER_DEFINITION__DESCRIPTION = eINSTANCE.getDbAdapterDefinition_Description();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.UnmanagedRemoteDatabaseImpl <em>Unmanaged Remote Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.UnmanagedRemoteDatabaseImpl
     * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.DbAdapterDslPackageImpl#getUnmanagedRemoteDatabase()
     * @generated
     */
    EClass UNMANAGED_REMOTE_DATABASE = eINSTANCE.getUnmanagedRemoteDatabase();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNMANAGED_REMOTE_DATABASE__URI = eINSTANCE.getUnmanagedRemoteDatabase_Uri();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.ManagedLocalDatabaseImpl <em>Managed Local Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.ManagedLocalDatabaseImpl
     * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.DbAdapterDslPackageImpl#getManagedLocalDatabase()
     * @generated
     */
    EClass MANAGED_LOCAL_DATABASE = eINSTANCE.getManagedLocalDatabase();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANAGED_LOCAL_DATABASE__PORT = eINSTANCE.getManagedLocalDatabase_Port();

    /**
     * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANAGED_LOCAL_DATABASE__STORAGE = eINSTANCE.getManagedLocalDatabase_Storage();

    /**
     * The meta object literal for the '<em><b>Files</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANAGED_LOCAL_DATABASE__FILES = eINSTANCE.getManagedLocalDatabase_Files();

  }

} //DbAdapterDslPackage
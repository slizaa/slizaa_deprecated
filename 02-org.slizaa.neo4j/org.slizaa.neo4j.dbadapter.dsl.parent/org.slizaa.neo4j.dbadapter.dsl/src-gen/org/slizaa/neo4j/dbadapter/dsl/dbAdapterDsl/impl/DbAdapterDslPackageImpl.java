/**
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDefinition;
import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDslFactory;
import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDslPackage;
import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase;
import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.UnmanagedRemoteDatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbAdapterDslPackageImpl extends EPackageImpl implements DbAdapterDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dbAdapterDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unmanagedRemoteDatabaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass managedLocalDatabaseEClass = null;

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
   * @see org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DbAdapterDslPackageImpl()
  {
    super(eNS_URI, DbAdapterDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DbAdapterDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DbAdapterDslPackage init()
  {
    if (isInited) return (DbAdapterDslPackage)EPackage.Registry.INSTANCE.getEPackage(DbAdapterDslPackage.eNS_URI);

    // Obtain or create and register package
    DbAdapterDslPackageImpl theDbAdapterDslPackage = (DbAdapterDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DbAdapterDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DbAdapterDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDbAdapterDslPackage.createPackageContents();

    // Initialize created meta-data
    theDbAdapterDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDbAdapterDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DbAdapterDslPackage.eNS_URI, theDbAdapterDslPackage);
    return theDbAdapterDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDbAdapterDefinition()
  {
    return dbAdapterDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDbAdapterDefinition_Name()
  {
    return (EAttribute)dbAdapterDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDbAdapterDefinition_Description()
  {
    return (EAttribute)dbAdapterDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnmanagedRemoteDatabase()
  {
    return unmanagedRemoteDatabaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnmanagedRemoteDatabase_Uri()
  {
    return (EAttribute)unmanagedRemoteDatabaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManagedLocalDatabase()
  {
    return managedLocalDatabaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManagedLocalDatabase_Port()
  {
    return (EAttribute)managedLocalDatabaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManagedLocalDatabase_Storage()
  {
    return (EAttribute)managedLocalDatabaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManagedLocalDatabase_Files()
  {
    return (EAttribute)managedLocalDatabaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbAdapterDslFactory getDbAdapterDslFactory()
  {
    return (DbAdapterDslFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dbAdapterDefinitionEClass = createEClass(DB_ADAPTER_DEFINITION);
    createEAttribute(dbAdapterDefinitionEClass, DB_ADAPTER_DEFINITION__NAME);
    createEAttribute(dbAdapterDefinitionEClass, DB_ADAPTER_DEFINITION__DESCRIPTION);

    unmanagedRemoteDatabaseEClass = createEClass(UNMANAGED_REMOTE_DATABASE);
    createEAttribute(unmanagedRemoteDatabaseEClass, UNMANAGED_REMOTE_DATABASE__URI);

    managedLocalDatabaseEClass = createEClass(MANAGED_LOCAL_DATABASE);
    createEAttribute(managedLocalDatabaseEClass, MANAGED_LOCAL_DATABASE__PORT);
    createEAttribute(managedLocalDatabaseEClass, MANAGED_LOCAL_DATABASE__STORAGE);
    createEAttribute(managedLocalDatabaseEClass, MANAGED_LOCAL_DATABASE__FILES);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    unmanagedRemoteDatabaseEClass.getESuperTypes().add(this.getDbAdapterDefinition());
    managedLocalDatabaseEClass.getESuperTypes().add(this.getDbAdapterDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(dbAdapterDefinitionEClass, DbAdapterDefinition.class, "DbAdapterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDbAdapterDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, DbAdapterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDbAdapterDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1, DbAdapterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unmanagedRemoteDatabaseEClass, UnmanagedRemoteDatabase.class, "UnmanagedRemoteDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnmanagedRemoteDatabase_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, UnmanagedRemoteDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(managedLocalDatabaseEClass, ManagedLocalDatabase.class, "ManagedLocalDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getManagedLocalDatabase_Port(), ecorePackage.getEInt(), "port", null, 0, 1, ManagedLocalDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManagedLocalDatabase_Storage(), ecorePackage.getEString(), "storage", null, 0, 1, ManagedLocalDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManagedLocalDatabase_Files(), ecorePackage.getEString(), "files", null, 0, -1, ManagedLocalDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DbAdapterDslPackageImpl
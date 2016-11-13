/**
 */
package org.slizaa.neo4j.dbadapter.impl;

import java.util.concurrent.Future;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.DbadapterContainer;
import org.slizaa.neo4j.dbadapter.DbadapterFactory;
import org.slizaa.neo4j.dbadapter.DbadapterPackage;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbadapterFactoryImpl extends EFactoryImpl implements DbadapterFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DbadapterFactory init() {
    try {
      DbadapterFactory theDbadapterFactory = (DbadapterFactory)EPackage.Registry.INSTANCE.getEFactory(DbadapterPackage.eNS_URI);
      if (theDbadapterFactory != null) {
        return theDbadapterFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DbadapterFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbadapterFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case DbadapterPackage.NEO4J_REST_CLIENT: return createNeo4jRestClient();
      case DbadapterPackage.DB_ADAPTER_REGISTRY: return createDbAdapterRegistry();
      case DbadapterPackage.DBADAPTER_CONTAINER: return createDbadapterContainer();
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE: return createManagedNeo4jInstance();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case DbadapterPackage.FUTURE:
        return createFutureFromString(eDataType, initialValue);
      case DbadapterPackage.CONSUMER:
        return createConsumerFromString(eDataType, initialValue);
      case DbadapterPackage.JSON_ARRAY:
        return createJsonArrayFromString(eDataType, initialValue);
      case DbadapterPackage.JSON_OBJECT:
        return createJsonObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case DbadapterPackage.FUTURE:
        return convertFutureToString(eDataType, instanceValue);
      case DbadapterPackage.CONSUMER:
        return convertConsumerToString(eDataType, instanceValue);
      case DbadapterPackage.JSON_ARRAY:
        return convertJsonArrayToString(eDataType, instanceValue);
      case DbadapterPackage.JSON_OBJECT:
        return convertJsonObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Neo4jRestClient createNeo4jRestClient() {
    Neo4jRestClientImpl neo4jRestClient = new ExtendedNeo4JRemoteRepositoryImpl();
    return neo4jRestClient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbAdapterRegistry createDbAdapterRegistry() {
    DbAdapterRegistryImpl dbAdapterRegistry = new DbAdapterRegistryImpl();
    return dbAdapterRegistry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbadapterContainer createDbadapterContainer() {
    DbadapterContainerImpl dbadapterContainer = new DbadapterContainerImpl();
    return dbadapterContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public ManagedNeo4jInstance createManagedNeo4jInstance() {
    ManagedNeo4jInstanceImpl managedNeo4jInstance = new ExtendedManagedNeo4JInstanceImpl();
    return managedNeo4jInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Future<?> createFutureFromString(EDataType eDataType, String initialValue) {
    return (Future<?>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFutureToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Consumer<?> createConsumerFromString(EDataType eDataType, String initialValue) {
    return (Consumer<?>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConsumerToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonArray createJsonArrayFromString(EDataType eDataType, String initialValue) {
    return (JsonArray)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJsonArrayToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonObject createJsonObjectFromString(EDataType eDataType, String initialValue) {
    return (JsonObject)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJsonObjectToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbadapterPackage getDbadapterPackage() {
    return (DbadapterPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DbadapterPackage getPackage() {
    return DbadapterPackage.eINSTANCE;
  }

} //DbadapterFactoryImpl

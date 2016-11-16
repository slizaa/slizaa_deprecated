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
import org.slizaa.neo4j.dbadapter.*;
import org.slizaa.neo4j.dbadapter.DbAdapterContainer;
import org.slizaa.neo4j.dbadapter.DbAdapterFactory;
import org.slizaa.neo4j.dbadapter.DbAdapterPackage;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class DbAdapterFactoryImpl extends EFactoryImpl implements DbAdapterFactory {
  /**
   * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static DbAdapterFactory init() {
    try {
      DbAdapterFactory theDbAdapterFactory = (DbAdapterFactory) EPackage.Registry.INSTANCE
          .getEFactory(DbAdapterPackage.eNS_URI);
      if (theDbAdapterFactory != null) {
        return theDbAdapterFactory;
      }
    } catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DbAdapterFactoryImpl();
  }

  /**
   * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public DbAdapterFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case DbAdapterPackage.NEO4J_REST_CLIENT:
      return createNeo4jRestClient();
    case DbAdapterPackage.DB_ADAPTER_REGISTRY:
      return createDbAdapterRegistry();
    case DbAdapterPackage.DB_ADAPTER_CONTAINER:
      return createDbAdapterContainer();
    case DbAdapterPackage.MANAGED_NEO4J_INSTANCE:
      return createManagedNeo4jInstance();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
    case DbAdapterPackage.CONTAINER_TYPE:
      return createContainerTypeFromString(eDataType, initialValue);
    case DbAdapterPackage.FUTURE:
      return createFutureFromString(eDataType, initialValue);
    case DbAdapterPackage.CONSUMER:
      return createConsumerFromString(eDataType, initialValue);
    case DbAdapterPackage.JSON_ARRAY:
      return createJsonArrayFromString(eDataType, initialValue);
    case DbAdapterPackage.JSON_OBJECT:
      return createJsonObjectFromString(eDataType, initialValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
    case DbAdapterPackage.CONTAINER_TYPE:
      return convertContainerTypeToString(eDataType, instanceValue);
    case DbAdapterPackage.FUTURE:
      return convertFutureToString(eDataType, instanceValue);
    case DbAdapterPackage.CONSUMER:
      return convertConsumerToString(eDataType, instanceValue);
    case DbAdapterPackage.JSON_ARRAY:
      return convertJsonArrayToString(eDataType, instanceValue);
    case DbAdapterPackage.JSON_OBJECT:
      return convertJsonObjectToString(eDataType, instanceValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Neo4jRestClient createNeo4jRestClient() {
    Neo4jRestClientImpl neo4jRestClient = new ExtendedNeo4jRestClientImpl();
    return neo4jRestClient;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public DbAdapterRegistry createDbAdapterRegistry() {
    DbAdapterRegistryImpl dbAdapterRegistry = new ExtendedDbAdapterRegistryImpl();
    return dbAdapterRegistry;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public DbAdapterContainer createDbAdapterContainer() {
    DbAdapterContainerImpl dbAdapterContainer = new DbAdapterContainerImpl();
    return dbAdapterContainer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public ManagedNeo4jInstance createManagedNeo4jInstance() {
    ManagedNeo4jInstanceImpl managedNeo4jInstance = new ExtendedManagedNeo4JInstanceImpl();
    return managedNeo4jInstance;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public ContainerType createContainerTypeFromString(EDataType eDataType, String initialValue) {
    ContainerType result = ContainerType.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException(
          "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String convertContainerTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Future<?> createFutureFromString(EDataType eDataType, String initialValue) {
    return (Future<?>) super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String convertFutureToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Consumer<?> createConsumerFromString(EDataType eDataType, String initialValue) {
    return (Consumer<?>) super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String convertConsumerToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public JsonArray createJsonArrayFromString(EDataType eDataType, String initialValue) {
    return (JsonArray) super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String convertJsonArrayToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public JsonObject createJsonObjectFromString(EDataType eDataType, String initialValue) {
    return (JsonObject) super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String convertJsonObjectToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public DbAdapterPackage getDbAdapterPackage() {
    return (DbAdapterPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DbAdapterPackage getPackage() {
    return DbAdapterPackage.eINSTANCE;
  }

} // DbAdapterFactoryImpl

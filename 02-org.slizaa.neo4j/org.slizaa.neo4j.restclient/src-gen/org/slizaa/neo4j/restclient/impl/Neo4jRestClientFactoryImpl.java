/**
 */
package org.slizaa.neo4j.restclient.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.concurrent.Future;

import java.util.function.Consumer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.slizaa.neo4j.restclient.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class Neo4jRestClientFactoryImpl extends EFactoryImpl implements Neo4jRestClientFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static Neo4jRestClientFactory init() {
    try {
      Neo4jRestClientFactory theNeo4jRestClientFactory = (Neo4jRestClientFactory)EPackage.Registry.INSTANCE.getEFactory(Neo4jRestClientPackage.eNS_URI);
      if (theNeo4jRestClientFactory != null) {
        return theNeo4jRestClientFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Neo4jRestClientFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Neo4jRestClientFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT: return createNeo4jRestClient();
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_REGISTRY: return createNeo4jRestClientRegistry();
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER: return createNeo4jRestClientContainer();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case Neo4jRestClientPackage.FUTURE:
        return createFutureFromString(eDataType, initialValue);
      case Neo4jRestClientPackage.CONSUMER:
        return createConsumerFromString(eDataType, initialValue);
      case Neo4jRestClientPackage.JSON_ARRAY:
        return createJsonArrayFromString(eDataType, initialValue);
      case Neo4jRestClientPackage.JSON_OBJECT:
        return createJsonObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case Neo4jRestClientPackage.FUTURE:
        return convertFutureToString(eDataType, instanceValue);
      case Neo4jRestClientPackage.CONSUMER:
        return convertConsumerToString(eDataType, instanceValue);
      case Neo4jRestClientPackage.JSON_ARRAY:
        return convertJsonArrayToString(eDataType, instanceValue);
      case Neo4jRestClientPackage.JSON_OBJECT:
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
    Neo4jRestClientImpl neo4jRestClient = new ExtendedNeo4JRemoteRepositoryImpl();
    return neo4jRestClient;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Neo4jRestClientRegistry createNeo4jRestClientRegistry() {
    Neo4jRestClientRegistryImpl neo4jRestClientRegistry = new Neo4jRestClientRegistryImpl();
    return neo4jRestClientRegistry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Neo4jRestClientContainer createNeo4jRestClientContainer() {
    Neo4jRestClientContainerImpl neo4jRestClientContainer = new Neo4jRestClientContainerImpl();
    return neo4jRestClientContainer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Future<?> createFutureFromString(EDataType eDataType, String initialValue) {
    return (Future<?>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertFutureToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Consumer<?> createConsumerFromString(EDataType eDataType, String initialValue) {
    return (Consumer<?>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertConsumerToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JsonArray createJsonArrayFromString(EDataType eDataType, String initialValue) {
    return (JsonArray)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertJsonArrayToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JsonObject createJsonObjectFromString(EDataType eDataType, String initialValue) {
    return (JsonObject)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertJsonObjectToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Neo4jRestClientPackage getNeo4jRestClientPackage() {
    return (Neo4jRestClientPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Neo4jRestClientPackage getPackage() {
    return Neo4jRestClientPackage.eINSTANCE;
  }

} // Neo4jRestClientFactoryImpl

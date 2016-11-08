/**
 */
package org.slizaa.neo4j.dbadapter.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import java.util.concurrent.Future;

import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slizaa.neo4j.dbadapter.DbadapterPackage;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4j Rest Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl#getThreadPoolSize <em>Thread Pool Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Neo4jRestClientImpl extends MinimalEObjectImpl.Container implements Neo4jRestClient {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseURI()
   * @generated
   * @ordered
   */
  protected static final String BASE_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseURI()
   * @generated
   * @ordered
   */
  protected String baseURI = BASE_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getThreadPoolSize() <em>Thread Pool Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreadPoolSize()
   * @generated
   * @ordered
   */
  protected static final int THREAD_POOL_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getThreadPoolSize() <em>Thread Pool Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreadPoolSize()
   * @generated
   * @ordered
   */
  protected int threadPoolSize = THREAD_POOL_SIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Neo4jRestClientImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DbadapterPackage.Literals.NEO4J_REST_CLIENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbadapterPackage.NEO4J_REST_CLIENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBaseURI() {
    return baseURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseURI(String newBaseURI) {
    String oldBaseURI = baseURI;
    baseURI = newBaseURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbadapterPackage.NEO4J_REST_CLIENT__BASE_URI, oldBaseURI, baseURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getThreadPoolSize() {
    return threadPoolSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThreadPoolSize(int newThreadPoolSize) {
    int oldThreadPoolSize = threadPoolSize;
    threadPoolSize = newThreadPoolSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbadapterPackage.NEO4J_REST_CLIENT__THREAD_POOL_SIZE, oldThreadPoolSize, threadPoolSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void init() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAllRelationshipTypes() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAllPropertyKeys() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAllLabels() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonArray getLabelsForNode(long nodeId) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonObject getPropertiesForNode(long nodeId) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonObject getPropertiesForRelationship(long nodeId) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Future<JsonObject> executeCypherQuery(String cypherQuery) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Future<JsonObject> executeCypherQuery(String cypherQuery, Map<String, String> params) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Future<?> executeCypherQuery(String cypherQuery, Consumer<JsonObject> consumer) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Future<?> executeCypherQuery(String cypherQuery, Map<String, String> params, Consumer<JsonObject> consumer) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DbadapterPackage.NEO4J_REST_CLIENT__NAME:
        return getName();
      case DbadapterPackage.NEO4J_REST_CLIENT__BASE_URI:
        return getBaseURI();
      case DbadapterPackage.NEO4J_REST_CLIENT__THREAD_POOL_SIZE:
        return getThreadPoolSize();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DbadapterPackage.NEO4J_REST_CLIENT__NAME:
        setName((String)newValue);
        return;
      case DbadapterPackage.NEO4J_REST_CLIENT__BASE_URI:
        setBaseURI((String)newValue);
        return;
      case DbadapterPackage.NEO4J_REST_CLIENT__THREAD_POOL_SIZE:
        setThreadPoolSize((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case DbadapterPackage.NEO4J_REST_CLIENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DbadapterPackage.NEO4J_REST_CLIENT__BASE_URI:
        setBaseURI(BASE_URI_EDEFAULT);
        return;
      case DbadapterPackage.NEO4J_REST_CLIENT__THREAD_POOL_SIZE:
        setThreadPoolSize(THREAD_POOL_SIZE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case DbadapterPackage.NEO4J_REST_CLIENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DbadapterPackage.NEO4J_REST_CLIENT__BASE_URI:
        return BASE_URI_EDEFAULT == null ? baseURI != null : !BASE_URI_EDEFAULT.equals(baseURI);
      case DbadapterPackage.NEO4J_REST_CLIENT__THREAD_POOL_SIZE:
        return threadPoolSize != THREAD_POOL_SIZE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  @SuppressWarnings({"rawtypes", "unchecked" })
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case DbadapterPackage.NEO4J_REST_CLIENT___INIT:
        init();
        return null;
      case DbadapterPackage.NEO4J_REST_CLIENT___DISPOSE:
        dispose();
        return null;
      case DbadapterPackage.NEO4J_REST_CLIENT___GET_ALL_RELATIONSHIP_TYPES:
        return getAllRelationshipTypes();
      case DbadapterPackage.NEO4J_REST_CLIENT___GET_ALL_PROPERTY_KEYS:
        return getAllPropertyKeys();
      case DbadapterPackage.NEO4J_REST_CLIENT___GET_ALL_LABELS:
        return getAllLabels();
      case DbadapterPackage.NEO4J_REST_CLIENT___GET_LABELS_FOR_NODE__LONG:
        return getLabelsForNode((Long)arguments.get(0));
      case DbadapterPackage.NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_NODE__LONG:
        return getPropertiesForNode((Long)arguments.get(0));
      case DbadapterPackage.NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_RELATIONSHIP__LONG:
        return getPropertiesForRelationship((Long)arguments.get(0));
      case DbadapterPackage.NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING:
        return executeCypherQuery((String)arguments.get(0));
      case DbadapterPackage.NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP:
        return executeCypherQuery((String)arguments.get(0), (Map<String, String>)arguments.get(1));
      case DbadapterPackage.NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_CONSUMER:
        return executeCypherQuery((String)arguments.get(0), (Consumer<JsonObject>)arguments.get(1));
      case DbadapterPackage.NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP_CONSUMER:
        return executeCypherQuery((String)arguments.get(0), (Map<String, String>)arguments.get(1), (Consumer<JsonObject>)arguments.get(2));
    }
    return super.eInvoke(operationID, arguments);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", baseURI: ");
    result.append(baseURI);
    result.append(", threadPoolSize: ");
    result.append(threadPoolSize);
    result.append(')');
    return result.toString();
  }

} //Neo4jRestClientImpl

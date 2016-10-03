/**
 */
package org.slizaa.neo4j.hierarchicalgraph.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import java.util.concurrent.Future;

import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.slizaa.hierarchicalgraph.HGRootNode;

import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4 JRemote Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JRemoteRepositoryImpl#getHierarchicalGraphs <em>Hierarchical Graphs</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JRemoteRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JRemoteRepositoryImpl#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JRemoteRepositoryImpl#getThreadPoolSize <em>Thread Pool Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Neo4JRemoteRepositoryImpl extends MinimalEObjectImpl.Container implements Neo4JRemoteRepository {
  /**
   * The cached value of the '{@link #getHierarchicalGraphs() <em>Hierarchical Graphs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHierarchicalGraphs()
   * @generated
   * @ordered
   */
  protected EList<HGRootNode> hierarchicalGraphs;

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
  protected Neo4JRemoteRepositoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Neo4jHierarchicalgraphPackage.Literals.NEO4_JREMOTE_REPOSITORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGRootNode> getHierarchicalGraphs() {
    if (hierarchicalGraphs == null) {
      hierarchicalGraphs = new EObjectResolvingEList<HGRootNode>(HGRootNode.class, this, Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__HIERARCHICAL_GRAPHS);
    }
    return hierarchicalGraphs;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__BASE_URI, oldBaseURI, baseURI));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__THREAD_POOL_SIZE, oldThreadPoolSize, threadPoolSize));
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
  public JsonArray getNodeLabels(long nodeId) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonObject getNodeProperties(long nodeId) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonObject getRelationshipProperties(long nodeId) {
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
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__HIERARCHICAL_GRAPHS:
        return getHierarchicalGraphs();
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__NAME:
        return getName();
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__BASE_URI:
        return getBaseURI();
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__THREAD_POOL_SIZE:
        return getThreadPoolSize();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__HIERARCHICAL_GRAPHS:
        getHierarchicalGraphs().clear();
        getHierarchicalGraphs().addAll((Collection<? extends HGRootNode>)newValue);
        return;
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__NAME:
        setName((String)newValue);
        return;
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__BASE_URI:
        setBaseURI((String)newValue);
        return;
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__THREAD_POOL_SIZE:
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
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__HIERARCHICAL_GRAPHS:
        getHierarchicalGraphs().clear();
        return;
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__BASE_URI:
        setBaseURI(BASE_URI_EDEFAULT);
        return;
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__THREAD_POOL_SIZE:
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
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__HIERARCHICAL_GRAPHS:
        return hierarchicalGraphs != null && !hierarchicalGraphs.isEmpty();
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__BASE_URI:
        return BASE_URI_EDEFAULT == null ? baseURI != null : !BASE_URI_EDEFAULT.equals(baseURI);
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__THREAD_POOL_SIZE:
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
  @SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY___INIT:
        init();
        return null;
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY___DISPOSE:
        dispose();
        return null;
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY___GET_NODE_LABELS__LONG:
        return getNodeLabels((Long)arguments.get(0));
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY___GET_NODE_PROPERTIES__LONG:
        return getNodeProperties((Long)arguments.get(0));
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY___GET_RELATIONSHIP_PROPERTIES__LONG:
        return getRelationshipProperties((Long)arguments.get(0));
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY___EXECUTE_CYPHER_QUERY__STRING:
        return executeCypherQuery((String)arguments.get(0));
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY___EXECUTE_CYPHER_QUERY__STRING_MAP:
        return executeCypherQuery((String)arguments.get(0), (Map<String, String>)arguments.get(1));
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY___EXECUTE_CYPHER_QUERY__STRING_CONSUMER:
        return executeCypherQuery((String)arguments.get(0), (Consumer<JsonObject>)arguments.get(1));
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY___EXECUTE_CYPHER_QUERY__STRING_MAP_CONSUMER:
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

} //Neo4JRemoteRepositoryImpl

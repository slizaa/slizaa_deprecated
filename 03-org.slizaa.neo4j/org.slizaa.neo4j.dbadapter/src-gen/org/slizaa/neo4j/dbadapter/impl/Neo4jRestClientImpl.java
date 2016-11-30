/**
 */
package org.slizaa.neo4j.dbadapter.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import java.util.concurrent.Future;

import java.util.function.Consumer;

import org.eclipse.core.resources.IFile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.slizaa.hierarchicalgraph.HGRootNode;

import org.slizaa.neo4j.dbadapter.DbAdapterContainer;
import org.slizaa.neo4j.dbadapter.DbAdapterPackage;
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
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl#isConnected <em>Connected</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl#getDefiningResource <em>Defining Resource</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.Neo4jRestClientImpl#getHierarchicalGraph <em>Hierarchical Graph</em>}</li>
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
   * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConnected()
   * @generated
   * @ordered
   */
  protected static final boolean CONNECTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConnected()
   * @generated
   * @ordered
   */
  protected boolean connected = CONNECTED_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

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
   * The default value of the '{@link #getDefiningResource() <em>Defining Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefiningResource()
   * @generated
   * @ordered
   */
  protected static final IFile DEFINING_RESOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefiningResource() <em>Defining Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefiningResource()
   * @generated
   * @ordered
   */
  protected IFile definingResource = DEFINING_RESOURCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getHierarchicalGraph() <em>Hierarchical Graph</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHierarchicalGraph()
   * @generated
   * @ordered
   */
  protected HGRootNode hierarchicalGraph;

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
    return DbAdapterPackage.Literals.NEO4J_REST_CLIENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.NEO4J_REST_CLIENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConnected() {
    return connected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.NEO4J_REST_CLIENT__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.NEO4J_REST_CLIENT__BASE_URI, oldBaseURI, baseURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IFile getDefiningResource() {
    return definingResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefiningResource(IFile newDefiningResource) {
    IFile oldDefiningResource = definingResource;
    definingResource = newDefiningResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.NEO4J_REST_CLIENT__DEFINING_RESOURCE, oldDefiningResource, definingResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbAdapterContainer getParent() {
    if (eContainerFeatureID() != DbAdapterPackage.NEO4J_REST_CLIENT__PARENT) return null;
    return (DbAdapterContainer)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(DbAdapterContainer newParent, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newParent, DbAdapterPackage.NEO4J_REST_CLIENT__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(DbAdapterContainer newParent) {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DbAdapterPackage.NEO4J_REST_CLIENT__PARENT && newParent != null)) {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DbAdapterPackage.DB_ADAPTER_CONTAINER__CHILDREN, DbAdapterContainer.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.NEO4J_REST_CLIENT__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGRootNode getHierarchicalGraph() {
    if (hierarchicalGraph != null && hierarchicalGraph.eIsProxy()) {
      InternalEObject oldHierarchicalGraph = (InternalEObject)hierarchicalGraph;
      hierarchicalGraph = (HGRootNode)eResolveProxy(oldHierarchicalGraph);
      if (hierarchicalGraph != oldHierarchicalGraph) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbAdapterPackage.NEO4J_REST_CLIENT__HIERARCHICAL_GRAPH, oldHierarchicalGraph, hierarchicalGraph));
      }
    }
    return hierarchicalGraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGRootNode basicGetHierarchicalGraph() {
    return hierarchicalGraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHierarchicalGraph(HGRootNode newHierarchicalGraph) {
    HGRootNode oldHierarchicalGraph = hierarchicalGraph;
    hierarchicalGraph = newHierarchicalGraph;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.NEO4J_REST_CLIENT__HIERARCHICAL_GRAPH, oldHierarchicalGraph, hierarchicalGraph));
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
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DbAdapterPackage.NEO4J_REST_CLIENT__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((DbAdapterContainer)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DbAdapterPackage.NEO4J_REST_CLIENT__PARENT:
        return basicSetParent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case DbAdapterPackage.NEO4J_REST_CLIENT__PARENT:
        return eInternalContainer().eInverseRemove(this, DbAdapterPackage.DB_ADAPTER_CONTAINER__CHILDREN, DbAdapterContainer.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DbAdapterPackage.NEO4J_REST_CLIENT__NAME:
        return getName();
      case DbAdapterPackage.NEO4J_REST_CLIENT__CONNECTED:
        return isConnected();
      case DbAdapterPackage.NEO4J_REST_CLIENT__DESCRIPTION:
        return getDescription();
      case DbAdapterPackage.NEO4J_REST_CLIENT__BASE_URI:
        return getBaseURI();
      case DbAdapterPackage.NEO4J_REST_CLIENT__DEFINING_RESOURCE:
        return getDefiningResource();
      case DbAdapterPackage.NEO4J_REST_CLIENT__PARENT:
        return getParent();
      case DbAdapterPackage.NEO4J_REST_CLIENT__HIERARCHICAL_GRAPH:
        if (resolve) return getHierarchicalGraph();
        return basicGetHierarchicalGraph();
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
      case DbAdapterPackage.NEO4J_REST_CLIENT__NAME:
        setName((String)newValue);
        return;
      case DbAdapterPackage.NEO4J_REST_CLIENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case DbAdapterPackage.NEO4J_REST_CLIENT__BASE_URI:
        setBaseURI((String)newValue);
        return;
      case DbAdapterPackage.NEO4J_REST_CLIENT__DEFINING_RESOURCE:
        setDefiningResource((IFile)newValue);
        return;
      case DbAdapterPackage.NEO4J_REST_CLIENT__PARENT:
        setParent((DbAdapterContainer)newValue);
        return;
      case DbAdapterPackage.NEO4J_REST_CLIENT__HIERARCHICAL_GRAPH:
        setHierarchicalGraph((HGRootNode)newValue);
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
      case DbAdapterPackage.NEO4J_REST_CLIENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DbAdapterPackage.NEO4J_REST_CLIENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case DbAdapterPackage.NEO4J_REST_CLIENT__BASE_URI:
        setBaseURI(BASE_URI_EDEFAULT);
        return;
      case DbAdapterPackage.NEO4J_REST_CLIENT__DEFINING_RESOURCE:
        setDefiningResource(DEFINING_RESOURCE_EDEFAULT);
        return;
      case DbAdapterPackage.NEO4J_REST_CLIENT__PARENT:
        setParent((DbAdapterContainer)null);
        return;
      case DbAdapterPackage.NEO4J_REST_CLIENT__HIERARCHICAL_GRAPH:
        setHierarchicalGraph((HGRootNode)null);
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
      case DbAdapterPackage.NEO4J_REST_CLIENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DbAdapterPackage.NEO4J_REST_CLIENT__CONNECTED:
        return connected != CONNECTED_EDEFAULT;
      case DbAdapterPackage.NEO4J_REST_CLIENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case DbAdapterPackage.NEO4J_REST_CLIENT__BASE_URI:
        return BASE_URI_EDEFAULT == null ? baseURI != null : !BASE_URI_EDEFAULT.equals(baseURI);
      case DbAdapterPackage.NEO4J_REST_CLIENT__DEFINING_RESOURCE:
        return DEFINING_RESOURCE_EDEFAULT == null ? definingResource != null : !DEFINING_RESOURCE_EDEFAULT.equals(definingResource);
      case DbAdapterPackage.NEO4J_REST_CLIENT__PARENT:
        return getParent() != null;
      case DbAdapterPackage.NEO4J_REST_CLIENT__HIERARCHICAL_GRAPH:
        return hierarchicalGraph != null;
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
      case DbAdapterPackage.NEO4J_REST_CLIENT___GET_ALL_RELATIONSHIP_TYPES:
        return getAllRelationshipTypes();
      case DbAdapterPackage.NEO4J_REST_CLIENT___GET_ALL_PROPERTY_KEYS:
        return getAllPropertyKeys();
      case DbAdapterPackage.NEO4J_REST_CLIENT___GET_ALL_LABELS:
        return getAllLabels();
      case DbAdapterPackage.NEO4J_REST_CLIENT___GET_LABELS_FOR_NODE__LONG:
        return getLabelsForNode((Long)arguments.get(0));
      case DbAdapterPackage.NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_NODE__LONG:
        return getPropertiesForNode((Long)arguments.get(0));
      case DbAdapterPackage.NEO4J_REST_CLIENT___GET_PROPERTIES_FOR_RELATIONSHIP__LONG:
        return getPropertiesForRelationship((Long)arguments.get(0));
      case DbAdapterPackage.NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING:
        return executeCypherQuery((String)arguments.get(0));
      case DbAdapterPackage.NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP:
        return executeCypherQuery((String)arguments.get(0), (Map<String, String>)arguments.get(1));
      case DbAdapterPackage.NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_CONSUMER:
        return executeCypherQuery((String)arguments.get(0), (Consumer<JsonObject>)arguments.get(1));
      case DbAdapterPackage.NEO4J_REST_CLIENT___EXECUTE_CYPHER_QUERY__STRING_MAP_CONSUMER:
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
    result.append(", connected: ");
    result.append(connected);
    result.append(", description: ");
    result.append(description);
    result.append(", baseURI: ");
    result.append(baseURI);
    result.append(", definingResource: ");
    result.append(definingResource);
    result.append(')');
    return result.toString();
  }

} //Neo4jRestClientImpl

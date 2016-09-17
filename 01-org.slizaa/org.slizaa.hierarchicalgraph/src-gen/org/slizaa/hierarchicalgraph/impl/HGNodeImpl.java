/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.INodeSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HG Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGNodeImpl#getRootNode <em>Root Node</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGNodeImpl#getNodeSource <em>Node Source</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGNodeImpl#getOutgoingCoreDependencies <em>Outgoing Core Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGNodeImpl#getOutgoingAccumulatedCoreDependencies <em>Outgoing Accumulated Core Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGNodeImpl#getIncomingCoreDependencies <em>Incoming Core Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGNodeImpl#getIncomingAccumulatedCoreDependencies <em>Incoming Accumulated Core Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGNodeImpl extends MinimalEObjectImpl.Container implements HGNode {
  /**
   * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootNode()
   * @generated
   * @ordered
   */
  protected HGRootNode rootNode;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<HGNode> children;

  /**
   * The cached value of the '{@link #getNodeSource() <em>Node Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeSource()
   * @generated
   * @ordered
   */
  protected INodeSource nodeSource;

  /**
   * The cached value of the '{@link #getOutgoingCoreDependencies() <em>Outgoing Core Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingCoreDependencies()
   * @generated
   * @ordered
   */
  protected EList<HGCoreDependency> outgoingCoreDependencies;

  /**
   * The cached value of the '{@link #getOutgoingAccumulatedCoreDependencies() <em>Outgoing Accumulated Core Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingAccumulatedCoreDependencies()
   * @generated
   * @ordered
   */
  protected EList<HGCoreDependency> outgoingAccumulatedCoreDependencies;

  /**
   * The cached value of the '{@link #getIncomingCoreDependencies() <em>Incoming Core Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncomingCoreDependencies()
   * @generated
   * @ordered
   */
  protected EList<HGCoreDependency> incomingCoreDependencies;

  /**
   * The cached value of the '{@link #getIncomingAccumulatedCoreDependencies() <em>Incoming Accumulated Core Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncomingAccumulatedCoreDependencies()
   * @generated
   * @ordered
   */
  protected EList<HGCoreDependency> incomingAccumulatedCoreDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HGNodeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.HG_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGRootNode getRootNode() {
    return rootNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode getParent() {
    if (eContainerFeatureID() != HierarchicalgraphPackage.HG_NODE__PARENT) return null;
    return (HGNode)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(HGNode newParent, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newParent, HierarchicalgraphPackage.HG_NODE__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(HGNode newParent) {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != HierarchicalgraphPackage.HG_NODE__PARENT && newParent != null)) {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, HierarchicalgraphPackage.HG_NODE__CHILDREN, HGNode.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_NODE__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGNode> getChildren() {
    if (children == null) {
      children = new EObjectContainmentWithInverseEList<HGNode>(HGNode.class, this, HierarchicalgraphPackage.HG_NODE__CHILDREN, HierarchicalgraphPackage.HG_NODE__PARENT);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INodeSource getNodeSource() {
    return nodeSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeSource(INodeSource newNodeSource, NotificationChain msgs) {
    INodeSource oldNodeSource = nodeSource;
    nodeSource = newNodeSource;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_NODE__NODE_SOURCE, oldNodeSource, newNodeSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeSource(INodeSource newNodeSource) {
    if (newNodeSource != nodeSource) {
      NotificationChain msgs = null;
      if (nodeSource != null)
        msgs = ((InternalEObject)nodeSource).eInverseRemove(this, HierarchicalgraphPackage.INODE_SOURCE__NODE, INodeSource.class, msgs);
      if (newNodeSource != null)
        msgs = ((InternalEObject)newNodeSource).eInverseAdd(this, HierarchicalgraphPackage.INODE_SOURCE__NODE, INodeSource.class, msgs);
      msgs = basicSetNodeSource(newNodeSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_NODE__NODE_SOURCE, newNodeSource, newNodeSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGCoreDependency> getOutgoingCoreDependencies() {
    if (outgoingCoreDependencies == null) {
      outgoingCoreDependencies = new EObjectEList<HGCoreDependency>(HGCoreDependency.class, this, HierarchicalgraphPackage.HG_NODE__OUTGOING_CORE_DEPENDENCIES);
    }
    return outgoingCoreDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGCoreDependency> getOutgoingAccumulatedCoreDependencies() {
    if (outgoingAccumulatedCoreDependencies == null) {
      outgoingAccumulatedCoreDependencies = new EObjectEList<HGCoreDependency>(HGCoreDependency.class, this, HierarchicalgraphPackage.HG_NODE__OUTGOING_ACCUMULATED_CORE_DEPENDENCIES);
    }
    return outgoingAccumulatedCoreDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGCoreDependency> getIncomingCoreDependencies() {
    if (incomingCoreDependencies == null) {
      incomingCoreDependencies = new EObjectEList<HGCoreDependency>(HGCoreDependency.class, this, HierarchicalgraphPackage.HG_NODE__INCOMING_CORE_DEPENDENCIES);
    }
    return incomingCoreDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGCoreDependency> getIncomingAccumulatedCoreDependencies() {
    if (incomingAccumulatedCoreDependencies == null) {
      incomingAccumulatedCoreDependencies = new EObjectEList<HGCoreDependency>(HGCoreDependency.class, this, HierarchicalgraphPackage.HG_NODE__INCOMING_ACCUMULATED_CORE_DEPENDENCIES);
    }
    return incomingAccumulatedCoreDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getIdentifier() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPredecessorOf(HGNode node) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSuccessorOf(HGNode node) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGNode> getPredecessors() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGCoreDependency> getOutgoingCoreDependencies(boolean includeChildren) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGCoreDependency> getIncomingCoreDependencies(boolean includeChildren) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGAggregatedDependency getIncomingDependenciesFrom(HGNode node) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGAggregatedDependency> getIncomingDependenciesFrom(EList<HGNode> nodes) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGAggregatedDependency getOutgoingDependenciesTo(HGNode targetNode) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HGAggregatedDependency> getOutgoingDependenciesTo(EList<HGNode> targetNodes) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void resolveIncomingAggregatedCoreDependencies(boolean includeChildren) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void resolveOutgoingAggregatedCoreDependencies(boolean includeChildren) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case HierarchicalgraphPackage.HG_NODE__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((HGNode)otherEnd, msgs);
      case HierarchicalgraphPackage.HG_NODE__CHILDREN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
      case HierarchicalgraphPackage.HG_NODE__NODE_SOURCE:
        if (nodeSource != null)
          msgs = ((InternalEObject)nodeSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HierarchicalgraphPackage.HG_NODE__NODE_SOURCE, null, msgs);
        return basicSetNodeSource((INodeSource)otherEnd, msgs);
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
      case HierarchicalgraphPackage.HG_NODE__PARENT:
        return basicSetParent(null, msgs);
      case HierarchicalgraphPackage.HG_NODE__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
      case HierarchicalgraphPackage.HG_NODE__NODE_SOURCE:
        return basicSetNodeSource(null, msgs);
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
      case HierarchicalgraphPackage.HG_NODE__PARENT:
        return eInternalContainer().eInverseRemove(this, HierarchicalgraphPackage.HG_NODE__CHILDREN, HGNode.class, msgs);
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
      case HierarchicalgraphPackage.HG_NODE__ROOT_NODE:
        return getRootNode();
      case HierarchicalgraphPackage.HG_NODE__PARENT:
        return getParent();
      case HierarchicalgraphPackage.HG_NODE__CHILDREN:
        return getChildren();
      case HierarchicalgraphPackage.HG_NODE__NODE_SOURCE:
        return getNodeSource();
      case HierarchicalgraphPackage.HG_NODE__OUTGOING_CORE_DEPENDENCIES:
        return getOutgoingCoreDependencies();
      case HierarchicalgraphPackage.HG_NODE__OUTGOING_ACCUMULATED_CORE_DEPENDENCIES:
        return getOutgoingAccumulatedCoreDependencies();
      case HierarchicalgraphPackage.HG_NODE__INCOMING_CORE_DEPENDENCIES:
        return getIncomingCoreDependencies();
      case HierarchicalgraphPackage.HG_NODE__INCOMING_ACCUMULATED_CORE_DEPENDENCIES:
        return getIncomingAccumulatedCoreDependencies();
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
      case HierarchicalgraphPackage.HG_NODE__PARENT:
        setParent((HGNode)newValue);
        return;
      case HierarchicalgraphPackage.HG_NODE__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends HGNode>)newValue);
        return;
      case HierarchicalgraphPackage.HG_NODE__NODE_SOURCE:
        setNodeSource((INodeSource)newValue);
        return;
      case HierarchicalgraphPackage.HG_NODE__OUTGOING_CORE_DEPENDENCIES:
        getOutgoingCoreDependencies().clear();
        getOutgoingCoreDependencies().addAll((Collection<? extends HGCoreDependency>)newValue);
        return;
      case HierarchicalgraphPackage.HG_NODE__OUTGOING_ACCUMULATED_CORE_DEPENDENCIES:
        getOutgoingAccumulatedCoreDependencies().clear();
        getOutgoingAccumulatedCoreDependencies().addAll((Collection<? extends HGCoreDependency>)newValue);
        return;
      case HierarchicalgraphPackage.HG_NODE__INCOMING_CORE_DEPENDENCIES:
        getIncomingCoreDependencies().clear();
        getIncomingCoreDependencies().addAll((Collection<? extends HGCoreDependency>)newValue);
        return;
      case HierarchicalgraphPackage.HG_NODE__INCOMING_ACCUMULATED_CORE_DEPENDENCIES:
        getIncomingAccumulatedCoreDependencies().clear();
        getIncomingAccumulatedCoreDependencies().addAll((Collection<? extends HGCoreDependency>)newValue);
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
      case HierarchicalgraphPackage.HG_NODE__PARENT:
        setParent((HGNode)null);
        return;
      case HierarchicalgraphPackage.HG_NODE__CHILDREN:
        getChildren().clear();
        return;
      case HierarchicalgraphPackage.HG_NODE__NODE_SOURCE:
        setNodeSource((INodeSource)null);
        return;
      case HierarchicalgraphPackage.HG_NODE__OUTGOING_CORE_DEPENDENCIES:
        getOutgoingCoreDependencies().clear();
        return;
      case HierarchicalgraphPackage.HG_NODE__OUTGOING_ACCUMULATED_CORE_DEPENDENCIES:
        getOutgoingAccumulatedCoreDependencies().clear();
        return;
      case HierarchicalgraphPackage.HG_NODE__INCOMING_CORE_DEPENDENCIES:
        getIncomingCoreDependencies().clear();
        return;
      case HierarchicalgraphPackage.HG_NODE__INCOMING_ACCUMULATED_CORE_DEPENDENCIES:
        getIncomingAccumulatedCoreDependencies().clear();
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
      case HierarchicalgraphPackage.HG_NODE__ROOT_NODE:
        return rootNode != null;
      case HierarchicalgraphPackage.HG_NODE__PARENT:
        return getParent() != null;
      case HierarchicalgraphPackage.HG_NODE__CHILDREN:
        return children != null && !children.isEmpty();
      case HierarchicalgraphPackage.HG_NODE__NODE_SOURCE:
        return nodeSource != null;
      case HierarchicalgraphPackage.HG_NODE__OUTGOING_CORE_DEPENDENCIES:
        return outgoingCoreDependencies != null && !outgoingCoreDependencies.isEmpty();
      case HierarchicalgraphPackage.HG_NODE__OUTGOING_ACCUMULATED_CORE_DEPENDENCIES:
        return outgoingAccumulatedCoreDependencies != null && !outgoingAccumulatedCoreDependencies.isEmpty();
      case HierarchicalgraphPackage.HG_NODE__INCOMING_CORE_DEPENDENCIES:
        return incomingCoreDependencies != null && !incomingCoreDependencies.isEmpty();
      case HierarchicalgraphPackage.HG_NODE__INCOMING_ACCUMULATED_CORE_DEPENDENCIES:
        return incomingAccumulatedCoreDependencies != null && !incomingAccumulatedCoreDependencies.isEmpty();
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
      case HierarchicalgraphPackage.HG_NODE___GET_IDENTIFIER:
        return getIdentifier();
      case HierarchicalgraphPackage.HG_NODE___IS_PREDECESSOR_OF__HGNODE:
        return isPredecessorOf((HGNode)arguments.get(0));
      case HierarchicalgraphPackage.HG_NODE___IS_SUCCESSOR_OF__HGNODE:
        return isSuccessorOf((HGNode)arguments.get(0));
      case HierarchicalgraphPackage.HG_NODE___GET_PREDECESSORS:
        return getPredecessors();
      case HierarchicalgraphPackage.HG_NODE___GET_OUTGOING_CORE_DEPENDENCIES__BOOLEAN:
        return getOutgoingCoreDependencies((Boolean)arguments.get(0));
      case HierarchicalgraphPackage.HG_NODE___GET_INCOMING_CORE_DEPENDENCIES__BOOLEAN:
        return getIncomingCoreDependencies((Boolean)arguments.get(0));
      case HierarchicalgraphPackage.HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__HGNODE:
        return getIncomingDependenciesFrom((HGNode)arguments.get(0));
      case HierarchicalgraphPackage.HG_NODE___GET_INCOMING_DEPENDENCIES_FROM__ELIST:
        return getIncomingDependenciesFrom((EList<HGNode>)arguments.get(0));
      case HierarchicalgraphPackage.HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__HGNODE:
        return getOutgoingDependenciesTo((HGNode)arguments.get(0));
      case HierarchicalgraphPackage.HG_NODE___GET_OUTGOING_DEPENDENCIES_TO__ELIST:
        return getOutgoingDependenciesTo((EList<HGNode>)arguments.get(0));
      case HierarchicalgraphPackage.HG_NODE___RESOLVE_INCOMING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN:
        resolveIncomingAggregatedCoreDependencies((Boolean)arguments.get(0));
        return null;
      case HierarchicalgraphPackage.HG_NODE___RESOLVE_OUTGOING_AGGREGATED_CORE_DEPENDENCIES__BOOLEAN:
        resolveOutgoingAggregatedCoreDependencies((Boolean)arguments.get(0));
        return null;
    }
    return super.eInvoke(operationID, arguments);
  }

} //HGNodeImpl

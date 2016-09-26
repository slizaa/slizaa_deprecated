/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.hierarchicalgraph.DefaultNodeSource;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Node Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.DefaultNodeSourceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.DefaultNodeSourceImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.DefaultNodeSourceImpl#isAutoExpand <em>Auto Expand</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.DefaultNodeSourceImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultNodeSourceImpl extends MinimalEObjectImpl.Container implements DefaultNodeSource {
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final Object IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected Object identifier = IDENTIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #isAutoExpand() <em>Auto Expand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutoExpand()
   * @generated
   * @ordered
   */
  protected static final boolean AUTO_EXPAND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EMap<String, String> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultNodeSourceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.DEFAULT_NODE_SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getIdentifier() {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(Object newIdentifier) {
    Object oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode getNode() {
    if (eContainerFeatureID() != HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__NODE) return null;
    return (HGNode)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNode(HGNode newNode, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newNode, HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__NODE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNode(HGNode newNode) {
    if (newNode != eInternalContainer() || (eContainerFeatureID() != HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__NODE && newNode != null)) {
      if (EcoreUtil.isAncestor(this, newNode))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newNode != null)
        msgs = ((InternalEObject)newNode).eInverseAdd(this, HierarchicalgraphPackage.HG_NODE__NODE_SOURCE, HGNode.class, msgs);
      msgs = basicSetNode(newNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__NODE, newNode, newNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAutoExpand() {
    // TODO: implement this method to return the 'Auto Expand' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map<String, String> getProperties() {
    if (properties == null) {
      properties = new EcoreEMap<String,String>(HierarchicalgraphPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__PROPERTIES);
    }
    return properties.map();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void onExpand() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void onCollapse() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void onSelect() {
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
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__NODE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetNode((HGNode)otherEnd, msgs);
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
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__NODE:
        return basicSetNode(null, msgs);
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__PROPERTIES:
        return ((InternalEList<?>)((EMap.InternalMapView<String, String>)getProperties()).eMap()).basicRemove(otherEnd, msgs);
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
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__NODE:
        return eInternalContainer().eInverseRemove(this, HierarchicalgraphPackage.HG_NODE__NODE_SOURCE, HGNode.class, msgs);
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
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__IDENTIFIER:
        return getIdentifier();
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__NODE:
        return getNode();
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__AUTO_EXPAND:
        return isAutoExpand();
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__PROPERTIES:
        if (coreType) return ((EMap.InternalMapView<String, String>)getProperties()).eMap();
        else return getProperties();
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
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__IDENTIFIER:
        setIdentifier(newValue);
        return;
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__NODE:
        setNode((HGNode)newValue);
        return;
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__PROPERTIES:
        ((EStructuralFeature.Setting)((EMap.InternalMapView<String, String>)getProperties()).eMap()).set(newValue);
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
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__NODE:
        setNode((HGNode)null);
        return;
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__PROPERTIES:
        getProperties().clear();
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
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__NODE:
        return getNode() != null;
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__AUTO_EXPAND:
        return isAutoExpand() != AUTO_EXPAND_EDEFAULT;
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE___ON_EXPAND:
        onExpand();
        return null;
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE___ON_COLLAPSE:
        onCollapse();
        return null;
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE___ON_SELECT:
        onSelect();
        return null;
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //DefaultNodeSourceImpl

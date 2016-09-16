/**
 */
package org.slizaa.hierarchicalgraph.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier To Node Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.IdentifierToNodeMapImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.IdentifierToNodeMapImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifierToNodeMapImpl extends MinimalEObjectImpl.Container implements BasicEMap.Entry<Object,HGNode> {
  /**
   * The default value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedKey()
   * @generated
   * @ordered
   */
  protected static final Object KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedKey()
   * @generated
   * @ordered
   */
  protected Object key = KEY_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedValue()
   * @generated
   * @ordered
   */
  protected HGNode value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentifierToNodeMapImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.IDENTIFIER_TO_NODE_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getTypedKey() {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypedKey(Object newKey) {
    Object oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode getTypedValue() {
    if (value != null && value.eIsProxy()) {
      InternalEObject oldValue = (InternalEObject)value;
      value = (HGNode)eResolveProxy(oldValue);
      if (value != oldValue) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode basicGetTypedValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypedValue(HGNode newValue) {
    HGNode oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP__KEY:
        return getTypedKey();
      case HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP__VALUE:
        if (resolve) return getTypedValue();
        return basicGetTypedValue();
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
      case HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP__KEY:
        setTypedKey(newValue);
        return;
      case HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP__VALUE:
        setTypedValue((HGNode)newValue);
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
      case HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP__KEY:
        setTypedKey(KEY_EDEFAULT);
        return;
      case HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP__VALUE:
        setTypedValue((HGNode)null);
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
      case HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP__KEY:
        return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
      case HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
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
    result.append(" (key: ");
    result.append(key);
    result.append(')');
    return result.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected int hash = -1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHash() {
    if (hash == -1) {
      Object theKey = getKey();
      hash = (theKey == null ? 0 : theKey.hashCode());
    }
    return hash;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHash(int hash) {
    this.hash = hash;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getKey() {
    return getTypedKey();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(Object key) {
    setTypedKey(key);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode getValue() {
    return getTypedValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode setValue(HGNode value) {
    HGNode oldValue = getValue();
    setTypedValue(value);
    return oldValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EMap<Object, HGNode> getEMap() {
    EObject container = eContainer();
    return container == null ? null : (EMap<Object, HGNode>)container.eGet(eContainmentFeature());
  }

} //IdentifierToNodeMapImpl

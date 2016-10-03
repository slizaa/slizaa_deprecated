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

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node To Core Dependency Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.NodeToCoreDependencyMapImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.NodeToCoreDependencyMapImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeToCoreDependencyMapImpl extends MinimalEObjectImpl.Container implements BasicEMap.Entry<HGNode,HGCoreDependency> {
  /**
   * The cached value of the '{@link #getTypedKey() <em>Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedKey()
   * @generated
   * @ordered
   */
  protected HGNode key;

  /**
   * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedValue()
   * @generated
   * @ordered
   */
  protected HGCoreDependency value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeToCoreDependencyMapImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.NODE_TO_CORE_DEPENDENCY_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode getTypedKey() {
    if (key != null && key.eIsProxy()) {
      InternalEObject oldKey = (InternalEObject)key;
      key = (HGNode)eResolveProxy(oldKey);
      if (key != oldKey) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__KEY, oldKey, key));
      }
    }
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode basicGetTypedKey() {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypedKey(HGNode newKey) {
    HGNode oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGCoreDependency getTypedValue() {
    if (value != null && value.eIsProxy()) {
      InternalEObject oldValue = (InternalEObject)value;
      value = (HGCoreDependency)eResolveProxy(oldValue);
      if (value != oldValue) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGCoreDependency basicGetTypedValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypedValue(HGCoreDependency newValue) {
    HGCoreDependency oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__KEY:
        if (resolve) return getTypedKey();
        return basicGetTypedKey();
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__VALUE:
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
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__KEY:
        setTypedKey((HGNode)newValue);
        return;
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__VALUE:
        setTypedValue((HGCoreDependency)newValue);
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
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__KEY:
        setTypedKey((HGNode)null);
        return;
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__VALUE:
        setTypedValue((HGCoreDependency)null);
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
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__KEY:
        return key != null;
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
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
  public HGNode getKey() {
    return getTypedKey();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(HGNode key) {
    setTypedKey(key);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGCoreDependency getValue() {
    return getTypedValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGCoreDependency setValue(HGCoreDependency value) {
    HGCoreDependency oldValue = getValue();
    setTypedValue(value);
    return oldValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EMap<HGNode, HGCoreDependency> getEMap() {
    EObject container = eContainer();
    return container == null ? null : (EMap<HGNode, HGCoreDependency>)container.eGet(eContainmentFeature());
  }

} //NodeToCoreDependencyMapImpl

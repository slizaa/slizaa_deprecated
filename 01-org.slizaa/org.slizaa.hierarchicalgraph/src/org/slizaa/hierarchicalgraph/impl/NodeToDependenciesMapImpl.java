/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node To Dependencies Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.NodeToDependenciesMapImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.NodeToDependenciesMapImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeToDependenciesMapImpl extends MinimalEObjectImpl.Container implements BasicEMap.Entry<HGNode,List<HGDependency>> {
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
   * The cached value of the '{@link #getTypedValue() <em>Value</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypedValue()
   * @generated
   * @ordered
   */
  protected EList<HGDependency> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeToDependenciesMapImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.NODE_TO_DEPENDENCIES_MAP;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP__KEY, oldKey, key));
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
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<HGDependency> getTypedValue() {
    if (value == null) {
      value = new EObjectResolvingEList<HGDependency>(HGDependency.class, this, HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP__VALUE);
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP__KEY:
        if (resolve) return getTypedKey();
        return basicGetTypedKey();
      case HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP__VALUE:
        return getTypedValue();
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
      case HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP__KEY:
        setTypedKey((HGNode)newValue);
        return;
      case HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP__VALUE:
        getTypedValue().clear();
        getTypedValue().addAll((Collection<? extends HGDependency>)newValue);
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
      case HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP__KEY:
        setTypedKey((HGNode)null);
        return;
      case HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP__VALUE:
        getTypedValue().clear();
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
      case HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP__KEY:
        return key != null;
      case HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP__VALUE:
        return value != null && !value.isEmpty();
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
  public List<HGDependency> getValue() {
    return getTypedValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<HGDependency> setValue(List<HGDependency> value) {
    List<HGDependency> oldValue = getValue();
    getTypedValue().clear();
    getTypedValue().addAll(value);
    return oldValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EMap<HGNode, List<HGDependency>> getEMap() {
    EObject container = eContainer();
    return container == null ? null : (EMap<HGNode, List<HGDependency>>)container.eGet(eContainmentFeature());
  }

} //NodeToDependenciesMapImpl

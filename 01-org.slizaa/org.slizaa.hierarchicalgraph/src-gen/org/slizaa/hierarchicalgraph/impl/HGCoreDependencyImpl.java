/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGProxyDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.IDependencySource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HG Core Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGCoreDependencyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGCoreDependencyImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGCoreDependencyImpl#getDependencySource <em>Dependency Source</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGCoreDependencyImpl#getProxyDependencyParent <em>Proxy Dependency Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGCoreDependencyImpl extends AbstractHGDependencyImpl implements HGCoreDependency {
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected static final int WEIGHT_EDEFAULT = 1;

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected int weight = WEIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getDependencySource() <em>Dependency Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencySource()
   * @generated
   * @ordered
   */
  protected IDependencySource dependencySource;

  /**
   * The cached value of the '{@link #getProxyDependencyParent() <em>Proxy Dependency Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProxyDependencyParent()
   * @generated
   * @ordered
   */
  protected HGProxyDependency proxyDependencyParent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HGCoreDependencyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.HG_CORE_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType) {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWeight() {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeight(int newWeight) {
    int oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__WEIGHT, oldWeight, weight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDependencySource getDependencySource() {
    return dependencySource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDependencySource(IDependencySource newDependencySource, NotificationChain msgs) {
    IDependencySource oldDependencySource = dependencySource;
    dependencySource = newDependencySource;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE, oldDependencySource, newDependencySource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependencySource(IDependencySource newDependencySource) {
    if (newDependencySource != dependencySource) {
      NotificationChain msgs = null;
      if (dependencySource != null)
        msgs = ((InternalEObject)dependencySource).eInverseRemove(this, HierarchicalgraphPackage.IDEPENDENCY_SOURCE__DEPENDENCY, IDependencySource.class, msgs);
      if (newDependencySource != null)
        msgs = ((InternalEObject)newDependencySource).eInverseAdd(this, HierarchicalgraphPackage.IDEPENDENCY_SOURCE__DEPENDENCY, IDependencySource.class, msgs);
      msgs = basicSetDependencySource(newDependencySource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE, newDependencySource, newDependencySource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGProxyDependency getProxyDependencyParent() {
    if (proxyDependencyParent != null && proxyDependencyParent.eIsProxy()) {
      InternalEObject oldProxyDependencyParent = (InternalEObject)proxyDependencyParent;
      proxyDependencyParent = (HGProxyDependency)eResolveProxy(oldProxyDependencyParent);
      if (proxyDependencyParent != oldProxyDependencyParent) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT, oldProxyDependencyParent, proxyDependencyParent));
      }
    }
    return proxyDependencyParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGProxyDependency basicGetProxyDependencyParent() {
    return proxyDependencyParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProxyDependencyParent(HGProxyDependency newProxyDependencyParent, NotificationChain msgs) {
    HGProxyDependency oldProxyDependencyParent = proxyDependencyParent;
    proxyDependencyParent = newProxyDependencyParent;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT, oldProxyDependencyParent, newProxyDependencyParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProxyDependencyParent(HGProxyDependency newProxyDependencyParent) {
    if (newProxyDependencyParent != proxyDependencyParent) {
      NotificationChain msgs = null;
      if (proxyDependencyParent != null)
        msgs = ((InternalEObject)proxyDependencyParent).eInverseRemove(this, HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES, HGProxyDependency.class, msgs);
      if (newProxyDependencyParent != null)
        msgs = ((InternalEObject)newProxyDependencyParent).eInverseAdd(this, HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES, HGProxyDependency.class, msgs);
      msgs = basicSetProxyDependencyParent(newProxyDependencyParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT, newProxyDependencyParent, newProxyDependencyParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> Optional<T> getDependencySource(Class<T> clazz) {
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
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE:
        if (dependencySource != null)
          msgs = ((InternalEObject)dependencySource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE, null, msgs);
        return basicSetDependencySource((IDependencySource)otherEnd, msgs);
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT:
        if (proxyDependencyParent != null)
          msgs = ((InternalEObject)proxyDependencyParent).eInverseRemove(this, HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES, HGProxyDependency.class, msgs);
        return basicSetProxyDependencyParent((HGProxyDependency)otherEnd, msgs);
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
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE:
        return basicSetDependencySource(null, msgs);
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT:
        return basicSetProxyDependencyParent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__TYPE:
        return getType();
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__WEIGHT:
        return getWeight();
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE:
        return getDependencySource();
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT:
        if (resolve) return getProxyDependencyParent();
        return basicGetProxyDependencyParent();
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
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__TYPE:
        setType((String)newValue);
        return;
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__WEIGHT:
        setWeight((Integer)newValue);
        return;
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE:
        setDependencySource((IDependencySource)newValue);
        return;
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT:
        setProxyDependencyParent((HGProxyDependency)newValue);
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
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__WEIGHT:
        setWeight(WEIGHT_EDEFAULT);
        return;
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE:
        setDependencySource((IDependencySource)null);
        return;
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT:
        setProxyDependencyParent((HGProxyDependency)null);
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
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__WEIGHT:
        return weight != WEIGHT_EDEFAULT;
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__DEPENDENCY_SOURCE:
        return dependencySource != null;
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT:
        return proxyDependencyParent != null;
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
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY___GET_DEPENDENCY_SOURCE__CLASS:
        return getDependencySource((Class)arguments.get(0));
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
    result.append(" (type: ");
    result.append(type);
    result.append(", weight: ");
    result.append(weight);
    result.append(')');
    return result.toString();
  }

} //HGCoreDependencyImpl

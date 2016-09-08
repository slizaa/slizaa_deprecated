/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGDependencySource;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HG Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGDependencyImpl#getDependencySource <em>Dependency Source</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGDependencyImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGDependencyImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HGDependencyImpl extends MinimalEObjectImpl.Container implements HGDependency {
  /**
   * The cached value of the '{@link #getDependencySource() <em>Dependency Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencySource()
   * @generated
   * @ordered
   */
  protected HGDependencySource dependencySource;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected HGNode from;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected HGNode to;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HGDependencyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.HG_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGDependencySource getDependencySource() {
    return dependencySource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDependencySource(HGDependencySource newDependencySource, NotificationChain msgs) {
    HGDependencySource oldDependencySource = dependencySource;
    dependencySource = newDependencySource;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCY_SOURCE, oldDependencySource, newDependencySource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependencySource(HGDependencySource newDependencySource) {
    if (newDependencySource != dependencySource) {
      NotificationChain msgs = null;
      if (dependencySource != null)
        msgs = ((InternalEObject)dependencySource).eInverseRemove(this, HierarchicalgraphPackage.HG_DEPENDENCY_SOURCE__DEPENDENCY, HGDependencySource.class, msgs);
      if (newDependencySource != null)
        msgs = ((InternalEObject)newDependencySource).eInverseAdd(this, HierarchicalgraphPackage.HG_DEPENDENCY_SOURCE__DEPENDENCY, HGDependencySource.class, msgs);
      msgs = basicSetDependencySource(newDependencySource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCY_SOURCE, newDependencySource, newDependencySource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode getFrom() {
    if (from != null && from.eIsProxy()) {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (HGNode)eResolveProxy(oldFrom);
      if (from != oldFrom) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalgraphPackage.HG_DEPENDENCY__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode basicGetFrom() {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(HGNode newFrom) {
    HGNode oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_DEPENDENCY__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode getTo() {
    if (to != null && to.eIsProxy()) {
      InternalEObject oldTo = (InternalEObject)to;
      to = (HGNode)eResolveProxy(oldTo);
      if (to != oldTo) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalgraphPackage.HG_DEPENDENCY__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGNode basicGetTo() {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(HGNode newTo) {
    HGNode oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_DEPENDENCY__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<HGDependency> getCoreDependencies() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWeight() {
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
      case HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCY_SOURCE:
        if (dependencySource != null)
          msgs = ((InternalEObject)dependencySource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCY_SOURCE, null, msgs);
        return basicSetDependencySource((HGDependencySource)otherEnd, msgs);
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
      case HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCY_SOURCE:
        return basicSetDependencySource(null, msgs);
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
      case HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCY_SOURCE:
        return getDependencySource();
      case HierarchicalgraphPackage.HG_DEPENDENCY__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case HierarchicalgraphPackage.HG_DEPENDENCY__TO:
        if (resolve) return getTo();
        return basicGetTo();
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
      case HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCY_SOURCE:
        setDependencySource((HGDependencySource)newValue);
        return;
      case HierarchicalgraphPackage.HG_DEPENDENCY__FROM:
        setFrom((HGNode)newValue);
        return;
      case HierarchicalgraphPackage.HG_DEPENDENCY__TO:
        setTo((HGNode)newValue);
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
      case HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCY_SOURCE:
        setDependencySource((HGDependencySource)null);
        return;
      case HierarchicalgraphPackage.HG_DEPENDENCY__FROM:
        setFrom((HGNode)null);
        return;
      case HierarchicalgraphPackage.HG_DEPENDENCY__TO:
        setTo((HGNode)null);
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
      case HierarchicalgraphPackage.HG_DEPENDENCY__DEPENDENCY_SOURCE:
        return dependencySource != null;
      case HierarchicalgraphPackage.HG_DEPENDENCY__FROM:
        return from != null;
      case HierarchicalgraphPackage.HG_DEPENDENCY__TO:
        return to != null;
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
      case HierarchicalgraphPackage.HG_DEPENDENCY___GET_CORE_DEPENDENCIES:
        return getCoreDependencies();
      case HierarchicalgraphPackage.HG_DEPENDENCY___GET_WEIGHT:
        return getWeight();
    }
    return super.eInvoke(operationID, arguments);
  }

} //HGDependencyImpl

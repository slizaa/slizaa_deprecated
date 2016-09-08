/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HG Core Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGCoreDependencyImpl#getAggregatedCoreDependencyParent <em>Aggregated Core Dependency Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGCoreDependencyImpl extends HGDependencyImpl implements HGCoreDependency {
  /**
   * The cached value of the '{@link #getAggregatedCoreDependencyParent() <em>Aggregated Core Dependency Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatedCoreDependencyParent()
   * @generated
   * @ordered
   */
  protected HGAggregatedCoreDependency aggregatedCoreDependencyParent;

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
  public HGAggregatedCoreDependency getAggregatedCoreDependencyParent() {
    if (aggregatedCoreDependencyParent != null && aggregatedCoreDependencyParent.eIsProxy()) {
      InternalEObject oldAggregatedCoreDependencyParent = (InternalEObject)aggregatedCoreDependencyParent;
      aggregatedCoreDependencyParent = (HGAggregatedCoreDependency)eResolveProxy(oldAggregatedCoreDependencyParent);
      if (aggregatedCoreDependencyParent != oldAggregatedCoreDependencyParent) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_PARENT, oldAggregatedCoreDependencyParent, aggregatedCoreDependencyParent));
      }
    }
    return aggregatedCoreDependencyParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGAggregatedCoreDependency basicGetAggregatedCoreDependencyParent() {
    return aggregatedCoreDependencyParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregatedCoreDependencyParent(HGAggregatedCoreDependency newAggregatedCoreDependencyParent) {
    HGAggregatedCoreDependency oldAggregatedCoreDependencyParent = aggregatedCoreDependencyParent;
    aggregatedCoreDependencyParent = newAggregatedCoreDependencyParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_PARENT, oldAggregatedCoreDependencyParent, aggregatedCoreDependencyParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResolvedAggregatedCoreDependency() {
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
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_PARENT:
        if (resolve) return getAggregatedCoreDependencyParent();
        return basicGetAggregatedCoreDependencyParent();
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
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_PARENT:
        setAggregatedCoreDependencyParent((HGAggregatedCoreDependency)newValue);
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
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_PARENT:
        setAggregatedCoreDependencyParent((HGAggregatedCoreDependency)null);
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
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY__AGGREGATED_CORE_DEPENDENCY_PARENT:
        return aggregatedCoreDependencyParent != null;
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
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY___IS_RESOLVED_AGGREGATED_CORE_DEPENDENCY:
        return isResolvedAggregatedCoreDependency();
    }
    return super.eInvoke(operationID, arguments);
  }

} //HGCoreDependencyImpl

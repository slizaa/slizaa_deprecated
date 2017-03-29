/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGProxyDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HG Proxy Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGProxyDependencyImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGProxyDependencyImpl#getResolvedCoreDependencies <em>Resolved Core Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGProxyDependencyImpl extends HGCoreDependencyImpl implements HGProxyDependency {
  /**
   * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResolved()
   * @generated
   * @ordered
   */
  protected static final boolean RESOLVED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResolved()
   * @generated
   * @ordered
   */
  protected boolean resolved = RESOLVED_EDEFAULT;

  /**
   * The cached value of the '{@link #getResolvedCoreDependencies() <em>Resolved Core Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResolvedCoreDependencies()
   * @generated
   * @ordered
   */
  protected EList<HGCoreDependency> resolvedCoreDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HGProxyDependencyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.HG_PROXY_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResolved() {
    return resolved;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<HGCoreDependency> getResolvedCoreDependencies() {
    if (resolvedCoreDependencies == null) {
      resolvedCoreDependencies = new EObjectWithInverseResolvingEList<HGCoreDependency>(HGCoreDependency.class, this, HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES, HierarchicalgraphPackage.HG_CORE_DEPENDENCY__PROXY_DEPENDENCY_PARENT);
    }
    return resolvedCoreDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void resolveProxyDependencies() {
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
      case HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvedCoreDependencies()).basicAdd(otherEnd, msgs);
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
      case HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES:
        return ((InternalEList<?>)getResolvedCoreDependencies()).basicRemove(otherEnd, msgs);
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
      case HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED:
        return isResolved();
      case HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES:
        return getResolvedCoreDependencies();
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
      case HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES:
        getResolvedCoreDependencies().clear();
        getResolvedCoreDependencies().addAll((Collection<? extends HGCoreDependency>)newValue);
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
      case HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES:
        getResolvedCoreDependencies().clear();
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
      case HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED:
        return resolved != RESOLVED_EDEFAULT;
      case HierarchicalgraphPackage.HG_PROXY_DEPENDENCY__RESOLVED_CORE_DEPENDENCIES:
        return resolvedCoreDependencies != null && !resolvedCoreDependencies.isEmpty();
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
      case HierarchicalgraphPackage.HG_PROXY_DEPENDENCY___RESOLVE_PROXY_DEPENDENCIES:
        resolveProxyDependencies();
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
    result.append(" (resolved: ");
    result.append(resolved);
    result.append(')');
    return result.toString();
  }

} //HGProxyDependencyImpl

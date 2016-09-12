/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HG Aggregated Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGAggregatedDependencyImpl#getCoreDependencies <em>Core Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGAggregatedDependencyImpl extends AbstractHGDependencyImpl implements HGAggregatedDependency {
  /**
   * The cached value of the '{@link #getCoreDependencies() <em>Core Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoreDependencies()
   * @generated
   * @ordered
   */
  protected EList<HGCoreDependency> coreDependencies;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HGAggregatedDependencyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.HG_AGGREGATED_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<HGCoreDependency> getCoreDependencies() {
    if (coreDependencies == null) {
      coreDependencies = new EObjectResolvingEList<HGCoreDependency>(HGCoreDependency.class, this, HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES);
    }
    return coreDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAggregatedWeight() {
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
      case HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES:
        return getCoreDependencies();
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
      case HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES:
        getCoreDependencies().clear();
        getCoreDependencies().addAll((Collection<? extends HGCoreDependency>)newValue);
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
      case HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES:
        getCoreDependencies().clear();
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
      case HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES:
        return coreDependencies != null && !coreDependencies.isEmpty();
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
      case HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY___GET_AGGREGATED_WEIGHT:
        return getAggregatedWeight();
    }
    return super.eInvoke(operationID, arguments);
  }

} //HGAggregatedDependencyImpl

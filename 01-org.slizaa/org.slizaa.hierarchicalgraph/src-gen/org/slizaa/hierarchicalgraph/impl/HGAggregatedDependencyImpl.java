/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.HGAggregatedDependencyImpl#getAggregatedWeight <em>Aggregated Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HGAggregatedDependencyImpl extends AbstractHGDependencyImpl implements HGAggregatedDependency {
  /**
   * The default value of the '{@link #getAggregatedWeight() <em>Aggregated Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatedWeight()
   * @generated
   * @ordered
   */
  protected static final int AGGREGATED_WEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAggregatedWeight() <em>Aggregated Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatedWeight()
   * @generated
   * @ordered
   */
  protected int aggregatedWeight = AGGREGATED_WEIGHT_EDEFAULT;

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
    // TODO: implement this method to return the 'Core Dependencies' reference list
    // Ensure that you remove @generated or mark it @generated NOT
    // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
    // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAggregatedWeight() {
    return aggregatedWeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void resolveAggregatedCoreDependencies() {
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
      case HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__AGGREGATED_WEIGHT:
        return getAggregatedWeight();
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
        return !getCoreDependencies().isEmpty();
      case HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__AGGREGATED_WEIGHT:
        return aggregatedWeight != AGGREGATED_WEIGHT_EDEFAULT;
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
      case HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY___RESOLVE_AGGREGATED_CORE_DEPENDENCIES:
        resolveAggregatedCoreDependencies();
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
    result.append(" (aggregatedWeight: ");
    result.append(aggregatedWeight);
    result.append(')');
    return result.toString();
  }

} //HGAggregatedDependencyImpl

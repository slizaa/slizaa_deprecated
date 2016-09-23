/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.DependenciesSelection;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependencies Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.DependenciesSelectionImpl#getCoreDependencies <em>Core Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.impl.DependenciesSelectionImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependenciesSelectionImpl extends MinimalEObjectImpl.Container implements DependenciesSelection {
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
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<AbstractHGDependency> dependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependenciesSelectionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalgraphPackage.Literals.DEPENDENCIES_SELECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<HGCoreDependency> getCoreDependencies() {
    if (coreDependencies == null) {
      coreDependencies = new EObjectResolvingEList<HGCoreDependency>(HGCoreDependency.class, this, HierarchicalgraphPackage.DEPENDENCIES_SELECTION__CORE_DEPENDENCIES);
    }
    return coreDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<AbstractHGDependency> getDependencies() {
    if (dependencies == null) {
      dependencies = new EObjectResolvingEList<AbstractHGDependency>(AbstractHGDependency.class, this, HierarchicalgraphPackage.DEPENDENCIES_SELECTION__DEPENDENCIES);
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case HierarchicalgraphPackage.DEPENDENCIES_SELECTION__CORE_DEPENDENCIES:
        return getCoreDependencies();
      case HierarchicalgraphPackage.DEPENDENCIES_SELECTION__DEPENDENCIES:
        return getDependencies();
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
      case HierarchicalgraphPackage.DEPENDENCIES_SELECTION__CORE_DEPENDENCIES:
        getCoreDependencies().clear();
        getCoreDependencies().addAll((Collection<? extends HGCoreDependency>)newValue);
        return;
      case HierarchicalgraphPackage.DEPENDENCIES_SELECTION__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends AbstractHGDependency>)newValue);
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
      case HierarchicalgraphPackage.DEPENDENCIES_SELECTION__CORE_DEPENDENCIES:
        getCoreDependencies().clear();
        return;
      case HierarchicalgraphPackage.DEPENDENCIES_SELECTION__DEPENDENCIES:
        getDependencies().clear();
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
      case HierarchicalgraphPackage.DEPENDENCIES_SELECTION__CORE_DEPENDENCIES:
        return coreDependencies != null && !coreDependencies.isEmpty();
      case HierarchicalgraphPackage.DEPENDENCIES_SELECTION__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DependenciesSelectionImpl

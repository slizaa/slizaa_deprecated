/**
 */
package org.slizaa.hierarchicalgraph.selection.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.slizaa.hierarchicalgraph.AbstractHGDependency;

import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.SelectionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.impl.DependencySelectionImpl#getSelectedDependencies <em>Selected Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencySelectionImpl extends MinimalEObjectImpl.Container implements DependencySelection {
  /**
   * The cached value of the '{@link #getSelectedDependencies() <em>Selected Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectedDependencies()
   * @generated
   * @ordered
   */
  protected EList<AbstractHGDependency> selectedDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencySelectionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SelectionPackage.Literals.DEPENDENCY_SELECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<AbstractHGDependency> getSelectedDependencies() {
    if (selectedDependencies == null) {
      selectedDependencies = new EObjectResolvingEList<AbstractHGDependency>(AbstractHGDependency.class, this, SelectionPackage.DEPENDENCY_SELECTION__SELECTED_DEPENDENCIES);
    }
    return selectedDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SelectionPackage.DEPENDENCY_SELECTION__SELECTED_DEPENDENCIES:
        return getSelectedDependencies();
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
      case SelectionPackage.DEPENDENCY_SELECTION__SELECTED_DEPENDENCIES:
        getSelectedDependencies().clear();
        getSelectedDependencies().addAll((Collection<? extends AbstractHGDependency>)newValue);
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
      case SelectionPackage.DEPENDENCY_SELECTION__SELECTED_DEPENDENCIES:
        getSelectedDependencies().clear();
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
      case SelectionPackage.DEPENDENCY_SELECTION__SELECTED_DEPENDENCIES:
        return selectedDependencies != null && !selectedDependencies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DependencySelectionImpl

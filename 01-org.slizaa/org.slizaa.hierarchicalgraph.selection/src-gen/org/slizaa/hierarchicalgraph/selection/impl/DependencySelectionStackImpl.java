/**
 */
package org.slizaa.hierarchicalgraph.selection.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.slizaa.hierarchicalgraph.AbstractHGDependency;

import org.slizaa.hierarchicalgraph.selection.DependencySelectionStack;
import org.slizaa.hierarchicalgraph.selection.SelectionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Selection Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.impl.DependencySelectionStackImpl#getCurrentSelection <em>Current Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencySelectionStackImpl extends MinimalEObjectImpl.Container implements DependencySelectionStack {
  /**
   * The cached value of the '{@link #getCurrentSelection() <em>Current Selection</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentSelection()
   * @generated
   * @ordered
   */
  protected EList<AbstractHGDependency> currentSelection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencySelectionStackImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SelectionPackage.Literals.DEPENDENCY_SELECTION_STACK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractHGDependency> getCurrentSelection() {
    if (currentSelection == null) {
      currentSelection = new EObjectResolvingEList<AbstractHGDependency>(AbstractHGDependency.class, this, SelectionPackage.DEPENDENCY_SELECTION_STACK__CURRENT_SELECTION);
    }
    return currentSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean canGoForward() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void goForward() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean canGoBack() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void goBack() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void clear() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelection(EList<AbstractHGDependency> selection) {
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
      case SelectionPackage.DEPENDENCY_SELECTION_STACK__CURRENT_SELECTION:
        return getCurrentSelection();
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
      case SelectionPackage.DEPENDENCY_SELECTION_STACK__CURRENT_SELECTION:
        getCurrentSelection().clear();
        getCurrentSelection().addAll((Collection<? extends AbstractHGDependency>)newValue);
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
      case SelectionPackage.DEPENDENCY_SELECTION_STACK__CURRENT_SELECTION:
        getCurrentSelection().clear();
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
      case SelectionPackage.DEPENDENCY_SELECTION_STACK__CURRENT_SELECTION:
        return currentSelection != null && !currentSelection.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  @SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case SelectionPackage.DEPENDENCY_SELECTION_STACK___CAN_GO_FORWARD:
        return canGoForward();
      case SelectionPackage.DEPENDENCY_SELECTION_STACK___GO_FORWARD:
        goForward();
        return null;
      case SelectionPackage.DEPENDENCY_SELECTION_STACK___CAN_GO_BACK:
        return canGoBack();
      case SelectionPackage.DEPENDENCY_SELECTION_STACK___GO_BACK:
        goBack();
        return null;
      case SelectionPackage.DEPENDENCY_SELECTION_STACK___CLEAR:
        clear();
        return null;
      case SelectionPackage.DEPENDENCY_SELECTION_STACK___SET_SELECTION__ELIST:
        setSelection((EList<AbstractHGDependency>)arguments.get(0));
        return null;
    }
    return super.eInvoke(operationID, arguments);
  }

} //DependencySelectionStackImpl

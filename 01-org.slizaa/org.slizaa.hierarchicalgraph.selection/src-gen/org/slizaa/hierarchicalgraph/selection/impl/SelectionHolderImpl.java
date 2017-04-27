/**
 */
package org.slizaa.hierarchicalgraph.selection.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slizaa.hierarchicalgraph.selection.Selection;
import org.slizaa.hierarchicalgraph.selection.SelectionHolder;
import org.slizaa.hierarchicalgraph.selection.SelectionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.impl.SelectionHolderImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionHolderImpl<S extends Selection> extends MinimalEObjectImpl.Container implements SelectionHolder<S> {
  /**
   * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelection()
   * @generated
   * @ordered
   */
  protected S selection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectionHolderImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SelectionPackage.Literals.SELECTION_HOLDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public S getSelection() {
    if (selection != null && selection.eIsProxy()) {
      InternalEObject oldSelection = (InternalEObject)selection;
      selection = (S)eResolveProxy(oldSelection);
      if (selection != oldSelection) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SelectionPackage.SELECTION_HOLDER__SELECTION, oldSelection, selection));
      }
    }
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public S basicGetSelection() {
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelection(S newSelection) {
    S oldSelection = selection;
    selection = newSelection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelectionPackage.SELECTION_HOLDER__SELECTION, oldSelection, selection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SelectionPackage.SELECTION_HOLDER__SELECTION:
        if (resolve) return getSelection();
        return basicGetSelection();
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
      case SelectionPackage.SELECTION_HOLDER__SELECTION:
        setSelection((S)newValue);
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
      case SelectionPackage.SELECTION_HOLDER__SELECTION:
        setSelection((S)null);
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
      case SelectionPackage.SELECTION_HOLDER__SELECTION:
        return selection != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectionHolderImpl

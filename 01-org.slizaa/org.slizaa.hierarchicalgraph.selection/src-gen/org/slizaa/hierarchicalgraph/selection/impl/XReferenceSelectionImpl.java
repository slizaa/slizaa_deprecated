/**
 */
package org.slizaa.hierarchicalgraph.selection.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.selection.SelectionPackage;
import org.slizaa.hierarchicalgraph.selection.XReferenceSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XReference Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.impl.XReferenceSelectionImpl#getIncomingDependencies <em>Incoming Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.impl.XReferenceSelectionImpl#getOutgoingDependencies <em>Outgoing Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XReferenceSelectionImpl extends MinimalEObjectImpl.Container implements XReferenceSelection {
  /**
   * The cached value of the '{@link #getIncomingDependencies() <em>Incoming Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncomingDependencies()
   * @generated
   * @ordered
   */
  protected EList<HGCoreDependency> incomingDependencies;

  /**
   * The cached value of the '{@link #getOutgoingDependencies() <em>Outgoing Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingDependencies()
   * @generated
   * @ordered
   */
  protected EList<HGCoreDependency> outgoingDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XReferenceSelectionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SelectionPackage.Literals.XREFERENCE_SELECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<HGCoreDependency> getIncomingDependencies() {
    if (incomingDependencies == null) {
      incomingDependencies = new EObjectResolvingEList<HGCoreDependency>(HGCoreDependency.class, this, SelectionPackage.XREFERENCE_SELECTION__INCOMING_DEPENDENCIES);
    }
    return incomingDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<HGCoreDependency> getOutgoingDependencies() {
    if (outgoingDependencies == null) {
      outgoingDependencies = new EObjectResolvingEList<HGCoreDependency>(HGCoreDependency.class, this, SelectionPackage.XREFERENCE_SELECTION__OUTGOING_DEPENDENCIES);
    }
    return outgoingDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SelectionPackage.XREFERENCE_SELECTION__INCOMING_DEPENDENCIES:
        return getIncomingDependencies();
      case SelectionPackage.XREFERENCE_SELECTION__OUTGOING_DEPENDENCIES:
        return getOutgoingDependencies();
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
      case SelectionPackage.XREFERENCE_SELECTION__INCOMING_DEPENDENCIES:
        getIncomingDependencies().clear();
        getIncomingDependencies().addAll((Collection<? extends HGCoreDependency>)newValue);
        return;
      case SelectionPackage.XREFERENCE_SELECTION__OUTGOING_DEPENDENCIES:
        getOutgoingDependencies().clear();
        getOutgoingDependencies().addAll((Collection<? extends HGCoreDependency>)newValue);
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
      case SelectionPackage.XREFERENCE_SELECTION__INCOMING_DEPENDENCIES:
        getIncomingDependencies().clear();
        return;
      case SelectionPackage.XREFERENCE_SELECTION__OUTGOING_DEPENDENCIES:
        getOutgoingDependencies().clear();
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
      case SelectionPackage.XREFERENCE_SELECTION__INCOMING_DEPENDENCIES:
        return incomingDependencies != null && !incomingDependencies.isEmpty();
      case SelectionPackage.XREFERENCE_SELECTION__OUTGOING_DEPENDENCIES:
        return outgoingDependencies != null && !outgoingDependencies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //XReferenceSelectionImpl

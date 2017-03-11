/**
 */
package org.slizaa.hierarchicalgraph.selection.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.slizaa.hierarchicalgraph.HGNode;

import org.slizaa.hierarchicalgraph.selection.NodeSelection;
import org.slizaa.hierarchicalgraph.selection.SelectionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.impl.NodeSelectionImpl#getSelectedNodes <em>Selected Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeSelectionImpl extends MinimalEObjectImpl.Container implements NodeSelection {
  /**
   * The cached value of the '{@link #getSelectedNodes() <em>Selected Nodes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectedNodes()
   * @generated
   * @ordered
   */
  protected EList<HGNode> selectedNodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeSelectionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return SelectionPackage.Literals.NODE_SELECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<HGNode> getSelectedNodes() {
    if (selectedNodes == null) {
      selectedNodes = new EObjectResolvingEList<HGNode>(HGNode.class, this, SelectionPackage.NODE_SELECTION__SELECTED_NODES);
    }
    return selectedNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SelectionPackage.NODE_SELECTION__SELECTED_NODES:
        return getSelectedNodes();
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
      case SelectionPackage.NODE_SELECTION__SELECTED_NODES:
        getSelectedNodes().clear();
        getSelectedNodes().addAll((Collection<? extends HGNode>)newValue);
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
      case SelectionPackage.NODE_SELECTION__SELECTED_NODES:
        getSelectedNodes().clear();
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
      case SelectionPackage.NODE_SELECTION__SELECTED_NODES:
        return selectedNodes != null && !selectedNodes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NodeSelectionImpl

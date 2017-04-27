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
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.impl.NodeSelectionImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeSelectionImpl extends MinimalEObjectImpl.Container implements NodeSelection {
  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<HGNode> nodes;

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
  public List<HGNode> getNodes() {
    if (nodes == null) {
      nodes = new EObjectResolvingEList<HGNode>(HGNode.class, this, SelectionPackage.NODE_SELECTION__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case SelectionPackage.NODE_SELECTION__NODES:
        return getNodes();
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
      case SelectionPackage.NODE_SELECTION__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends HGNode>)newValue);
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
      case SelectionPackage.NODE_SELECTION__NODES:
        getNodes().clear();
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
      case SelectionPackage.NODE_SELECTION__NODES:
        return nodes != null && !nodes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NodeSelectionImpl

/**
 */
package org.slizaa.workbench.model.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.NodeSelection;

import org.slizaa.workbench.model.ModelPackage;
import org.slizaa.workbench.model.SlizaaWorkbenchModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slizaa Workbench Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.workbench.model.impl.SlizaaWorkbenchModelImpl#getRootNode <em>Root Node</em>}</li>
 *   <li>{@link org.slizaa.workbench.model.impl.SlizaaWorkbenchModelImpl#getNodeSelection <em>Node Selection</em>}</li>
 *   <li>{@link org.slizaa.workbench.model.impl.SlizaaWorkbenchModelImpl#getMainDependencySelection <em>Main Dependency Selection</em>}</li>
 *   <li>{@link org.slizaa.workbench.model.impl.SlizaaWorkbenchModelImpl#getDetailDependencySelection <em>Detail Dependency Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlizaaWorkbenchModelImpl extends MinimalEObjectImpl.Container implements SlizaaWorkbenchModel {
  /**
   * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootNode()
   * @generated
   * @ordered
   */
  protected HGRootNode rootNode;

  /**
   * The cached value of the '{@link #getNodeSelection() <em>Node Selection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeSelection()
   * @generated
   * @ordered
   */
  protected NodeSelection nodeSelection;

  /**
   * The cached value of the '{@link #getMainDependencySelection() <em>Main Dependency Selection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainDependencySelection()
   * @generated
   * @ordered
   */
  protected DependencySelection mainDependencySelection;

  /**
   * The cached value of the '{@link #getDetailDependencySelection() <em>Detail Dependency Selection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetailDependencySelection()
   * @generated
   * @ordered
   */
  protected DependencySelection detailDependencySelection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlizaaWorkbenchModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ModelPackage.Literals.SLIZAA_WORKBENCH_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGRootNode getRootNode() {
    if (rootNode != null && rootNode.eIsProxy()) {
      InternalEObject oldRootNode = (InternalEObject)rootNode;
      rootNode = (HGRootNode)eResolveProxy(oldRootNode);
      if (rootNode != oldRootNode) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SLIZAA_WORKBENCH_MODEL__ROOT_NODE, oldRootNode, rootNode));
      }
    }
    return rootNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGRootNode basicGetRootNode() {
    return rootNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootNode(HGRootNode newRootNode) {
    HGRootNode oldRootNode = rootNode;
    rootNode = newRootNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SLIZAA_WORKBENCH_MODEL__ROOT_NODE, oldRootNode, rootNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeSelection getNodeSelection() {
    if (nodeSelection != null && nodeSelection.eIsProxy()) {
      InternalEObject oldNodeSelection = (InternalEObject)nodeSelection;
      nodeSelection = (NodeSelection)eResolveProxy(oldNodeSelection);
      if (nodeSelection != oldNodeSelection) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SLIZAA_WORKBENCH_MODEL__NODE_SELECTION, oldNodeSelection, nodeSelection));
      }
    }
    return nodeSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeSelection basicGetNodeSelection() {
    return nodeSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeSelection(NodeSelection newNodeSelection) {
    NodeSelection oldNodeSelection = nodeSelection;
    nodeSelection = newNodeSelection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SLIZAA_WORKBENCH_MODEL__NODE_SELECTION, oldNodeSelection, nodeSelection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencySelection getMainDependencySelection() {
    if (mainDependencySelection != null && mainDependencySelection.eIsProxy()) {
      InternalEObject oldMainDependencySelection = (InternalEObject)mainDependencySelection;
      mainDependencySelection = (DependencySelection)eResolveProxy(oldMainDependencySelection);
      if (mainDependencySelection != oldMainDependencySelection) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SLIZAA_WORKBENCH_MODEL__MAIN_DEPENDENCY_SELECTION, oldMainDependencySelection, mainDependencySelection));
      }
    }
    return mainDependencySelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencySelection basicGetMainDependencySelection() {
    return mainDependencySelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainDependencySelection(DependencySelection newMainDependencySelection) {
    DependencySelection oldMainDependencySelection = mainDependencySelection;
    mainDependencySelection = newMainDependencySelection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SLIZAA_WORKBENCH_MODEL__MAIN_DEPENDENCY_SELECTION, oldMainDependencySelection, mainDependencySelection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencySelection getDetailDependencySelection() {
    if (detailDependencySelection != null && detailDependencySelection.eIsProxy()) {
      InternalEObject oldDetailDependencySelection = (InternalEObject)detailDependencySelection;
      detailDependencySelection = (DependencySelection)eResolveProxy(oldDetailDependencySelection);
      if (detailDependencySelection != oldDetailDependencySelection) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SLIZAA_WORKBENCH_MODEL__DETAIL_DEPENDENCY_SELECTION, oldDetailDependencySelection, detailDependencySelection));
      }
    }
    return detailDependencySelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencySelection basicGetDetailDependencySelection() {
    return detailDependencySelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetailDependencySelection(DependencySelection newDetailDependencySelection) {
    DependencySelection oldDetailDependencySelection = detailDependencySelection;
    detailDependencySelection = newDetailDependencySelection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SLIZAA_WORKBENCH_MODEL__DETAIL_DEPENDENCY_SELECTION, oldDetailDependencySelection, detailDependencySelection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeSelection(EList<HGNode> nodes) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainDependencySelection(EList<HGNode> dependencies) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetailDependencySelection(EList<HGNode> dependencies) {
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
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__ROOT_NODE:
        if (resolve) return getRootNode();
        return basicGetRootNode();
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__NODE_SELECTION:
        if (resolve) return getNodeSelection();
        return basicGetNodeSelection();
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__MAIN_DEPENDENCY_SELECTION:
        if (resolve) return getMainDependencySelection();
        return basicGetMainDependencySelection();
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__DETAIL_DEPENDENCY_SELECTION:
        if (resolve) return getDetailDependencySelection();
        return basicGetDetailDependencySelection();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__ROOT_NODE:
        setRootNode((HGRootNode)newValue);
        return;
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__NODE_SELECTION:
        setNodeSelection((NodeSelection)newValue);
        return;
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__MAIN_DEPENDENCY_SELECTION:
        setMainDependencySelection((DependencySelection)newValue);
        return;
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__DETAIL_DEPENDENCY_SELECTION:
        setDetailDependencySelection((DependencySelection)newValue);
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
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__ROOT_NODE:
        setRootNode((HGRootNode)null);
        return;
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__NODE_SELECTION:
        setNodeSelection((NodeSelection)null);
        return;
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__MAIN_DEPENDENCY_SELECTION:
        setMainDependencySelection((DependencySelection)null);
        return;
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__DETAIL_DEPENDENCY_SELECTION:
        setDetailDependencySelection((DependencySelection)null);
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
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__ROOT_NODE:
        return rootNode != null;
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__NODE_SELECTION:
        return nodeSelection != null;
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__MAIN_DEPENDENCY_SELECTION:
        return mainDependencySelection != null;
      case ModelPackage.SLIZAA_WORKBENCH_MODEL__DETAIL_DEPENDENCY_SELECTION:
        return detailDependencySelection != null;
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
      case ModelPackage.SLIZAA_WORKBENCH_MODEL___SET_NODE_SELECTION__ELIST:
        setNodeSelection((EList<HGNode>)arguments.get(0));
        return null;
      case ModelPackage.SLIZAA_WORKBENCH_MODEL___SET_MAIN_DEPENDENCY_SELECTION__ELIST:
        setMainDependencySelection((EList<HGNode>)arguments.get(0));
        return null;
      case ModelPackage.SLIZAA_WORKBENCH_MODEL___SET_DETAIL_DEPENDENCY_SELECTION__ELIST:
        setDetailDependencySelection((EList<HGNode>)arguments.get(0));
        return null;
    }
    return super.eInvoke(operationID, arguments);
  }

} //SlizaaWorkbenchModelImpl

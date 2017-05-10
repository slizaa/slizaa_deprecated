/**
 */
package org.slizaa.workbench.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.NodeSelection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slizaa Workbench Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getRootNode <em>Root Node</em>}</li>
 *   <li>{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getNodeSelection <em>Node Selection</em>}</li>
 *   <li>{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getMainDependencySelection <em>Main Dependency Selection</em>}</li>
 *   <li>{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getDetailDependencySelection <em>Detail Dependency Selection</em>}</li>
 * </ul>
 *
 * @see org.slizaa.workbench.model.ModelPackage#getSlizaaWorkbenchModel()
 * @model
 * @generated
 */
public interface SlizaaWorkbenchModel extends EObject {
  /**
   * Returns the value of the '<em><b>Root Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Node</em>' reference.
   * @see #setRootNode(HGRootNode)
   * @see org.slizaa.workbench.model.ModelPackage#getSlizaaWorkbenchModel_RootNode()
   * @model
   * @generated
   */
  HGRootNode getRootNode();

  /**
   * Sets the value of the '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getRootNode <em>Root Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Node</em>' reference.
   * @see #getRootNode()
   * @generated
   */
  void setRootNode(HGRootNode value);

  /**
   * Returns the value of the '<em><b>Node Selection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Selection</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Selection</em>' reference.
   * @see #setNodeSelection(NodeSelection)
   * @see org.slizaa.workbench.model.ModelPackage#getSlizaaWorkbenchModel_NodeSelection()
   * @model
   * @generated
   */
  NodeSelection getNodeSelection();

  /**
   * Sets the value of the '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getNodeSelection <em>Node Selection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Selection</em>' reference.
   * @see #getNodeSelection()
   * @generated
   */
  void setNodeSelection(NodeSelection value);

  /**
   * Returns the value of the '<em><b>Main Dependency Selection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Dependency Selection</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Dependency Selection</em>' reference.
   * @see #setMainDependencySelection(DependencySelection)
   * @see org.slizaa.workbench.model.ModelPackage#getSlizaaWorkbenchModel_MainDependencySelection()
   * @model
   * @generated
   */
  DependencySelection getMainDependencySelection();

  /**
   * Sets the value of the '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getMainDependencySelection <em>Main Dependency Selection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Dependency Selection</em>' reference.
   * @see #getMainDependencySelection()
   * @generated
   */
  void setMainDependencySelection(DependencySelection value);

  /**
   * Returns the value of the '<em><b>Detail Dependency Selection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detail Dependency Selection</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detail Dependency Selection</em>' reference.
   * @see #setDetailDependencySelection(DependencySelection)
   * @see org.slizaa.workbench.model.ModelPackage#getSlizaaWorkbenchModel_DetailDependencySelection()
   * @model
   * @generated
   */
  DependencySelection getDetailDependencySelection();

  /**
   * Sets the value of the '{@link org.slizaa.workbench.model.SlizaaWorkbenchModel#getDetailDependencySelection <em>Detail Dependency Selection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Detail Dependency Selection</em>' reference.
   * @see #getDetailDependencySelection()
   * @generated
   */
  void setDetailDependencySelection(DependencySelection value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model nodesMany="true"
   * @generated
   */
  void setNodeSelection(EList<HGNode> nodes);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dependenciesMany="true"
   * @generated
   */
  void setMainDependencySelection(EList<HGNode> dependencies);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dependenciesMany="true"
   * @generated
   */
  void setDetailDependencySelection(EList<HGNode> dependencies);

} // SlizaaWorkbenchModel

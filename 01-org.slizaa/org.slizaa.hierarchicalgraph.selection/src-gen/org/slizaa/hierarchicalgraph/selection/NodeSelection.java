/**
 */
package org.slizaa.hierarchicalgraph.selection;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.slizaa.hierarchicalgraph.HGNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.NodeSelection#getSelectedNodes <em>Selected Nodes</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getNodeSelection()
 * @model
 * @generated
 */
public interface NodeSelection extends EObject {
  /**
   * Returns the value of the '<em><b>Selected Nodes</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selected Nodes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selected Nodes</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getNodeSelection_SelectedNodes()
   * @model
   * @generated
   */
  List<HGNode> getSelectedNodes();

} // NodeSelection

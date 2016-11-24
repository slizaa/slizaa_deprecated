/**
 */
package org.slizaa.neo4j.workbenchmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Graphs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.workbenchmodel.MappedGraphs#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage#getMappedGraphs()
 * @model
 * @generated
 */
public interface MappedGraphs extends EObject {
  /**
   * Returns the value of the '<em><b>Content</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGRootNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' reference list.
   * @see org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage#getMappedGraphs_Content()
   * @model
   * @generated
   */
  EList<HGRootNode> getContent();

} // MappedGraphs

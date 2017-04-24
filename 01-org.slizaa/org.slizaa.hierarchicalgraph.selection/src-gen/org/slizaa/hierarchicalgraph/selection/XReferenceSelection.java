/**
 */
package org.slizaa.hierarchicalgraph.selection;

import java.util.List;

import org.slizaa.hierarchicalgraph.HGCoreDependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XReference Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.XReferenceSelection#getIncomingDependencies <em>Incoming Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.XReferenceSelection#getOutgoingDependencies <em>Outgoing Dependencies</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getXReferenceSelection()
 * @model
 * @generated
 */
public interface XReferenceSelection extends Selection {
  /**
   * Returns the value of the '<em><b>Incoming Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGCoreDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getXReferenceSelection_IncomingDependencies()
   * @model
   * @generated
   */
  List<HGCoreDependency> getIncomingDependencies();

  /**
   * Returns the value of the '<em><b>Outgoing Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGCoreDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getXReferenceSelection_OutgoingDependencies()
   * @model
   * @generated
   */
  List<HGCoreDependency> getOutgoingDependencies();

} // XReferenceSelection

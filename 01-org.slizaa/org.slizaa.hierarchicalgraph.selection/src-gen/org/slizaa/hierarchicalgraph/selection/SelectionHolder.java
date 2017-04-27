/**
 */
package org.slizaa.hierarchicalgraph.selection;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.SelectionHolder#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getSelectionHolder()
 * @model
 * @generated
 */
public interface SelectionHolder<S extends Selection> extends EObject {
  /**
   * Returns the value of the '<em><b>Selection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' reference.
   * @see #setSelection(Selection)
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getSelectionHolder_Selection()
   * @model required="true"
   * @generated
   */
  S getSelection();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.selection.SelectionHolder#getSelection <em>Selection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection</em>' reference.
   * @see #getSelection()
   * @generated
   */
  void setSelection(S value);

} // SelectionHolder

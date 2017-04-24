/**
 */
package org.slizaa.hierarchicalgraph.selection;

import java.util.List;
import java.util.Optional;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.SelectionStack#getSelections <em>Selections</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.SelectionStack#getCurrentSelection <em>Current Selection</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.SelectionStack#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.SelectionStack#isCanGoForward <em>Can Go Forward</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.SelectionStack#isCanGoBack <em>Can Go Back</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getSelectionStack()
 * @model
 * @generated
 */
public interface SelectionStack<T extends Selection> extends EObject {
  /**
   * Returns the value of the '<em><b>Selections</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selections</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selections</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getSelectionStack_Selections()
   * @model changeable="false"
   * @generated
   */
  List<T> getSelections();

  /**
   * Returns the value of the '<em><b>Current Position</b></em>' attribute.
   * The default value is <code>"-1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Position</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Position</em>' attribute.
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getSelectionStack_CurrentPosition()
   * @model default="-1" changeable="false"
   * @generated
   */
  int getCurrentPosition();

  /**
   * Returns the value of the '<em><b>Can Go Forward</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Can Go Forward</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Can Go Forward</em>' attribute.
   * @see #setCanGoForward(boolean)
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getSelectionStack_CanGoForward()
   * @model
   * @generated
   */
  boolean isCanGoForward();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.selection.SelectionStack#isCanGoForward <em>Can Go Forward</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Can Go Forward</em>' attribute.
   * @see #isCanGoForward()
   * @generated
   */
  void setCanGoForward(boolean value);

  /**
   * Returns the value of the '<em><b>Can Go Back</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Can Go Back</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Can Go Back</em>' attribute.
   * @see #setCanGoBack(boolean)
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getSelectionStack_CanGoBack()
   * @model
   * @generated
   */
  boolean isCanGoBack();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.selection.SelectionStack#isCanGoBack <em>Can Go Back</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Can Go Back</em>' attribute.
   * @see #isCanGoBack()
   * @generated
   */
  void setCanGoBack(boolean value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void clear();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void goForward();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void goBack();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void setCurrentSelection(T setCurrentSelection);

  /**
   * Returns the value of the '<em><b>Current Selection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Selection</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Selection</em>' attribute.
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getSelectionStack_CurrentSelection()
   * @model dataType="org.slizaa.hierarchicalgraph.Optional<T>" changeable="false"
   * @generated
   */
  Optional<T> getCurrentSelection();

} // SelectionStack

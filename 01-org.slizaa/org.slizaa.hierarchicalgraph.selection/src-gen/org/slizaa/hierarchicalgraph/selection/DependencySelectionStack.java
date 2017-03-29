/**
 */
package org.slizaa.hierarchicalgraph.selection;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Selection Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.DependencySelectionStack#getCurrentSelection <em>Current Selection</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getDependencySelectionStack()
 * @model
 * @generated
 */
public interface DependencySelectionStack extends EObject {
  /**
   * Returns the value of the '<em><b>Current Selection</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.AbstractHGDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Selection</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Selection</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getDependencySelectionStack_CurrentSelection()
   * @model
   * @generated
   */
  List<AbstractHGDependency> getCurrentSelection();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  boolean canGoForward();

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
  boolean canGoBack();

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
  void clear();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model selectionMany="true"
   * @generated
   */
  <E extends AbstractHGDependency> void setSelection(List<E> selection);

} // DependencySelectionStack

/**
 */
package org.slizaa.hierarchicalgraph.selection;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.DependencySelection#getSelectedDependencies <em>Selected Dependencies</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getDependencySelection()
 * @model
 * @generated
 */
public interface DependencySelection extends EObject {
  /**
   * Returns the value of the '<em><b>Selected Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.AbstractHGDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selected Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selected Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getDependencySelection_SelectedDependencies()
   * @model
   * @generated
   */
  List<AbstractHGDependency> getSelectedDependencies();

} // DependencySelection

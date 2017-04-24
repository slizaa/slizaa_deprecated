/**
 */
package org.slizaa.hierarchicalgraph.selection;

import java.util.List;
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
 *   <li>{@link org.slizaa.hierarchicalgraph.selection.DependencySelection#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getDependencySelection()
 * @model
 * @generated
 */
public interface DependencySelection extends Selection {

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.AbstractHGDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage#getDependencySelection_Dependencies()
   * @model
   * @generated
   */
  List<AbstractHGDependency> getDependencies();
} // DependencySelection

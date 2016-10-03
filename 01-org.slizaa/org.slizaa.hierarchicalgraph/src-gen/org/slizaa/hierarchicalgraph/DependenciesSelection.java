/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependencies Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.DependenciesSelection#getCoreDependencies <em>Core Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.DependenciesSelection#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getDependenciesSelection()
 * @model
 * @generated
 */
public interface DependenciesSelection extends EObject {
  /**
   * Returns the value of the '<em><b>Core Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGCoreDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Core Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Core Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getDependenciesSelection_CoreDependencies()
   * @model transient="true" derived="true"
   * @generated
   */
  List<HGCoreDependency> getCoreDependencies();

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
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getDependenciesSelection_Dependencies()
   * @model transient="true" derived="true"
   * @generated
   */
  List<AbstractHGDependency> getDependencies();

} // DependenciesSelection

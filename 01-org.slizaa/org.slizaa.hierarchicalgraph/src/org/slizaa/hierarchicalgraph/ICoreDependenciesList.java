/**
 */
package org.slizaa.hierarchicalgraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICore Dependencies List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.ICoreDependenciesList#getCoreDependencies <em>Core Dependencies</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getICoreDependenciesList()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ICoreDependenciesList extends EObject {
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
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getICoreDependenciesList_CoreDependencies()
   * @model transient="true" derived="true"
   * @generated
   */
  EList<HGCoreDependency> getCoreDependencies();

} // ICoreDependenciesList

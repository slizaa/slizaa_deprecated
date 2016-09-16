/**
 */
package org.slizaa.hierarchicalgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HG Aggregated Core Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency#isResolved <em>Resolved</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency#getResolvedCoreDependencies <em>Resolved Core Dependencies</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGAggregatedCoreDependency()
 * @model
 * @generated
 */
public interface HGAggregatedCoreDependency extends HGCoreDependency {
  /**
   * Returns the value of the '<em><b>Resolved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolved</em>' attribute.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGAggregatedCoreDependency_Resolved()
   * @model changeable="false"
   * @generated
   */
  boolean isResolved();

  /**
   * Returns the value of the '<em><b>Resolved Core Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGCoreDependency}.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getAggregatedCoreDependencyParent <em>Aggregated Core Dependency Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolved Core Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolved Core Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGAggregatedCoreDependency_ResolvedCoreDependencies()
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency#getAggregatedCoreDependencyParent
   * @model opposite="aggregatedCoreDependencyParent"
   * @generated
   */
  EList<HGCoreDependency> getResolvedCoreDependencies();

} // HGAggregatedCoreDependency

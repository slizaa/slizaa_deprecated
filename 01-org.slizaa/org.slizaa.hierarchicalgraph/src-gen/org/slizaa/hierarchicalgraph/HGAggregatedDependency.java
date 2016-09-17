/**
 */
package org.slizaa.hierarchicalgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HG Aggregated Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGAggregatedDependency#getCoreDependencies <em>Core Dependencies</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGAggregatedDependency#getAggregatedWeight <em>Aggregated Weight</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGAggregatedDependency()
 * @model
 * @generated
 */
public interface HGAggregatedDependency extends AbstractHGDependency {
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
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGAggregatedDependency_CoreDependencies()
   * @model transient="true" volatile="true" derived="true"
   * @generated
   */
  EList<HGCoreDependency> getCoreDependencies();

  /**
   * Returns the value of the '<em><b>Aggregated Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregated Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregated Weight</em>' attribute.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGAggregatedDependency_AggregatedWeight()
   * @model changeable="false"
   * @generated
   */
  int getAggregatedWeight();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void resolveAggregatedCoreDependencies();

} // HGAggregatedDependency

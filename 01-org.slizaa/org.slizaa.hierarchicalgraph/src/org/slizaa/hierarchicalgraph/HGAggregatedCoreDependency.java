/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HG Aggregated Core Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGAggregatedCoreDependency()
 * @model
 * @generated
 */
public interface HGAggregatedCoreDependency extends HGDependency {
  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.hierarchicalgraph.HGDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGAggregatedCoreDependency_Dependencies()
   * @model transient="true" derived="true"
   * @generated
   */
  List<HGDependency> getDependencies();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void resolveAggregatedCoreDependencies();

} // HGAggregatedCoreDependency

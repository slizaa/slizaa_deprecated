/**
 */
package org.slizaa.hierarchicalgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HG Core Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getAggregatedCoreDependencyParent <em>Aggregated Core Dependency Parent</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency()
 * @model
 * @generated
 */
public interface HGCoreDependency extends HGDependency {
  /**
   * Returns the value of the '<em><b>Aggregated Core Dependency Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregated Core Dependency Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregated Core Dependency Parent</em>' reference.
   * @see #setAggregatedCoreDependencyParent(HGAggregatedCoreDependency)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency_AggregatedCoreDependencyParent()
   * @model
   * @generated
   */
  HGAggregatedCoreDependency getAggregatedCoreDependencyParent();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getAggregatedCoreDependencyParent <em>Aggregated Core Dependency Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregated Core Dependency Parent</em>' reference.
   * @see #getAggregatedCoreDependencyParent()
   * @generated
   */
  void setAggregatedCoreDependencyParent(HGAggregatedCoreDependency value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  boolean isResolvedAggregatedCoreDependency();

} // HGCoreDependency

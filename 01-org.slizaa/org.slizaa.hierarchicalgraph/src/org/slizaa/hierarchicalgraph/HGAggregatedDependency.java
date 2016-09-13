/**
 */
package org.slizaa.hierarchicalgraph;

import java.util.List;

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
 *   <li>{@link org.slizaa.hierarchicalgraph.HGAggregatedDependency#isInitialized <em>Initialized</em>}</li>
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Core Dependencies</em>' reference list.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGAggregatedDependency_CoreDependencies()
   * @model transient="true" derived="true"
   * @generated
   */
  List<HGCoreDependency> getCoreDependencies();

  /**
   * Returns the value of the '<em><b>Initialized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialized</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialized</em>' attribute.
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGAggregatedDependency_Initialized()
   * @model changeable="false"
   * @generated
   */
  boolean isInitialized();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  int getAggregatedWeight();

} // HGAggregatedDependency

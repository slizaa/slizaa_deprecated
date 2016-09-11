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
 *   <li>{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGCoreDependency#isAggregatedCoreDependency <em>Aggregated Core Dependency</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGCoreDependency#isAggregatedCoreDependencyResolved <em>Aggregated Core Dependency Resolved</em>}</li>
 *   <li>{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource <em>Dependency Source</em>}</li>
 * </ul>
 *
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency()
 * @model
 * @generated
 */
public interface HGCoreDependency extends AbstractHGDependency {
  /**
   * Returns the value of the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' attribute.
   * @see #setWeight(int)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency_Weight()
   * @model
   * @generated
   */
  int getWeight();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getWeight <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' attribute.
   * @see #getWeight()
   * @generated
   */
  void setWeight(int value);

  /**
   * Returns the value of the '<em><b>Aggregated Core Dependency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregated Core Dependency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregated Core Dependency</em>' attribute.
   * @see #setAggregatedCoreDependency(boolean)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency_AggregatedCoreDependency()
   * @model
   * @generated
   */
  boolean isAggregatedCoreDependency();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#isAggregatedCoreDependency <em>Aggregated Core Dependency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregated Core Dependency</em>' attribute.
   * @see #isAggregatedCoreDependency()
   * @generated
   */
  void setAggregatedCoreDependency(boolean value);

  /**
   * Returns the value of the '<em><b>Aggregated Core Dependency Resolved</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregated Core Dependency Resolved</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregated Core Dependency Resolved</em>' attribute.
   * @see #setAggregatedCoreDependencyResolved(boolean)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency_AggregatedCoreDependencyResolved()
   * @model
   * @generated
   */
  boolean isAggregatedCoreDependencyResolved();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#isAggregatedCoreDependencyResolved <em>Aggregated Core Dependency Resolved</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregated Core Dependency Resolved</em>' attribute.
   * @see #isAggregatedCoreDependencyResolved()
   * @generated
   */
  void setAggregatedCoreDependencyResolved(boolean value);

  /**
   * Returns the value of the '<em><b>Dependency Source</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link org.slizaa.hierarchicalgraph.HGDependencySource#getDependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency Source</em>' containment reference.
   * @see #setDependencySource(HGDependencySource)
   * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage#getHGCoreDependency_DependencySource()
   * @see org.slizaa.hierarchicalgraph.HGDependencySource#getDependency
   * @model opposite="dependency" containment="true"
   * @generated
   */
  HGDependencySource getDependencySource();

  /**
   * Sets the value of the '{@link org.slizaa.hierarchicalgraph.HGCoreDependency#getDependencySource <em>Dependency Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependency Source</em>' containment reference.
   * @see #getDependencySource()
   * @generated
   */
  void setDependencySource(HGDependencySource value);

} // HGCoreDependency

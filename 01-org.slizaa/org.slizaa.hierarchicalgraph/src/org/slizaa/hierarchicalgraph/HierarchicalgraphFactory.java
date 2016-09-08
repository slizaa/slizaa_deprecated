/**
 */
package org.slizaa.hierarchicalgraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage
 * @generated
 */
public interface HierarchicalgraphFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HierarchicalgraphFactory eINSTANCE = org.slizaa.hierarchicalgraph.impl.HierarchicalgraphFactoryImpl.init();

  /**
   * Returns a new object of class '<em>HG Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HG Node</em>'.
   * @generated
   */
  HGNode createHGNode();

  /**
   * Returns a new object of class '<em>HG Dependency Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HG Dependency Source</em>'.
   * @generated
   */
  HGDependencySource createHGDependencySource();

  /**
   * Returns a new object of class '<em>HG Root Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HG Root Node</em>'.
   * @generated
   */
  HGRootNode createHGRootNode();

  /**
   * Returns a new object of class '<em>Default HG Node Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default HG Node Source</em>'.
   * @generated
   */
  DefaultHGNodeSource createDefaultHGNodeSource();

  /**
   * Returns a new object of class '<em>Default HG Dependency Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default HG Dependency Source</em>'.
   * @generated
   */
  DefaultHGDependencySource createDefaultHGDependencySource();

  /**
   * Returns a new object of class '<em>HG Core Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HG Core Dependency</em>'.
   * @generated
   */
  HGCoreDependency createHGCoreDependency();

  /**
   * Returns a new object of class '<em>HG Aggregated Core Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HG Aggregated Core Dependency</em>'.
   * @generated
   */
  HGAggregatedCoreDependency createHGAggregatedCoreDependency();

  /**
   * Returns a new object of class '<em>HG Aggregated Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HG Aggregated Dependency</em>'.
   * @generated
   */
  HGAggregatedDependency createHGAggregatedDependency();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HierarchicalgraphPackage getHierarchicalgraphPackage();

} //HierarchicalgraphFactory

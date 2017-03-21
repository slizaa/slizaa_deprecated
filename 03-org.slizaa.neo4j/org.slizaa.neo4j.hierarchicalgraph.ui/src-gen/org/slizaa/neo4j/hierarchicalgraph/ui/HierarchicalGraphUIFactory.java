/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage
 * @generated
 */
public interface HierarchicalGraphUIFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HierarchicalGraphUIFactory eINSTANCE = org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Bundle Based Mapping Descriptor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bundle Based Mapping Descriptor</em>'.
   * @generated
   */
  BundleBasedMappingDescriptor createBundleBasedMappingDescriptor();

  /**
   * Returns a new object of class '<em>Workspace Based Mapping Descriptor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workspace Based Mapping Descriptor</em>'.
   * @generated
   */
  WorkspaceBasedMappingDescriptor createWorkspaceBasedMappingDescriptor();

  /**
   * Returns a new object of class '<em>Mapping Descriptor Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Descriptor Container</em>'.
   * @generated
   */
  MappingDescriptorContainer createMappingDescriptorContainer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HierarchicalGraphUIPackage getHierarchicalGraphUIPackage();

} //HierarchicalGraphUIFactory

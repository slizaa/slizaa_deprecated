/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Descriptor Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer#getBundleBasedMappingDescriptors <em>Bundle Based Mapping Descriptors</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer#getWorkspaceBasedMappingDescriptors <em>Workspace Based Mapping Descriptors</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getMappingDescriptorContainer()
 * @model
 * @generated
 */
public interface MappingDescriptorContainer extends EObject {
  /**
   * Returns the value of the '<em><b>Bundle Based Mapping Descriptors</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bundle Based Mapping Descriptors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bundle Based Mapping Descriptors</em>' reference list.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getMappingDescriptorContainer_BundleBasedMappingDescriptors()
   * @model
   * @generated
   */
  EList<BundleBasedMappingDescriptor> getBundleBasedMappingDescriptors();

  /**
   * Returns the value of the '<em><b>Workspace Based Mapping Descriptors</b></em>' reference list.
   * The list contents are of type {@link org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspace Based Mapping Descriptors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace Based Mapping Descriptors</em>' reference list.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getMappingDescriptorContainer_WorkspaceBasedMappingDescriptors()
   * @model
   * @generated
   */
  EList<WorkspaceBasedMappingDescriptor> getWorkspaceBasedMappingDescriptors();

} // MappingDescriptorContainer

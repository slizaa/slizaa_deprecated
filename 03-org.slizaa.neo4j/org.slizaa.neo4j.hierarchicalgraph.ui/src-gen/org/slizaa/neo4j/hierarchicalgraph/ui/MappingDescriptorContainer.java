/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui;

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
   * Returns the value of the '<em><b>Bundle Based Mapping Descriptors</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bundle Based Mapping Descriptors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bundle Based Mapping Descriptors</em>' reference.
   * @see #setBundleBasedMappingDescriptors(MappingDescriptorList)
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getMappingDescriptorContainer_BundleBasedMappingDescriptors()
   * @model required="true"
   * @generated
   */
  MappingDescriptorList getBundleBasedMappingDescriptors();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer#getBundleBasedMappingDescriptors <em>Bundle Based Mapping Descriptors</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bundle Based Mapping Descriptors</em>' reference.
   * @see #getBundleBasedMappingDescriptors()
   * @generated
   */
  void setBundleBasedMappingDescriptors(MappingDescriptorList value);

  /**
   * Returns the value of the '<em><b>Workspace Based Mapping Descriptors</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspace Based Mapping Descriptors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace Based Mapping Descriptors</em>' reference.
   * @see #setWorkspaceBasedMappingDescriptors(MappingDescriptorList)
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage#getMappingDescriptorContainer_WorkspaceBasedMappingDescriptors()
   * @model required="true"
   * @generated
   */
  MappingDescriptorList getWorkspaceBasedMappingDescriptors();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer#getWorkspaceBasedMappingDescriptors <em>Workspace Based Mapping Descriptors</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workspace Based Mapping Descriptors</em>' reference.
   * @see #getWorkspaceBasedMappingDescriptors()
   * @generated
   */
  void setWorkspaceBasedMappingDescriptors(MappingDescriptorList value);

} // MappingDescriptorContainer

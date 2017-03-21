/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer;
import org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Descriptor Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorContainerImpl#getBundleBasedMappingDescriptors <em>Bundle Based Mapping Descriptors</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorContainerImpl#getWorkspaceBasedMappingDescriptors <em>Workspace Based Mapping Descriptors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingDescriptorContainerImpl extends MinimalEObjectImpl.Container implements MappingDescriptorContainer {
  /**
   * The cached value of the '{@link #getBundleBasedMappingDescriptors() <em>Bundle Based Mapping Descriptors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBundleBasedMappingDescriptors()
   * @generated
   * @ordered
   */
  protected EList<BundleBasedMappingDescriptor> bundleBasedMappingDescriptors;

  /**
   * The cached value of the '{@link #getWorkspaceBasedMappingDescriptors() <em>Workspace Based Mapping Descriptors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkspaceBasedMappingDescriptors()
   * @generated
   * @ordered
   */
  protected EList<WorkspaceBasedMappingDescriptor> workspaceBasedMappingDescriptors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingDescriptorContainerImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HierarchicalGraphUIPackage.Literals.MAPPING_DESCRIPTOR_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BundleBasedMappingDescriptor> getBundleBasedMappingDescriptors() {
    if (bundleBasedMappingDescriptors == null) {
      bundleBasedMappingDescriptors = new EObjectResolvingEList<BundleBasedMappingDescriptor>(BundleBasedMappingDescriptor.class, this, HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS);
    }
    return bundleBasedMappingDescriptors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WorkspaceBasedMappingDescriptor> getWorkspaceBasedMappingDescriptors() {
    if (workspaceBasedMappingDescriptors == null) {
      workspaceBasedMappingDescriptors = new EObjectResolvingEList<WorkspaceBasedMappingDescriptor>(WorkspaceBasedMappingDescriptor.class, this, HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS);
    }
    return workspaceBasedMappingDescriptors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS:
        return getBundleBasedMappingDescriptors();
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS:
        return getWorkspaceBasedMappingDescriptors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS:
        getBundleBasedMappingDescriptors().clear();
        getBundleBasedMappingDescriptors().addAll((Collection<? extends BundleBasedMappingDescriptor>)newValue);
        return;
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS:
        getWorkspaceBasedMappingDescriptors().clear();
        getWorkspaceBasedMappingDescriptors().addAll((Collection<? extends WorkspaceBasedMappingDescriptor>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS:
        getBundleBasedMappingDescriptors().clear();
        return;
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS:
        getWorkspaceBasedMappingDescriptors().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS:
        return bundleBasedMappingDescriptors != null && !bundleBasedMappingDescriptors.isEmpty();
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS:
        return workspaceBasedMappingDescriptors != null && !workspaceBasedMappingDescriptors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MappingDescriptorContainerImpl

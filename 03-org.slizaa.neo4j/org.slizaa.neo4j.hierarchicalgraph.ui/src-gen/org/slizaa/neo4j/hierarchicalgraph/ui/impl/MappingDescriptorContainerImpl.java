/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList;

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
   * The cached value of the '{@link #getBundleBasedMappingDescriptors() <em>Bundle Based Mapping Descriptors</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBundleBasedMappingDescriptors()
   * @generated
   * @ordered
   */
  protected MappingDescriptorList bundleBasedMappingDescriptors;

  /**
   * The cached value of the '{@link #getWorkspaceBasedMappingDescriptors() <em>Workspace Based Mapping Descriptors</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkspaceBasedMappingDescriptors()
   * @generated
   * @ordered
   */
  protected MappingDescriptorList workspaceBasedMappingDescriptors;

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
  public MappingDescriptorList getBundleBasedMappingDescriptors() {
    if (bundleBasedMappingDescriptors != null && bundleBasedMappingDescriptors.eIsProxy()) {
      InternalEObject oldBundleBasedMappingDescriptors = (InternalEObject)bundleBasedMappingDescriptors;
      bundleBasedMappingDescriptors = (MappingDescriptorList)eResolveProxy(oldBundleBasedMappingDescriptors);
      if (bundleBasedMappingDescriptors != oldBundleBasedMappingDescriptors) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS, oldBundleBasedMappingDescriptors, bundleBasedMappingDescriptors));
      }
    }
    return bundleBasedMappingDescriptors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingDescriptorList basicGetBundleBasedMappingDescriptors() {
    return bundleBasedMappingDescriptors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBundleBasedMappingDescriptors(MappingDescriptorList newBundleBasedMappingDescriptors) {
    MappingDescriptorList oldBundleBasedMappingDescriptors = bundleBasedMappingDescriptors;
    bundleBasedMappingDescriptors = newBundleBasedMappingDescriptors;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS, oldBundleBasedMappingDescriptors, bundleBasedMappingDescriptors));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingDescriptorList getWorkspaceBasedMappingDescriptors() {
    if (workspaceBasedMappingDescriptors != null && workspaceBasedMappingDescriptors.eIsProxy()) {
      InternalEObject oldWorkspaceBasedMappingDescriptors = (InternalEObject)workspaceBasedMappingDescriptors;
      workspaceBasedMappingDescriptors = (MappingDescriptorList)eResolveProxy(oldWorkspaceBasedMappingDescriptors);
      if (workspaceBasedMappingDescriptors != oldWorkspaceBasedMappingDescriptors) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS, oldWorkspaceBasedMappingDescriptors, workspaceBasedMappingDescriptors));
      }
    }
    return workspaceBasedMappingDescriptors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingDescriptorList basicGetWorkspaceBasedMappingDescriptors() {
    return workspaceBasedMappingDescriptors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkspaceBasedMappingDescriptors(MappingDescriptorList newWorkspaceBasedMappingDescriptors) {
    MappingDescriptorList oldWorkspaceBasedMappingDescriptors = workspaceBasedMappingDescriptors;
    workspaceBasedMappingDescriptors = newWorkspaceBasedMappingDescriptors;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS, oldWorkspaceBasedMappingDescriptors, workspaceBasedMappingDescriptors));
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
        if (resolve) return getBundleBasedMappingDescriptors();
        return basicGetBundleBasedMappingDescriptors();
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS:
        if (resolve) return getWorkspaceBasedMappingDescriptors();
        return basicGetWorkspaceBasedMappingDescriptors();
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
        setBundleBasedMappingDescriptors((MappingDescriptorList)newValue);
        return;
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS:
        setWorkspaceBasedMappingDescriptors((MappingDescriptorList)newValue);
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
        setBundleBasedMappingDescriptors((MappingDescriptorList)null);
        return;
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS:
        setWorkspaceBasedMappingDescriptors((MappingDescriptorList)null);
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
        return bundleBasedMappingDescriptors != null;
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS:
        return workspaceBasedMappingDescriptors != null;
    }
    return super.eIsSet(featureID);
  }

} //MappingDescriptorContainerImpl

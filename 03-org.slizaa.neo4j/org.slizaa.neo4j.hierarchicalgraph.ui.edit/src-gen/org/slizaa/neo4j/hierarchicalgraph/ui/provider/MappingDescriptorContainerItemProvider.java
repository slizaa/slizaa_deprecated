/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import org.eclipse.emf.edit.provider.ViewerNotification;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer;

/**
 * This is the item provider adapter for a {@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingDescriptorContainerItemProvider 
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingDescriptorContainerItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addBundleBasedMappingDescriptorsPropertyDescriptor(object);
      addWorkspaceBasedMappingDescriptorsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Bundle Based Mapping Descriptors feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBundleBasedMappingDescriptorsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MappingDescriptorContainer_bundleBasedMappingDescriptors_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MappingDescriptorContainer_bundleBasedMappingDescriptors_feature", "_UI_MappingDescriptorContainer_type"),
         HierarchicalGraphUIPackage.Literals.MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS,
         false,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Workspace Based Mapping Descriptors feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addWorkspaceBasedMappingDescriptorsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MappingDescriptorContainer_workspaceBasedMappingDescriptors_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MappingDescriptorContainer_workspaceBasedMappingDescriptors_feature", "_UI_MappingDescriptorContainer_type"),
         HierarchicalGraphUIPackage.Literals.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS,
         false,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(HierarchicalGraphUIPackage.Literals.MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS);
      childrenFeatures.add(HierarchicalGraphUIPackage.Literals.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns MappingDescriptorContainer.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/MappingDescriptorContainer"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    return getString("_UI_MappingDescriptorContainer_type");
  }
  

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(MappingDescriptorContainer.class)) {
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS:
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    return HierarchicalgraphuiEditPlugin.INSTANCE;
  }

}

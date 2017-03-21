/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage;

/**
 * This is the item provider adapter for a {@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleBasedMappingDescriptorItemProvider 
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
  public BundleBasedMappingDescriptorItemProvider(AdapterFactory adapterFactory) {
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

      addMappingDescriptorPropertyDescriptor(object);
      addBundleSymbolicNamePropertyDescriptor(object);
      addBasePathPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Mapping Descriptor feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMappingDescriptorPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ISlizaaMappingDescription_mappingDescriptor_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ISlizaaMappingDescription_mappingDescriptor_feature", "_UI_ISlizaaMappingDescription_type"),
         HierarchicalGraphUIPackage.Literals.ISLIZAA_MAPPING_DESCRIPTION__MAPPING_DESCRIPTOR,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Bundle Symbolic Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBundleSymbolicNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_BundleBasedMappingDescriptor_bundleSymbolicName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_BundleBasedMappingDescriptor_bundleSymbolicName_feature", "_UI_BundleBasedMappingDescriptor_type"),
         HierarchicalGraphUIPackage.Literals.BUNDLE_BASED_MAPPING_DESCRIPTOR__BUNDLE_SYMBOLIC_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Base Path feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBasePathPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_BundleBasedMappingDescriptor_basePath_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_BundleBasedMappingDescriptor_basePath_feature", "_UI_BundleBasedMappingDescriptor_type"),
         HierarchicalGraphUIPackage.Literals.BUNDLE_BASED_MAPPING_DESCRIPTOR__BASE_PATH,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns BundleBasedMappingDescriptor.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/BundleBasedMappingDescriptor"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((BundleBasedMappingDescriptor)object).getBundleSymbolicName();
    return label == null || label.length() == 0 ?
      getString("_UI_BundleBasedMappingDescriptor_type") :
      getString("_UI_BundleBasedMappingDescriptor_type") + " " + label;
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

    switch (notification.getFeatureID(BundleBasedMappingDescriptor.class)) {
      case HierarchicalGraphUIPackage.BUNDLE_BASED_MAPPING_DESCRIPTOR__BUNDLE_SYMBOLIC_NAME:
      case HierarchicalGraphUIPackage.BUNDLE_BASED_MAPPING_DESCRIPTOR__BASE_PATH:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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

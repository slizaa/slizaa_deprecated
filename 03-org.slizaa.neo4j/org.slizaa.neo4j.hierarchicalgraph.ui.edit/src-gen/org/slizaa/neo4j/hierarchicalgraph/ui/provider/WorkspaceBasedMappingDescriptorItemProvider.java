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

import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage;
import org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor;

/**
 * This is the item provider adapter for a {@link org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkspaceBasedMappingDescriptorItemProvider 
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
  public WorkspaceBasedMappingDescriptorItemProvider(AdapterFactory adapterFactory) {
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
      addQualifiedNamePropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addDescriptionPropertyDescriptor(object);
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
         getString("_UI_ISlizaaMappingDescriptor_mappingDescriptor_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ISlizaaMappingDescriptor_mappingDescriptor_feature", "_UI_ISlizaaMappingDescriptor_type"),
         HierarchicalGraphUIPackage.Literals.ISLIZAA_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Qualified Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addQualifiedNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ISlizaaMappingDescriptor_qualifiedName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ISlizaaMappingDescriptor_qualifiedName_feature", "_UI_ISlizaaMappingDescriptor_type"),
         HierarchicalGraphUIPackage.Literals.ISLIZAA_MAPPING_DESCRIPTOR__QUALIFIED_NAME,
         false,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ISlizaaMappingDescriptor_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ISlizaaMappingDescriptor_name_feature", "_UI_ISlizaaMappingDescriptor_type"),
         HierarchicalGraphUIPackage.Literals.ISLIZAA_MAPPING_DESCRIPTOR__NAME,
         false,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Description feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDescriptionPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ISlizaaMappingDescriptor_description_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ISlizaaMappingDescriptor_description_feature", "_UI_ISlizaaMappingDescriptor_type"),
         HierarchicalGraphUIPackage.Literals.ISLIZAA_MAPPING_DESCRIPTOR__DESCRIPTION,
         false,
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
         getString("_UI_WorkspaceBasedMappingDescriptor_basePath_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_WorkspaceBasedMappingDescriptor_basePath_feature", "_UI_WorkspaceBasedMappingDescriptor_type"),
         HierarchicalGraphUIPackage.Literals.WORKSPACE_BASED_MAPPING_DESCRIPTOR__BASE_PATH,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns WorkspaceBasedMappingDescriptor.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkspaceBasedMappingDescriptor"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((WorkspaceBasedMappingDescriptor)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_WorkspaceBasedMappingDescriptor_type") :
      getString("_UI_WorkspaceBasedMappingDescriptor_type") + " " + label;
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

    switch (notification.getFeatureID(WorkspaceBasedMappingDescriptor.class)) {
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__QUALIFIED_NAME:
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__NAME:
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__DESCRIPTION:
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR__BASE_PATH:
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

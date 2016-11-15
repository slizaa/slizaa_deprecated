/**
 */
package org.slizaa.neo4j.dbadapter.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.slizaa.neo4j.dbadapter.DbAdapterPackage;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;

/**
 * This is the item provider adapter for a {@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ManagedNeo4jInstanceItemProvider extends Neo4jRestClientItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManagedNeo4jInstanceItemProvider(AdapterFactory adapterFactory) {
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

      addRunningPropertyDescriptor(object);
      addStorageAreaPropertyDescriptor(object);
      addDirectoriesToScanPropertyDescriptor(object);
      addLaunchPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Running feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRunningPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ManagedNeo4jInstance_running_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ManagedNeo4jInstance_running_feature", "_UI_ManagedNeo4jInstance_type"),
         DbAdapterPackage.Literals.MANAGED_NEO4J_INSTANCE__RUNNING,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Storage Area feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addStorageAreaPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ManagedNeo4jInstance_storageArea_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ManagedNeo4jInstance_storageArea_feature", "_UI_ManagedNeo4jInstance_type"),
         DbAdapterPackage.Literals.MANAGED_NEO4J_INSTANCE__STORAGE_AREA,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Directories To Scan feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDirectoriesToScanPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ManagedNeo4jInstance_directoriesToScan_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ManagedNeo4jInstance_directoriesToScan_feature", "_UI_ManagedNeo4jInstance_type"),
         DbAdapterPackage.Literals.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Launch feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addLaunchPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ManagedNeo4jInstance_launch_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ManagedNeo4jInstance_launch_feature", "_UI_ManagedNeo4jInstance_type"),
         DbAdapterPackage.Literals.MANAGED_NEO4J_INSTANCE__LAUNCH,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This returns ManagedNeo4jInstance.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ManagedNeo4jInstance"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((ManagedNeo4jInstance)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_ManagedNeo4jInstance_type") :
      getString("_UI_ManagedNeo4jInstance_type") + " " + label;
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

    switch (notification.getFeatureID(ManagedNeo4jInstance.class)) {
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__RUNNING:
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__LAUNCH:
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

}

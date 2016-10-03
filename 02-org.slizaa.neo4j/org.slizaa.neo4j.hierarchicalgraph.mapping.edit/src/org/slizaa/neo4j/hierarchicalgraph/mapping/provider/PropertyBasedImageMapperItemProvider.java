/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.provider;


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

import org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage;
import org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper;

/**
 * This is the item provider adapter for a {@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyBasedImageMapperItemProvider 
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
	public PropertyBasedImageMapperItemProvider(AdapterFactory adapterFactory) {
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

      addPositionPropertyDescriptor(object);
      addPropertyNamePropertyDescriptor(object);
      addPropertyValuePropertyDescriptor(object);
      addImagePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

	/**
   * This adds a property descriptor for the Position feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addPositionPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PropertyBasedImageMapper_position_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PropertyBasedImageMapper_position_feature", "_UI_PropertyBasedImageMapper_type"),
         Neo4jHierarchicalGraphMappingPackage.Literals.PROPERTY_BASED_IMAGE_MAPPER__POSITION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Property Name feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addPropertyNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PropertyBasedImageMapper_propertyName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PropertyBasedImageMapper_propertyName_feature", "_UI_PropertyBasedImageMapper_type"),
         Neo4jHierarchicalGraphMappingPackage.Literals.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Property Value feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addPropertyValuePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PropertyBasedImageMapper_propertyValue_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PropertyBasedImageMapper_propertyValue_feature", "_UI_PropertyBasedImageMapper_type"),
         Neo4jHierarchicalGraphMappingPackage.Literals.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_VALUE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This adds a property descriptor for the Image feature.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void addImagePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_PropertyBasedImageMapper_image_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_PropertyBasedImageMapper_image_feature", "_UI_PropertyBasedImageMapper_type"),
         Neo4jHierarchicalGraphMappingPackage.Literals.PROPERTY_BASED_IMAGE_MAPPER__IMAGE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

	/**
   * This returns PropertyBasedImageMapper.gif.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/PropertyBasedImageMapper"));
  }

	/**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String getText(Object object) {
    String label = ((PropertyBasedImageMapper)object).getPropertyName();
    return label == null || label.length() == 0 ?
      getString("_UI_PropertyBasedImageMapper_type") :
      getString("_UI_PropertyBasedImageMapper_type") + " " + label;
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

    switch (notification.getFeatureID(PropertyBasedImageMapper.class)) {
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__POSITION:
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_NAME:
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_VALUE:
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER__IMAGE:
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
    return Hierarchicalgraphneo4jmappingEditPlugin.INSTANCE;
  }

}

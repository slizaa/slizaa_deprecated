/**
 */
package org.slizaa.neo4j.dbadapter.provider;


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
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.slizaa.neo4j.dbadapter.DbAdapterPackage;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

/**
 * This is the item provider adapter for a {@link org.slizaa.neo4j.dbadapter.Neo4jRestClient} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Neo4jRestClientItemProvider 
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemStyledLabelProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Neo4jRestClientItemProvider(AdapterFactory adapterFactory) {
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

      addNamePropertyDescriptor(object);
      addConnectedPropertyDescriptor(object);
      addDescriptionPropertyDescriptor(object);
      addBaseURIPropertyDescriptor(object);
      addDefiningResourcePropertyDescriptor(object);
      addHierarchicalGraphPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
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
         getString("_UI_Neo4jRestClient_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Neo4jRestClient_name_feature", "_UI_Neo4jRestClient_type"),
         DbAdapterPackage.Literals.NEO4J_REST_CLIENT__NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Connected feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addConnectedPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Neo4jRestClient_connected_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Neo4jRestClient_connected_feature", "_UI_Neo4jRestClient_type"),
         DbAdapterPackage.Literals.NEO4J_REST_CLIENT__CONNECTED,
         false,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
         getString("_UI_Neo4jRestClient_description_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Neo4jRestClient_description_feature", "_UI_Neo4jRestClient_type"),
         DbAdapterPackage.Literals.NEO4J_REST_CLIENT__DESCRIPTION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Base URI feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBaseURIPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Neo4jRestClient_baseURI_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Neo4jRestClient_baseURI_feature", "_UI_Neo4jRestClient_type"),
         DbAdapterPackage.Literals.NEO4J_REST_CLIENT__BASE_URI,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Defining Resource feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDefiningResourcePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Neo4jRestClient_definingResource_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Neo4jRestClient_definingResource_feature", "_UI_Neo4jRestClient_type"),
         DbAdapterPackage.Literals.NEO4J_REST_CLIENT__DEFINING_RESOURCE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Hierarchical Graph feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addHierarchicalGraphPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Neo4jRestClient_hierarchicalGraph_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Neo4jRestClient_hierarchicalGraph_feature", "_UI_Neo4jRestClient_type"),
         DbAdapterPackage.Literals.NEO4J_REST_CLIENT__HIERARCHICAL_GRAPH,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This returns Neo4jRestClient.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Neo4jRestClient"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    return ((StyledString)getStyledText(object)).getString();
  }
  

  /**
   * This returns the label styled text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getStyledText(Object object) {
    String label = ((Neo4jRestClient)object).getName();
    	StyledString styledLabel = new StyledString();
    if (label == null || label.length() == 0) {
      styledLabel.append(getString("_UI_Neo4jRestClient_type"), StyledString.Style.QUALIFIER_STYLER); 
    } else {
      styledLabel.append(getString("_UI_Neo4jRestClient_type"), StyledString.Style.QUALIFIER_STYLER).append(" " + label);
    }
    return styledLabel;
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

    switch (notification.getFeatureID(Neo4jRestClient.class)) {
      case DbAdapterPackage.NEO4J_REST_CLIENT__NAME:
      case DbAdapterPackage.NEO4J_REST_CLIENT__CONNECTED:
      case DbAdapterPackage.NEO4J_REST_CLIENT__DESCRIPTION:
      case DbAdapterPackage.NEO4J_REST_CLIENT__BASE_URI:
      case DbAdapterPackage.NEO4J_REST_CLIENT__DEFINING_RESOURCE:
      case DbAdapterPackage.NEO4J_REST_CLIENT__HIERARCHICAL_GRAPH:
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
    return Neo4jdbadapterEditPlugin.INSTANCE;
  }

}

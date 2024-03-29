/**
 */
package org.slizaa.neo4j.hierarchicalgraph.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

/**
 * This is the item provider adapter for a {@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class Neo4JBackedRootNodeSourceItemProvider extends Neo4JBackedNodeSourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Neo4JBackedRootNodeSourceItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		return Collections.emptyList();
	}

	/**
	 * This adds a property descriptor for the Repository feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addRepositoryPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Neo4JBackedRootNodeSource_repository_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Neo4JBackedRootNodeSource_repository_feature", "_UI_Neo4JBackedRootNodeSource_type"),
         Neo4jHierarchicalgraphPackage.Literals.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY,
         true,
         false,
         true,
         null,
         null,
         null));
  }

	/**
   * This returns Neo4JBackedRootNodeSource.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Neo4JBackedRootNodeSource"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String getText(Object object) {
    Object labelValue = ((Neo4JBackedRootNodeSource)object).getIdentifier();
    String label = labelValue == null ? null : labelValue.toString();
    return label == null || label.length() == 0 ?
      getString("_UI_Neo4JBackedRootNodeSource_type") :
      getString("_UI_Neo4JBackedRootNodeSource_type") + " " + label;
  }

	/**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
   * @generated
   */
	@Override
	public void notifyChanged(Notification notification) {
    updateChildren(notification);
    super.notifyChanged(notification);
  }

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

}

/**
 */
package org.slizaa.neo4j.hierarchicalgraph.provider;

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
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

/**
 * This is the item provider adapter for a {@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class Neo4JRemoteRepositoryItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Neo4JRemoteRepositoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHierarchicalGraphsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addBaseURIPropertyDescriptor(object);
			addThreadPoolSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Hierarchical Graphs feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addHierarchicalGraphsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_INeo4JRepository_hierarchicalGraphs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_INeo4JRepository_hierarchicalGraphs_feature", "_UI_INeo4JRepository_type"),
				 Neo4jHierarchicalgraphPackage.Literals.INEO4_JREPOSITORY__HIERARCHICAL_GRAPHS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Neo4JRemoteRepository_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Neo4JRemoteRepository_name_feature", "_UI_Neo4JRemoteRepository_type"),
				 Neo4jHierarchicalgraphPackage.Literals.NEO4_JREMOTE_REPOSITORY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Base URI feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addBaseURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Neo4JRemoteRepository_baseURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Neo4JRemoteRepository_baseURI_feature", "_UI_Neo4JRemoteRepository_type"),
				 Neo4jHierarchicalgraphPackage.Literals.NEO4_JREMOTE_REPOSITORY__BASE_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Thread Pool Size feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addThreadPoolSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Neo4JRemoteRepository_threadPoolSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Neo4JRemoteRepository_threadPoolSize_feature", "_UI_Neo4JRemoteRepository_type"),
				 Neo4jHierarchicalgraphPackage.Literals.NEO4_JREMOTE_REPOSITORY__THREAD_POOL_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This returns Neo4JRemoteRepository.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Neo4JRemoteRepository"));
	}

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  @Override
  public String getText(Object object) {
    String label = ((Neo4JRemoteRepository) object).getName();
    return label == null || label.length() == 0 ? getString("_UI_Neo4JRemoteRepository_type") : label;
  }

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Neo4JRemoteRepository.class)) {
			case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__NAME:
			case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__BASE_URI:
			case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY__THREAD_POOL_SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

  /**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator() {
		return Neo4jHierarchicalGraphEditPlugin.INSTANCE;
	}

}

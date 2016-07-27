/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.provider;


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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingFactory;
import org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage;

/**
 * This is the item provider adapter for a {@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchicalGraphMappingDescriptorItemProvider 
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
	public HierarchicalGraphMappingDescriptorItemProvider(AdapterFactory adapterFactory) {
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
			addDescriptionPropertyDescriptor(object);
			addHierarchyMappingsPropertyDescriptor(object);
			addDependencyMappersPropertyDescriptor(object);
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
				 getString("_UI_HierarchicalGraphMappingDescriptor_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HierarchicalGraphMappingDescriptor_name_feature", "_UI_HierarchicalGraphMappingDescriptor_type"),
				 Neo4jHierarchicalGraphMappingPackage.Literals.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__NAME,
				 true,
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
				 getString("_UI_HierarchicalGraphMappingDescriptor_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HierarchicalGraphMappingDescriptor_description_feature", "_UI_HierarchicalGraphMappingDescriptor_type"),
				 Neo4jHierarchicalGraphMappingPackage.Literals.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hierarchy Mappings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHierarchyMappingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HierarchicalGraphMappingDescriptor_hierarchyMappings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HierarchicalGraphMappingDescriptor_hierarchyMappings_feature", "_UI_HierarchicalGraphMappingDescriptor_type"),
				 Neo4jHierarchicalGraphMappingPackage.Literals.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__HIERARCHY_MAPPINGS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependency Mappers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependencyMappersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HierarchicalGraphMappingDescriptor_dependencyMappers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HierarchicalGraphMappingDescriptor_dependencyMappers_feature", "_UI_HierarchicalGraphMappingDescriptor_type"),
				 Neo4jHierarchicalGraphMappingPackage.Literals.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DEPENDENCY_MAPPERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(Neo4jHierarchicalGraphMappingPackage.Literals.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__ROOT_MAPPINGS);
			childrenFeatures.add(Neo4jHierarchicalGraphMappingPackage.Literals.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS);
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
	 * This returns HierarchicalGraphMappingDescriptor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HierarchicalGraphMappingDescriptor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HierarchicalGraphMappingDescriptor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HierarchicalGraphMappingDescriptor_type") :
			getString("_UI_HierarchicalGraphMappingDescriptor_type") + " " + label;
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

		switch (notification.getFeatureID(HierarchicalGraphMappingDescriptor.class)) {
			case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__NAME:
			case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DESCRIPTION:
			case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__HIERARCHY_MAPPINGS:
			case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DEPENDENCY_MAPPERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__ROOT_MAPPINGS:
			case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS:
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

		newChildDescriptors.add
			(createChildParameter
				(Neo4jHierarchicalGraphMappingPackage.Literals.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__ROOT_MAPPINGS,
				 Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createCypherQuery()));

		newChildDescriptors.add
			(createChildParameter
				(Neo4jHierarchicalGraphMappingPackage.Literals.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS,
				 Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createNodeLabelMapper()));
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

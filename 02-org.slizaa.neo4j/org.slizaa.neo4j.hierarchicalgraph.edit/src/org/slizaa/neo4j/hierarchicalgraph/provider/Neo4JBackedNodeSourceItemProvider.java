/**
 */
package org.slizaa.neo4j.hierarchicalgraph.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;
import org.slizaa.neo4j.hierarchicalgraph.provider.impl.CustomItemPropertyDescriptor;

/**
 * This is the item provider adapter for a
 * {@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated NOT
 */
public class Neo4JBackedNodeSourceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Neo4JBackedNodeSourceItemProvider(AdapterFactory adapterFactory) {
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

		//
		List<IItemPropertyDescriptor> itemPropertyDescriptors = new ArrayList<IItemPropertyDescriptor>();

		// get the Neo4JBackedNodeSource
		Neo4JBackedNodeSource neo4jBackedNodeSource = (Neo4JBackedNodeSource) object;

		//
		itemPropertyDescriptors
				.add(new CustomItemPropertyDescriptor(neo4jBackedNodeSource.getIdentifier().toString(), "ID", "Node"));

		itemPropertyDescriptors
				.add(new CustomItemPropertyDescriptor(neo4jBackedNodeSource.getLabels().toString(), "Label", "Node"));

		//
		for (Map.Entry<String, String> property : neo4jBackedNodeSource.getProperties()) {
			itemPropertyDescriptors.add(new CustomItemPropertyDescriptor(property.getValue(), property.getKey(), "Properties"));
		}

		//
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((Neo4JBackedNodeSource) object).getIdentifier();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_Neo4JBackedNodeSource_type")
				: getString("_UI_Neo4JBackedNodeSource_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Neo4JBackedNodeSource.class)) {
		case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__IDENTIFIER:
		case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__LABELS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__PROPERTIES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
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

		newChildDescriptors.add(createChildParameter(
				Neo4jHierarchicalgraphPackage.Literals.NEO4_JBACKED_NODE_SOURCE__PROPERTIES,
				HierarchicalgraphFactory.eINSTANCE.create(HierarchicalgraphPackage.Literals.STRING_TO_STRING_MAP)));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Neo4jHierarchicalGraphEditPlugin.INSTANCE;
	}

}

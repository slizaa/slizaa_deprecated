/**
 */
package org.slizaa.hierarchicalgraph.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.INodeSource;

/**
 * This is the item provider adapter for a {@link org.slizaa.hierarchicalgraph.HGNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HGNodeItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, IItemStyledLabelProvider {

	/** the AdapterFactoryItemDelegator */
	private AdapterFactoryItemDelegator _adapterFactoryItemDelegatorInstance;

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public HGNodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);

		// create the composed adapter factory (based on the registry instance)
		ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		// create the AdapterFactoryItemDelegator
		_adapterFactoryItemDelegatorInstance = new AdapterFactoryItemDelegator(composedAdapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {

		// get the node source
		INodeSource hgNodeSource = (INodeSource) ((HGNode) object).getNodeSource();

		// return the property descriptors
		return _adapterFactoryItemDelegatorInstance.getPropertyDescriptors(hgNodeSource);
	}

	/**
   * This adds a property descriptor for the Outgoing Core Dependencies feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addOutgoingCoreDependenciesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HGNode_outgoingCoreDependencies_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HGNode_outgoingCoreDependencies_feature", "_UI_HGNode_type"),
         HierarchicalgraphPackage.Literals.HG_NODE__OUTGOING_CORE_DEPENDENCIES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Accumulated Outgoing Core Dependencies feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAccumulatedOutgoingCoreDependenciesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HGNode_accumulatedOutgoingCoreDependencies_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HGNode_accumulatedOutgoingCoreDependencies_feature", "_UI_HGNode_type"),
         HierarchicalgraphPackage.Literals.HG_NODE__ACCUMULATED_OUTGOING_CORE_DEPENDENCIES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Incoming Core Dependencies feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIncomingCoreDependenciesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HGNode_incomingCoreDependencies_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HGNode_incomingCoreDependencies_feature", "_UI_HGNode_type"),
         HierarchicalgraphPackage.Literals.HG_NODE__INCOMING_CORE_DEPENDENCIES,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Accumulated Incoming Core Dependencies feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAccumulatedIncomingCoreDependenciesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HGNode_accumulatedIncomingCoreDependencies_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HGNode_accumulatedIncomingCoreDependencies_feature", "_UI_HGNode_type"),
         HierarchicalgraphPackage.Literals.HG_NODE__ACCUMULATED_INCOMING_CORE_DEPENDENCIES,
         true,
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(HierarchicalgraphPackage.Literals.HG_NODE__CHILDREN);
    }
    return childrenFeatures;
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected boolean shouldComposeCreationImage() {
    return true;
  }

	/**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String getText(Object object) {
    return ((StyledString)getStyledText(object)).getString();
  }

	@Override
	public Object getImage(Object object) {
		if (object instanceof HGNode) {
			HGNode hgNode = (HGNode) object;
			IItemLabelProvider itemLabelProvider = hgNode.getRootNode().getExtension(IItemLabelProvider.class);
			return itemLabelProvider.getImage(object);
		}
		return null;
	}

	/**
	 * This returns the label styled text for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getStyledText(Object object) {

		if (object instanceof HGNode) {
			HGNode hgNode = (HGNode) object;
			IItemLabelProvider itemLabelProvider = hgNode.getRootNode().getExtension(IItemLabelProvider.class);
			if (itemLabelProvider instanceof IItemStyledLabelProvider) {
				IItemStyledLabelProvider styledLabelProvider = (IItemStyledLabelProvider) itemLabelProvider;
				return styledLabelProvider.getStyledText(object);
			}
		}

		return new StyledString(getString("_UI_HGNode_type"));
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

    switch (notification.getFeatureID(HGNode.class)) {
      case HierarchicalgraphPackage.HG_NODE__CHILDREN:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
    return HierarchicalgraphEditPlugin.INSTANCE;
  }

}

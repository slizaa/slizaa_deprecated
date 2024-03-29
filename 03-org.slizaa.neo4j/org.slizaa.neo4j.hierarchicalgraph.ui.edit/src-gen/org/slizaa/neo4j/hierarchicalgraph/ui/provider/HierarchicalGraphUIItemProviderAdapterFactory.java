/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.slizaa.neo4j.hierarchicalgraph.ui.edit.ExtendedBundleBasedMappingDescriptorItemProvider;
import org.slizaa.neo4j.hierarchicalgraph.ui.edit.ExtendedMappingDescriptorListItemProvider;
import org.slizaa.neo4j.hierarchicalgraph.ui.edit.ExtendedWorkspaceBasedMappingDescriptorItemProvider;
import org.slizaa.neo4j.hierarchicalgraph.ui.util.HierarchicalGraphUIAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class HierarchicalGraphUIItemProviderAdapterFactory extends HierarchicalGraphUIAdapterFactory
    implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected IChangeNotifier        changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected Collection<Object>     supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalGraphUIItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor} instances.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected BundleBasedMappingDescriptorItemProvider bundleBasedMappingDescriptorItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  @Override
  public Adapter createBundleBasedMappingDescriptorAdapter() {
    if (bundleBasedMappingDescriptorItemProvider == null) {
      bundleBasedMappingDescriptorItemProvider = new ExtendedBundleBasedMappingDescriptorItemProvider(this);
    }

    return bundleBasedMappingDescriptorItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkspaceBasedMappingDescriptorItemProvider workspaceBasedMappingDescriptorItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  @Override
  public Adapter createWorkspaceBasedMappingDescriptorAdapter() {
    if (workspaceBasedMappingDescriptorItemProvider == null) {
      workspaceBasedMappingDescriptorItemProvider = new ExtendedWorkspaceBasedMappingDescriptorItemProvider(this);
    }

    return workspaceBasedMappingDescriptorItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer} instances.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected MappingDescriptorContainerItemProvider mappingDescriptorContainerItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createMappingDescriptorContainerAdapter() {
    if (mappingDescriptorContainerItemProvider == null) {
      mappingDescriptorContainerItemProvider = new MappingDescriptorContainerItemProvider(this);
    }

    return mappingDescriptorContainerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingDescriptorListItemProvider mappingDescriptorListItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public Adapter createMappingDescriptorListAdapter() {
    if (mappingDescriptorListItemProvider == null) {
      mappingDescriptorListItemProvider = new ExtendedMappingDescriptorListItemProvider(this);
    }

    return mappingDescriptorListItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory() {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type) {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type) {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type) {
    if (isFactoryForType(type)) {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification) {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null) {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void dispose() {
    if (bundleBasedMappingDescriptorItemProvider != null) bundleBasedMappingDescriptorItemProvider.dispose();
    if (workspaceBasedMappingDescriptorItemProvider != null) workspaceBasedMappingDescriptorItemProvider.dispose();
    if (mappingDescriptorContainerItemProvider != null) mappingDescriptorContainerItemProvider.dispose();
    if (mappingDescriptorListItemProvider != null) mappingDescriptorListItemProvider.dispose();
  }

}

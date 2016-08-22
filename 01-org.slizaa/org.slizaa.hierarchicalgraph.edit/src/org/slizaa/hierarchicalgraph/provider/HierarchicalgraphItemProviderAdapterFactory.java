/**
 */
package org.slizaa.hierarchicalgraph.provider;

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
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.slizaa.hierarchicalgraph.util.HierarchicalgraphAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchicalgraphItemProviderAdapterFactory extends HierarchicalgraphAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalgraphItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
    supportedTypes.add(IItemStyledLabelProvider.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.hierarchicalgraph.HGNode} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HGNodeItemProvider hgNodeItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.hierarchicalgraph.HGNode}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createHGNodeAdapter() {
    if (hgNodeItemProvider == null) {
      hgNodeItemProvider = new HGNodeItemProvider(this);
    }

    return hgNodeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.hierarchicalgraph.HGDependencySource} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HGDependencySourceItemProvider hgDependencySourceItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.hierarchicalgraph.HGDependencySource}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createHGDependencySourceAdapter() {
    if (hgDependencySourceItemProvider == null) {
      hgDependencySourceItemProvider = new HGDependencySourceItemProvider(this);
    }

    return hgDependencySourceItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.hierarchicalgraph.HGRootNode} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HGRootNodeItemProvider hgRootNodeItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.hierarchicalgraph.HGRootNode}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createHGRootNodeAdapter() {
    if (hgRootNodeItemProvider == null) {
      hgRootNodeItemProvider = new HGRootNodeItemProvider(this);
    }

    return hgRootNodeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.hierarchicalgraph.DefaultHGDependencySource} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultHGDependencySourceItemProvider defaultHGDependencySourceItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.hierarchicalgraph.DefaultHGDependencySource}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDefaultHGDependencySourceAdapter() {
    if (defaultHGDependencySourceItemProvider == null) {
      defaultHGDependencySourceItemProvider = new DefaultHGDependencySourceItemProvider(this);
    }

    return defaultHGDependencySourceItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.hierarchicalgraph.HGDependency} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HGDependencyItemProvider hgDependencyItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.hierarchicalgraph.HGDependency}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createHGDependencyAdapter() {
    if (hgDependencyItemProvider == null) {
      hgDependencyItemProvider = new HGDependencyItemProvider(this);
    }

    return hgDependencyItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory() {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type) {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type) {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose() {
    if (hgNodeItemProvider != null) hgNodeItemProvider.dispose();
    if (hgDependencySourceItemProvider != null) hgDependencySourceItemProvider.dispose();
    if (hgRootNodeItemProvider != null) hgRootNodeItemProvider.dispose();
    if (defaultHGDependencySourceItemProvider != null) defaultHGDependencySourceItemProvider.dispose();
    if (hgDependencyItemProvider != null) hgDependencyItemProvider.dispose();
  }

}

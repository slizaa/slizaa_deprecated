/**
 */
package org.slizaa.neo4j.dbadapter.provider;

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
import org.slizaa.neo4j.dbadapter.provider.ExtendedDbadapterContainerItemProvider;
import org.slizaa.neo4j.dbadapter.provider.ExtendedNeo4jRestClientItemProvider;
import org.slizaa.neo4j.dbadapter.util.DbadapterAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DbadapterItemProviderAdapterFactory extends DbadapterAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
  public DbadapterItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.neo4j.dbadapter.Neo4jRestClient} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Neo4jRestClientItemProvider neo4jRestClientItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.neo4j.dbadapter.Neo4jRestClient}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public Adapter createNeo4jRestClientAdapter() {
    if (neo4jRestClientItemProvider == null) {
      neo4jRestClientItemProvider = new ExtendedNeo4jRestClientItemProvider(this);
    }

    return neo4jRestClientItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DbAdapterRegistryItemProvider dbAdapterRegistryItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDbAdapterRegistryAdapter() {
    if (dbAdapterRegistryItemProvider == null) {
      dbAdapterRegistryItemProvider = new DbAdapterRegistryItemProvider(this);
    }

    return dbAdapterRegistryItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.neo4j.dbadapter.DbadapterContainer} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DbadapterContainerItemProvider dbadapterContainerItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.neo4j.dbadapter.DbadapterContainer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public Adapter createDbadapterContainerAdapter() {
    if (dbadapterContainerItemProvider == null) {
      dbadapterContainerItemProvider = new ExtendedDbadapterContainerItemProvider(this);
    }

    return dbadapterContainerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ManagedNeo4jInstanceItemProvider managedNeo4jInstanceItemProvider;

  /**
   * This creates an adapter for a {@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createManagedNeo4jInstanceAdapter() {
    if (managedNeo4jInstanceItemProvider == null) {
      managedNeo4jInstanceItemProvider = new ManagedNeo4jInstanceItemProvider(this);
    }

    return managedNeo4jInstanceItemProvider;
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
    if (neo4jRestClientItemProvider != null) neo4jRestClientItemProvider.dispose();
    if (dbAdapterRegistryItemProvider != null) dbAdapterRegistryItemProvider.dispose();
    if (dbadapterContainerItemProvider != null) dbadapterContainerItemProvider.dispose();
    if (managedNeo4jInstanceItemProvider != null) managedNeo4jInstanceItemProvider.dispose();
  }

}
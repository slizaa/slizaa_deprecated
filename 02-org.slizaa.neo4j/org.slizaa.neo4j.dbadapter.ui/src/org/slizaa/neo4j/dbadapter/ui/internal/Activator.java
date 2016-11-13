package org.slizaa.neo4j.dbadapter.ui.internal;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.DbadapterContainer;
import org.slizaa.neo4j.dbadapter.DbadapterFactory;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.dbadapter.ui.internal.action.LauncherService;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

  // The plug-in ID
  public static final String     PLUGIN_ID                = "org.slizaa.neo4j.restclient.ui"; //$NON-NLS-1$

  //
  public static final String     CONTAINER_ID_RESTCLIENTS = "CONTAINER_ID_RESTCLIENTS";

  //
  public static final String     CONTAINER_ID_MANAGEDDBS  = "CONTAINER_ID_MANAGEDDBS";

  // The shared instance
  private static Activator       _plugin;

  /** - */
  private LauncherService        _launcherService;

  //
  private ComposedAdapterFactory _adapterFactory;

  //
  private DbAdapterRegistry      _dbAdapterRegistry;

  /**
   * Returns the shared instance
   *
   * @return the shared instance
   */
  public static Activator getDefault() {
    return _plugin;
  }

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  public void start(BundleContext context) throws Exception {
    super.start(context);
    _plugin = this;

    //
    _dbAdapterRegistry = DbadapterFactory.eINSTANCE.createDbAdapterRegistry();

    //
    DbadapterContainer remoteUnmanagedDatabaseClient = DbadapterFactory.eINSTANCE.createDbadapterContainer();
    remoteUnmanagedDatabaseClient.setName("Remote Database");
    remoteUnmanagedDatabaseClient.setIdentifier(CONTAINER_ID_RESTCLIENTS);
    _dbAdapterRegistry.getClients().add(remoteUnmanagedDatabaseClient);

    //
    DbadapterContainer localManagedDatabaseClient = DbadapterFactory.eINSTANCE.createDbadapterContainer();
    localManagedDatabaseClient.setName("Local Managed Database");
    localManagedDatabaseClient.setIdentifier(CONTAINER_ID_MANAGEDDBS);
    _dbAdapterRegistry.getClients().add(localManagedDatabaseClient);

    Neo4jRestClient restClient = DbadapterFactory.eINSTANCE.createNeo4jRestClient();
    restClient.setBaseURI("http://localhost:7474");
    restClient.setName("localhost");
    restClient.setThreadPoolSize(20);
    restClient.init();
    remoteUnmanagedDatabaseClient.getClients().add(restClient);

    ManagedNeo4jInstance managedNeo4jInstance = DbadapterFactory.eINSTANCE.createManagedNeo4jInstance();
    managedNeo4jInstance.setBaseURI("http://localhost:7474");
    managedNeo4jInstance.setName("localhost");
    managedNeo4jInstance.setThreadPoolSize(20);
    managedNeo4jInstance.init();
    managedNeo4jInstance.setRunning(false);
    managedNeo4jInstance.setStorageArea("c:\\neo4jTemp\\testdatabase");
    managedNeo4jInstance.getDirectoriesToScan().add("c:\\neo4jTemp\\testInput");
    localManagedDatabaseClient.getClients().add(managedNeo4jInstance);

    // register as service
    context.registerService(DbAdapterRegistry.class, _dbAdapterRegistry, null);
  }

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  public void stop(BundleContext context) throws Exception {
    _plugin = null;
    if (_launcherService != null) {
      _launcherService.dispose();
    }
    super.stop(context);
  }

  public LauncherService getLauncherService() {

    //
    if (_launcherService == null) {
      _launcherService = new LauncherService();
      _launcherService.init();
    }

    return _launcherService;
  }

  /**
   * Gives access to the composed adapter factory.
   *
   * @return the adapter factory
   */
  public ComposedAdapterFactory getComposedAdapterFactory() {
    if (_adapterFactory == null) {
      _adapterFactory = new ComposedAdapterFactory(new AdapterFactory[] { new ReflectiveItemProviderAdapterFactory(),
          new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE) });
    }
    return _adapterFactory;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public DbAdapterRegistry getRestClientRegistry() {
    return _dbAdapterRegistry;
  }
}

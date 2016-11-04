package org.slizaa.neo4j.restclient.ui;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.slizaa.neo4j.restclient.Neo4jRestClient;
import org.slizaa.neo4j.restclient.Neo4jRestClientContainer;
import org.slizaa.neo4j.restclient.Neo4jRestClientFactory;
import org.slizaa.neo4j.restclient.Neo4jRestClientRegistry;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

  // The plug-in ID
  public static final String      PLUGIN_ID = "org.slizaa.neo4j.restclient.ui"; //$NON-NLS-1$

  // The shared instance
  private static Activator        _plugin;

  //
  private ComposedAdapterFactory  _adapterFactory;

  //
  private Neo4jRestClientRegistry _restClientRegistry;

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
    _restClientRegistry = Neo4jRestClientFactory.eINSTANCE.createNeo4jRestClientRegistry();

    //
    Neo4jRestClientContainer remoteUnmanagedDatabaseClient = Neo4jRestClientFactory.eINSTANCE.createNeo4jRestClientContainer();
    remoteUnmanagedDatabaseClient.setName("Remote Database");
    _restClientRegistry.getClients().add(remoteUnmanagedDatabaseClient);

    //
    Neo4jRestClientContainer localManagedDatabaseClient = Neo4jRestClientFactory.eINSTANCE
        .createNeo4jRestClientContainer();
    localManagedDatabaseClient.setName("Local Managed Database");
    _restClientRegistry.getClients().add(localManagedDatabaseClient);

    Neo4jRestClient restClient = Neo4jRestClientFactory.eINSTANCE.createNeo4jRestClient();
    restClient.setBaseURI("http://localhost:7474");
    restClient.setName("localhost");
    restClient.setThreadPoolSize(20);
    restClient.init();
    remoteUnmanagedDatabaseClient.getClients().add(restClient);

    // register as service
    context.registerService(Neo4jRestClientRegistry.class, _restClientRegistry, null);
  }

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  public void stop(BundleContext context) throws Exception {
    _plugin = null;
    super.stop(context);
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
  public Neo4jRestClientRegistry getRestClientRegistry() {
    return _restClientRegistry;
  }
}

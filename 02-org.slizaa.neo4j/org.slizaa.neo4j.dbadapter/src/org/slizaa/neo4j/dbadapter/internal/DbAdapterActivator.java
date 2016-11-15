package org.slizaa.neo4j.dbadapter.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slizaa.neo4j.dbadapter.DbAdapterContainer;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.DbAdapterFactory;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

public class DbAdapterActivator implements BundleActivator {

  /** - */
  private static DbAdapterActivator _instance;

  /** - */
  private DbAdapterRegistry         _dbAdapterRegistry;

  /** - */
  private ExecutorService           _executor;

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public static DbAdapterActivator instance() {
    return _instance;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public ExecutorService getExecutor() {
    return _executor;
  }

  @Override
  public void start(BundleContext context) throws Exception {

    //
    _instance = this;

    // TODO!!
    _executor = Executors.newFixedThreadPool(20);

    //
    _dbAdapterRegistry = DbAdapterFactory.eINSTANCE.createDbAdapterRegistry();

    //
    DbAdapterContainer<Neo4jRestClient> remoteUnmanagedDatabaseClient = DbAdapterFactory.eINSTANCE
        .createDbAdapterContainer();
    remoteUnmanagedDatabaseClient.setName("Unmanaged Remote Database");
    _dbAdapterRegistry.setUnmanaged(remoteUnmanagedDatabaseClient);

    //
    DbAdapterContainer<ManagedNeo4jInstance> localManagedDatabaseClient = DbAdapterFactory.eINSTANCE
        .createDbAdapterContainer();
    localManagedDatabaseClient.setName("Managed Local Database");
    _dbAdapterRegistry.setManaged(localManagedDatabaseClient);

    // register as service
    context.registerService(DbAdapterRegistry.class, _dbAdapterRegistry, null);

  }

  @Override
  public void stop(BundleContext context) throws Exception {
    _instance = null;

    //
    _executor.shutdown();

    //
    try {
      _executor.awaitTermination(20, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
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

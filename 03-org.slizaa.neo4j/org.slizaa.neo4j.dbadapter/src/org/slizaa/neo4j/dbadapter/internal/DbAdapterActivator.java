package org.slizaa.neo4j.dbadapter.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slizaa.neo4j.dbadapter.ContainerType;
import org.slizaa.neo4j.dbadapter.DbAdapterContainer;
import org.slizaa.neo4j.dbadapter.DbAdapterFactory;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;

public class DbAdapterActivator implements BundleActivator {

  /** - */
  private static DbAdapterActivator _instance;

  /** - */
  private static ExecutorService    _executor;

  /** - */
  private DbAdapterRegistry         _dbAdapterRegistry;

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
  public static ExecutorService getExecutor() {

    //
    initializeExecutor();

    return _executor;
  }

  @Override
  public void start(BundleContext context) throws Exception {

    //
    _instance = this;

    // TODO!!
    initializeExecutor();

    //
    _dbAdapterRegistry = DbAdapterFactory.eINSTANCE.createDbAdapterRegistry();

    //
    DbAdapterContainer remoteUnmanagedDatabaseClient = DbAdapterFactory.eINSTANCE.createDbAdapterContainer();
    remoteUnmanagedDatabaseClient.setType(ContainerType.UNMANAGED);
    _dbAdapterRegistry.getChildren().add(remoteUnmanagedDatabaseClient);

    //
    DbAdapterContainer localManagedDatabaseClient = DbAdapterFactory.eINSTANCE.createDbAdapterContainer();
    localManagedDatabaseClient.setType(ContainerType.MANAGED);
    _dbAdapterRegistry.getChildren().add(localManagedDatabaseClient);

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

  /**
   * <p>
   * </p>
   */
  private static void initializeExecutor() {
    if (_executor == null) {
      _executor = Executors.newFixedThreadPool(20);
    }
  }
}

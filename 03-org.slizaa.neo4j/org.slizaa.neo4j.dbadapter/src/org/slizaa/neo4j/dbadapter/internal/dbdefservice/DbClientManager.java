package org.slizaa.neo4j.dbadapter.internal.dbdefservice;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.slizaa.neo4j.dbadapter.ContainerType;
import org.slizaa.neo4j.dbadapter.DbAdapterFactory;
import org.slizaa.neo4j.dbadapter.DbAdapterPackage;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.IRestClientConnectionListener;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase;
import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.UnmanagedRemoteDatabase;
import org.slizaa.neo4j.dbadapter.impl.ExtendedManagedNeo4JInstanceImpl;
import org.slizaa.neo4j.dbadapter.internal.LauncherService;

public class DbClientManager {

  /** - */
  private DbAdapterRegistry                   _dbAdapterRegistry;

  /** - */
  private List<IRestClientConnectionListener> _databaseClientAdapterFactories;

  /** - */
  private LauncherService                     _launcherService;

  /** - */
  private Adapter                             _adapter;

  /**
   * <p>
   * Creates a new instance of type {@link DbClientManager}.
   * </p>
   *
   * @param dbAdapterRegistry
   * @param componentFactory
   * @param launcherService
   */
  public DbClientManager(DbAdapterRegistry dbAdapterRegistry,
      List<IRestClientConnectionListener> databaseClientAdapterFactories, LauncherService launcherService) {

    //
    _dbAdapterRegistry = checkNotNull(dbAdapterRegistry);
    _databaseClientAdapterFactories = checkNotNull(databaseClientAdapterFactories);
    _launcherService = checkNotNull(launcherService);

    //
    _adapter = new AdapterImpl() {

      @Override
      public void notifyChanged(Notification msg) {
        if (msg.getEventType() == Notification.SET
            && (msg.getFeatureID(Neo4jRestClient.class) == DbAdapterPackage.MANAGED_NEO4J_INSTANCE__CONNECTED
                || msg.getFeatureID(Neo4jRestClient.class) == DbAdapterPackage.NEO4J_REST_CLIENT__CONNECTED)) {

          Neo4jRestClient restClient = (Neo4jRestClient) msg.getNotifier();

          if (msg.getNewBooleanValue()) {
            for (IRestClientConnectionListener databaseClientAdapterFactory : _databaseClientAdapterFactories) {
              databaseClientAdapterFactory.restClientConnected(restClient);
            }
          } else {
            for (IRestClientConnectionListener databaseClientAdapterFactory : _databaseClientAdapterFactories) {
              databaseClientAdapterFactory.restClientDisconnected(restClient);
            }
          }
        }
      }
    };

  }

  /**
   * <p>
   * </p>
   *
   * @param definingFile
   * @param managedLocalDatabase
   */
  void updateUnmanagedRemoteDatabase(IFile definingFile, UnmanagedRemoteDatabase unmanagedRemoteDatabase) {

    //
    Neo4jRestClient restClient = _dbAdapterRegistry.getDbAdapterContainer(ContainerType.UNMANAGED).getChildren()
        .stream().filter(c -> definingFile.equals(c.getDefiningResource())).findFirst().orElse(null);

    //
    if (restClient != null) {
      restClient.setName(unmanagedRemoteDatabase.getName());
      restClient.setBaseURI(unmanagedRemoteDatabase.getUri());
    }
    //
    else {
      Neo4jRestClient client = DbAdapterFactory.eINSTANCE.createNeo4jRestClient();
      client.setName(unmanagedRemoteDatabase.getName());
      client.setBaseURI(unmanagedRemoteDatabase.getUri());
      client.setDefiningResource(definingFile);
      _dbAdapterRegistry.getDbAdapterContainer(ContainerType.UNMANAGED).getChildren().add(client);
      client.eAdapters().add(_adapter);
    }
  }

  void updateManagedLocalDatabase(IFile definingFile, ManagedLocalDatabase managedLocalDatabase) {

    //
    Neo4jRestClient restClient = _dbAdapterRegistry.getDbAdapterContainer(ContainerType.MANAGED).getChildren().stream()
        .filter(c -> definingFile.equals(c.getDefiningResource())).findFirst().orElse(null);

    //
    if (restClient != null) {

      ExtendedManagedNeo4JInstanceImpl managedNeo4jInstance = (ExtendedManagedNeo4JInstanceImpl) restClient;

      IContainer container = definingFile.getParent();

      managedNeo4jInstance.setName(managedLocalDatabase.getName());
      managedNeo4jInstance.setBaseURI("http://localhost:" + managedLocalDatabase.getPort() + "/");
      managedNeo4jInstance.setName(managedLocalDatabase.getName());
      managedNeo4jInstance
          .setStorageArea(container.getFile(new Path(managedLocalDatabase.getStorage())).getRawLocation().toOSString());
      managedNeo4jInstance.setDefiningResource(definingFile);

      managedNeo4jInstance.getDirectoriesToScan().clear();
      for (String file : managedLocalDatabase.getFiles()) {
        // TODO PATHES -> LAZY
        managedNeo4jInstance.getDirectoriesToScan()
            .add(container.getFile(new Path(file)).getRawLocation().toOSString());
      }
    }
    //
    else {

      IContainer container = definingFile.getParent();

      ExtendedManagedNeo4JInstanceImpl managedNeo4jInstance = (ExtendedManagedNeo4JInstanceImpl) DbAdapterFactory.eINSTANCE
          .createManagedNeo4jInstance();
      managedNeo4jInstance.setLauncherService(_launcherService);
      managedNeo4jInstance.setBaseURI("http://localhost:" + managedLocalDatabase.getPort() + "/");
      managedNeo4jInstance.setName(managedLocalDatabase.getName());
      managedNeo4jInstance.setRunning(false);
      managedNeo4jInstance
          .setStorageArea(container.getFile(new Path(managedLocalDatabase.getStorage())).getRawLocation().toOSString());
      managedNeo4jInstance.setDefiningResource(definingFile);

      for (String file : managedLocalDatabase.getFiles()) {
        // TODO PATHES -> LAZY
        managedNeo4jInstance.getDirectoriesToScan()
            .add(container.getFile(new Path(file)).getRawLocation().toOSString());
      }

      _dbAdapterRegistry.getDbAdapterContainer(ContainerType.MANAGED).getChildren().add(managedNeo4jInstance);
      managedNeo4jInstance.eAdapters().add(_adapter);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param definingFile
   */
  void removeFromUnmanaged(IFile definingFile) {

    //
    Neo4jRestClient restClient = _dbAdapterRegistry.getDbAdapterContainer(ContainerType.UNMANAGED).getChildren()
        .stream().filter(c -> definingFile.equals(c.getDefiningResource())).findFirst().orElse(null);

    //
    if (restClient != null) {
      if (_dbAdapterRegistry.getActiveDbAdapter() == restClient) {
        _dbAdapterRegistry.setActiveDbAdapter(null);
      }
      _dbAdapterRegistry.getDbAdapterContainer(ContainerType.UNMANAGED).getChildren().remove(restClient);
      restClient.eAdapters().remove(_adapter);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param definingFile
   */
  void removeFromManaged(IFile definingFile) {

    //
    Neo4jRestClient restClient = _dbAdapterRegistry.getDbAdapterContainer(ContainerType.MANAGED).getChildren().stream()
        .filter(c -> definingFile.equals(c.getDefiningResource())).findFirst().orElse(null);

    //
    if (restClient != null) {
      if (_dbAdapterRegistry.getActiveDbAdapter() == restClient) {
        _dbAdapterRegistry.setActiveDbAdapter(null);
      }
      _dbAdapterRegistry.getDbAdapterContainer(ContainerType.MANAGED).getChildren().remove(restClient);
      restClient.eAdapters().remove(_adapter);
    }
  }
}

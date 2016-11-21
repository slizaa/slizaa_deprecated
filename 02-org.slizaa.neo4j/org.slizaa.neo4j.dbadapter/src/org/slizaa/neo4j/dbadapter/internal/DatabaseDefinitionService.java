package org.slizaa.neo4j.dbadapter.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.slizaa.neo4j.dbadapter.ContainerType;
import org.slizaa.neo4j.dbadapter.DbAdapterFactory;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.dbadapter.dbAdapterDsl.DbAdapterDefinition;
import org.slizaa.neo4j.dbadapter.dbAdapterDsl.ManagedLocalDatabase;
import org.slizaa.neo4j.dbadapter.dbAdapterDsl.UnmanagedRemoteDatabase;

@Component
public class DatabaseDefinitionService {

  /** - */
  private DbAdapterRegistry _dbAdapterRegistry;

  /**
   * <p>
   * </p>
   *
   * @param adapterRegistry
   */
  @Reference
  public void bindDbAdapterRegistry(DbAdapterRegistry adapterRegistry) {
    _dbAdapterRegistry = adapterRegistry;
  }

  /**
   * <p>
   * </p>
   *
   * @param adapterRegistry
   */
  public void unbindDbAdapterRegistry(DbAdapterRegistry adapterRegistry) {
    _dbAdapterRegistry = null;
  }

  /**
   * <p>
   * </p>
   */
  @Activate
  protected void init() {

    //
    IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

    //
    ResourcesPlugin.getWorkspace().addResourceChangeListener(new IResourceChangeListener() {
      @Override
      public void resourceChanged(IResourceChangeEvent event) {
        if (IResourceChangeEvent.POST_CHANGE == event.getType()) {
          try {
            event.getDelta().accept(new DatabaseDefinitionVisitor());
          } catch (CoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      }
    });

    //
    try {
      workspaceRoot.accept(new IResourceVisitor() {

        @Override
        public boolean visit(IResource resource) throws CoreException {
          if (resource.getType() != IResource.FILE) {
            return true;
          } else {

            if ("dbdef".equals(resource.getFileExtension())) {

              DbAdapterDefinition target = (DbAdapterDefinition) Platform.getAdapterManager().getAdapter(resource,
                  DbAdapterDefinition.class);

              if (target instanceof UnmanagedRemoteDatabase) {
                updateUnmanagedRemoteDatabase((IFile) resource, (UnmanagedRemoteDatabase) target);
              } else if (target instanceof ManagedLocalDatabase) {
                updateManagedLocalDatabase((IFile) resource, (ManagedLocalDatabase) target);
              }
            }

            return false;
          }
        }
      });
    } catch (CoreException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @Deactivate
  protected void dispose() {

  }

  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  class DatabaseDefinitionVisitor implements IResourceDeltaVisitor {

    /**
     * {@inheritDoc}
     */
    public boolean visit(IResourceDelta delta) {

      //
      if (delta.getResource().getType() != IResource.FILE && !"dbdef".equals(delta.getResource().getFileExtension())) {
        return true;
      }

      // cast to file
      IFile file = (IFile) delta.getResource();

      //
      switch (delta.getKind()) {
      case IResourceDelta.ADDED: {

        //
        DbAdapterDefinition dbAdapterDefinition = (DbAdapterDefinition) Platform.getAdapterManager().getAdapter(file,
            DbAdapterDefinition.class);

        if (dbAdapterDefinition instanceof UnmanagedRemoteDatabase) {
          removeFromManaged(file);
          updateUnmanagedRemoteDatabase(file, (UnmanagedRemoteDatabase) dbAdapterDefinition);
        }
        //
        else if (dbAdapterDefinition instanceof ManagedLocalDatabase) {
          removeFromUnmanaged(file);
          updateManagedLocalDatabase(file, (ManagedLocalDatabase) dbAdapterDefinition);
        }
        break;
      }
      case IResourceDelta.REMOVED:
        removeFromUnmanaged(file);
        removeFromManaged(file);
        break;
      case IResourceDelta.CHANGED: {

        //
        DbAdapterDefinition dbAdapterDefinition = (DbAdapterDefinition) Platform.getAdapterManager().getAdapter(file,
            DbAdapterDefinition.class);

        if (dbAdapterDefinition instanceof UnmanagedRemoteDatabase) {
          removeFromManaged(file);
          updateUnmanagedRemoteDatabase(file, (UnmanagedRemoteDatabase) dbAdapterDefinition);
        }

        //
        else if (dbAdapterDefinition instanceof ManagedLocalDatabase) {
          removeFromUnmanaged(file);
          updateManagedLocalDatabase(file, (ManagedLocalDatabase) dbAdapterDefinition);
        }

        break;
      }
      }
      return true; // visit the children
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param definingFile
   * @param managedLocalDatabase
   */
  private void updateUnmanagedRemoteDatabase(IFile definingFile, UnmanagedRemoteDatabase unmanagedRemoteDatabase) {

    // IStringVariableManager manager = VariablesPlugin.getDefault().getStringVariableManager();
    //
    // for (IDynamicVariable variable : manager.getDynamicVariables()) {
    // System.out.println(" - dynVar " + variable.getName());
    // }
    //
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
    }
  }

  private void updateManagedLocalDatabase(IFile definingFile, ManagedLocalDatabase managedLocalDatabase) {

    // IStringVariableManager manager = VariablesPlugin.getDefault().getStringVariableManager();
    //
    // for (IDynamicVariable variable : manager.getDynamicVariables()) {
    // System.out.println(" - dynVar " + variable.getName());
    // }
    //
    //
    Neo4jRestClient restClient = _dbAdapterRegistry.getDbAdapterContainer(ContainerType.MANAGED).getChildren().stream()
        .filter(c -> definingFile.equals(c.getDefiningResource())).findFirst().orElse(null);

    //
    if (restClient != null) {
      restClient.setName(managedLocalDatabase.getName());
      restClient.setBaseURI("http://localhost:" + managedLocalDatabase.getPort());
    }
    //
    else {
      ManagedNeo4jInstance managedNeo4jInstance = DbAdapterFactory.eINSTANCE.createManagedNeo4jInstance();
      managedNeo4jInstance.setBaseURI("http://localhost:" + managedLocalDatabase.getPort() + "/");
      managedNeo4jInstance.setName(managedLocalDatabase.getName());
      managedNeo4jInstance.setRunning(false);
      managedNeo4jInstance.setStorageArea(managedLocalDatabase.getStorage());
      managedNeo4jInstance.setDefiningResource(definingFile);

      for (String file : managedLocalDatabase.getFiles()) {
        managedNeo4jInstance.getDirectoriesToScan().add(file);
      }

      _dbAdapterRegistry.getDbAdapterContainer(ContainerType.MANAGED).getChildren().add(managedNeo4jInstance);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param definingFile
   */
  private void removeFromUnmanaged(IFile definingFile) {

    //
    Neo4jRestClient restClient = _dbAdapterRegistry.getDbAdapterContainer(ContainerType.UNMANAGED).getChildren()
        .stream().filter(c -> definingFile.equals(c.getDefiningResource())).findFirst().orElse(null);

    //
    if (restClient != null) {
      _dbAdapterRegistry.getDbAdapterContainer(ContainerType.UNMANAGED).getChildren().remove(restClient);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param definingFile
   */
  private void removeFromManaged(IFile definingFile) {

    //
    Neo4jRestClient restClient = _dbAdapterRegistry.getDbAdapterContainer(ContainerType.MANAGED).getChildren().stream()
        .filter(c -> definingFile.equals(c.getDefiningResource())).findFirst().orElse(null);

    //
    if (restClient != null) {
      _dbAdapterRegistry.getDbAdapterContainer(ContainerType.MANAGED).getChildren().remove(restClient);
    }
  }
}

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

  @Reference
  public void bindDbAdapterRegistry(DbAdapterRegistry adapterRegistry) {
    _dbAdapterRegistry = adapterRegistry;
  }

  public void unbindDbAdapterRegistry(DbAdapterRegistry adapterRegistry) {
    _dbAdapterRegistry = null;
  }

  @Activate
  protected void init() {

    //
    IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

    //
    ResourcesPlugin.getWorkspace().addResourceChangeListener(new IResourceChangeListener() {
      @Override
      public void resourceChanged(IResourceChangeEvent event) {
        if (IResourceChangeEvent.POST_CHANGE == event.getType()) {
          System.out.println("Resources have changed.");
          try {
            event.getDelta().accept(new DeltaPrinter());
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
              System.out.println("REGISTER: " + resource);
              DbAdapterDefinition target = (DbAdapterDefinition) Platform.getAdapterManager().getAdapter(resource,
                  DbAdapterDefinition.class);

              if (target instanceof UnmanagedRemoteDatabase) {
                System.out.println("handleUnmanagedRemoteDatabase");
                updateUnmanagedRemoteDatabase((IFile) resource, (UnmanagedRemoteDatabase) target);
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

    // public boolean visit(IResource resource) {
    //
    // if (resource.getName().endsWith(".java") processJavaFile((IFile)resource);
    // return true;
    // }
    //
    // }
  }

  @Deactivate
  protected void dispose() {

  }

  class DeltaPrinter implements IResourceDeltaVisitor {
    public boolean visit(IResourceDelta delta) {
      IResource resource = delta.getResource();
      if (resource.getType() != IResource.FILE && !"dbdef".equals(resource.getFileExtension())) {
        return true;
      }
      switch (delta.getKind()) {
      case IResourceDelta.ADDED: {

        DbAdapterDefinition target = (DbAdapterDefinition) Platform.getAdapterManager().getAdapter(resource,
            DbAdapterDefinition.class);

        if (target instanceof UnmanagedRemoteDatabase) {
          updateUnmanagedRemoteDatabase((IFile) resource, (UnmanagedRemoteDatabase) target);
        }
        break;
      }
      case IResourceDelta.REMOVED:
        deleteUnmanagedRemoteDatabase((IFile) resource);
        break;
      case IResourceDelta.CHANGED: {

        DbAdapterDefinition target = (DbAdapterDefinition) Platform.getAdapterManager().getAdapter(resource,
            DbAdapterDefinition.class);

        if (target instanceof UnmanagedRemoteDatabase) {
          updateUnmanagedRemoteDatabase((IFile) resource, (UnmanagedRemoteDatabase) target);
        }

        //
        else if (target instanceof ManagedLocalDatabase) {

          ManagedLocalDatabase managedLocalDatabase = (ManagedLocalDatabase) target;

          ManagedNeo4jInstance managedNeo4jInstance = DbAdapterFactory.eINSTANCE.createManagedNeo4jInstance();
          managedNeo4jInstance.setBaseURI("http://localhost:" + managedLocalDatabase.getPort() + "/");
          managedNeo4jInstance.setName(managedLocalDatabase.getName());
          managedNeo4jInstance.setRunning(false);
          managedNeo4jInstance.setStorageArea(managedLocalDatabase.getStorage());

          for (String file : managedLocalDatabase.getFiles()) {
            managedNeo4jInstance.getDirectoriesToScan().add(file);
          }

          DbAdapterActivator.instance().getRestClientRegistry().getManaged().getChildren().add(managedNeo4jInstance);
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
    Neo4jRestClient restClient = _dbAdapterRegistry.getUnmanaged().getChildren().stream()
        .filter(c -> definingFile.equals(c.getDefiningResource())).findFirst().orElse(null);

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
      _dbAdapterRegistry.getUnmanaged().getChildren().add(client);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param definingFile
   */
  private void deleteUnmanagedRemoteDatabase(IFile definingFile) {

    //
    Neo4jRestClient restClient = _dbAdapterRegistry.getUnmanaged().getChildren().stream()
        .filter(c -> definingFile.equals(c.getDefiningResource())).findFirst().orElse(null);

    //
    if (restClient != null) {
      _dbAdapterRegistry.getUnmanaged().getChildren().remove(restClient);
    }
  }
}

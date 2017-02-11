package org.slizaa.neo4j.dbadapter.internal.dbdefservice;

import java.util.LinkedList;
import java.util.List;

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
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.IRestClientConnectionListener;
import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDefinition;
import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase;
import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.UnmanagedRemoteDatabase;
import org.slizaa.neo4j.dbadapter.internal.LauncherService;

@Component
public class DatabaseDefinitionService {

  /** - */
  private DbAdapterRegistry                      _dbAdapterRegistry;

  /** - */
  private List<IRestClientConnectionListener> _databaseClientAdapterFactories = new LinkedList<IRestClientConnectionListener>();

  /** - */
  private LauncherService                        _launcherService;

  /** - */
  private DbClientManager                        _manager;

  /**
   * <p>
   * </p>
   *
   * @param componentFactory
   */
  @Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
  public void addDatabaseClientAdapterFactory(IRestClientConnectionListener clientAdapterFactory) {
    _databaseClientAdapterFactories.add(clientAdapterFactory);
  }

  /**
   * <p>
   * </p>
   *
   * @param componentFactory
   */
  public void removeDatabaseClientAdapterFactory(IRestClientConnectionListener clientAdapterFactory) {
    _databaseClientAdapterFactories.remove(clientAdapterFactory);
  }

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
    _launcherService = new LauncherService();
    _launcherService.init();

    //
    _manager = new DbClientManager(_dbAdapterRegistry, _databaseClientAdapterFactories, _launcherService);

    //
    observeWorkspace();
  }

  /**
   * <p>
   * </p>
   */
  private void observeWorkspace() {

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

              DbAdapterDefinition target = (DbAdapterDefinition) Platform.getAdapterManager().loadAdapter(resource,
                  DbAdapterDefinition.class.getName());

              if (target instanceof UnmanagedRemoteDatabase) {
                _manager.updateUnmanagedRemoteDatabase((IFile) resource, (UnmanagedRemoteDatabase) target);
              } else if (target instanceof ManagedLocalDatabase) {
                _manager.updateManagedLocalDatabase((IFile) resource, (ManagedLocalDatabase) target);
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
    _launcherService.dispose();
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
          _manager.removeFromManaged(file);
          _manager.updateUnmanagedRemoteDatabase(file, (UnmanagedRemoteDatabase) dbAdapterDefinition);
        }
        //
        else if (dbAdapterDefinition instanceof ManagedLocalDatabase) {
          _manager.removeFromUnmanaged(file);
          _manager.updateManagedLocalDatabase(file, (ManagedLocalDatabase) dbAdapterDefinition);
        }
        break;
      }
      case IResourceDelta.REMOVED:
        _manager.removeFromUnmanaged(file);
        _manager.removeFromManaged(file);
        break;
      case IResourceDelta.CHANGED: {

        //
        DbAdapterDefinition dbAdapterDefinition = (DbAdapterDefinition) Platform.getAdapterManager().getAdapter(file,
            DbAdapterDefinition.class);

        if (dbAdapterDefinition instanceof UnmanagedRemoteDatabase) {
          _manager.removeFromManaged(file);
          _manager.updateUnmanagedRemoteDatabase(file, (UnmanagedRemoteDatabase) dbAdapterDefinition);
        }

        //
        else if (dbAdapterDefinition instanceof ManagedLocalDatabase) {
          _manager.removeFromUnmanaged(file);
          _manager.updateManagedLocalDatabase(file, (ManagedLocalDatabase) dbAdapterDefinition);
        }

        break;
      }
      }
      return true; // visit the children
    }
  }

}

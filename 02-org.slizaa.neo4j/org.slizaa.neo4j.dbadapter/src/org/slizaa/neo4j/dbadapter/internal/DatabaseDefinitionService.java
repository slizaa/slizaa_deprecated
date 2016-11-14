package org.slizaa.neo4j.dbadapter.internal;

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
import org.eclipse.core.variables.IDynamicVariable;
import org.eclipse.core.variables.IStringVariableManager;
import org.eclipse.core.variables.VariablesPlugin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slizaa.neo4j.dbadapter.dbAdapterDsl.DbAdapterDefinition;

@Component
public class DatabaseDefinitionService {

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
            System.out.println(resource);
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
      IResource res = delta.getResource();
      if (res.getType() != IResource.FILE && !"dbdef".equals(res.getFileExtension())) {
        return true;
      }
      switch (delta.getKind()) {
      case IResourceDelta.ADDED:
        System.out.print("Resource ");
        System.out.print(res.getFullPath());
        System.out.println(" was added.");
        break;
      case IResourceDelta.REMOVED:
        System.out.print("Resource ");
        System.out.print(res.getFullPath());
        System.out.println(" was removed.");
        break;
      case IResourceDelta.CHANGED:
        System.out.print("Resource ");
        System.out.print(res.getFullPath());
        System.out.println(" has changed.");

        IStringVariableManager manager = VariablesPlugin.getDefault().getStringVariableManager();
        
        for (IDynamicVariable variable : manager.getDynamicVariables()) {
         System.out.println(" - dynVar " + variable.getName()); 
        }
        
        DbAdapterDefinition target = (DbAdapterDefinition) Platform.getAdapterManager().getAdapter(res,
            DbAdapterDefinition.class);
        System.out.println("MODEL: " + target);
        break;
      }
      return true; // visit the children
    }
  }
}

package org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappingsdialog;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIFactory;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList;
import org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.Activator;

public class MappingDescriptorUtil {

  public static MappingDescriptorContainer getSlizaaMappingDescriptionContainer() {

    //
    MappingDescriptorContainer container = HierarchicalGraphUIFactory.eINSTANCE.createMappingDescriptorContainer();
    MappingDescriptorList mappingDescriptorList = HierarchicalGraphUIFactory.eINSTANCE.createMappingDescriptorList();
    mappingDescriptorList.setName("Built-In Mappings");
    container.setBundleBasedMappingDescriptors(mappingDescriptorList);
    
    mappingDescriptorList = HierarchicalGraphUIFactory.eINSTANCE.createMappingDescriptorList();
    mappingDescriptorList.setName("User-Defined Mappings");
    container.setWorkspaceBasedMappingDescriptors(mappingDescriptorList);

    // add all bundle based mappings
    for (List<BundleBasedMappingDescriptor> mappingDescriptors : Activator.getDefault().getMappingsTracker()
        .getTracked().values()) {

      //
      container.getBundleBasedMappingDescriptors().getMappingDescriptors().addAll(mappingDescriptors);
    }

    // add all workspace mappings
    container.getWorkspaceBasedMappingDescriptors().getMappingDescriptors().addAll(getWorkspaceMappings());

    // return the result
    return container;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private static List<WorkspaceBasedMappingDescriptor> getWorkspaceMappings() {

    // create the result list
    List<WorkspaceBasedMappingDescriptor> result = new LinkedList<WorkspaceBasedMappingDescriptor>();

    try {
      ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {

        @Override
        public boolean visit(IResource resource) throws CoreException {

          //
          if (resource.getType() != IResource.FILE) {
            return true;
          }

          //
          if (resource.getName().endsWith(".mapping")) {

            //
            MappingDescriptor mappingDescriptor = (MappingDescriptor) Platform.getAdapterManager().loadAdapter(resource,
                MappingDescriptor.class.getName());

            //
            if (mappingDescriptor != null) {

              //
              WorkspaceBasedMappingDescriptor descriptor = HierarchicalGraphUIFactory.eINSTANCE
                  .createWorkspaceBasedMappingDescriptor();
              descriptor.setBasePath(resource.getFullPath().removeLastSegments(1).toString());
              descriptor.setMappingDescriptor(mappingDescriptor);
              
              //
              result.add(descriptor);
            }
          }

          return false;
        }
      });
    } catch (CoreException e) {
      e.printStackTrace();
    }

    // return the result
    return result;
  }
}

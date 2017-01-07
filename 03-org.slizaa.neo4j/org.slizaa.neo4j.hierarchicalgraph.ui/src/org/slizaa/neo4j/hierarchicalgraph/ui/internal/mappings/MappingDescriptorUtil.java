package org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappings;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.Activator;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappings.BundleBasedMappingsTracker.BundleBasedMappingsHolder;

public class MappingDescriptorUtil {

  public static List<ISlizaaMappingDescription> getSlizaaMappingDescriptions() {

    //
    List<ISlizaaMappingDescription> result = new LinkedList<ISlizaaMappingDescription>();

    // add all bundle based mappings
    for (BundleBasedMappingsHolder holder : Activator.getDefault().getMappingsTracker().getHolder()) {
      result.addAll(holder.getMappingDescriptors());
    }

    // add all workspace mappings
    result.addAll(getWorkspaceMappings());

    // return the result
    return result;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private static List<ISlizaaMappingDescription> getWorkspaceMappings() {

    // create the result list
    List<ISlizaaMappingDescription> result = new LinkedList<ISlizaaMappingDescription>();

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
              result.add(new WorkspaceBasedMappingDescription(resource.getFullPath().removeLastSegments(1).toString(),
                  mappingDescriptor));
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

package org.slizaa.neo4j.hierarchicalgraph.ui.actions;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.slizaa.neo4j.hierarchicalgraph.mappingdsl.mappingDsl.MappingDescriptor;

public class ReadDescriptors {

  public static List<MappingDescriptor> getMappingDescriptors() {

    //
    List<MappingDescriptor> result = new LinkedList<MappingDescriptor>();

    try {

      //
      ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {

        @Override
        public boolean visit(IResource resource) throws CoreException {
          System.out.println("visit: " + resource);
          //
          if (resource.getType() != IResource.FILE) {
            return true;
          }

          //
          if (resource.getName().endsWith(".mapping")) {
            System.out.println("MAPPING " + resource);
            //
            MappingDescriptor mappingDescriptor = (MappingDescriptor) Platform.getAdapterManager().getAdapter(resource,
                MappingDescriptor.class);
            System.out.println("mappingDescriptor " + mappingDescriptor);
            //
            if (mappingDescriptor != null) {
              result.add(mappingDescriptor);
            }
          }
          return false;
        }
      });
    } catch (CoreException e) {
      e.printStackTrace();
    }

    return result;
  }
}

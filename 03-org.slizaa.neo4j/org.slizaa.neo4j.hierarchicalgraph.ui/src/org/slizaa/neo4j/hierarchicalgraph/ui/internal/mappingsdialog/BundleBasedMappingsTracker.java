package org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappingsdialog;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.util.tracker.BundleTracker;
import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIFactory;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class BundleBasedMappingsTracker extends BundleTracker<List<BundleBasedMappingDescriptor>> {

  /**
   * <p>
   * Creates a new instance of type {@link BundleBasedMappingsTracker}.
   * </p>
   *
   * @param context
   */
  public BundleBasedMappingsTracker(BundleContext context) {
    super(context, Bundle.RESOLVED | Bundle.STARTING | Bundle.ACTIVE | Bundle.STOPPING, null);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<BundleBasedMappingDescriptor> addingBundle(Bundle bundle, BundleEvent event) {

    //
    String slizaaMappings = bundle.getHeaders().get("Slizaa-Mappings");

    //
    if (slizaaMappings != null && !slizaaMappings.isEmpty()) {

      // create the result
      List<BundleBasedMappingDescriptor> result = new LinkedList<>();

      Enumeration<String> mappings = bundle.getEntryPaths(slizaaMappings);
      
      while (mappings.hasMoreElements()) {
        String mapping = (String) mappings.nextElement();
        if (mapping.endsWith(".mapping")) {

          // get directory
          Path path = new Path(mapping);
          IPath parentDirectory = path.removeLastSegments(1);

          //
          MappingDescriptor mappingDescriptor = (MappingDescriptor) Platform.getAdapterManager()
              .loadAdapter(bundle.getEntry(mapping), MappingDescriptor.class.getName());
          
          //
          BundleBasedMappingDescriptor descriptor = HierarchicalGraphUIFactory.eINSTANCE.createBundleBasedMappingDescriptor();
          descriptor.setBundle(bundle);
          descriptor.setBasePath(parentDirectory.toString());
          descriptor.setMappingDescriptor(mappingDescriptor);
          
          //
          result.add(descriptor);
        }
      }
      
      return result;
    }

    return null;
  }
}

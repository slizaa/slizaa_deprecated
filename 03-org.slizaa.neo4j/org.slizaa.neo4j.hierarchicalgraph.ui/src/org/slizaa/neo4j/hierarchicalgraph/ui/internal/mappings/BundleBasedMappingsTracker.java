package org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappings;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.util.tracker.BundleTracker;
import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;

public class BundleBasedMappingsTracker {

  /** - */
  private BundleTracker<BundleBasedMappingsHolder>        _bundleTracker;

  /** - */
  private CopyOnWriteArrayList<BundleBasedMappingsHolder> _bundles;

  /**
   * <p>
   * Creates a new instance of type {@link BundleBasedMappingsTracker}.
   * </p>
   *
   * @param bundleContext
   */
  public BundleBasedMappingsTracker(BundleContext bundleContext) {

    // create the bundles list
    _bundles = new CopyOnWriteArrayList<>();

    //
    _bundleTracker = new BundleTracker<BundleBasedMappingsHolder>(checkNotNull(bundleContext),
        Bundle.RESOLVED | Bundle.STARTING | Bundle.ACTIVE | Bundle.STOPPING, null) {

      @Override
      public BundleBasedMappingsHolder addingBundle(Bundle bundle, BundleEvent event) {

        String slizaaMappings = bundle.getHeaders().get("Slizaa-Mappings");

        if (slizaaMappings != null && !slizaaMappings.isEmpty()) {
          BundleBasedMappingsHolder holder = new BundleBasedMappingsHolder(bundle);
          _bundles.add(holder);

          Enumeration<String> mappings = bundle.getEntryPaths(slizaaMappings);
          while (mappings.hasMoreElements()) {
            String mapping = (String) mappings.nextElement();
            if (mapping.endsWith(".mapping")) {

              Path path = new Path(mapping);
              IPath parentDirectory = path.removeLastSegments(1);
              
              //
              MappingDescriptor mappingDescriptor = (MappingDescriptor) Platform.getAdapterManager()
                  .loadAdapter(bundle.getEntry(mapping), MappingDescriptor.class.getName());

              //
              holder.getMappingDescriptors().add(new BundleBasedMappingDescription(bundle.getSymbolicName(), parentDirectory.toString() ,mappingDescriptor));
            }
          }
        }

        return null;
      }

      @Override
      public void removedBundle(Bundle bundle, BundleEvent event, BundleBasedMappingsHolder object) {

        //
        if (object != null) {
          _bundles.remove(object);
        }

        //
        super.removedBundle(bundle, event, object);
      }
    };
  }

  /**
   * <p>
   * </p>
   */
  public void open() {
    _bundleTracker.open();
  }

  /**
   * <p>
   * </p>
   */
  public void close() {
    _bundleTracker.close();
  }

  public CopyOnWriteArrayList<BundleBasedMappingsHolder> getHolder() {
    return _bundles;
  }
  
  public static class BundleBasedMappingsHolder {

    private Bundle                  _bundle;

    private List<ISlizaaMappingDescription> _mappingDescriptors;

    public BundleBasedMappingsHolder(Bundle bundle) {
      _bundle = checkNotNull(bundle);
      _mappingDescriptors = new LinkedList<>();
    }

    public Bundle getBundle() {
      return _bundle;
    }

    public List<ISlizaaMappingDescription> getMappingDescriptors() {
      return _mappingDescriptors;
    }
  }
}

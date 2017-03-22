package org.slizaa.neo4j.hierarchicalgraph.ui.edit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.provider.BundleBasedMappingDescriptorItemProvider;

public class ExtendedBundleBasedMappingDescriptorItemProvider extends BundleBasedMappingDescriptorItemProvider {

  public ExtendedBundleBasedMappingDescriptorItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  @Override
  public String getText(Object object) {
    return ((BundleBasedMappingDescriptor) object).getName();
  }

  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/BundleBasedMappingDescriptor.png"));
  }
}

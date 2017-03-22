package org.slizaa.neo4j.hierarchicalgraph.ui.edit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList;
import org.slizaa.neo4j.hierarchicalgraph.ui.provider.MappingDescriptorListItemProvider;

public class ExtendedMappingDescriptorListItemProvider extends MappingDescriptorListItemProvider {
  
  public ExtendedMappingDescriptorListItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  @Override
  public String getText(Object object) {
    return ((MappingDescriptorList) object).getName();
  }

  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/MappingDescriptorList.png"));
  }
  
  
}

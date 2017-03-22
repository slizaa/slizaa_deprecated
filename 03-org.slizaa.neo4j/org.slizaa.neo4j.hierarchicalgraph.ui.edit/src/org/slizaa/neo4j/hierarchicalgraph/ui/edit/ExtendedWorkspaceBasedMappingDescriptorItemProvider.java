package org.slizaa.neo4j.hierarchicalgraph.ui.edit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.provider.WorkspaceBasedMappingDescriptorItemProvider;

public class ExtendedWorkspaceBasedMappingDescriptorItemProvider extends WorkspaceBasedMappingDescriptorItemProvider {

  public ExtendedWorkspaceBasedMappingDescriptorItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  @Override
  public String getText(Object object) {
    return ((WorkspaceBasedMappingDescriptor) object).getName();
  }

  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkspaceBasedMappingDescriptor.png"));
  }
}

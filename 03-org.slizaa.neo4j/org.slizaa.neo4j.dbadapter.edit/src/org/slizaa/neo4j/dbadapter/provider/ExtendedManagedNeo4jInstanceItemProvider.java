/**
 */
package org.slizaa.neo4j.dbadapter.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;

/**
 */
public class ExtendedManagedNeo4jInstanceItemProvider extends ManagedNeo4jInstanceItemProvider {

  public ExtendedManagedNeo4jInstanceItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }
  
  @Override
  public Object getImage(Object object) {
    if (((ManagedNeo4jInstance) object).isActive()) {
      if (((ManagedNeo4jInstance) object).isStarted()) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ManagedNeo4jInstance_running_connected.png"));
      } else {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ManagedNeo4jInstance_stopped_connected.png"));
      }
    }
    else {
      if (((ManagedNeo4jInstance) object).isStarted()) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ManagedNeo4jInstance_running.png"));
      } else {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ManagedNeo4jInstance_stopped.png"));
      }
    }
  }


  @Override
  public String getText(Object object) {
    return ((ManagedNeo4jInstance) object).getName();
  }
}

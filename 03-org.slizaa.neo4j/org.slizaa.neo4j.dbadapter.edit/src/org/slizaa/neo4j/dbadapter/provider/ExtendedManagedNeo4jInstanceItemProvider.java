/**
 */
package org.slizaa.neo4j.dbadapter.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.StyledString;
import org.eclipse.emf.edit.provider.StyledString.Style;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;

/**
 */
public class ExtendedManagedNeo4jInstanceItemProvider extends ManagedNeo4jInstanceItemProvider {

  // https://bugs.eclipse.org/bugs/show_bug.cgi?id=411890

  public ExtendedManagedNeo4jInstanceItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  @Override
  public Object getImage(Object object) {
    if (((ManagedNeo4jInstance) object).isConnected()) {
      if (((ManagedNeo4jInstance) object).isRunning()) {
        return overlayImage(object,
            getResourceLocator().getImage("full/obj16/ManagedNeo4jInstance_running_connected.png"));
      } else {
        return overlayImage(object,
            getResourceLocator().getImage("full/obj16/ManagedNeo4jInstance_stopped_connected.png"));
      }
    } else {
      if (((ManagedNeo4jInstance) object).isRunning()) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ManagedNeo4jInstance_running.png"));
      } else {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ManagedNeo4jInstance_stopped.png"));
      }
    }
  }

  @Override
  public Object getStyledText(Object object) {

    Style italicStyle = StyledString.Style.newBuilder().setFont(URI.createURI("font:////italic")).setForegroundColor(URI.createURI("color://rgb/45/45/45")).toStyle();

    //
    StyledString result = new StyledString();

    //
    ManagedNeo4jInstance client = (ManagedNeo4jInstance) object;

    // BUG: https://www.eclipse.org/forums/index.php/t/1082215/
    if (client.isRunning()) {
      result.append(new StyledString("<running>", italicStyle));
    } else {
      result.append(new StyledString("<not running>", italicStyle));
    }
    
    // add the name
    result.append(client.getName(), StyledString.Style.NO_STYLE);

    //
    return result;
  }
}

/**
 */
package org.slizaa.neo4j.dbadapter.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.StyledString;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

/**
 */
public class ExtendedNeo4jRestClientItemProvider extends Neo4jRestClientItemProvider {

  public ExtendedNeo4jRestClientItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  @Override
  public Object getImage(Object object) {
    if (((Neo4jRestClient) object).isConnected()) {
      return overlayImage(object, getResourceLocator().getImage("full/obj16/Neo4jRestClient_connected.png"));
    }
    else {
      return overlayImage(object, getResourceLocator().getImage("full/obj16/Neo4jRestClient.png"));
    }
  }

  @Override
  public Object getStyledText(Object object) {
    
    //
    StyledString result = new StyledString();
    
    //
    Neo4jRestClient client = (Neo4jRestClient) object;
    if (client.getName() != null) {
      result.append(client.getName(), StyledString.Style.NO_STYLE);
    } else {
      result.append(client.getBaseURI(), StyledString.Style.NO_STYLE);
    }
    
    //
    return result;
  }
}

/**
 */
package org.slizaa.neo4j.dbadapter.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

/**
 */
public class ExtendedNeo4jRestClientItemProvider extends Neo4jRestClientItemProvider {

  public ExtendedNeo4jRestClientItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  @Override
  public Object getImage(Object object) {
    
    //
    if (((Neo4jRestClient) object).isActive()) {
      return overlayImage(object, getResourceLocator().getImage("full/obj16/Neo4jRestClient"));
    }
    
    //
    else {
      return overlayImage(object, getResourceLocator().getImage("full/obj16/Neo4jRestClient_grayed"));
    }
  }
  
  @Override
  public String getText(Object object) {

    //
    Neo4jRestClient client = (Neo4jRestClient) object;

    //
    if (client.getName() != null) {
      return client.getName();
    }

    //
    return client.getBaseURI();
  }
}

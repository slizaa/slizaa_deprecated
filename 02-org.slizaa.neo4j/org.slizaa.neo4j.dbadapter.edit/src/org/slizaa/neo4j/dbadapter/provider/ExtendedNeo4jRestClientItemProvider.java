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
  public String getText(Object object) {

    //
    Neo4jRestClient client = (Neo4jRestClient) object;

    if (client.isActive()) {
      return "SCHPUMM";
    }
    
    //
    if (client.getName() != null) {
      return client.getName();
    }

    //
    return client.getBaseURI();
  }

  // /**
  // * <p>
  // * </p>
  // *
  // * @return
  // */
  // private DbAdapterRegistry dbAdapterRegistry(Neo4jRestClient neo4jRestClient) {
  // if (neo4jRestClient != null && neo4jRestClient.getParent() != null
  // && neo4jRestClient.getParent().getParent() != null) {
  // return neo4jRestClient.getParent().getParent();
  // }
  // return null;
  // }
}

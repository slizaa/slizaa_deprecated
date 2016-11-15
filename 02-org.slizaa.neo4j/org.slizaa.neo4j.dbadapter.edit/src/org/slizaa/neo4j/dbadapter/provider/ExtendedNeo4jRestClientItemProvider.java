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
    if (((Neo4jRestClient) object).getName() != null) {
      return ((Neo4jRestClient) object).getName();
    }
    
    
    return ((Neo4jRestClient) object).getBaseURI();
  }
}

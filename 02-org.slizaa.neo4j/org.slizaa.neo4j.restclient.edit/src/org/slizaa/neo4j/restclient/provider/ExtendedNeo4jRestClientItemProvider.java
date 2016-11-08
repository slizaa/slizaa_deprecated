/**
 */
package org.slizaa.neo4j.restclient.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.dbadapter.provider.Neo4jRestClientItemProvider;

/**
 */
public class ExtendedNeo4jRestClientItemProvider extends Neo4jRestClientItemProvider {

  public ExtendedNeo4jRestClientItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  @Override
  public String getText(Object object) {
    return ((Neo4jRestClient) object).getBaseURI();
  }
}

package org.slizaa.neo4j.restclient.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.slizaa.neo4j.restclient.Neo4jRestClientContainer;

public class ExtendedNeo4jRestClientContainerItemProvider extends Neo4jRestClientContainerItemProvider {

  public ExtendedNeo4jRestClientContainerItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  @Override
  public String getText(Object object) {
    return  ((Neo4jRestClientContainer)object).getName();
  }
}

package org.slizaa.neo4j.dbadapter.impl;

import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

public class ExtendedDbAdapterRegistryImpl extends DbAdapterRegistryImpl {

  @Override
  public boolean hasHierarchicalGraph() {
    if (getManaged() == null || getUnmanaged() == null) {
      return false;
    }
    for (ManagedNeo4jInstance instance : getManaged().getChildren()) {
      if (instance.getHierarchicalGraph() != null) {
        return true;
      }
    }
    for (Neo4jRestClient client : getUnmanaged().getChildren()) {
      if (client.getHierarchicalGraph() != null) {
        return true;
      }
    }
    return false;
  }
}

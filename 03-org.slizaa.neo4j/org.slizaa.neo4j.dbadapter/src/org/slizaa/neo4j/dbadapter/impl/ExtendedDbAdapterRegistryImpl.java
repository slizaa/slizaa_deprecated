package org.slizaa.neo4j.dbadapter.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import org.slizaa.neo4j.dbadapter.ContainerType;
import org.slizaa.neo4j.dbadapter.DbAdapterContainer;

public class ExtendedDbAdapterRegistryImpl extends DbAdapterRegistryImpl {

  @Override
  public DbAdapterContainer getDbAdapterContainer(ContainerType type) {
    checkNotNull(type);
    for (DbAdapterContainer dbAdapterContainer : getChildren()) {
      if (checkNotNull(type).equals(dbAdapterContainer.getType())) {
        return dbAdapterContainer;
      }
    }

    return null;
  }
}

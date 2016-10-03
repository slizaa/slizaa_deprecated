package org.slizaa.neo4j.hierarchicalgraph.mapping.impl;

public class ExtendedDependencyMappingImpl extends DependencyMappingImpl {

  @Override
  public boolean isAggregatedCoreDependency() {
    return this.detailQueries != null && !this.detailQueries.isEmpty();
  }
}

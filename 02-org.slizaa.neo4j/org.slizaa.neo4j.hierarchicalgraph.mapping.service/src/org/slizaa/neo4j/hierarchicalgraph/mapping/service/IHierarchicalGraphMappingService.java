package org.slizaa.neo4j.hierarchicalgraph.mapping.service;

import org.eclipse.core.runtime.IProgressMonitor;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal.HierarchicalgraphMappingService;

public interface IHierarchicalGraphMappingService {

  /**
   * <p>
   * </p>
   * 
   * @param mappingDescriptor
   * @param repository
   *
   * @return
   * @throws HierarchicalGraphMappingException
   */
  HGRootNode convert(HierarchicalGraphMappingDescriptor mappingDescriptor, Neo4JRemoteRepository repository,
      IProgressMonitor progressMonitor) throws HierarchicalGraphMappingException;

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public static IHierarchicalGraphMappingService createHierarchicalgraphMappingService() {
    return new HierarchicalgraphMappingService();
  }
}

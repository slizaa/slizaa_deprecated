package org.slizaa.neo4j.hierarchicalgraph.mapping.service;

import org.eclipse.core.runtime.IProgressMonitor;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal.HierarchicalgraphMappingServiceImpl;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
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
  HGRootNode convert(MappingDescriptor mappingDescriptor, Neo4jRestClient repository,
      IProgressMonitor progressMonitor) throws HierarchicalGraphMappingException;

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public static IHierarchicalGraphMappingService createHierarchicalgraphMappingService() {
    return new HierarchicalgraphMappingServiceImpl();
  }
}

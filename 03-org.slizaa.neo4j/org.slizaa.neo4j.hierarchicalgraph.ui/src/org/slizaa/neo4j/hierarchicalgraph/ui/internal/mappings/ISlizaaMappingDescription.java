package org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappings;

import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface ISlizaaMappingDescription {

  /**
   * <p>
   * </p>
   *
   * @return
   */
  MappingDescriptor getMappingDescriptor();

  /**
   * <p>
   * </p>
   *
   * @param relativeImagePath
   * @return
   */
  String resolveImage(String relativeImagePath);
}

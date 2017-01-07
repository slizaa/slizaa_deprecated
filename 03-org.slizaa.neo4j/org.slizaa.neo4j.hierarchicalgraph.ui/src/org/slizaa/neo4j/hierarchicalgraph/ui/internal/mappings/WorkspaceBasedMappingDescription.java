package org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappings;

import static com.google.common.base.Preconditions.checkNotNull;

import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class WorkspaceBasedMappingDescription implements ISlizaaMappingDescription {

  /** - */
  private String            _basePath;

  /** - */
  private MappingDescriptor _mappingDescriptor;

  /**
   * <p>
   * Creates a new instance of type {@link WorkspaceBasedMappingDescription}.
   * </p>
   *
   * @param basePath
   * @param mappingDescriptor
   */
  public WorkspaceBasedMappingDescription(String basePath, MappingDescriptor mappingDescriptor) {
    _basePath = checkNotNull(basePath);
    _mappingDescriptor = checkNotNull(mappingDescriptor);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public MappingDescriptor getMappingDescriptor() {
    return _mappingDescriptor;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String resolveImage(String relativeImagePath) {
    return "platform:/resource/" + _basePath + "/" + relativeImagePath;
  }
}

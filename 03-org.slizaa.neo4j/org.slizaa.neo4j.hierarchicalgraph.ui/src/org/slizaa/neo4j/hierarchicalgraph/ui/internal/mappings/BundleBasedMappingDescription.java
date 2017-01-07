package org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappings;

import static com.google.common.base.Preconditions.checkNotNull;

import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;

public class BundleBasedMappingDescription implements ISlizaaMappingDescription {

  /** - */
  private String            _bundleSymbolicName;

  /** - */
  private String            _basePath;

  /** - */
  private MappingDescriptor _mappingDescriptor;
  
  /**
   * <p>
   * Creates a new instance of type {@link BundleBasedMappingDescription}.
   * </p>
   *
   * @param bundleSymbolicName
   * @param basePath
   * @param mappingDescriptor
   */
  public BundleBasedMappingDescription(String bundleSymbolicName, String basePath,
      MappingDescriptor mappingDescriptor) {
    
    _bundleSymbolicName = checkNotNull(bundleSymbolicName);
    _basePath = checkNotNull(basePath);
    _mappingDescriptor = checkNotNull(mappingDescriptor);
  }

  @Override
  public MappingDescriptor getMappingDescriptor() {
    return _mappingDescriptor;
  }

  @Override
  public String resolveImage(String relativeImagePath) {
    return "platform:/plugin/" + _bundleSymbolicName + "/" + _basePath + "/" + relativeImagePath;
  }
}

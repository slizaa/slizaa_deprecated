package org.slizaa.neo4j.hierarchicalgraph.ui.impl;

import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MetaInformation;

public class ExtendedBundleBasedMappingDescriptorImpl extends BundleBasedMappingDescriptorImpl {

  /**
   * {@inheritDoc}
   */
  @Override
  public String getQualifiedName() {
    return getMappingDescriptor().getQualifiedName();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getName() {

    //
    MetaInformation metaInformation = getMappingDescriptor().getMetaInformation();

    //
    return metaInformation != null && metaInformation.getName() != null ? metaInformation.getName()
        : getQualifiedName();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getDescription() {

    //
    MetaInformation metaInformation = getMappingDescriptor().getMetaInformation();

    //
    String result = metaInformation != null && metaInformation.getDescription() != null
        ? metaInformation.getDescription() : getQualifiedName();

    //
    return WhitespaceStripper.stripWhitespace(result);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String resolveImage(String relativeImagePath) {
    return "platform:/plugin/" + getBundle().getSymbolicName() + "/" + getBasePath() + "/" + relativeImagePath;
  }
}

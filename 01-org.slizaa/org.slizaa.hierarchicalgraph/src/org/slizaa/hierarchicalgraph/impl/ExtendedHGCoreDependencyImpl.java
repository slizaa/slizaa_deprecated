package org.slizaa.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Optional;

import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGCoreDependencyImpl extends HGCoreDependencyImpl {

  /**
   * {@inheritDoc}
   */
  @Override
  public HGRootNode getRootNode() {
    return getFrom().getRootNode();
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public <T> Optional<T> getDependencySource(Class<T> clazz) {

    //
    if (checkNotNull(clazz).isInstance(dependencySource)) {
      return Optional.of(clazz.cast(dependencySource));
    }
    
    return Optional.empty();
  }
}

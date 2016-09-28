package org.slizaa.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Future;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGAggregatedCoreDependencyImpl extends HGAggregatedCoreDependencyImpl {

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

  /**
   * {@inheritDoc}
   */
  @Override
  public void resolveAggregatedCoreDependencies() {

    //
    if (!resolved) {
      Utilities.resolveAggregatedCoreDependencies(null, this);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public List<Future<?>> onResolveAggregatedCoreDependency() {

    //
    if (!resolved) {

      //
      if (getRootNode().hasExtension(IAggregatedCoreDependencyResolver.class)) {
        return getRootNode().getExtension(IAggregatedCoreDependencyResolver.class).resolveAggregatedDependency(this);
      }
    }

    //
    return null;
  }

  /**
   * <p>
   * </p>
   *
   * @param newResolved
   */
  void setResolved(boolean newResolved) {
    boolean oldResolved = resolved;
    resolved = newResolved;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
          HierarchicalgraphPackage.HG_AGGREGATED_CORE_DEPENDENCY__RESOLVED, oldResolved, resolved));
  }
}

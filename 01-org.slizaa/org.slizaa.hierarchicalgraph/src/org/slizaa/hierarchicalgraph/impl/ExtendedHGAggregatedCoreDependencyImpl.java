package org.slizaa.hierarchicalgraph.impl;

import static java.util.Arrays.asList;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.removeDependency;

import java.util.concurrent.ExecutionException;
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
  public void resolveAggregatedCoreDependencies() {

    //
    if (this.resolved) {
      return;
    }

    //
    // get the future
    Future<?> future = onResolveAggregatedCoreDependency();
    if (future != null) {
      try {
        future.get();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      } catch (ExecutionException e) {
        throw new RuntimeException(e);
      }
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Future<?> onResolveAggregatedCoreDependency() {

    //
    if (this.resolved) {
      return null;
    }

    //
    Future<?> result = null;

    //
    IAggregatedCoreDependencyResolver resolver = getFrom().getRootNode()
        .getExtension(IAggregatedCoreDependencyResolver.class);

    if (resolver != null) {
      result = resolver.resolveAggregatedDependency(this);
      
      //
      if (result == null) {
        removeDependency(this, true);
      }
    }
    setResolved(true);

    //
    return result;
  }

  /**
   * <p>
   * </p>
   *
   * @param newResolved
   */
  private void setResolved(boolean newResolved) {
    boolean oldResolved = resolved;
    resolved = newResolved;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
          HierarchicalgraphPackage.HG_AGGREGATED_CORE_DEPENDENCY__RESOLVED, oldResolved, resolved));
  }
}

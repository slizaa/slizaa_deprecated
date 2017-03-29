package org.slizaa.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.removeDependency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.spi.IProxyDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class Utilities {

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public static Optional<ExtendedHGNodeTrait> getTrait(HGNode hgNode) {

    // handle ExtendedHGNodeImpl
    if (hgNode instanceof ExtendedHGNodeImpl) {
      return Optional.of(((ExtendedHGNodeImpl) hgNode).getTrait());
    }
    // handle ExtendedHGRootNodeImpl
    else if (hgNode instanceof ExtendedHGRootNodeImpl) {
      return Optional.of(((ExtendedHGRootNodeImpl) hgNode).getTrait());
    }
    // should not happen
    return Optional.empty();
  }

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   */
  public static void resolveProxyDependencies(IProgressMonitor progressMonitor,
      HGCoreDependency... dependencies) {
    resolveProxyDependencies(Arrays.asList(dependencies), progressMonitor);
  }

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   */
  public static void resolveProxyDependencies(List<? extends HGCoreDependency> dependencies,
      IProgressMonitor progressMonitor) {

    //
    if (dependencies == null || dependencies.isEmpty()) {
      return;
    }

    //
    if (!dependencies.get(0).getRootNode().hasExtension(IProxyDependencyResolver.class)) {
      return;
    }

    //
    List<DependencyResolution> dependencyResolutions = new ArrayList<>();

    // copy the dependencies (concurrent modifications!)
    for (HGCoreDependency coreDependency : new ArrayList<>(dependencies)) {

      if (coreDependency instanceof ExtendedHGProxyDependencyImpl
          && !((ExtendedHGProxyDependencyImpl) coreDependency).isResolved()) {

        //
        ExtendedHGProxyDependencyImpl extendedDependency = (ExtendedHGProxyDependencyImpl) coreDependency;
        List<Future<?>> futureList = extendedDependency.onResolveProxyDependency();
        dependencyResolutions.add(new DependencyResolution(futureList, extendedDependency));
      }
    }

    // wait for completion the result
    for (DependencyResolution dependencyResolution : dependencyResolutions) {

      //
      for (Future<?> future : dependencyResolution.getFutures()) {
        try {
          future.get();
        } catch (InterruptedException | ExecutionException e) {
          throw new RuntimeException(e);
        }
      }

      //
      if (!dependencyResolution.getDependency().getResolvedCoreDependencies().isEmpty()) {
        removeDependency(dependencyResolution.getDependency(), true);
      } else {
         System.out.println("*****************************************************************************************");
         System.out.println("** WARNING: Aggregated Dependency has been resolved to ZERO core dependencies! **");
         System.out
         .println(String.format("** %s : %s **", dependencyResolution.getDependency().getFrom().getIdentifier(),
         dependencyResolution.getDependency().getTo().getIdentifier()));
         System.out.println("*****************************************************************************************");
      }
      
      dependencyResolution.getDependency().setResolved(true);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  private static class DependencyResolution {

    private List<Future<?>>                        _futures;

    private ExtendedHGProxyDependencyImpl _dependency;

    public DependencyResolution(List<Future<?>> futures, ExtendedHGProxyDependencyImpl dependency) {
      _dependency = checkNotNull(dependency);
      _futures = futures != null ? futures : Collections.emptyList();
    }

    public List<Future<?>> getFutures() {
      return _futures;
    }

    public ExtendedHGProxyDependencyImpl getDependency() {
      return _dependency;
    }
  }
  
  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  public static class NotificationBuffer {

    protected List<Notification> notifications = new ArrayList<Notification>();

    protected List<Adapter>      savedAdapters = new ArrayList<Adapter>();

    protected EObject            eObject;

    public NotificationBuffer(EObject eObject) {
      this.eObject = eObject;
    }

    public void startBuffering() {
      EList<Adapter> eAdapters = eObject.eAdapters();
      for (Adapter a : eAdapters) {
        savedAdapters.add(a);
      }
      for (Adapter a : savedAdapters) {
        eAdapters.remove(a);
      }
      System.out.println("NotificationBuffer: " + savedAdapters.size());
    }

    public void stopBuffering() {
      eObject.eAdapters().addAll(savedAdapters);
    }
  }
}

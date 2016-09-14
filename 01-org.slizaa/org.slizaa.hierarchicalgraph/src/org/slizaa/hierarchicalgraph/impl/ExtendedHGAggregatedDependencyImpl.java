package org.slizaa.hierarchicalgraph.impl;

import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGAggregatedDependencyImpl extends HGAggregatedDependencyImpl {

  /**
   * <p>
   * Invalidates the contained core dependencies.
   * </p>
   */
  public void invalidate() {

    // clear the core dependencies
    if (coreDependencies != null) {
      coreDependencies.clear();
    }

    // set initialized to false
    initialized = false;
  }

  /**
   * <p>
   * </p>
   */
  public void initialize() {

    // return immediately if this dependency already has been initialized
    if (initialized) {
      return;
    }

    // lazy create the core dependencies list
    if (coreDependencies == null) {
      coreDependencies = new EObjectResolvingEList<HGCoreDependency>(HGCoreDependency.class, this,
          HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY__CORE_DEPENDENCIES);
    }

    //
    ExtendedHierarchicalGraphHelper.getTrait(to).ifPresent((t) -> {

      // add all incoming dependencies from successors of the specified node
      coreDependencies.addAll(t.getIncomingCoreDependencies(true).stream()
          .filter((dep) -> from.equals(dep.getFrom()) || from.isPredecessorOf(dep.getFrom()))
          .collect(Collectors.toList()));
    });

    //
    initialized = true;
  }

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
  public EList<HGCoreDependency> getCoreDependencies() {

    initialize();

    return coreDependencies;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getAggregatedWeight() {

    //
    initialize();

    //
    return this.coreDependencies.stream().mapToInt(i -> i.getWeight()).sum();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void resolveAggregatedCoreDependencies() {

    //
    initialize();

    //
    ExtendedHierarchicalGraphHelper.resolveAggregatedCoreDependencies(this.coreDependencies);
  }
}

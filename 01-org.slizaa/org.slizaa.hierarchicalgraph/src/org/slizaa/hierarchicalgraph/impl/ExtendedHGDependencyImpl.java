package org.slizaa.hierarchicalgraph.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slizaa.hierarchicalgraph.DependencyType;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGDependencyImpl extends HGDependencyImpl {

  private boolean resolved = false;

  /**
   * {@inheritDoc}
   */
  @Override
  public EList<HGDependency> getCoreDependencies() {
    EList<HGDependency> result = new BasicEList<HGDependency>();
    getLeafDependencies(result);
    return result;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getWeight() {
    //
    if (this.dependencies != null && !this.dependencies.isEmpty()) {
      return DependencyType.CORE_DEPENDENCY.equals(this.getType()) ? this.dependencies.size() + 1
          : this.dependencies.size();
    } else {
      return DependencyType.CORE_DEPENDENCY.equals(this.getType()) ? 1 : 0;
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void resolveAggregatedCoreDependencies() {

    //
    if (resolved) {
      return;
    }

    //
    resolved = true;

    //
    if (DependencyType.AGGREGATED_DEPENDENCY.equals(getType())) {
      for (HGDependency hgDependency : getCoreDependencies()) {
        hgDependency.resolveAggregatedCoreDependencies();
      }
    }

    //
    else if (DependencyType.AGGREGATED_CORE_DEPENDENCY.equals(getType())) {
      getDependencySource().onResolveAggregatedCoreDependency();
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param leafDependencies
   */
  private void getLeafDependencies(Collection<HGDependency> leafDependencies) {

    // AGGREGATED_CORE_DEPENDENCY
    if (DependencyType.CORE_DEPENDENCY.equals(this.getType())
        || (DependencyType.AGGREGATED_CORE_DEPENDENCY.equals(this.getType()) /*&& !resolved*/)) {
      leafDependencies.add(this);
    }

    //
    else {
      if (this.dependencies != null) {
        for (HGDependency dependency : this.dependencies) {
          ((ExtendedHGDependencyImpl) dependency).getLeafDependencies(leafDependencies);
        }
      }
    }
  }

}

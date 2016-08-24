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

  public EList<HGDependency> getCoreDependencies() {
    EList<HGDependency> result = new BasicEList<HGDependency>();
    getLeafDependencies(result);
    return result;
  }

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
  public void resolveAggregatedCoreDependency() {

    //
    if (resolved) {
      return;
    }

    //
    resolved = true;

    System.out.println("getType(): " + getType());

    //
    if (DependencyType.AGGREGATED_DEPENDENCY.equals(getType())) {
      for (HGDependency hgDependency : getCoreDependencies()) {
        hgDependency.resolveAggregatedCoreDependency();
      }
    }

    //
    else if (DependencyType.AGGREGATED_CORE_DEPENDENCY.equals(getType())) {

      System.out.println(getFrom().getIdentifier() + " -> " + getTo().getIdentifier());

      Set<Object> fromNodes = new HashSet<>();
      Set<Object> toNodes = new HashSet<>();
      for (HGDependency hgDependency : getCoreDependencies()) {
        for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(hgDependency.getFrom())); iter
            .hasNext();) {
          Object containedElement = iter.next();
          if (containedElement instanceof HGNode) {
            fromNodes.add(((HGNode) containedElement).getIdentifier());
          }
        }
        for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(hgDependency.getTo())); iter
            .hasNext();) {
          Object containedElement = iter.next();
          if (containedElement instanceof HGNode) {
            toNodes.add(((HGNode) containedElement).getIdentifier());
          }
        }
      }
      System.out.println("FROM " + fromNodes);
      System.out.println("TO " + toNodes);
    }
  }

  private void getLeafDependencies(Collection<HGDependency> leafDependencies) {

    // AGGREGATED_CORE_DEPENDENCY
    if (DependencyType.CORE_DEPENDENCY.equals(this.getType())
        || DependencyType.AGGREGATED_CORE_DEPENDENCY.equals(this.getType())) {
      leafDependencies.add(this);
    }

    //
    else {

      //
      if (this.dependencies != null) {

        //
        for (HGDependency dependency : this.dependencies) {
          ((ExtendedHGDependencyImpl) dependency).getLeafDependencies(leafDependencies);
        }
      }
    }
  }

}

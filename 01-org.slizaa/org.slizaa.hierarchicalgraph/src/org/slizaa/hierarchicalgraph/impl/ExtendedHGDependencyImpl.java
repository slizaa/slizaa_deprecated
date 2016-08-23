package org.slizaa.hierarchicalgraph.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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

  public void resolveAggregatedCoreDependency() {

    //
    if (resolved) {
      return;
    }

    //
    resolved = true;



    if (DependencyType.AGGREGATED_DEPENDENCY.equals(getType())) {
      
      Set<Object> fromNodes = new HashSet<>();
      Set<Object> toNodes = new HashSet<>();
      
      //
      for (HGDependency hgDependency : getCoreDependencies()) {

        //
        for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(hgDependency.getFrom())); iter
            .hasNext();) {
          Object containedElement = iter.next();
          if (containedElement instanceof HGNode) {
            fromNodes.add(((HGNode) containedElement).getIdentifier());
          }
        }

        //
        for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(hgDependency.getTo())); iter
            .hasNext();) {
          Object containedElement = iter.next();
          if (containedElement instanceof HGNode) {
            toNodes.add(((HGNode) containedElement).getIdentifier());
          }
        }
      } 
      System.out.println("FROM " + fromNodes.size());
      System.out.println("TO " + toNodes.size());
    }
  }

  private void getLeafDependencies(Collection<HGDependency> leafDependencies) {

    //
    if (DependencyType.CORE_DEPENDENCY.equals(this.getType())) {
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

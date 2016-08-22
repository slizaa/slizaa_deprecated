package org.slizaa.hierarchicalgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.slizaa.hierarchicalgraph.DependencyType;
import org.slizaa.hierarchicalgraph.HGDependency;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGDependencyImpl extends HGDependencyImpl {

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
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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

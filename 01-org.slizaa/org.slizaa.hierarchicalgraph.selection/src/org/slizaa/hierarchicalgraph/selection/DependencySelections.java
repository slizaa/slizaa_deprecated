/*******************************************************************************
 * Copyright (c) Gerd W�therich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd W�therich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.hierarchicalgraph.selection;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;

/**
 * <p>
 * Helper class that provides several static methods useful when working with analysis models.
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencySelections {

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   * @param adapter
   */
  public static void addAdapter(Collection<? extends AbstractHGDependency> dependencies, Adapter adapter) {
    checkNotNull(adapter);
    checkNotNull(dependencies).forEach((dep) -> dep.eAdapters().add(adapter));
  }
  
  /**
   * <p>
   * </p>
   *
   * @param dependencies
   * @param adapter
   */
  public static void removeAdapter(Collection<? extends AbstractHGDependency> dependencies, Adapter adapter) {
    checkNotNull(adapter);
    checkNotNull(dependencies).forEach((dep) -> dep.eAdapters().remove(adapter));
  }

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   * @return
   */
  public static Set<HGCoreDependency> getCoreDependencies(AbstractHGDependency... dependencies) {

    //
    if (dependencies == null) {
      return Collections.emptySet();
    }

    //
    final Set<HGCoreDependency> result = new HashSet<>();

    for (AbstractHGDependency dependency : dependencies) {
      if (dependency instanceof HGCoreDependency) {
        result.add((HGCoreDependency) dependency);
      }
      //
      else if (dependency instanceof HGAggregatedDependency) {
        result.addAll(((HGAggregatedDependency) dependency).getCoreDependencies());
      }
    }

    return result;
  }

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public static Set<HGCoreDependency> getCoreDependencies(Collection<? extends AbstractHGDependency> dependencies) {

    //
    if (dependencies == null) {
      return Collections.emptySet();
    }

    //
    return getCoreDependencies((AbstractHGDependency[]) dependencies.toArray(new AbstractHGDependency[0]));
  }
}

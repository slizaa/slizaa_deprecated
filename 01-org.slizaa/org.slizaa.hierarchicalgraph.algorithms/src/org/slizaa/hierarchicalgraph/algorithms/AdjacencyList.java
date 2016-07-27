/*******************************************************************************
 * Copyright (c) Gerd Wütherich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd Wütherich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.hierarchicalgraph.algorithms;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;

public class AdjacencyList {

  /**
   * <p>
   * </p>
   * 
   * @param artifacts
   * @return
   */
  public static int[][] computeAdjacencyList(Collection<HGNode> artifacts) {
    checkNotNull(artifacts);

    return computeAdjacencyList((HGNode[]) artifacts
        .toArray(new HGNode[artifacts.size()]));
  }

  /**
   * @param nodes
   */
  public static int[][] computeAdjacencyList(HGNode... nodes) {

    //
    int[][] matrix;

    // prepare
    int i = 0;
    Map<HGNode, Integer> map = new HashMap<HGNode, Integer>();
    for (HGNode iArtifact : nodes) {
      map.put(iArtifact, i);
      i++;
    }

    matrix = new int[nodes.length][];

    //
    for (HGNode node : nodes) {

      // get the referenced artifacts
      Collection<? extends HGDependency> dependencies = node.getOutgoingDependenciesTo(Arrays.asList(nodes));

      if (dependencies == null) {
        dependencies = Collections.emptyList();
      }

      //
      int index = map.get(node);
      matrix[index] = new int[dependencies.size()];

      // GENERICS HACK
      int count = 0;
      for (HGDependency dependency : dependencies) {
        matrix[index][count] = map.get(dependency.getTo());
        count++;
      }
    }

    //
    return matrix;
  }
}

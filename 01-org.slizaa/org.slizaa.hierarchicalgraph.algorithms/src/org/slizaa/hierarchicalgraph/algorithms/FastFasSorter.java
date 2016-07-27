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

import java.util.ArrayList;
import java.util.List;

import org.slizaa.hierarchicalgraph.HGNode;

public class FastFasSorter implements INodeSorter {

  /**
   * {@inheritDoc}
   */
  @Override
  public List<HGNode> sort(List<HGNode> artifacts) {

    // we have to compute the adjacency matrix first
    int[][] adjacencyMatrix = AdjacencyMatrix.computeAdjacencyMatrix(artifacts);

    // the ordered sequence (highest first!)
    FastFAS fastFAS = new FastFAS(adjacencyMatrix);
    int[] ordered = fastFAS.getOrderedSequence();

    // Bubbles
    for (int outerIndex = 1; outerIndex < ordered.length; outerIndex++) {
      for (int index = outerIndex; index >= 1; index--) {

        //
        if (adjacencyMatrix[ordered[index]][ordered[index - 1]] > adjacencyMatrix[ordered[index - 1]][ordered[index]]) {

          // swap...
          int temp = ordered[index];
          ordered[index] = ordered[index - 1];
          ordered[index - 1] = temp;

        } else {

          // stop bubbling...
          break;
        }
      }
    }

    // reverse it
    ordered = FastFAS.reverse(ordered);

    // create the result list
    List<HGNode> result = new ArrayList<HGNode>(artifacts.size());
    for (int index : ordered) {
      result.add(artifacts.get(index));
    }

    //
    artifacts.clear();
    artifacts.addAll(result);
    return artifacts;
  }
}

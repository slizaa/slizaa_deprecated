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

import java.util.Collection;

import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;

/**
 * <p>
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class AdjacencyMatrix {

  /**
   * <p>
   * </p>
   * 
   * @param artifacts
   * @return
   */
  public static int[][] computeAdjacencyMatrix(Collection<? extends HGNode> artifacts) {

    //
    checkNotNull(artifacts);

    //
    return computeAdjacencyMatrix((HGNode[]) artifacts.toArray(new HGNode[artifacts.size()]));
  }

  /**
   * <p>
   * </p>
   * 
   * @param monitor
   * @param artifacts
   * @return
   */
  public static int[][] computeAdjacencyMatrix(HGNode... artifacts) {

    //
    int[][] result = new int[artifacts.length][artifacts.length];

    //
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result.length; j++) {

        // get the dependency
        HGDependency dependency = artifacts[i].getOutgoingDependenciesTo(artifacts[j]);
        result[i][j] = dependency != null ? dependency.getWeight() : 0;
      }
    }

    // return the matrix
    return result;
  }

  public static void printMatrix(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        System.out.printf("%6d", matrix[row][col]);
      }
      System.out.println();
    }
  }
}

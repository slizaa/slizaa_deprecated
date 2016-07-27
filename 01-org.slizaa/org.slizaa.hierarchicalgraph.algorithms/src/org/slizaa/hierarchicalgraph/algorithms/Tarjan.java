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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slizaa.hierarchicalgraph.HGNode;

/**
 */
public class Tarjan<T extends HGNode> {

  /** - */
  private int                     _index                       = 0;

  /** - */
  private ArrayList<Integer>      _stack                       = new ArrayList<Integer>();

  /** - */
  private List<List<T>>           _stronglyConnectedComponents = new ArrayList<List<T>>();

  /** - */
  int[]                           _vlowlink;

  /** - */
  int[]                           _vindex;

  /** - */
  private HGNode[] _artifacts;

  /**
   * @param artifacts
   * @return
   */
  public List<List<T>> executeTarjan(Collection<? extends T> artifacts) {
    checkNotNull(artifacts);

    _artifacts = artifacts.toArray(new HGNode[0]);
    int[][] adjacencyList = AdjacencyList.computeAdjacencyList(_artifacts);
    return executeTarjan(adjacencyList);
  }

  //
  private List<List<T>> executeTarjan(int[][] graph) {
    checkNotNull(graph);

    // clear
    _stronglyConnectedComponents.clear();
    _index = 0;
    _stack.clear();
    _vlowlink = new int[graph.length];
    _vindex = new int[graph.length];
    for (int i = 0; i < _vlowlink.length; i++) {
      _vlowlink[i] = -1;
      _vindex[i] = -1;
    }

    //
    for (int i = 0; i < graph.length; i++) {
      if (_vindex[i] == -1) {
        tarjan(i, graph);
      }
    }

    //
    return _stronglyConnectedComponents;
  }

  @SuppressWarnings("unchecked")
  private void tarjan(int v, int[][] graph) {
    checkNotNull(v);
    checkNotNull(graph);

    _vindex[v] = _index;
    _vlowlink[v] = _index;

    _index++;
    _stack.add(0, v);
    for (int n : graph[v]) {
      if (_vindex[n] == -1) {
        tarjan(n, graph);
        _vlowlink[v] = Math.min(_vlowlink[v], _vlowlink[n]);
      } else if (_stack.contains(n)) {
        _vlowlink[v] = Math.min(_vlowlink[v], _vindex[n]);
      }
    }
    if (_vlowlink[v] == _vindex[v]) {
      int n;
      ArrayList<T> component = new ArrayList<T>();
      do {
        n = _stack.remove(0);
        component.add((T) _artifacts[n]);
      } while (n != v);
      _stronglyConnectedComponents.add(component);
    }
  }
}

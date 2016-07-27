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
package org.slizaa.hierarchicalgraph.algorithms;

import java.util.List;

import org.slizaa.hierarchicalgraph.HGNode;

public interface INodeSorter {

  /**
   * <p>
   * </p>
   * 
   * @param artifacts
   * @return
   */
  List<HGNode> sort(List<HGNode> node);
}

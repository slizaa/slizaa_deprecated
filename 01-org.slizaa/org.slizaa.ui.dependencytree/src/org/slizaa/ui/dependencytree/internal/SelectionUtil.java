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
package org.slizaa.ui.dependencytree.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.slizaa.hierarchicalgraph.HGNode;

public class SelectionUtil {

  // public static List<HGNode> computeArtifactsWithParents(ISelection selection) {
  // return computeArtifactsWithParents(toArtifactList(selection));
  // }

  public static List<HGNode> computeArtifactsWithParents(
      Collection<HGNode> visibleArtifacts) {

    // add all visible artifacts
    List<HGNode> result = new LinkedList<>(checkNotNull(visibleArtifacts));

    // add the parent nodes as well
    for (HGNode element : visibleArtifacts) {
      HGNode parent = element.getParent();
      while (parent != null) {
        result.add(parent);
        parent = parent.getParent();
      }
    }

    //
    return result;
  }

  /**
   * <p>
   * Helper method.
   * </p>
   * 
   * @param objects
   * @return
   */
  public static List<HGNode> toArtifactList(List<?> objects) {

    //
    Assert.isNotNull(objects);

    //
    List<HGNode> result = new LinkedList<HGNode>();

    //
    for (Object object : objects) {
      if (object instanceof HGNode) {
        result.add((HGNode) object);
      }
    }

    //
    return result;
  }

  public static List<HGNode> toArtifactList(ISelection selection) {

    if (!(selection instanceof IStructuredSelection)) {
      return Collections.emptyList();
    } else {
      return toArtifactList(((IStructuredSelection) selection).toList());
    }
  }
}

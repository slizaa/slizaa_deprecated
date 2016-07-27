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
package org.slizaa.ui.dependencytree.internal.expand;

import java.util.Collection;

import org.eclipse.jface.viewers.TreeViewer;
import org.slizaa.hierarchicalgraph.HGNode;

public class NullExpandStrategy implements IExpandStrategy {

  @Override
  public void init(TreeViewer fromTreeViewer) {
    //
  }

  @Override
  public void dispose(TreeViewer treeViewer) {
    //
  }

  @Override
  public void expandTreeViewer(Collection<HGNode> visibleElements) {
    //
  }
}

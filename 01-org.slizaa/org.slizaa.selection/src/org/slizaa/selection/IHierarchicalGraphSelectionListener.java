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
package org.slizaa.selection;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IHierarchicalGraphSelectionListener {
  
  /**
   * <p>
   * </p>
   *
   * @return
   */
  String getSelectionProviderId();

  /**
   * <p>
   * </p>
   *
   * @param selection
   */
  void currentSelectionChanged(IHierarchicalGraphSelection selection);
}

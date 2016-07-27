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
public interface IHierarchicalGraphSelection {

  /**
   * <p>
   * Returns the identifier of the selection provider. A selection provider is (normally) a UI part that allows the user
   * to select one or more {@link IHierarchicalGraphNode IHierarchicalGraphNodes} or {@link IDependency IDependencies}.
   * </p>
   *
   * @return the identifier of the selection provider.
   */
  String getSelectionProviderId();

  boolean isRootSelection();

  <T extends IHierarchicalGraphSelection> boolean isCastable(Class<T> clazz);

  <T extends IHierarchicalGraphSelection> T cast(Class<T> clazz);

  IHierarchicalGraphSelection getRootSelection();

  boolean isLeafSelection();

  IHierarchicalGraphSelection getLeafSelection();

  boolean hasDetailSelection();

  IHierarchicalGraphSelection getDetailSelection();

  boolean hasParentSelection();

  IHierarchicalGraphSelection getParentSelection();

  <T extends IHierarchicalGraphSelection> T findFirstOccurrence(Class<T> type);

  <T extends IHierarchicalGraphSelection> T findLastOccurrence(Class<T> type);
}

package org.slizaa.hierarchicalgraph.selection.selector;

import java.util.Collection;
import java.util.Set;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface IDependencySelector {

  /**
   * <p>
   * </p>
   *
   * @param listener
   */
  void addDependencySelectorListener(IDependencySelectorListener listener);

  /**
   * <p>
   * </p>
   *
   * @param listener
   */
  void removeDependencySelectorListener(IDependencySelectorListener listener);

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   */
  void setUnfilteredCoreDependencies(Collection<HGCoreDependency> dependencies);

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  void setSelectedSourceNodes(HGNode... selectedNodes);

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  void setSelectedSourceNodes(Collection<HGNode> selectedNodes);

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  void setSelectedTargetNodes(HGNode... selectedNodes);

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  void setSelectedTargetNodes(Collection<HGNode> selectedNodes);

  /**
   * <p>
   * </p>
   */
  void unselectNodes();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  Set<HGNode> getSelectedSourceNodes();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  Set<HGNode> getSelectedTargetNodes();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  Set<HGCoreDependency> getUnfilteredCoreDependencies();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  Set<HGNode> getUnfilteredSourceNodes();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  Set<HGNode> getUnfilteredTargetNodes();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  Set<HGCoreDependency> getFilteredCoreDependencies();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  Set<HGNode> getFilteredSourceNodes();

  /**
   * <p>
   * </p>
   *
   * @return
   */
  Set<HGNode> getFilteredTargetNodes();

  /**
   * <p>
   * </p>
   *
   * @param fromNode
   * @return
   */
  Set<HGCoreDependency> getDependenciesForSourceNode(HGNode fromNode);

  /**
   * <p>
   * </p>
   *
   * @param toNode
   * @return
   */
  Set<HGCoreDependency> getDependenciesForTargetNode(HGNode toNode);
}
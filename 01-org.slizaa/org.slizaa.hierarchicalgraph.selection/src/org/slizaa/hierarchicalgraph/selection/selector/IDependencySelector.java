package org.slizaa.hierarchicalgraph.selection.selector;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;

// TODO: API REVIEW!!
public interface IDependencySelector {

  /**
   * <p>
   * </p>
   *
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  public enum NodeType {
    SOURCE, TARGET;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  Collection<HGCoreDependency> getUnfilteredCoreDependencies();

  /**
   * <p>
   * </p>
   *
   * @param type
   * @return
   */
  Set<HGNode> getUnfilteredNodes(NodeType type);

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
   * @param type
   * @return
   */
  Set<HGNode> getFilteredNodes(NodeType type);

  /**
   * <p>
   * </p>
   *
   * @param type
   * @param filtered
   * @return
   */
  Set<HGNode> getNodesWithParents(NodeType type, boolean filtered);

  /**
   * <p>
   * </p>
   *
   * @param type
   * @param selectedNodes
   */
  void setSelectedNodes(NodeType type, HGNode... selectedNodes);

  /**
   * <p>
   * </p>
   *
   * @param type
   * @param selectedNodes
   */
  void setSelectedNodes(NodeType type, Collection<HGNode> selectedNodes);

  /**
   * <p>
   * </p>
   *
   * @param fromNode
   * @return
   */
  List<HGCoreDependency> getDependenciesForSourceNode(HGNode fromNode);

  /**
   * <p>
   * </p>
   *
   * @param toNode
   * @return
   */
  List<HGCoreDependency> getDependenciesForTargetNode(HGNode toNode);

  /**
   * <p>
   * </p>
   *
   * @param dependencies
   */
  void setDependencies(Collection<HGCoreDependency> dependencies);
}
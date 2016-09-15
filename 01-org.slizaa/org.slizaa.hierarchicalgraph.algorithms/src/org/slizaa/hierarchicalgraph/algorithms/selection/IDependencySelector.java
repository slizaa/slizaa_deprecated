package org.slizaa.hierarchicalgraph.algorithms.selection;

import java.util.Collection;
import java.util.Set;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;

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
  Set<HGNode> getUnfilteredNodesWithParents(NodeType type);

  
  /**
   * <p>
   * </p>
   *
   * @return the filteredSourceNodes
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
   * @return the filteredSourceNodes
   */
  Set<HGNode> getFilteredNodes(NodeType type);

  /**
   * <p>
   * </p>
   *
   * @return
   */
  Set<HGNode> getFilteredNodesWithParents(NodeType type);

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  void setSelectedNodes(NodeType type, HGNode... selectedNodes);

  /**
   * <p>
   * </p>
   *
   * @param selectedNodes
   */
  void setSelectedNodes(NodeType type, Collection<HGNode> selectedNodes);

}
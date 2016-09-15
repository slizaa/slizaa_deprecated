package org.slizaa.hierarchicalgraph.algorithms.selection;

import java.util.List;

import org.eclipse.emf.common.util.EList;
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
  EList<HGCoreDependency> getUnfilteredCoreDependencies();
  
  /**
   * <p>
   * </p>
   *
   * @return the filteredSourceNodes
   */
  EList<HGNode> getUnfilteredNodes(NodeType type);


  /**
   * <p>
   * </p>
   * 
   * @return
   */
  EList<HGCoreDependency> getFilteredCoreDependencies();

  /**
   * <p>
   * </p>
   *
   * @return the filteredSourceNodes
   */
  EList<HGNode> getFilteredNodes(NodeType type);

  /**
   * <p>
   * </p>
   *
   * @return
   */
  EList<HGNode> getFilteredNodesWithParents(NodeType type);

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
  void setSelectedNodes(NodeType type, List<HGNode> selectedNodes);

}
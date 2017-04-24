package org.slizaa.testfwk;

import java.util.List;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

public interface IHierarchicalGraphProvider {

  HGNode node(Long id);

  void dumpChildren(HGNode hgNode);

  HGRootNode rootNode();

  HGNode node(long id);
  
  List<HGNode> nodes(long... ids);
}

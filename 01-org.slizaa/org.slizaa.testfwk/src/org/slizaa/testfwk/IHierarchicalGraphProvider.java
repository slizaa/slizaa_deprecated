package org.slizaa.testfwk;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

public interface IHierarchicalGraphProvider {

  void setup() throws Exception;

  void dispose() throws Exception;

  HGNode node(Long id);

  void dumpChildren(HGNode hgNode);

  HGRootNode rootNode();

  HGNode node(long id);

}

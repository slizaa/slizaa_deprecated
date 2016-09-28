package org.slizaa.ui.tree;

import org.slizaa.hierarchicalgraph.HGNode;

public interface IEventInterceptor {

  void handleSelect(HGNode data);

  void handleTreeExpand(HGNode data);

  void handleTreeCollapse(HGNode data);

}

package org.slizaa.ui.tree;

import org.slizaa.hierarchicalgraph.HGNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 *
 */
public interface ITreeEventInterceptor {

  void handleSelect(HGNode data);

  void handleTreeExpand(HGNode data);

  void handleTreeCollapse(HGNode data);
}

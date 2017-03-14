package org.slizaa.testfwk.ui;

import java.util.List;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.spi.INodeLabelProvider;
import org.slizaa.testfwk.HGNodeUtils;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class TestNodeLabelProvider implements INodeLabelProvider {

  /**
   * {@inheritDoc}
   */
  @Override
  public String getText(Object object) {
    return (String) getStyledText(object);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Object getImage(Object object) {
    return null;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Object getStyledText(Object object) {

    HGNode hgNode = (HGNode) object;

    //
    List<String> labels = HGNodeUtils.getLabels((HGNode) object);

    //
    if (labels.contains("Type")) {
      return HGNodeUtils.getProperties(hgNode).get("fqn");
    }

    //
    return HGNodeUtils.getLabels((HGNode) object).toString();
  }
}

package org.slizaa.hierarchicalgraph;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.junit.Before;
import org.slizaa.hierarchicalgraph.util.XmiUtils;

public class AbstractHierarchicalTest {

  private HGRootNode _rootNode;

  @Before
  public void setup() throws IOException {

    //
    _rootNode = XmiUtils.load("org/slizaa/hierarchicalgraph/mapstruct_1-1-0-Beta2.hggraph");

    //
    for (HGNode node : _rootNode.getChildren()) {
      System.out.println(node.getIdentifier());
      // System.out.println(getProperties(node));
    }

    //
    System.out.println(_rootNode.getNode(new Long(1)));
    System.out.println(_rootNode.getNode(new Long(577)));
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public HGRootNode rootNode() {
    return _rootNode;
  }

  /**
   * <p>
   * </p>
   *
   * @param node
   * @return
   */
  public Map<String, String> getProperties(HGNode node) {

    //
    HGNodeSource nodeSource = (HGNodeSource) node.getNodeSource();

    //
    if (nodeSource instanceof DefaultHGNodeSource) {
      return ((DefaultHGNodeSource) nodeSource).getProperties();
    }

    //
    return Collections.emptyMap();
  }
}

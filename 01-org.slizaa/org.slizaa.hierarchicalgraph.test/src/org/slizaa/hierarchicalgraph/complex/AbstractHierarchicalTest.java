package org.slizaa.hierarchicalgraph.complex;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.junit.Before;
import org.slizaa.hierarchicalgraph.DefaultHGNodeSource;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractHierarchicalTest {

  /** - */
  private HGRootNode _rootNode;

  /**
   * <p>
   * </p>
   *
   * @throws IOException
   */
  @Before
  public void setup() throws IOException {
    _rootNode = XmiUtils.load("org/slizaa/hierarchicalgraph/mapstruct_1-1-0-Beta2.hggraph");

    // dumpChildren(node(new Long(6308)));
  }

  /**
   * <p>
   * </p>
   *
   * @param id
   * @return
   */
  public HGNode node(Long id) {
    return _rootNode.getNode(checkNotNull(id));
  }
  
  public HGNode node(long id) {
    return _rootNode.getNode(new Long(id));
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
    else {
      return Collections.emptyMap();
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param hgNode
   */
  protected void dumpChildren(HGNode hgNode) {
    for (HGNode node : checkNotNull(hgNode).getChildren()) {
      System.out.println(node.getIdentifier() + " : " + getProperties(node));
    }
  }
}

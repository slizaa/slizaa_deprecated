package org.slizaa.testfwk;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.junit.Before;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractXmiBasedTest {

  /** the root node */
  private HGRootNode _rootNode;

  /** - */
  private String     _xmiModelPath;

  /**
   * <p>
   * Creates a new instance of type {@link AbstractXmiBasedTest}.
   * </p>
   *
   * @param _miModelPath
   */
  public AbstractXmiBasedTest(String xmiModelPath) {
    this._xmiModelPath = checkNotNull(xmiModelPath);
  }

  /**
   * <p>
   * </p>
   *
   * @throws IOException
   */
  @Before
  public void setup() throws IOException {
    _rootNode = XmiUtils.load(_xmiModelPath);
  }

  /**
   * <p>
   * </p>
   *
   * @param id
   * @return
   */
  public HGNode node(Long id) {
    return _rootNode.lookupNode(checkNotNull(id));
  }

  /**
   * <p>
   * </p>
   *
   * @param id
   * @return
   */
  public HGNode node(long id) {
    return _rootNode.lookupNode(new Long(id));
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
   * @param hgNode
   */
  protected void dumpChildren(HGNode hgNode) {
    for (HGNode node : checkNotNull(hgNode).getChildren()) {
      System.out.println(node.getIdentifier() + " : " + HGNodeUtils.getProperties(node));
    }
  }
}

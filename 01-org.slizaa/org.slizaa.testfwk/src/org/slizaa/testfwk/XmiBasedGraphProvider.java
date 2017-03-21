package org.slizaa.testfwk;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class XmiBasedGraphProvider implements IHierarchicalGraphProvider {

  /** the root node */
  private HGRootNode _rootNode;

  /** - */
  private String     _xmiModelPath;

  /**
   * <p>
   * Creates a new instance of type {@link XmiBasedGraphProvider}.
   * </p>
   *
   * @param _miModelPath
   */
  public XmiBasedGraphProvider(String xmiModelPath) {
    this._xmiModelPath = checkNotNull(xmiModelPath);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setup() throws IOException {
    _rootNode = XmiUtils.load(_xmiModelPath);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void dispose() throws IOException {
    //
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public HGNode node(Long id) {
    return _rootNode.lookupNode(checkNotNull(id));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public HGNode node(long id) {
    return _rootNode.lookupNode(new Long(id));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public HGRootNode rootNode() {
    return _rootNode;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void dumpChildren(HGNode hgNode) {
    for (HGNode node : checkNotNull(hgNode).getChildren()) {
      System.out.println(node.getIdentifier() + " : " + HGNodeUtils.getProperties(node));
    }
  }
}

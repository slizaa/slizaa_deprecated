package org.slizaa.testfwk;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractXmiBasedTest implements IHierarchicalGraphProvider {

  /** - */
  private XmiBasedGraphProvider _xmiBasedGraphProvider;

  /**
   * <p>
   * Creates a new instance of type {@link AbstractXmiBasedTest}.
   * </p>
   *
   * @param _miModelPath
   */
  public AbstractXmiBasedTest(String xmiModelPath) {
    this._xmiBasedGraphProvider = new XmiBasedGraphProvider(checkNotNull(xmiModelPath));
  }

  @Before
  public void setup() throws IOException {
    _xmiBasedGraphProvider.setup();
  }

  @After
  public void dispose() throws IOException {
    _xmiBasedGraphProvider.dispose();
  }

  public HGNode node(Long id) {
    return _xmiBasedGraphProvider.node(id);
  }

  public HGNode node(long id) {
    return _xmiBasedGraphProvider.node(id);
  }
  
  public List<HGNode> nodes(long... ids) {
    return _xmiBasedGraphProvider.nodes(ids);
  }

  public HGRootNode rootNode() {
    return _xmiBasedGraphProvider.rootNode();
  }

  public void dumpChildren(HGNode hgNode) {
    _xmiBasedGraphProvider.dumpChildren(hgNode);
  }

}

package org.slizaa.testfwk.ui;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.spi.INodeLabelProvider;
import org.slizaa.testfwk.IHierarchicalGraphProvider;
import org.slizaa.testfwk.XmiBasedGraphProvider;

import com.google.common.base.Stopwatch;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractXmiBasedSlizaaPartTest extends AbstractSlizaaPartTest
    implements IImageProvider, IHierarchicalGraphProvider {

  /** - */
  private static XmiBasedGraphProvider _xmiBasedGraphedProvider;

  /** - */
  private String                       _modelName;

  /**
   * <p>
   * Creates a new instance of type {@link AbstractXmiBasedSlizaaPartTest}.
   * </p>
   */
  public AbstractXmiBasedSlizaaPartTest() {
    _modelName = "eureka_1-4-10.hggraph";
  }

  /**
   * <p>
   * Creates a new instance of type {@link AbstractXmiBasedSlizaaPartTest}.
   * </p>
   *
   * @param modelName
   */
  public AbstractXmiBasedSlizaaPartTest(String modelName) {
    _modelName = modelName;
  }

  /**
   * <p>
   * </p>
   *
   * @throws Exception
   */
  @Before
  public void setupAbstractXmiBasedSlizaaPartTest() throws Exception {

    //
    if (_xmiBasedGraphedProvider == null) {

      System.out.println("Loading XMI-based model...");
      Stopwatch stopwatch = Stopwatch.createStarted();
      _xmiBasedGraphedProvider = new XmiBasedGraphProvider(_modelName);
      _xmiBasedGraphedProvider.setup();
      System.out.printf("Loading XMI-based model completed (%s ms).\n", stopwatch.elapsed(TimeUnit.MILLISECONDS));
    }

    //
    rootNode().registerExtension(INodeLabelProvider.class, new DefaultNodeLabelProvider(this));
  }

  /**
   * {@inheritDoc}
   */
  public HGRootNode rootNode() {
    return _xmiBasedGraphedProvider.rootNode();
  }

  /**
   * {@inheritDoc}
   */
  public HGNode node(Long id) {
    return _xmiBasedGraphedProvider.node(id);
  }

  /**
   * {@inheritDoc}
   */
  public HGNode node(long id) {
    return _xmiBasedGraphedProvider.node(id);
  }

  /**
   * {@inheritDoc}
   */
  public List<HGNode> nodes(long... ids) {
    return _xmiBasedGraphedProvider.nodes(ids);
  }

  /**
   * {@inheritDoc}
   */
  public void dumpChildren(HGNode hgNode) {
    _xmiBasedGraphedProvider.dumpChildren(hgNode);
  }
}
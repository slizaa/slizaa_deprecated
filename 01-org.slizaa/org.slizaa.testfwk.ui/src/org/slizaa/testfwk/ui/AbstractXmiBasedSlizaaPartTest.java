package org.slizaa.testfwk.ui;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.spi.INodeLabelProvider;
import org.slizaa.testfwk.IHierarchicalGraphProvider;
import org.slizaa.testfwk.XmiBasedGraphProvider;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractXmiBasedSlizaaPartTest extends AbstractSlizaaPartTest
    implements IImageProvider, IHierarchicalGraphProvider {

  /** - */
  private XmiBasedGraphProvider _xmiBasedGraphedProvider;

  private String                _modelName;

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

  @Override
  public void setup() throws IOException {
    _xmiBasedGraphedProvider = new XmiBasedGraphProvider(_modelName);
    _xmiBasedGraphedProvider.setup();
    rootNode().registerExtension(INodeLabelProvider.class, new DefaultNodeLabelProvider(this));
    onPrepareRootNode(rootNode());
    
    super.setup();
  }

  /**
   * <p>
   * </p>
   */
  protected void onPrepareRootNode(HGRootNode rootNode) {
    //
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
  public void dumpChildren(HGNode hgNode) {
    _xmiBasedGraphedProvider.dumpChildren(hgNode);
  }

  /**
   * <p>
   * </p>
   */
  public final Set<AbstractHGDependency> toAbstractHGDependencySet(
      Collection<? extends AbstractHGDependency> collection) {
    return new HashSet<>(collection);
  }
}
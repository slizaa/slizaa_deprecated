package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.slizaa.hierarchicalgraph.selection.SlizaaNodesAssert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.mockito.MockitoAnnotations;
import org.slizaa.hierarchicalgraph.DefaultNodeSource;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.selection.xref.XRefStack;
import org.slizaa.testfwk.AbstractXmiBasedTest;

public abstract class AbstractXRefStack_Test extends AbstractXmiBasedTest {

  /** - */
  private XRefStack _xRefStack;

  /**
   * <p>
   * Creates a new instance of type {@link AbstractXRefStack_Test}.
   * </p>
   */
  public AbstractXRefStack_Test() {
    super("eureka_1-4-10-aggregated.hggraph");
  }

  @Before
  public void before() {

    //
    MockitoAnnotations.initMocks(this);

    //
    _xRefStack = new XRefStack();
  }

  public XRefStack xRefStack() {
    return _xRefStack;
  }

  public void assertCenterNodes(int size, long... nodeIds) {
    assertThat(xRefStack().getCenterNodesWithParents()).hasSize(size);
    assertThat(xRefStack().getCenterNodesWithParents()).containsNodesWithId(nodeIds);
  }

  public void assertLeftsidedNodes(int size, long... nodeIds) {
    assertThat(xRefStack().getLeftsidedNodesWithParents()).hasSize(size);
    assertThat(xRefStack().getLeftsidedNodesWithParents()).containsNodesWithId(nodeIds);
  }

  public void assertRightsidedNodes(int size, long... nodeIds) {
    assertThat(xRefStack().getRightsidedNodesWithParents()).hasSize(size);
    assertThat(xRefStack().getRightsidedNodesWithParents()).containsNodesWithId(nodeIds);
  }
  
  public void dumpNodes(Collection<HGNode> nodes) {
    for (HGNode node : nodes) {
      System.out
          .println(node.getNodeSource(DefaultNodeSource.class).get().getProperties().get("fqn") + ": " + node.getIdentifier());
    }
  }
}

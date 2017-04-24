package org.slizaa.ui.xref.internal;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGNode;

/**
 * <p>
 * </p>
 */
public class XRefPart_SingleCenterSelect_Test extends AbstractXRefPartTest {

  /**
   * <p>
   * </p>
   * 
   * @throws InterruptedException
   */
  @Test
  public void test() throws InterruptedException {

    //
    for (int i = 0; i < modules().size(); i++) {

      //
      HGNode centerModule = (HGNode) modules().get(i);

      //
      centerRootItem().getNode(property(centerModule, "fileName")).select();

      //
      for (HGAggregatedDependency dependency : centerModule.getIncomingDependenciesFrom(modules())) {
        fromRootItem().getNode(property(dependency.getFrom(), "fileName"));
      }

      //
      for (HGAggregatedDependency dependency : centerModule.getOutgoingDependenciesTo(modules())) {
        toRootItem().getNode(property(dependency.getTo(), "fileName"));
      }
    }
  }
}
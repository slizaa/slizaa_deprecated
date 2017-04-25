package org.slizaa.hierarchicalgraph.selection.xmi;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class XRefStack_BasicSetupWithSelectedNodes_Test extends AbstractXRefStack_Test {

  @Test
  public void test() {

    //
    xRefStack().pruneDependenciesForUncroppedCenterNodes(rootNode().getAccumulatedIncomingCoreDependencies(), rootNode().getAccumulatedOutgoingCoreDependencies());
    xRefStack().setSelectedCenterNodes(node(1063));
    
    //
    assertThat(xRefStack().getVisibleCenterNodes()).hasSize(1);
    assertThat(xRefStack().getBackreferencedCenterNodes()).hasSize(0);
    assertThat(xRefStack().getBackreferencedCenterNodesWithParents()).hasSize(0);
    assertThat(xRefStack().getVisibleCenterNodesWithParents()).hasSize(1004);
    assertThat(xRefStack().getLeftsidedNodesWithParents()).hasSize(72);
    assertThat(xRefStack().getRightsidedNodesWithParents()).hasSize(120);
  }
}

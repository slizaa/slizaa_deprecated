package org.slizaa.hierarchicalgraph.selection.xmi;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class XRefStack_CropSelection_Test extends AbstractXRefStack_Test {

  @Test
  public void test() {

    //
    xRefStack().pruneDependenciesForUncroppedCenterNodes(rootNode().getAccumulatedIncomingCoreDependencies(), rootNode().getAccumulatedOutgoingCoreDependencies());
    xRefStack().setSelectedCenterNodes(node(1063));
    xRefStack().cropSelection();
    
    //
    assertThat(xRefStack().getVisibleCenterNodes()).hasSize(0);
    assertThat(xRefStack().getBackreferencedCenterNodes()).hasSize(0);
    assertThat(xRefStack().getBackreferencedCenterNodesWithParents()).hasSize(0);
    assertThat(xRefStack().getVisibleCenterNodesWithParents()).hasSize(64);
    assertThat(xRefStack().getLeftsidedNodesWithParents()).hasSize(72);
    assertThat(xRefStack().getRightsidedNodesWithParents()).hasSize(120);
    
    //
    dumpNodes(xRefStack().getVisibleCenterNodesWithParents());
  }
}

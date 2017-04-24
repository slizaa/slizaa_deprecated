package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class XRefStack_BasicSetup_Test extends AbstractXRefStack_Test {

  @Test
  public void test() {

    //
    xRefStack().setInitialDependencies(rootNode().getAccumulatedIncomingCoreDependencies(),
        rootNode().getAccumulatedOutgoingCoreDependencies());

    //
    assertThat(xRefStack().getSelectedCenterNodes()).hasSize(0);
    assertThat(xRefStack().getBackreferencedCenterNodes()).hasSize(0);
    assertThat(xRefStack().getBackreferencedCenterNodesWithParents()).hasSize(0);
    assertThat(xRefStack().getCenterNodesWithParents()).hasSize(1004);
    assertThat(xRefStack().getLeftsidedNodesWithParents()).hasSize(889);
    assertThat(xRefStack().getRightsidedNodesWithParents()).hasSize(981);
  }
}

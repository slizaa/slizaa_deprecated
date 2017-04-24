package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class XRefStack_CropSelectionSelectLeft_Test extends AbstractXRefStack_Test {

  @Test
  public void test() {

    //
    xRefStack().setInitialDependencies(rootNode().getAccumulatedIncomingCoreDependencies(),
        rootNode().getAccumulatedOutgoingCoreDependencies());
    xRefStack().setSelectedCenterNodes(node(1063));
    xRefStack().cropSelection();

    xRefStack().setSelectedLeftsidedNodes(node(603));
    
    //
    assertThat(xRefStack().getSelectedCenterNodes()).hasSize(0);
    assertThat(xRefStack().getBackreferencedCenterNodes()).hasSize(2);
    assertThat(xRefStack().getBackreferencedCenterNodesWithParents()).hasSize(5);
    assertThat(xRefStack().getCenterNodesWithParents()).hasSize(64);
    assertThat(xRefStack().getLeftsidedNodesWithParents()).hasSize(72);
    assertThat(xRefStack().getRightsidedNodesWithParents()).hasSize(120);
  }
}

package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.junit.Test;

public class XRefStack_BasicSetup_Test extends AbstractXRefStack_Test {

  @Test
  public void test() {

    //
    xRefStack().pruneDependenciesForUncroppedCenterNodes(Collections.singletonList(rootNode()), rootNode().getAccumulatedIncomingCoreDependencies(),
        rootNode().getAccumulatedOutgoingCoreDependencies());

    //
    assertThat(xRefStack().getVisibleCenterNodesWithParents()).hasSize(0);
    assertThat(xRefStack().getBackreferencedCenterNodes()).hasSize(0);
    assertThat(xRefStack().getLeftsidedNodesWithParents()).hasSize(12660);
    assertThat(xRefStack().getRightsidedNodesWithParents()).hasSize(13116);
  }
}

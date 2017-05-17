package org.slizaa.hierarchicalgraph.selection.xmi;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.junit.Test;

public class XRefStack_BasicSetupWithSelectedNodes_Test extends AbstractXRefStack_Test {

  @Test
  public void test() {

    //
    xRefStack().pruneDependenciesForUncroppedCenterNodes(Collections.singletonList(rootNode()), rootNode().getAccumulatedIncomingCoreDependencies(),
        rootNode().getAccumulatedOutgoingCoreDependencies());

    xRefStack().setSelectedCenterNodes(node(54411));
    
    //
    assertThat(xRefStack().getCenterNodes()).hasSize(13365);
    assertThat(xRefStack().getBackreferencedCenterNodes()).hasSize(0);
    assertThat(xRefStack().getLeftsidedNodes()).hasSize(100);
    assertThat(xRefStack().getRightsidedNodes()).hasSize(119);
  }
}

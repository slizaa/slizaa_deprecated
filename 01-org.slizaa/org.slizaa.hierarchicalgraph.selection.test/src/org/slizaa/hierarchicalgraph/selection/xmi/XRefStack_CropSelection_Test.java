package org.slizaa.hierarchicalgraph.selection.xmi;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.junit.Test;

public class XRefStack_CropSelection_Test extends AbstractXRefStack_Test {

  @Test
  public void test() {

    //
    xRefStack().pruneDependenciesForUncroppedCenterNodes(Collections.singletonList(rootNode()), rootNode().getAccumulatedIncomingCoreDependencies(), rootNode().getAccumulatedOutgoingCoreDependencies());
    
    // select "/WEB-INF/lib/archaius-core-0.7.3.jar (54411)"
    xRefStack().setSelectedCenterNodes(node(54411));
    xRefStack().cropSelection();
    
    //
    assertThat(xRefStack().getVisibleCenterNodes()).hasSize(1);
    assertThat(xRefStack().getBackreferencedCenterNodes()).hasSize(0);
    assertThat(xRefStack().getBackreferencedCenterNodesWithParents()).hasSize(0);
    assertThat(xRefStack().getVisibleCenterNodesWithParents()).hasSize(107);
    assertThat(xRefStack().getLeftsidedNodesWithParents()).hasSize(121);
    assertThat(xRefStack().getRightsidedNodesWithParents()).hasSize(146);
    
    //
    dumpNodes(xRefStack().getVisibleCenterNodesWithParents());
  }
}
package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.DefaultNodeSource;

public class XRefStack_BasicSetup_Test extends AbstractXRefStack_Test {

  @Test
  public void test() {

    //
    xRefStack().pruneDependenciesForUncroppedCenterNodes(Collections.singletonList(rootNode()),
        rootNode().getAccumulatedIncomingCoreDependencies(), rootNode().getAccumulatedOutgoingCoreDependencies());

    //
    assertThat(xRefStack().getCenterNodes()).hasSize(13365);
    assertThat(xRefStack().getBackreferencedCenterNodes()).hasSize(0);
    assertThat(xRefStack().getLeftsidedNodes()).hasSize(11975);
    assertThat(xRefStack().getRightsidedNodes()).hasSize(12437);

    // assert only dependency sources on the left side
    assertThat(xRefStack().getLeftsidedNodes()).allMatch(
        node -> node.getNodeSource(DefaultNodeSource.class).get().getProperties().get("labels").contains("Type"));
    
    // assert only dependency targets on the right side
    assertThat(xRefStack().getLeftsidedNodes()).allMatch(
        node -> node.getNodeSource(DefaultNodeSource.class).get().getProperties().get("labels").contains("Type"));
  }
}

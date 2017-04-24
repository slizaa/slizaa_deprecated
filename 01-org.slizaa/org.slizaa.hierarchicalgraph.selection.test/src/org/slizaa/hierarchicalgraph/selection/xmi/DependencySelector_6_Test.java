package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DependencySelector_6_Test extends AbstractDependencySelector_Test {

  @Test
  public void testWithTargetSelection() {

    //
    assertThat(dependencySelector().getUnfilteredCoreDependencies()).hasSize(50);
    assertThat(dependencySelector().getUnfilteredSourceNodes()).hasSize(22);
    assertThat(dependencySelector().getUnfilteredSourceNodesWithParents()).hasSize(25);
    assertThat(dependencySelector().getUnfilteredTargetNodes()).hasSize(6);
    assertThat(dependencySelector().getUnfilteredTargetNodesWithParents()).hasSize(9);
    
    //
    dependencySelector().setSelectedTargetNodes(node(1383));

    
    //
    assertThat(dependencySelector().getFilteredCoreDependencies()).hasSize(7);
    assertThat(dependencySelector().getFilteredSourceNodes()).hasSize(7);
    assertThat(dependencySelector().getFilteredSourceNodesWithParents()).hasSize(10);
    assertThat(dependencySelector().getFilteredTargetNodes()).hasSize(6);
    assertThat(dependencySelector().getFilteredTargetNodesWithParents()).hasSize(9);
    
    //
    dependencySelector().setUnfilteredCoreDependencies(dependencySelector().getFilteredCoreDependencies());
    
    // the core dependencies and the source nodes have the same size as above
    assertThat(dependencySelector().getUnfilteredCoreDependencies()).hasSize(7);
    assertThat(dependencySelector().getUnfilteredSourceNodes()).hasSize(7);
    assertThat(dependencySelector().getUnfilteredSourceNodesWithParents()).hasSize(10);
    // here the 'crop' has removed the target node
    assertThat(dependencySelector().getUnfilteredTargetNodes()).hasSize(1);
    assertThat(dependencySelector().getUnfilteredTargetNodesWithParents()).hasSize(4);
  }
}

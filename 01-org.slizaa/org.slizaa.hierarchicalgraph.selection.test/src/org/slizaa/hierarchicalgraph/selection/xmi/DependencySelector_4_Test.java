package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DependencySelector_4_Test extends AbstractDependencySelector_Test {

  @Test
  public void testWithTargetSelection() {

    //
    assertThat(dependencySelector().getUnfilteredCoreDependencies()).hasSize(50);
    assertThat(dependencySelector().getUnfilteredSourceNodes()).hasSize(22);
    assertThat(dependencySelector().getUnfilteredTargetNodes()).hasSize(6);
    
    //
    dependencySelector().setSelectedTargetNodes(node(1383));

    //
    assertThat(dependencySelector().getFilteredCoreDependencies()).hasSize(7);
    assertThat(dependencySelector().getFilteredSourceNodes()).hasSize(7);
    assertThat(dependencySelector().getFilteredTargetNodes()).hasSize(6);
    
    //
    dependencySelector().unselectNodes();
    
    //
    assertThat(dependencySelector().getUnfilteredCoreDependencies()).hasSize(50);
    assertThat(dependencySelector().getUnfilteredSourceNodes()).hasSize(22);
    assertThat(dependencySelector().getUnfilteredTargetNodes()).hasSize(6);
  }
}

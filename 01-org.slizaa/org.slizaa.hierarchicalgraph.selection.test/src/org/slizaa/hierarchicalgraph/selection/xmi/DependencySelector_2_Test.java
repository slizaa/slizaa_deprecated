package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DependencySelector_2_Test extends AbstractDependencySelector_Test {

  @Test
  public void testWithSourceSelection() {

    //
    assertThat(dependencySelector().getUnfilteredCoreDependencies()).hasSize(50);
    assertThat(dependencySelector().getUnfilteredSourceNodes()).hasSize(22);
    assertThat(dependencySelector().getUnfilteredTargetNodes()).hasSize(6);

    //
    dependencySelector().setSelectedSourceNodes(node(2280));

    //
    assertThat(dependencySelector().getFilteredCoreDependencies()).hasSize(4);
    assertThat(dependencySelector().getFilteredSourceNodes()).hasSize(22);
    assertThat(dependencySelector().getFilteredTargetNodes()).hasSize(4);
  }
}

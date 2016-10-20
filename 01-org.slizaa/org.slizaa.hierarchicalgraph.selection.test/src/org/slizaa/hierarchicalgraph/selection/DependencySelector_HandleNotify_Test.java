package org.slizaa.hierarchicalgraph.selection;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.selection.selector.DefaultDependencySelector;
import org.slizaa.hierarchicalgraph.selection.selector.IDependencySelector.NodeType;
import org.slizaa.testfwk.AbstractXmiBasedTest;

public class DependencySelector_HandleNotify_Test extends AbstractXmiBasedTest {

  /** - */
  private DefaultDependencySelector _dependencySelector;

  /** - */
  private HGAggregatedDependency    _aggregatedDependency;

  /**
   * <p>
   * Creates a new instance of type {@link DependencySelector_HandleNotify_Test}.
   * </p>
   */
  public DependencySelector_HandleNotify_Test() {
    super("mapstruct_1-1-0-Beta2.hggraph");
  }

  @Before
  public void before() {

    // ap.internal.model -> ap.internal.util
    _aggregatedDependency = node(1063).getOutgoingDependenciesTo(node(5922));
    assertThat(_aggregatedDependency).isNotNull();
    assertThat(node(1063).getOutgoingDependenciesTo(node(5922)).getAggregatedWeight()).isEqualTo(50);

    //
    _dependencySelector = new DefaultDependencySelector();
    _dependencySelector.setDependencies(_aggregatedDependency.getCoreDependencies());
  }

  @Test
  public void testGetUnfilteredCoreDependencies() {
    assertThat(_dependencySelector.getUnfilteredCoreDependencies()).hasSize(50);
  }

  @Test
  public void testGetUnfilteredSourceNodes() {
    assertThat(_dependencySelector.getUnfilteredNodes(NodeType.SOURCE)).hasSize(22);
  }

  @Test
  public void testGetUnfilteredTargetNodes() {
    assertThat(_dependencySelector.getUnfilteredNodes(NodeType.TARGET)).hasSize(6);
  }

  @Test
  public void testSetSelectedSourceElements() {

    // EnumMappingMethod$Builder
    _dependencySelector.setSelectedNodes(NodeType.SOURCE, node(2280));

    assertThat(_dependencySelector.getFilteredCoreDependencies()).hasSize(4);
    assertThat(_dependencySelector.getFilteredNodes(NodeType.TARGET)).hasSize(4);
    assertThat(_dependencySelector.getFilteredNodes(NodeType.SOURCE)).hasSize(0);
  }

  @Test
  public void testSetSelectedTargetElements() {

    // Message
    _dependencySelector.setSelectedNodes(NodeType.TARGET, node(1383));

    assertThat(_dependencySelector.getFilteredCoreDependencies()).hasSize(7);
    assertThat(_dependencySelector.getFilteredNodes(NodeType.TARGET)).hasSize(0);
    assertThat(_dependencySelector.getFilteredNodes(NodeType.SOURCE)).hasSize(7);
  }
}

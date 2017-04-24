package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.mockito.MockitoAnnotations;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.selection.selector.DefaultDependencySelector;
import org.slizaa.hierarchicalgraph.selection.selector.IDependencySelector;
import org.slizaa.testfwk.AbstractXmiBasedTest;

public abstract class AbstractDependencySelector_Test extends AbstractXmiBasedTest {

  /** - */
  private IDependencySelector    _dependencySelector;

  /** - */
  private HGAggregatedDependency _aggregatedDependency;

  /**
   * <p>
   * Creates a new instance of type {@link AbstractDependencySelector_Test}.
   * </p>
   */
  public AbstractDependencySelector_Test() {
    super("mapstruct_1-1-0-Beta2.hggraph");
  }

  @Before
  public void before() {
    
    //
    MockitoAnnotations.initMocks(this);

    // ap.internal.model -> ap.internal.util
    _aggregatedDependency = node(1063).getOutgoingDependenciesTo(node(5922));
    assertThat(_aggregatedDependency).isNotNull();
    assertThat(node(1063).getOutgoingDependenciesTo(node(5922)).getAggregatedWeight()).isEqualTo(50);

    //
    _dependencySelector = new DefaultDependencySelector();
    _dependencySelector.setUnfilteredCoreDependencies(_aggregatedDependency.getCoreDependencies());
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public IDependencySelector dependencySelector() {
    return _dependencySelector;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public HGAggregatedDependency aggregatedDependency() {
    return _aggregatedDependency;
  }
}

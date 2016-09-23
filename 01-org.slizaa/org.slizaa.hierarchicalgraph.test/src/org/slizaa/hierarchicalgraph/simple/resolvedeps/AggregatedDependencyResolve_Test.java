package org.slizaa.hierarchicalgraph.simple.resolvedeps;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class AggregatedDependencyResolve_Test extends AbstractResolverTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void aggregatedDependencyResolve() {

    //
    HGAggregatedDependency aggregatedDependency = model().a1().getOutgoingDependenciesTo(model().b1());
    assertThat(aggregatedDependency).isNotNull();

    //
    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(4);
    assertThat(aggregatedDependency.getCoreDependencies()).isNotNull();
    assertThat(aggregatedDependency.getCoreDependencies()).hasSize(4).contains(model().a1_b1_core1(),
        model().a1_b1_core2(), model().a2_b2_core1(), model().a3_b3_core1());

    //
    aggregatedDependency.resolveAggregatedCoreDependencies();

    //
    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(4);
    assertThat(aggregatedDependency.getCoreDependencies()).isNotNull();
    assertThat(aggregatedDependency.getCoreDependencies()).hasSize(5).contains(model().a1_b1_core1(),
        model().a1_b1_core2(), model().a2_b2_core1(), getNewDependency_1(), getNewDependency_2());
  }
}
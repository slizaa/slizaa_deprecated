package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class GetIncomingDependenciesFrom_Test extends AbstractSimpleModelTest {

  @Test
  public void testGetIncomingDependenciesFrom() {

    //
    HGAggregatedDependency aggregatedDependency = model().b1()
        .getIncomingDependenciesFrom(model().a1());
    assertThat(aggregatedDependency).isNotNull();

    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(4);
    assertThat(aggregatedDependency.getCoreDependencies()).containsExactly(model().a1_b1_core1(),
        model().a1_b1_core2(), model().a2_b2_core1(), model().a3_b3_core1());

    //
    aggregatedDependency = model().b2().getIncomingDependenciesFrom(model().a2());
    assertThat(aggregatedDependency).isNotNull();

    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(2);
    assertThat(aggregatedDependency.getCoreDependencies()).containsExactly(model().a2_b2_core1(),
        model().a3_b3_core1());

    //
    aggregatedDependency = model().b3().getIncomingDependenciesFrom(model().a3());
    assertThat(aggregatedDependency).isNotNull();
    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(1);
    assertThat(aggregatedDependency.getCoreDependencies()).containsExactly(model().a3_b3_core1());
  }
}

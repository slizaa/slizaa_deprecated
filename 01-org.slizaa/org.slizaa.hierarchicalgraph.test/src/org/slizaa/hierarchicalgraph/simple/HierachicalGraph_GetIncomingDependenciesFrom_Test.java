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
public class HierachicalGraph_GetIncomingDependenciesFrom_Test extends AbstractSimpleModelTest {

  @Test
  public void testGetIncomingDependenciesFrom() {

    //
    HGAggregatedDependency aggregatedDependency = simpleModel().getB1()
        .getIncomingDependenciesFrom(simpleModel().getA1());
    assertThat(aggregatedDependency).isNotNull();

    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(4);
    assertThat(aggregatedDependency.getCoreDependencies()).containsExactly(simpleModel().getDep_a1_b1_core1(),
        simpleModel().getDep_a1_b1_core2(), simpleModel().getDep_a2_b2_core1(), simpleModel().getDep_a3_b3_core1());

    //
    aggregatedDependency = simpleModel().getB2().getIncomingDependenciesFrom(simpleModel().getA2());
    assertThat(aggregatedDependency).isNotNull();

    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(2);
    assertThat(aggregatedDependency.getCoreDependencies()).containsExactly(simpleModel().getDep_a2_b2_core1(),
        simpleModel().getDep_a3_b3_core1());

    //
    aggregatedDependency = simpleModel().getB3().getIncomingDependenciesFrom(simpleModel().getA3());
    assertThat(aggregatedDependency).isNotNull();
    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(1);
    assertThat(aggregatedDependency.getCoreDependencies()).containsExactly(simpleModel().getDep_a3_b3_core1());
  }
}

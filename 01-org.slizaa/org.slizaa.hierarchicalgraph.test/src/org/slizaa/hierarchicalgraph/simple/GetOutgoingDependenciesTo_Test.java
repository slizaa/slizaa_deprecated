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
public class GetOutgoingDependenciesTo_Test extends AbstractSimpleModelTest {

  @Test
  public void testGetOutgoingDependenciesTo() {

    //
    HGAggregatedDependency aggregatedDependency = simpleModel().getA1()
        .getOutgoingDependenciesTo(simpleModel().getB1());
    assertThat(aggregatedDependency).isNotNull();

    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(4);
    assertThat(aggregatedDependency.getCoreDependencies()).containsExactly(simpleModel().getDep_a1_b1_core1(),
        simpleModel().getDep_a1_b1_core2(), simpleModel().getDep_a2_b2_core1(), simpleModel().getDep_a3_b3_core1());

    //
    aggregatedDependency = simpleModel().getA2().getOutgoingDependenciesTo(simpleModel().getB2());
    assertThat(aggregatedDependency).isNotNull();

    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(2);
    assertThat(aggregatedDependency.getCoreDependencies()).containsExactly(simpleModel().getDep_a2_b2_core1(),
        simpleModel().getDep_a3_b3_core1());

    //
    aggregatedDependency = simpleModel().getA3().getOutgoingDependenciesTo(simpleModel().getB3());
    assertThat(aggregatedDependency).isNotNull();
    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(1);
    assertThat(aggregatedDependency.getCoreDependencies()).containsExactly(simpleModel().getDep_a3_b3_core1());
  }

  @Test
  public void testGetOutgoingDependenciesTo_Null() {

    //
    HGAggregatedDependency aggregatedDependency = simpleModel().getA1()
        .getOutgoingDependenciesTo(simpleModel().getA2());

    assertThat(aggregatedDependency).isNull();
  }
}

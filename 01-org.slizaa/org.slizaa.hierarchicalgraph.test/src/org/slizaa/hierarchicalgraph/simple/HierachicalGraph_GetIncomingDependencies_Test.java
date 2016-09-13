package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class HierachicalGraph_GetIncomingDependencies_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testGetIncomingDependencies() {

    //
    assertThat(simpleModel().getB1().getIncomingCoreDependencies(false))
        .containsExactly(simpleModel().getDep_a1_b1_core1(), simpleModel().getDep_a1_b1_core2());

    assertThat(simpleModel().getB1().getIncomingCoreDependencies(true)).containsExactly(
        simpleModel().getDep_a1_b1_core1(), simpleModel().getDep_a1_b1_core2(), simpleModel().getDep_a2_b2_core1(),
        simpleModel().getDep_a3_b3_core1());

    //
    assertThat(simpleModel().getB2().getIncomingCoreDependencies(false))
        .containsExactly(simpleModel().getDep_a2_b2_core1());

    assertThat(simpleModel().getB2().getIncomingCoreDependencies(true))
        .containsExactly(simpleModel().getDep_a2_b2_core1(), simpleModel().getDep_a3_b3_core1());

    //
    assertThat(simpleModel().getB3().getIncomingCoreDependencies(false))
        .containsExactly(simpleModel().getDep_a3_b3_core1());

    assertThat(simpleModel().getB3().getIncomingCoreDependencies(true))
        .containsExactly(simpleModel().getDep_a3_b3_core1());
  }
}

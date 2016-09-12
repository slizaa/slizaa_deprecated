package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class HierachicalGraph_GetOutgoingDependencies_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testGetOutgoingDependencies() {

    //
    assertThat(simpleModel().getA1().getOutgoingCoreDependencies(false))
        .containsExactly(simpleModel().getDep_a1_b1_core1(), simpleModel().getDep_a1_b1_core2());

    assertThat(simpleModel().getA1().getOutgoingCoreDependencies(true)).containsExactly(
        simpleModel().getDep_a1_b1_core1(), simpleModel().getDep_a1_b1_core2(), simpleModel().getDep_a2_b2_core1(),
        simpleModel().getDep_a3_b3_core1(), simpleModel().getDep_a3_b3_core2());

    //
    assertThat(simpleModel().getA2().getOutgoingCoreDependencies(false))
        .containsExactly(simpleModel().getDep_a2_b2_core1());
    
    assertThat(simpleModel().getA2().getOutgoingCoreDependencies(true)).containsExactly(
        simpleModel().getDep_a2_b2_core1(), simpleModel().getDep_a3_b3_core1(), simpleModel().getDep_a3_b3_core2());

    //
    assertThat(simpleModel().getA3().getOutgoingCoreDependencies(false)).containsExactly(simpleModel().getDep_a3_b3_core1(), simpleModel().getDep_a3_b3_core2());
    assertThat(simpleModel().getA3().getOutgoingCoreDependencies(true)).containsExactly(simpleModel().getDep_a3_b3_core1(), simpleModel().getDep_a3_b3_core2());
  }
}

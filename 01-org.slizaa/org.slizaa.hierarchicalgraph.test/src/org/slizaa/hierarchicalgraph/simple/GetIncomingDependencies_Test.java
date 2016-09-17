package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class GetIncomingDependencies_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testGetIncomingDependencies() {

    //
    assertThat(model().b1().getIncomingCoreDependencies()).hasSize(2).containsOnly(model().a1_b1_core1(),
        model().a1_b1_core2());

    assertThat(model().b1().getAccumulatedIncomingCoreDependencies()).hasSize(4).containsOnly(model().a1_b1_core1(),
        model().a1_b1_core2(), model().a2_b2_core1(), model().a3_b3_core1());

    //
    assertThat(model().b2().getIncomingCoreDependencies()).hasSize(1).containsOnly(model().a2_b2_core1());

    assertThat(model().b2().getAccumulatedIncomingCoreDependencies()).hasSize(2).containsOnly(model().a2_b2_core1(),
        model().a3_b3_core1());

    //
    assertThat(model().b3().getIncomingCoreDependencies()).hasSize(1).containsOnly(model().a3_b3_core1());

    assertThat(model().b3().getAccumulatedIncomingCoreDependencies()).hasSize(1).containsOnly(model().a3_b3_core1());
  }
}

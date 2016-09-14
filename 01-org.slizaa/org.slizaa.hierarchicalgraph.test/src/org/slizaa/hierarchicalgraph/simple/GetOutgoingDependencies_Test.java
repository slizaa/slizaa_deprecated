package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class GetOutgoingDependencies_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testGetOutgoingDependencies() {

    //
    assertThat(model().a1().getOutgoingCoreDependencies(false)).hasSize(2).containsOnly(model().a1_b1_core1(),
        model().a1_b1_core2());

    assertThat(model().a1().getOutgoingCoreDependencies(true)).hasSize(4).containsOnly(model().a1_b1_core1(),
        model().a1_b1_core2(), model().a2_b2_core1(), model().a3_b3_core1());

    //
    assertThat(model().a2().getOutgoingCoreDependencies(false)).hasSize(1).containsOnly(model().a2_b2_core1());

    assertThat(model().a2().getOutgoingCoreDependencies(true)).hasSize(2).containsOnly(model().a2_b2_core1(),
        model().a3_b3_core1());

    //
    assertThat(model().a3().getOutgoingCoreDependencies(false)).hasSize(1).containsOnly(model().a3_b3_core1());
    
    assertThat(model().a3().getOutgoingCoreDependencies(true)).hasSize(1).containsOnly(model().a3_b3_core1());
  }
}

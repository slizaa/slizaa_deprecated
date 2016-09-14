package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeImpl;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class CachedSubTreeCoreDependencies_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testCachedSubTreeCoreDependencies() {

    //
    ExtendedHGNodeImpl nodeA1 = (ExtendedHGNodeImpl) model().a1();
    ExtendedHGNodeImpl nodeB1 = (ExtendedHGNodeImpl) model().b1();

    //
    assertThat(nodeA1.getTrait().cachedOutgoingSelfAndSubTreeCoreDependencies()).hasSize(4)
        .containsOnly(model().a1_b1_core1(), model().a1_b1_core2(), model().a2_b2_core1(), model().a3_b3_core1());

    assertThat(nodeB1.getTrait().cachedIncomingSelfAndSubTreeCoreDependencies()).hasSize(4)
        .containsOnly(model().a1_b1_core1(), model().a1_b1_core2(), model().a2_b2_core1(), model().a3_b3_core1());
  }
}

package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class IsSuccessorOf_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testIsSuccessorOf() {

    //
    assertThat(model().b1().isSuccessorOf(model().b1())).isFalse();
    assertThat(model().b1().isSuccessorOf(model().b2())).isFalse();
    assertThat(model().b1().isSuccessorOf(model().b3())).isFalse();
    
    assertThat(model().b2().isSuccessorOf(model().b1())).isTrue();
    assertThat(model().b2().isSuccessorOf(model().b2())).isFalse();
    assertThat(model().b2().isSuccessorOf(model().b3())).isFalse();
    
    assertThat(model().b3().isSuccessorOf(model().b1())).isTrue();
    assertThat(model().b3().isSuccessorOf(model().b2())).isTrue();
    assertThat(model().b3().isSuccessorOf(model().b3())).isFalse();
  }
}

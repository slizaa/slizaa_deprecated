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
    assertThat(simpleModel().getB1().isSuccessorOf(simpleModel().getB1())).isFalse();
    assertThat(simpleModel().getB1().isSuccessorOf(simpleModel().getB2())).isFalse();
    assertThat(simpleModel().getB1().isSuccessorOf(simpleModel().getB3())).isFalse();
    
    assertThat(simpleModel().getB2().isSuccessorOf(simpleModel().getB1())).isTrue();
    assertThat(simpleModel().getB2().isSuccessorOf(simpleModel().getB2())).isFalse();
    assertThat(simpleModel().getB2().isSuccessorOf(simpleModel().getB3())).isFalse();
    
    assertThat(simpleModel().getB3().isSuccessorOf(simpleModel().getB1())).isTrue();
    assertThat(simpleModel().getB3().isSuccessorOf(simpleModel().getB2())).isTrue();
    assertThat(simpleModel().getB3().isSuccessorOf(simpleModel().getB3())).isFalse();
  }
}

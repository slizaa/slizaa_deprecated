package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class IsPredecessorOf_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testIsPredecessorOf() {

    //
    assertThat(simpleModel().getB1().isPredecessorOf(simpleModel().getB1())).isFalse();
    assertThat(simpleModel().getB1().isPredecessorOf(simpleModel().getB2())).isTrue();
    assertThat(simpleModel().getB1().isPredecessorOf(simpleModel().getB3())).isTrue();
    
    assertThat(simpleModel().getB2().isPredecessorOf(simpleModel().getB1())).isFalse();
    assertThat(simpleModel().getB2().isPredecessorOf(simpleModel().getB2())).isFalse();
    assertThat(simpleModel().getB2().isPredecessorOf(simpleModel().getB3())).isTrue();
    
    assertThat(simpleModel().getB3().isPredecessorOf(simpleModel().getB1())).isFalse();
    assertThat(simpleModel().getB3().isPredecessorOf(simpleModel().getB2())).isFalse();
    assertThat(simpleModel().getB3().isPredecessorOf(simpleModel().getB3())).isFalse();
  }
}

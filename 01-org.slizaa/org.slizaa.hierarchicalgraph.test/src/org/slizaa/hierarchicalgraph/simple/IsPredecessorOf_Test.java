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
    assertThat(model().b1().isPredecessorOf(model().b1())).isFalse();
    assertThat(model().b1().isPredecessorOf(model().b2())).isTrue();
    assertThat(model().b1().isPredecessorOf(model().b3())).isTrue();
    
    assertThat(model().b2().isPredecessorOf(model().b1())).isFalse();
    assertThat(model().b2().isPredecessorOf(model().b2())).isFalse();
    assertThat(model().b2().isPredecessorOf(model().b3())).isTrue();
    
    assertThat(model().b3().isPredecessorOf(model().b1())).isFalse();
    assertThat(model().b3().isPredecessorOf(model().b2())).isFalse();
    assertThat(model().b3().isPredecessorOf(model().b3())).isFalse();
  }
}

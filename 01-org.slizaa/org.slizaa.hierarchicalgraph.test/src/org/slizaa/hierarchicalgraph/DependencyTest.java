package org.slizaa.hierarchicalgraph;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class DependencyTest extends AbstractHierarchicalTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testOutgoingCoreDependencies() {

    //
    assertThat(greatGrandChild().getOutgoingCoreDependencies(false)).hasSize(1);
    assertThat(grandChild().getOutgoingCoreDependencies(false)).hasSize(1);
    assertThat(child().getOutgoingCoreDependencies(false)).hasSize(1);

    //
    assertThat(greatGrandChild().getOutgoingCoreDependencies(true)).hasSize(1);
    assertThat(grandChild().getOutgoingCoreDependencies(true)).hasSize(2);
    assertThat(child().getOutgoingCoreDependencies(true)).hasSize(3);
  }

  @Test
  public void testIncomingCoreDependencies() {

    //
    assertThat(greatGrandChild2().getIncomingCoreDependencies(false)).hasSize(1);
    assertThat(grandChild2().getIncomingCoreDependencies(false)).hasSize(1);
    assertThat(child2().getIncomingCoreDependencies(false)).hasSize(1);

    //
    assertThat(greatGrandChild2().getIncomingCoreDependencies(true)).hasSize(1);
    assertThat(grandChild2().getIncomingCoreDependencies(true)).hasSize(2);
    assertThat(child2().getIncomingCoreDependencies(true)).hasSize(3);
  }

  @Test
  public void testAggregatedDependencies() {
    
    //
    assertThat(greatGrandChild().getOutgoingDependenciesTo(greatGrandChild2()).getWeight()).isEqualTo(1);
    assertThat(grandChild().getOutgoingDependenciesTo(grandChild2()).getWeight()).isEqualTo(2);
    assertThat(child().getOutgoingDependenciesTo(child2()).getWeight()).isEqualTo(3);
    
    //
    assertThat(greatGrandChild2().getIncomingDependenciesFrom(greatGrandChild()).getWeight()).isEqualTo(1);
    assertThat(grandChild2().getIncomingDependenciesFrom(grandChild()).getWeight()).isEqualTo(2);
    assertThat(child2().getIncomingDependenciesFrom(child()).getWeight()).isEqualTo(3);
  }
}

package org.slizaa.hierarchicalgraph.simple.resolvedeps;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class CoreDependencyResolve_Test extends AbstractResolverTest {

  /**
   * <p>
   * Precondition: Node 'a1' has four (accumulated) outgoing core dependencies. The dependency from 'a3 -> b3' is a
   * aggregated core dependency.
   * </p>
   * <p>
   * Test: Resolve the aggregated core dependency from 'a3 -> b3'
   * </p>
   * <p>
   * Postcondition:
   * <ul>
   * <li>Node 'a1' has five (accumulated) outgoing core dependencies.</li>
   * <li>The aggregated core dependency from 'a3 -> b3' is a not longer part of the accumulated dependencies.</li>
   * <li>The aggregated core dependency contains the resolved dependencies</li>
   * </ul>
   * </p>
   */
  @Test
  public void coreDependencyResolve() {

    //
    List<HGCoreDependency> outgoingDependencies = model().a1().getAccumulatedOutgoingCoreDependencies();
    assertThat(outgoingDependencies).hasSize(4).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), model().a3_b3_core1());

    // Execute
    for (HGCoreDependency outgoingDependency : new ArrayList<>(outgoingDependencies)) {
      if (outgoingDependency instanceof HGAggregatedCoreDependency) {
        ((HGAggregatedCoreDependency) outgoingDependency).resolveAggregatedCoreDependencies();
      }
    }

    // Asserts
    outgoingDependencies = model().a1().getAccumulatedOutgoingCoreDependencies();

    //
    assertThat(outgoingDependencies).hasSize(5);
    assertThat(outgoingDependencies).containsOnly(model().a1_b1_core1(), model().a1_b1_core2(), model().a2_b2_core1(),
        getNewDependency_1(), getNewDependency_2());

    assertThat(model().a3_b3_core1().getResolvedCoreDependencies()).containsOnly(getNewDependency_1(),
        getNewDependency_2());

    assertThat(getNewDependency_1().getAggregatedCoreDependencyParent()).isSameAs(model().a3_b3_core1());
    assertThat(getNewDependency_2().getAggregatedCoreDependencyParent()).isSameAs(model().a3_b3_core1());
  }

}
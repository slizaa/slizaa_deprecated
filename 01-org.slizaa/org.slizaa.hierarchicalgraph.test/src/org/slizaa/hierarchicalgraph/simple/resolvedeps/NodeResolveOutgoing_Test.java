package org.slizaa.hierarchicalgraph.simple.resolvedeps;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGCoreDependency;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class NodeResolveOutgoing_Test extends AbstractResolverTest {

  @Test
  public void nodeResolveOutgoing() {

    //
    List<HGCoreDependency> outgoingDependencies = model().a1().getAccumulatedOutgoingCoreDependencies();
    assertThat(outgoingDependencies).hasSize(4).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), model().a3_b3_core1());

    //
    model().a1().resolveOutgoingAggregatedCoreDependencies();

    // we have to re-read the aggregated dependency
    outgoingDependencies = model().a1().getAccumulatedOutgoingCoreDependencies();
    assertThat(outgoingDependencies).hasSize(5).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), getNewDependency_1(), getNewDependency_2());
  }
}
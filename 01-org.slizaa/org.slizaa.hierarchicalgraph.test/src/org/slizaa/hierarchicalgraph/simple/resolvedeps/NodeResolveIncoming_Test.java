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
public class NodeResolveIncoming_Test extends AbstractResolverTest {

  @Test
  public void nodeResolveIncoming() {

    //
    List<HGCoreDependency> incomingDependencies = model().b1().getAccumulatedIncomingCoreDependencies();
    assertThat(incomingDependencies).hasSize(4).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), model().a3_b3_core1());

    //
    model().b1().resolveIncomingAggregatedCoreDependencies();

    // we have to re-read the aggregated dependency
    incomingDependencies = model().b1().getAccumulatedIncomingCoreDependencies();
    assertThat(incomingDependencies).hasSize(5).contains(model().a1_b1_core1(), model().a1_b1_core2(),
        model().a2_b2_core1(), getNewDependency_1(), getNewDependency_2());
  }
}
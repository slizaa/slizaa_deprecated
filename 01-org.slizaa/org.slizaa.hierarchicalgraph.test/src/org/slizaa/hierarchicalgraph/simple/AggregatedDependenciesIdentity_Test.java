package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class AggregatedDependenciesIdentity_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testAggregatedDependenciesIdentity_1() {

    //
    HGAggregatedDependency aggregatedDependency_1 = model().a1()
        .getOutgoingDependenciesTo(model().b1());

    //
    model().root().invalidateAllCaches();

    //
    HGAggregatedDependency aggregatedDependency_2 = model().a1()
        .getOutgoingDependenciesTo(model().b1());

    //
    assertThat(aggregatedDependency_1).isEqualTo(aggregatedDependency_2);
    assertThat(aggregatedDependency_1).isSameAs(aggregatedDependency_2);
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testAggregatedDependenciesIdentity_2() {

    //
    HGAggregatedDependency aggregatedDependency_1 = model().a1()
        .getOutgoingDependenciesTo(model().b1());

    //
    model().root().invalidateAllCaches();

    //
    HGAggregatedDependency aggregatedDependency_2 = aggregatedDependency_1.getFrom()
        .getOutgoingDependenciesTo(aggregatedDependency_1.getTo());

    //
    assertThat(aggregatedDependency_1).isEqualTo(aggregatedDependency_2);
    assertThat(aggregatedDependency_1).isSameAs(aggregatedDependency_2);
  }
}

package org.slizaa.hierarchicalgraph.simple.resolvedeps;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class AggregatedDependencyResolve_Test extends AbstractResolverTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void aggregatedDependencyResolve() {

    //
    resolve(() -> {
      HGAggregatedDependency aggregatedDependency = model().a1().getOutgoingDependenciesTo(model().b1());
      aggregatedDependency.resolveAggregatedCoreDependencies();
    });
  }
}
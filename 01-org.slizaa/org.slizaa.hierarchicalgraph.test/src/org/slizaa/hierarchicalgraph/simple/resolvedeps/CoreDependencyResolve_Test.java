package org.slizaa.hierarchicalgraph.simple.resolvedeps;

import java.util.ArrayList;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
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
    resolve(() -> {
      for (HGCoreDependency outgoingDependency : new ArrayList<>(model().a1().getAccumulatedOutgoingCoreDependencies())) {
        if (outgoingDependency instanceof HGAggregatedCoreDependency) {
          ((HGAggregatedCoreDependency) outgoingDependency).resolveAggregatedCoreDependencies();
        }
      }
    });
  }
}
package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class HierachicalGraph_ResolveAggregatedCoreDependencies_Test extends AbstractSimpleModelTest {

  /**
   * <p>
   * </p>
   */
  @Test
  public void testResolveAggregatedCoreDependencies() {

    // set the resolver
    IAggregatedCoreDependencyResolver resolver = mock(IAggregatedCoreDependencyResolver.class);
    simpleModel().root().setAggregatedCoreDependencyResolver(resolver);

    //
    HGAggregatedDependency aggregatedDependency = simpleModel().getA1()
        .getOutgoingDependenciesTo(simpleModel().getB1());
    assertThat(aggregatedDependency).isNotNull();

    //
    aggregatedDependency.resolveAggregatedCoreDependencies();

    //
    for (HGCoreDependency coreDependency : aggregatedDependency.getCoreDependencies()) {
      verify(resolver).createNewAggregatedDependencyResolver(coreDependency);
    }
  }
}

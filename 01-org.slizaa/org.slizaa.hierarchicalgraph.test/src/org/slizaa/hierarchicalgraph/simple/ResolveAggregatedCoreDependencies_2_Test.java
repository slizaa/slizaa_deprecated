package org.slizaa.hierarchicalgraph.simple;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewCoreDependency;

import java.util.List;
import java.util.concurrent.Future;

import org.junit.Before;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ResolveAggregatedCoreDependencies_2_Test extends AbstractSimpleModelTest
    implements IAggregatedCoreDependencyResolver {

  @Before
  @Override
  public void before() {
    super.before();

    //
    simpleModel().root().setAggregatedCoreDependencyResolver(this);
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testResolveAggregatedCoreDependencies() {

    //
    HGAggregatedDependency aggregatedDependency = simpleModel().getA1()
        .getOutgoingDependenciesTo(simpleModel().getB1());
    List<HGCoreDependency> coreDependencies = aggregatedDependency.getCoreDependencies();
    assertThat(coreDependencies).hasSize(4);

    //
    aggregatedDependency.resolveAggregatedCoreDependencies();

    // we have to re-read the aggregated dependency
    aggregatedDependency = simpleModel().getA1().getOutgoingDependenciesTo(simpleModel().getB1());
    assertThat(aggregatedDependency.getCoreDependencies()).hasSize(6);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<?> resolveAggregatedDependency(HGCoreDependency dependencyToResolve) {

    System.out.println(" -- " + dependencyToResolve);

    createNewCoreDependency(dependencyToResolve.getFrom(), dependencyToResolve.getTo(), "NEW_USAGE",
        () -> HierarchicalgraphFactory.eINSTANCE.createDefaultHGDependencySource());

    createNewCoreDependency(dependencyToResolve.getFrom(), dependencyToResolve.getTo(), "NEW_USAGE",
        () -> HierarchicalgraphFactory.eINSTANCE.createDefaultHGDependencySource());

    dependencyToResolve.getRootNode()
        .invalidateCaches(asList(dependencyToResolve.getFrom(), dependencyToResolve.getTo()));

    return null;
  }
}

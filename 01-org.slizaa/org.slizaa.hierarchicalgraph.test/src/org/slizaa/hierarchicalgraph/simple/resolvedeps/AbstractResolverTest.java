package org.slizaa.hierarchicalgraph.simple.resolvedeps;

import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewCoreDependency;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.removeDependency;

import java.util.concurrent.Future;

import org.junit.Before;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.simple.AbstractSimpleModelTest;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractResolverTest extends AbstractSimpleModelTest
    implements IAggregatedCoreDependencyResolver {

  /** - */
  private HGCoreDependency _newDependency_1;

  /** - */
  private HGCoreDependency _newDependency_2;

  @Before
  @Override
  public void before() {
    super.before();

    //
    model().root().registerExtension(IAggregatedCoreDependencyResolver.class, this);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public HGCoreDependency getNewDependency_1() {
    return _newDependency_1;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public HGCoreDependency getNewDependency_2() {
    return _newDependency_2;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Future<?> resolveAggregatedDependency(HGAggregatedCoreDependency dependencyToResolve) {

    _newDependency_1 = createNewCoreDependency(dependencyToResolve.getFrom(), dependencyToResolve.getTo(), "NEW_USAGE",
        () -> HierarchicalgraphFactory.eINSTANCE.createDefaultDependencySource(), false);

    _newDependency_2 = createNewCoreDependency(dependencyToResolve.getFrom(), dependencyToResolve.getTo(), "NEW_USAGE",
        () -> HierarchicalgraphFactory.eINSTANCE.createDefaultDependencySource(), false);

    dependencyToResolve.getResolvedCoreDependencies().add(_newDependency_1);
    dependencyToResolve.getResolvedCoreDependencies().add(_newDependency_2);

    // return null as we resolved the dependencies immediately
    return null;
  }
}
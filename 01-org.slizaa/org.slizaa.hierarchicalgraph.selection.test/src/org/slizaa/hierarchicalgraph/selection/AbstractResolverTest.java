package org.slizaa.hierarchicalgraph.selection;

import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewCoreDependency;

import java.util.List;
import java.util.concurrent.Future;

import org.junit.Before;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGProxyDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.spi.IProxyDependencyResolver;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractResolverTest extends AbstractSimpleModelTest
    implements IProxyDependencyResolver {

  /** - */
  private HGCoreDependency _newDependency_1;

  /** - */
  private HGCoreDependency _newDependency_2;

  @Before
  @Override
  public void before() {
    super.before();

    //
    model().root().registerExtension(IProxyDependencyResolver.class, this);
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
  public List<Future<?>> resolveProxyDependency(HGProxyDependency dependencyToResolve) {

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
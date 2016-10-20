package org.slizaa.hierarchicalgraph.selection.testfwk;

import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewAggregatedCoreDependency;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewCoreDependency;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewNode;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewRootNode;

import java.util.function.Supplier;

import org.junit.After;
import org.junit.Before;
import org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.IDependencySource;
import org.slizaa.hierarchicalgraph.INodeSource;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class AbstractSimpleModelTest {

  /** - */
  private SimpleModel _simpleModel;

  /**
   * <p>
   * </p>
   */
  @Before
  public void before() {
    _simpleModel = new SimpleModel();
  }

  /**
   * <p>
   * </p>
   */
  @After
  public void after() {
    _simpleModel = null;
  }

  /**
   * <p>
   * </p>
   *
   * @return the simpleModel
   */
  public SimpleModel model() {
    return _simpleModel;
  }

  public class SimpleModel {

    private HGNode                     _a1;

    private HGNode                     _b1;

    private HGNode                     _b2;

    private HGNode                     _a2;

    private HGNode                     _a3;

    private HGNode                     _b3;

    private HGCoreDependency           _dep_a1_b1_core1;

    private HGCoreDependency           _dep_a1_b1_core2;

    private HGCoreDependency           _dep_a2_b2_core1;

    private HGAggregatedCoreDependency _dep_a3_b3_core1;

    private HGRootNode                 _rootNode;

    public SimpleModel() {

      //
      Supplier<INodeSource> nodeSourceSupplier = () -> HierarchicalgraphFactory.eINSTANCE.createDefaultNodeSource();
      Supplier<IDependencySource> dependencySourceSupplier = () -> HierarchicalgraphFactory.eINSTANCE
          .createDefaultDependencySource();

      _rootNode = createNewRootNode(nodeSourceSupplier);

      _a1 = createNewNode(_rootNode, _rootNode, nodeSourceSupplier);
      _b1 = createNewNode(_rootNode, _rootNode, nodeSourceSupplier);

      _a2 = createNewNode(_rootNode, _a1, nodeSourceSupplier);
      _b2 = createNewNode(_rootNode, _b1, nodeSourceSupplier);

      _a3 = createNewNode(_rootNode, _a2, nodeSourceSupplier);
      _b3 = createNewNode(_rootNode, _b2, nodeSourceSupplier);

      _dep_a1_b1_core1 = createNewCoreDependency(_a1, _b1, "USES", dependencySourceSupplier, false);
      _dep_a1_b1_core2 = createNewCoreDependency(_a1, _b1, "DEPENDS_ON", dependencySourceSupplier, false);
      _dep_a2_b2_core1 = createNewCoreDependency(_a2, _b2, "USES", dependencySourceSupplier, false);

      _dep_a3_b3_core1 = createNewAggregatedCoreDependency(_a3, _b3, "DEPENDS_ON", dependencySourceSupplier, false);
    }

    /**
     * <p>
     * </p>
     *
     * @return
     */
    public HGRootNode root() {
      return _rootNode;
    }

    /**
     * <p>
     * </p>
     *
     * @return the a1
     */
    public HGNode a1() {
      return _a1;
    }

    /**
     * <p>
     * </p>
     *
     * @return the b1
     */
    public HGNode b1() {
      return _b1;
    }

    /**
     * <p>
     * </p>
     *
     * @return the b2
     */
    public HGNode b2() {
      return _b2;
    }

    /**
     * <p>
     * </p>
     *
     * @return the a2
     */
    public HGNode a2() {
      return _a2;
    }

    /**
     * <p>
     * </p>
     *
     * @return the a3
     */
    public HGNode a3() {
      return _a3;
    }

    /**
     * <p>
     * </p>
     *
     * @return the b3
     */
    public HGNode b3() {
      return _b3;
    }

    /**
     * <p>
     * </p>
     *
     * @return the dep_a1_b1_core1
     */
    public HGCoreDependency a1_b1_core1() {
      return _dep_a1_b1_core1;
    }

    /**
     * <p>
     * </p>
     *
     * @return the dep_a1_b1_core2
     */
    public HGCoreDependency a1_b1_core2() {
      return _dep_a1_b1_core2;
    }

    /**
     * <p>
     * </p>
     *
     * @return the dep_a2_b2_core1
     */
    public HGCoreDependency a2_b2_core1() {
      return _dep_a2_b2_core1;
    }

    /**
     * <p>
     * </p>
     *
     * @return the dep_a3_b3_core1
     */
    public HGAggregatedCoreDependency a3_b3_core1() {
      return _dep_a3_b3_core1;
    }
  }
}

package org.slizaa.hierarchicalgraph.simple;

import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewCoreDependency;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewNode;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewRootNode;

import java.util.function.Supplier;

import org.junit.After;
import org.junit.Before;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGDependencySource;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;

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
  public SimpleModel simpleModel() {
    return _simpleModel;
  }

  public class SimpleModel {

    private HGNode           _a1;

    private HGNode           _b1;

    private HGNode           _b2;

    private HGNode           _a2;

    private HGNode           _a3;

    private HGNode           _b3;

    private HGCoreDependency _dep_a1_b1_core1;

    private HGCoreDependency _dep_a1_b1_core2;

    private HGCoreDependency _dep_a2_b2_core1;

    private HGCoreDependency _dep_a3_b3_core1;

    private HGCoreDependency _dep_a3_b3_core2;

    public SimpleModel() {

      //
      Supplier<HGNodeSource> nodeSourceSupplier = () -> HierarchicalgraphFactory.eINSTANCE.createDefaultHGNodeSource();
      Supplier<HGDependencySource> dependencySourceSupplier = () -> HierarchicalgraphFactory.eINSTANCE
          .createDefaultHGDependencySource();

      //
      HGRootNode rootNode = createNewRootNode(nodeSourceSupplier);

      _a1 = createNewNode(rootNode, rootNode, nodeSourceSupplier);
      _b1 = createNewNode(rootNode, rootNode, nodeSourceSupplier);

      _a2 = createNewNode(rootNode, _a1, nodeSourceSupplier);
      _b2 = createNewNode(rootNode, _b1, nodeSourceSupplier);

      _a3 = createNewNode(rootNode, _a2, nodeSourceSupplier);
      _b3 = createNewNode(rootNode, _b2, nodeSourceSupplier);

      _dep_a1_b1_core1 = createNewCoreDependency(_a1, _b1, /* "USES", */ dependencySourceSupplier);
      _dep_a1_b1_core2 = createNewCoreDependency(_a1, _b1, /* "DEPENDS_ON", */ dependencySourceSupplier);

      _dep_a2_b2_core1 = createNewCoreDependency(_a2, _b2, /* "USES", */ dependencySourceSupplier);

      _dep_a3_b3_core1 = createNewCoreDependency(_a3, _b3, /* "USES", */ dependencySourceSupplier);
      _dep_a3_b3_core2 = createNewCoreDependency(_a3, _b3, /* "DEPENDS_ON", */ dependencySourceSupplier);
    }

    /**
     * <p>
     * </p>
     *
     * @return the a1
     */
    public HGNode getA1() {
      return _a1;
    }

    /**
     * <p>
     * </p>
     *
     * @return the b1
     */
    public HGNode getB1() {
      return _b1;
    }

    /**
     * <p>
     * </p>
     *
     * @return the b2
     */
    public HGNode getB2() {
      return _b2;
    }

    /**
     * <p>
     * </p>
     *
     * @return the a2
     */
    public HGNode getA2() {
      return _a2;
    }

    /**
     * <p>
     * </p>
     *
     * @return the a3
     */
    public HGNode getA3() {
      return _a3;
    }

    /**
     * <p>
     * </p>
     *
     * @return the b3
     */
    public HGNode getB3() {
      return _b3;
    }

    /**
     * <p>
     * </p>
     *
     * @return the dep_a1_b1_core1
     */
    public HGCoreDependency getDep_a1_b1_core1() {
      return _dep_a1_b1_core1;
    }

    /**
     * <p>
     * </p>
     *
     * @return the dep_a1_b1_core2
     */
    public HGCoreDependency getDep_a1_b1_core2() {
      return _dep_a1_b1_core2;
    }

    /**
     * <p>
     * </p>
     *
     * @return the dep_a2_b2_core1
     */
    public HGCoreDependency getDep_a2_b2_core1() {
      return _dep_a2_b2_core1;
    }

    /**
     * <p>
     * </p>
     *
     * @return the dep_a3_b3_core1
     */
    public HGCoreDependency getDep_a3_b3_core1() {
      return _dep_a3_b3_core1;
    }

    /**
     * <p>
     * </p>
     *
     * @return the dep_a3_b3_core2
     */
    public HGCoreDependency getDep_a3_b3_core2() {
      return _dep_a3_b3_core2;
    }

  }
}

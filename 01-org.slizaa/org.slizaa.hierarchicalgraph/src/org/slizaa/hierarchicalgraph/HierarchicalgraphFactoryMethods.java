package org.slizaa.hierarchicalgraph;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class HierarchicalgraphFactoryMethods {

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param nodeSource
   * @return
   */
  public static HGRootNode createNewRootNode(Supplier<HGNodeSource> nodeSourceSupplier) {

    //
    HGRootNode result = HierarchicalgraphFactory.eINSTANCE.createHGRootNode();
    result.setNodeSource(checkNotNull(checkNotNull(nodeSourceSupplier)).get());

    //
    return result;
  }

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param nodeSource
   * @return
   */
  public static HGNode createNewNode(HGNode parent, Supplier<HGNodeSource> nodeSourceSupplier) {

    //
    HGNode result = HierarchicalgraphFactory.eINSTANCE.createHGNode();
    result.setParent(checkNotNull(parent));
    result.setNodeSource(checkNotNull(checkNotNull(nodeSourceSupplier)).get());

    //
    return result;
  }

  /**
   * <p>
   * </p>
   *
   * @param source
   * @param target
   * @return
   */
  public static HGDependency createNewAggregatedCoreDependency(HGNode source, HGNode target,
      Supplier<HGDependencySource> dependencySourceSupplier) {
    return createNewDependency(source, target, DependencyType.AGGREGATED_CORE_DEPENDENCY, dependencySourceSupplier);
  }

  /**
   * <p>
   * </p>
   *
   * @param source
   * @param target
   * @return
   */
  public static HGDependency createNewCoreDependency(HGNode source, HGNode target,
      Supplier<HGDependencySource> dependencySourceSupplier) {
    return createNewDependency(source, target, DependencyType.CORE_DEPENDENCY, dependencySourceSupplier);
  }

  /**
   * <p>
   * </p>
   *
   * @param source
   * @param target
   * @param dependencyType
   * @return
   */
  public static HGDependency createNewDependency(HGNode source, HGNode target, DependencyType dependencyType,
      Supplier<HGDependencySource> dependencySourceSupplier) {

    //
    HGDependency dependency = HierarchicalgraphFactory.eINSTANCE.createHGDependency();
    dependency.setFrom(checkNotNull(source));
    dependency.setTo(checkNotNull(target));
    dependency.setType(checkNotNull(dependencyType));
    dependency.setDependencySource(checkNotNull(checkNotNull(dependencySourceSupplier)).get());

    //
    source.getOutgoingCoreDependenciesMap().putIfAbsent(target, new ArrayList<>());
    source.getOutgoingCoreDependenciesMap().get(target).add(dependency);

    target.getIncomingCoreDependenciesMap().putIfAbsent(source, new ArrayList<>());
    target.getIncomingCoreDependenciesMap().get(source).add(dependency);

    //
    return dependency;
  }
}

package org.slizaa.hierarchicalgraph;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.function.Supplier;

import org.slizaa.hierarchicalgraph.impl.ExtendedHGRootNodeImpl;

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
  public static HGNode createNewNode(HGRootNode rootNode, HGNode parent, Supplier<HGNodeSource> nodeSourceSupplier) {

    //
    HGNode result = HierarchicalgraphFactory.eINSTANCE.createHGNode();
    result.setParent(parent);
    result.setNodeSource(checkNotNull(checkNotNull(nodeSourceSupplier)).get());

    // put in cache
    ((ExtendedHGRootNodeImpl) checkNotNull(rootNode)).getIdToNodeMap().put(result.getIdentifier(), result);

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
  public static HGCoreDependency createNewCoreDependency(HGNode source, HGNode target, String type,
      Supplier<HGDependencySource> dependencySourceSupplier) {

    //
    HGCoreDependency dependency = HierarchicalgraphFactory.eINSTANCE.createHGCoreDependency();
    dependency.setFrom(checkNotNull(source));
    dependency.setTo(checkNotNull(target));
    dependency.setType(checkNotNull(type));
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

package org.slizaa.hierarchicalgraph;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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
      Supplier<HGDependencySource> dependencySourceSupplier, boolean reinitializeCaches) {

    //
    HGCoreDependency dependency = HierarchicalgraphFactory.eINSTANCE.createHGCoreDependency();
    dependency.setFrom(checkNotNull(source));
    dependency.setTo(checkNotNull(target));
    dependency.setType(checkNotNull(type));
    dependency.setDependencySource(checkNotNull(checkNotNull(dependencySourceSupplier)).get());

    //
    if (!source.getOutgoingCoreDependenciesMap().containsKey(target)) {
      source.getOutgoingCoreDependenciesMap().put(target, new BasicEList<>());
    }
    source.getOutgoingCoreDependenciesMap().get(target).add(dependency);

    if (!target.getIncomingCoreDependenciesMap().containsKey(source)) {
      target.getIncomingCoreDependenciesMap().put(source, new BasicEList<>());
    }
    target.getIncomingCoreDependenciesMap().get(source).add(dependency);

    //
    if (reinitializeCaches) {
      source.getRootNode().invalidateCaches(new BasicEList<HGNode>(Arrays.asList(source, target)));
      source.getRootNode().initializeCaches(new BasicEList<HGNode>(Arrays.asList(source, target)));
    }

    //
    return dependency;
  }
}

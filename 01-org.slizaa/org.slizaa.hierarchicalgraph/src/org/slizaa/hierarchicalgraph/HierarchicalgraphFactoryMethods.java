package org.slizaa.hierarchicalgraph;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Arrays;
import java.util.function.Supplier;

import org.eclipse.emf.common.util.BasicEList;
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
  public static HGRootNode createNewRootNode(Supplier<INodeSource> nodeSourceSupplier) {

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
  public static HGNode createNewNode(HGRootNode rootNode, HGNode parent, Supplier<INodeSource> nodeSourceSupplier) {

    //
    HGNode result = HierarchicalgraphFactory.eINSTANCE.createHGNode();
    result.setParent(parent);
    result.setNodeSource(checkNotNull(checkNotNull(nodeSourceSupplier)).get());

    // put in cache
    ((ExtendedHGRootNodeImpl) checkNotNull(rootNode)).getIdToNodeMap().put(result.getIdentifier(), result);

    //
    return result;
  }

  public static <T extends HGCoreDependency> void removeDependency(T dependency, boolean invalidateCaches) {

    //
    checkNotNull(dependency).getFrom().getOutgoingCoreDependencies().remove(dependency);
    dependency.getTo().getIncomingCoreDependencies().remove(dependency);

    //
    if (invalidateCaches) {
      dependency.getFrom().getRootNode()
          .invalidateCaches(new BasicEList<HGNode>(Arrays.asList(dependency.getFrom(), dependency.getTo())));
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param source
   * @param target
   * @return
   */
  public static HGAggregatedCoreDependency createNewAggregatedCoreDependency(HGNode source, HGNode target, String type,
      Supplier<IDependencySource> dependencySourceSupplier, boolean reinitializeCaches) {

    //
    return _initializeDependency(HierarchicalgraphFactory.eINSTANCE.createHGAggregatedCoreDependency(), source, target,
        type, dependencySourceSupplier, reinitializeCaches);
  }

  /**
   * <p>
   * </p>
   *
   * @param source
   * @param target
   * @param type
   * @param dependencySourceSupplier
   * @param reinitializeCaches
   * @return
   */
  public static HGCoreDependency createNewCoreDependency(HGNode source, HGNode target, String type,
      Supplier<IDependencySource> dependencySourceSupplier, boolean reinitializeCaches) {

    //
    return _initializeDependency(HierarchicalgraphFactory.eINSTANCE.createHGCoreDependency(), source, target, type,
        dependencySourceSupplier, reinitializeCaches);
  }

  /**
   * <p>
   * </p>
   *
   * @param dependency
   * @param source
   * @param target
   * @param type
   * @param dependencySourceSupplier
   * @param reinitializeCaches
   * @return
   */
  private static <T extends HGCoreDependency> T _initializeDependency(T dependency, HGNode source, HGNode target,
      String type, Supplier<IDependencySource> dependencySourceSupplier, boolean reinitializeCaches) {

    //
    dependency.setFrom(checkNotNull(source));
    dependency.setTo(checkNotNull(target));
    dependency.setType(checkNotNull(type));
    dependency.setDependencySource(checkNotNull(checkNotNull(dependencySourceSupplier)).get());

    //
    source.getOutgoingCoreDependencies().add(dependency);
    target.getIncomingCoreDependencies().add(dependency);

    //
    source.getRootNode().invalidateCaches(new BasicEList<HGNode>(Arrays.asList(source, target)));
    if (reinitializeCaches) {
      source.getRootNode().initializeCaches(new BasicEList<HGNode>(Arrays.asList(source, target)));
    }

    //
    return dependency;
  }
}

package org.slizaa.hierarchicalgraph;

import java.util.ArrayList;

import org.eclipse.core.runtime.Assert;

public class Factory {

  private static long IDENTIFIER = 0l;

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @param nodeSource
   * @return
   */
  public static HGNode createHgNode(HGNode parent, HGNodeSource nodeSource) {
    Assert.isNotNull(parent);
    Assert.isNotNull(nodeSource);

    HGNode result = HierarchicalgraphFactory.eINSTANCE.createHGNode();
    result.setParent(parent);
    result.setNodeSource(nodeSource);
    return result;
  }

  /**
   * <p>
   * </p>
   *
   * @param parent
   * @return
   */
  public static HGNode createNode(HGNode parent) {
    DefaultHGNodeSource defaultHGNodeSource = HierarchicalgraphFactory.eINSTANCE.createDefaultHGNodeSource();
    defaultHGNodeSource.setIdentifier("ID" + IDENTIFIER++);
    return createHgNode(parent, defaultHGNodeSource);
  }

  /**
   * <p>
   * </p>
   *
   * @param child
   * @param child2
   */
  public static HGDependency createDependency(HGNode source, HGNode target) {
    Assert.isNotNull(source);
    Assert.isNotNull(target);

    //
    HGDependency dependency = HierarchicalgraphFactory.eINSTANCE.createHGDependency();
    dependency.setFrom(source);
    dependency.setTo(target);
    dependency.setCoreDependency(true);

    //
    source.getOutgoingCoreDependenciesMap().putIfAbsent(target, new ArrayList<>());
    source.getOutgoingCoreDependenciesMap().get(target).add(dependency);

    target.getIncomingCoreDependenciesMap().putIfAbsent(source, new ArrayList<>());
    target.getIncomingCoreDependenciesMap().get(source).add(dependency);

    //
    return dependency;
  }
}

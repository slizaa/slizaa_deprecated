package org.slizaa.hierarchicalgraph.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeImpl;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeTrait;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGRootNodeImpl;

public class NodeCacheHelper {

  public static void assertCachesAreInvalid(Object c) {
    ExtendedHGNodeTrait trait = getTrait(c);
    if (trait != null) {
      trait._cachedAggregatedIncomingDependenciesMap.values().forEach((dep) -> assertThat(!!dep.isInitialized()));
      trait._cachedAggregatedOutgoingDependenciesMap.values().forEach((dep) -> assertThat(dep.isInitialized()));
      assertThat(trait._cachedIncomingSelfAndSubTreeCoreDependencies).isNullOrEmpty();
      assertThat(trait._cachedIncomingSelfAndSubTreeCoreDependenciesInitialized).isFalse();
      assertThat(trait._cachedOutgoingSelfAndSubTreeCoreDependencies).isNullOrEmpty();
      assertThat(trait._cachedOutgoingSelfAndSubTreeCoreDependenciesInitialized).isFalse();
      assertThat(trait._cachedParents).isNullOrEmpty();
      assertThat(trait._cachedParentsInitialized).isFalse();
    }
  }

  public static void assertCachesAreNotNull(Object c) {

    ExtendedHGNodeTrait trait = getTrait(c);
    if (trait != null) {
      trait._cachedAggregatedIncomingDependenciesMap.values().forEach((dep) -> assertThat(dep.isInitialized()));
      trait._cachedAggregatedOutgoingDependenciesMap.values().forEach((dep) -> assertThat(dep.isInitialized()));
      assertThat(trait._cachedIncomingSelfAndSubTreeCoreDependencies).isNotNull();
      assertThat(trait._cachedIncomingSelfAndSubTreeCoreDependenciesInitialized).isTrue();
      assertThat(trait._cachedOutgoingSelfAndSubTreeCoreDependencies).isNotNull();
      assertThat(trait._cachedOutgoingSelfAndSubTreeCoreDependenciesInitialized).isTrue();
      assertThat(trait._cachedParents).isNotNull();
      assertThat(trait._cachedParentsInitialized).isTrue();
    }
  }

  public static void populateCaches(Object c) {

    ExtendedHGNodeTrait trait = getTrait(c);

    if (trait != null) {
      trait.getPredecessors();
      trait.getOutgoingCoreDependencies(true);
      trait.getIncomingCoreDependencies(true);
      trait.getIncomingDependenciesFrom(trait.getRootNode());
      trait.getOutgoingDependenciesTo(trait.getRootNode());
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param o
   * @return
   */
  public static ExtendedHGNodeTrait getTrait(Object o) {

    //
    if (o instanceof ExtendedHGNodeImpl) {
      return ((ExtendedHGNodeImpl) o).getTrait();
    }

    //
    if (o instanceof ExtendedHGRootNodeImpl) {
      return ((ExtendedHGRootNodeImpl) o).getTrait();
    }

    //
    return null;
  }
}

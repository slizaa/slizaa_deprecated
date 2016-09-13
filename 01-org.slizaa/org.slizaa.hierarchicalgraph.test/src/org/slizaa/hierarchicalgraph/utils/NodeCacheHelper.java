package org.slizaa.hierarchicalgraph.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeImpl;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGNodeTrait;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGRootNodeImpl;

public class NodeCacheHelper {

  public static void assertCachesAreNull(Object c) {
    ExtendedHGNodeTrait trait = getTrait(c);
    if (trait != null) {
      trait.getUnmodifiableCachedAggregatedIncomingDependenciesMap().values()
          .forEach((dep) -> assertThat(!dep.isInitialized()));
      trait.getUnmodifiableCachedAggregatedOutgoingDependenciesMap().values()
          .forEach((dep) -> assertThat(!dep.isInitialized()));
      assertThat(trait.getUnmodifiableCachedIncomingSubTreeCoreDependencies()).isNull();
      assertThat(trait.getUnmodifiableCachedOutgoingSubTreeCoreDependencies()).isNull();
      assertThat(trait.getUnmodifiableCachedParents()).isNull();
    }
  }

  public static void assertCachesAreNotNull(Object c) {

    ExtendedHGNodeTrait trait = getTrait(c);
    if (trait != null) {
      trait.getUnmodifiableCachedAggregatedIncomingDependenciesMap().values()
          .forEach((dep) -> assertThat(dep.isInitialized()));
      trait.getUnmodifiableCachedAggregatedOutgoingDependenciesMap().values()
          .forEach((dep) -> assertThat(dep.isInitialized()));
      assertThat(trait.getUnmodifiableCachedIncomingSubTreeCoreDependencies()).isNotNull();
      assertThat(trait.getUnmodifiableCachedOutgoingSubTreeCoreDependencies()).isNotNull();
      assertThat(trait.getUnmodifiableCachedParents()).isNotNull();
    }
  }

  public static void populateCaches(Object c) {

    ExtendedHGNodeTrait trait = getTrait(c);

    if (trait != null) {
      trait.cachedParents();
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

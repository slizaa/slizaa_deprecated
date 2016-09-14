package org.slizaa.hierarchicalgraph.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;

public class NodeCacheHelper {

  public static Optional<EList<HGNode>> cachedParents(Object c) {
    return getTrait(c).map(trait -> trait._cachedParents);
  }

  public static Optional<EMap<HGNode, HGAggregatedDependency>> cachedAggregatedIncomingDependenciesMap(Object c) {
    return getTrait(c).map(trait -> trait._cachedAggregatedIncomingDependenciesMap);
  }

  public static Optional<EMap<HGNode, HGAggregatedDependency>> cachedAggregatedOutgoingDependenciesMap(Object c) {
    return getTrait(c).map(trait -> trait._cachedAggregatedOutgoingDependenciesMap);
  }

  public static Optional<EList<HGCoreDependency>> cachedIncomingSelfAndSubTreeCoreDependencies(Object c) {
    return getTrait(c).map(trait -> trait._cachedIncomingSelfAndSubTreeCoreDependencies);
  }

  public static Optional<EList<HGCoreDependency>> cachedOutgoingSelfAndSubTreeCoreDependencies(Object c) {
    return getTrait(c).map(trait -> trait._cachedOutgoingSelfAndSubTreeCoreDependencies);
  }

  public static void assertCachesAreInvalid(Object c) {
    getTrait(c).ifPresent((trait) -> {
      trait._cachedAggregatedIncomingDependenciesMap.values().forEach((dep) -> assertThat(!!dep.isInitialized()));
      trait._cachedAggregatedOutgoingDependenciesMap.values().forEach((dep) -> assertThat(dep.isInitialized()));
      assertThat(trait._cachedIncomingSelfAndSubTreeCoreDependencies).isNullOrEmpty();
      assertThat(trait._cachedIncomingSelfAndSubTreeCoreDependenciesInitialized).isFalse();
      assertThat(trait._cachedOutgoingSelfAndSubTreeCoreDependencies).isNullOrEmpty();
      assertThat(trait._cachedOutgoingSelfAndSubTreeCoreDependenciesInitialized).isFalse();
      assertThat(trait._cachedParents).isNullOrEmpty();
      assertThat(trait._cachedParentsInitialized).isFalse();
    });
  }

  public static void assertCachesAreNotNull(Object c) {
    getTrait(c).ifPresent((trait) -> {
      trait._cachedAggregatedIncomingDependenciesMap.values().forEach((dep) -> assertThat(dep.isInitialized()));
      trait._cachedAggregatedOutgoingDependenciesMap.values().forEach((dep) -> assertThat(dep.isInitialized()));
      assertThat(trait._cachedIncomingSelfAndSubTreeCoreDependencies).isNotNull();
      assertThat(trait._cachedIncomingSelfAndSubTreeCoreDependenciesInitialized).isTrue();
      assertThat(trait._cachedOutgoingSelfAndSubTreeCoreDependencies).isNotNull();
      assertThat(trait._cachedOutgoingSelfAndSubTreeCoreDependenciesInitialized).isTrue();
      assertThat(trait._cachedParents).isNotNull();
      assertThat(trait._cachedParentsInitialized).isTrue();
    });
  }

  public static void populateCaches(Object c) {
    getTrait(c).ifPresent((trait) -> {
      trait.getPredecessors();
      trait.getOutgoingCoreDependencies(true);
      trait.getIncomingCoreDependencies(true);
      trait.getIncomingDependenciesFrom(trait.getRootNode());
      trait.getOutgoingDependenciesTo(trait.getRootNode());
    });
  }

  /**
   * <p>
   * </p>
   *
   * @param o
   * @return
   */
  public static Optional<ExtendedHGNodeTrait> getTrait(Object o) {

    //
    if (o instanceof ExtendedHGNodeImpl) {
      return Optional.of(((ExtendedHGNodeImpl) o).getTrait());
    }

    //
    if (o instanceof ExtendedHGRootNodeImpl) {
      return Optional.of(((ExtendedHGRootNodeImpl) o).getTrait());
    }

    //
    return Optional.empty();
  }
}

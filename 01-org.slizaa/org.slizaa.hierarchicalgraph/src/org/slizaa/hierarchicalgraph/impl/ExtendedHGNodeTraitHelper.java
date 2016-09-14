package org.slizaa.hierarchicalgraph.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EMap;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedHGNodeTraitHelper {

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public static Optional<ExtendedHGNodeTrait> getTrait(HGNode hgNode) {

    // handle ExtendedHGNodeImpl
    if (hgNode instanceof ExtendedHGNodeImpl) {
      return Optional.of(((ExtendedHGNodeImpl) hgNode).getTrait());
    }
    // handle ExtendedHGRootNodeImpl
    else if (hgNode instanceof ExtendedHGRootNodeImpl) {
      return Optional.of(((ExtendedHGRootNodeImpl) hgNode).getTrait());
    }
    // should not happen
    return Optional.empty();
  }

  /**
   * <p>
   * </p>
   *
   * @param map
   * @return
   */
  public static List<HGCoreDependency> flattenCoreDependencies(EMap<?, List<HGCoreDependency>> map) {

    //
    if (map == null) {
      return ECollections.emptyEList();
    }

    //
    return flattenCoreDependencies(map.map());
  }

  /**
   * <p>
   * </p>
   *
   * @param map
   * @return
   */
  public static List<HGCoreDependency> flattenCoreDependencies(Map<?, List<HGCoreDependency>> map) {

    //
    if (map == null) {
      return ECollections.emptyEList();
    }

    //
    List<HGCoreDependency> result = new ArrayList<>();
    for (List<HGCoreDependency> dependencies : map.values()) {
      result.addAll(dependencies);
    }

    //
    return ECollections.unmodifiableEList(result);
  }
}

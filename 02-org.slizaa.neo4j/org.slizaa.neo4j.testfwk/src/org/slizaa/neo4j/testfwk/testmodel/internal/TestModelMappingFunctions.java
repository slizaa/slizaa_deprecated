package org.slizaa.neo4j.testfwk.testmodel.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewCoreDependency;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewNode;

import java.util.function.BiFunction;
import java.util.function.Function;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGDependencySource;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGRootNodeImpl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class TestModelMappingFunctions {

  /**
   * <p>
   * </p>
   *
   * @param hierachyResult
   * @param rootElement
   * @param nodeSourceCreator
   */
  public static void mapFirstLevelElements(JsonArray hierachyResult, HGRootNode rootElement,
      final Function<Long, HGNodeSource> nodeSourceCreator) {

    checkNotNull(hierachyResult);
    checkNotNull(rootElement);
    checkNotNull(nodeSourceCreator);

    for (int i = 0; i < hierachyResult.size(); i++) {
      createNodeIfAbsent(asLong(hierachyResult.get(i).getAsJsonArray(), 0), rootElement, rootElement,
          nodeSourceCreator);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param hierachyResult
   * @param creator
   */
  public static void mapHierarchy(JsonArray hierachyResult, HGRootNode rootElement,
      final Function<Long, HGNodeSource> nodeSourceCreator) {

    //
    for (int i = 0; i < hierachyResult.size(); i++) {
      JsonArray row = hierachyResult.get(i).getAsJsonArray();
      HGNode moduleNode = createNodeIfAbsent(asLong(row, 0), rootElement, null, nodeSourceCreator);
      createNodeIfAbsent(asLong(row, 1), rootElement, moduleNode, nodeSourceCreator);
    }
  }

  public static void mapDependencies(JsonArray asJsonArray, HGRootNode rootElement,
      boolean isAggregatedCoreDependency, BiFunction<Long, String, HGDependencySource> dependencySourceCreator) {

    //
    asJsonArray.forEach((element) -> {
      JsonArray row = element.getAsJsonArray();
      long idStart = row.get(0).getAsLong();
      long idTarget = row.get(1).getAsLong();
      long idRel = row.get(2).getAsLong();
      String type = row.get(3).getAsString();
      mapDependency(idStart, idTarget, idRel, type, rootElement, isAggregatedCoreDependency,
          dependencySourceCreator);
    });
  }

  /**
   * <p>
   * </p>
   *
   * @param from
   * @param to
   * @param type
   * @return
   */
  public static HGCoreDependency mapDependency(Long from, Long to, Long idRel, String type, HGRootNode rootElement,
      boolean isAggregatedCoreDependency, BiFunction<Long, String, HGDependencySource> dependencySourceCreator) {

    // get the from...
    HGNode fromElement = ((ExtendedHGRootNodeImpl) rootElement).getIdToNodeMap().get(from);
    if (fromElement == null) {
      return null;
    }

    // ...and to nodes
    HGNode toElement = ((ExtendedHGRootNodeImpl) rootElement).getIdToNodeMap().get(to);
    if (toElement == null) {
      return null;
    }

    //
    HGCoreDependency hgDependency = createNewCoreDependency(fromElement, toElement, () -> {
      return dependencySourceCreator.apply(idRel, type);
    });

    //
    return hgDependency;
  }

  /**
   * <p>
   * </p>
   *
   * @param identifier
   * @param parent
   * @param nodeSourceCreator
   * @return
   */
  private static HGNode createNodeIfAbsent(final Long identifier, final HGRootNode rootNode, final HGNode parent,
      final Function<Long, HGNodeSource> nodeSourceCreator) {

    checkNotNull(identifier);

    //
    HGNode newNode = ((ExtendedHGRootNodeImpl) rootNode).getIdToNodeMap().get(identifier);
    if (newNode == null) {
      newNode = createNewNode(rootNode, parent, () -> checkNotNull(checkNotNull(nodeSourceCreator)).apply(identifier));
    }

    // may be the node has been created before - so we have to set the parent yet...
    else if (newNode.getParent() == null) {
      newNode.setParent(parent);
    }

    //
    return newNode;
  }

  /**
   * <p>
   * </p>
   *
   * @param array
   * @param i
   * 
   * @return
   */
  private static long asLong(JsonArray array, int i) {
    JsonElement jsonElement = array.get(i);
    if (jsonElement == null || jsonElement.isJsonNull()) {
      return -1l;
    }
    return jsonElement.getAsLong();
  }
}

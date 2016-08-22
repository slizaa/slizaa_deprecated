package org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.function.BiFunction;
import java.util.function.Function;

import org.slizaa.hierarchicalgraph.Factory;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGDependencySource;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGRootNodeImpl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class GraphFactoryFunctions {

  /**
   * <p>
   * </p>
   *
   * @param hierachyResult
   * @param rootElement
   * @param nodeSourceCreator
   */
  public static void createFirstLevelElements(JsonArray hierachyResult, HGRootNode rootElement,
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
  public static void createHierarchy(JsonArray hierachyResult, HGRootNode rootElement,
      final Function<Long, HGNodeSource> nodeSourceCreator) {

    //
    for (int i = 0; i < hierachyResult.size(); i++) {
      JsonArray row = hierachyResult.get(i).getAsJsonArray();
      HGNode moduleNode = createNodeIfAbsent(asLong(row, 0), rootElement, null, nodeSourceCreator);
      createNodeIfAbsent(asLong(row, 1), rootElement, moduleNode, nodeSourceCreator);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param asJsonArray
   * @param rootElement
   * @param dependencySourceCreator
   */
  public static void createDependencies(JsonArray asJsonArray, HGRootNode rootElement, BiFunction<Long, String, HGDependencySource> dependencySourceCreator) {
    asJsonArray.forEach((element) -> {
      JsonArray row = element.getAsJsonArray();
      long idStart = row.get(0).getAsLong();
      long idTarget = row.get(1).getAsLong();
      long idRel = row.get(2).getAsLong();
      String type = row.get(3).getAsString();
      createDependency(idStart, idTarget, idRel, type, rootElement, dependencySourceCreator);
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
  public static HGDependency createDependency(Long from, Long to, Long idRel, String type, HGRootNode rootElement, BiFunction<Long, String, HGDependencySource> dependencySourceCreator) {

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
    HGDependency hgDependency = Factory.createDependency(fromElement, toElement);
    HGDependencySource dependencySource = dependencySourceCreator.apply(idRel, type);
    hgDependency.setDependencySource(dependencySource);
    
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
  private static HGNode createNodeIfAbsent(final Long identifier, final HGNode rootNode, final HGNode parent,
      final Function<Long, HGNodeSource> nodeSourceCreator) {

    checkNotNull(identifier);

    //
    HGNode newNode = ((ExtendedHGRootNodeImpl) rootNode).getIdToNodeMap().get(identifier);
    if (newNode == null) {

      // create new node
      newNode = HierarchicalgraphFactory.eINSTANCE.createHGNode();
      newNode.setNodeSource(nodeSourceCreator.apply(identifier));
      newNode.setParent(parent);

      // put in cache
      ((ExtendedHGRootNodeImpl) rootNode).getIdToNodeMap().put(identifier, newNode);
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

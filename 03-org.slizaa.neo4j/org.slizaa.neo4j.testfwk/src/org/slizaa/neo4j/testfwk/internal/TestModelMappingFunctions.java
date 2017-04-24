package org.slizaa.neo4j.testfwk.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryFunctions.createNewCoreDependency;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryFunctions.createNewNode;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.IDependencySource;
import org.slizaa.hierarchicalgraph.INodeSource;
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
   * @param elements
   * @param rootElement
   * @param nodeSourceCreator
   */
  public static void mapFirstLevelElements(List<Long> elements, HGRootNode rootElement,
      final Function<Long, INodeSource> nodeSourceCreator) {

    checkNotNull(elements);
    checkNotNull(rootElement);
    checkNotNull(nodeSourceCreator);

    elements.forEach(e -> createNodeIfAbsent(e, rootElement, rootElement, nodeSourceCreator));
  }

  /**
   * <p>
   * </p>
   *
   * @param hierachyResult
   * @param creator
   */
  public static void mapHierarchy(List<Long[]> elements, HGRootNode rootElement,
      final Function<Long, INodeSource> nodeSourceCreator) {

    //
    elements.forEach(e -> {
      HGNode moduleNode = createNodeIfAbsent(e[0], rootElement, null, nodeSourceCreator);
      createNodeIfAbsent(e[1], rootElement, moduleNode, nodeSourceCreator);
    });
  }

  public static void mapDependencies(List<DependencyDefinition> definitions, HGRootNode rootElement,
      boolean proxyDependency, BiFunction<Long, String, IDependencySource> dependencySourceCreator) {

    //
    definitions.forEach((def) -> {
      mapDependency(def.getIdStart(), def.getIdTarget(), def.getIdRel(), def.getType(), rootElement,
          proxyDependency, dependencySourceCreator);
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
      boolean isProxyDependency, BiFunction<Long, String, IDependencySource> dependencySourceCreator) {

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
    HGCoreDependency hgDependency = createNewCoreDependency(fromElement, toElement, type, () -> {
      return dependencySourceCreator.apply(idRel, type);
    }, false);

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
      final Function<Long, INodeSource> nodeSourceCreator) {

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

  public static class DependencyDefinition {

    /** - */
    public long   _idStart;

    /** - */
    public long   _idTarget;

    /** - */
    public long   _idRel;

    /** - */
    public String _type;

    public DependencyDefinition(long idStart, long idTarget, long idRel, String type) {
      _idStart = idStart;
      _idTarget = idTarget;
      _idRel = idRel;
      _type = type;
    }

    public long getIdStart() {
      return _idStart;
    }

    public long getIdTarget() {
      return _idTarget;
    }

    public long getIdRel() {
      return _idRel;
    }

    public String getType() {
      return _type;
    }
  }
}

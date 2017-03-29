package org.slizaa.neo4j.testfwk.internal.exporter.mapping;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods;
import org.slizaa.hierarchicalgraph.IDependencySource;
import org.slizaa.hierarchicalgraph.INodeSource;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGRootNodeImpl;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;

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
   * @param id
   * @param type
   * @return
   */
  public static Neo4JBackedDependencySource createDependencySource(Long id, String type) {
    return createDependencySource(checkNotNull(id), checkNotNull(type), null);
  }

  /**
   * <p>
   * </p>
   *
   * @param id
   * @param type
   * @param userObject
   * @return
   */
  public static Neo4JBackedDependencySource createDependencySource(Long id, String type, Object userObject) {

    checkNotNull(id);
    checkNotNull(type);

    // create the dependency source
    Neo4JBackedDependencySource dependencySource = Neo4jHierarchicalgraphFactory.eINSTANCE
        .createNeo4JBackedDependencySource();

    dependencySource.setIdentifier(id);
    dependencySource.setType(type);
    dependencySource.setUserObject(userObject);

    return dependencySource;
  }

  /**
   * <p>
   * </p>
   *
   * @param hierachyResult
   * @param rootElement
   * @param nodeSourceCreator
   */
  public static void createFirstLevelElements(Long[] firstLevelNodeIds, HGRootNode rootElement,
      final Function<Long, INodeSource> nodeSourceCreator, IProgressMonitor progressMonitor) {

    checkNotNull(firstLevelNodeIds);
    checkNotNull(rootElement);
    checkNotNull(nodeSourceCreator);

    // create sub monitor
    final SubMonitor subMonitor = progressMonitor != null
        ? SubMonitor.convert(progressMonitor, firstLevelNodeIds.length) : null;

    for (int i = 0; i < firstLevelNodeIds.length; i++) {

      // increase sub monitor
      if (subMonitor != null) {
        subMonitor.split(1);
      }

      createNodeIfAbsent(firstLevelNodeIds[i], rootElement, rootElement, nodeSourceCreator);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param hierachyResult
   * @param creator
   */
  public static void createHierarchy(Long[][] hierarchyNodeIds, HGRootNode rootElement,
      final Function<Long, INodeSource> nodeSourceCreator, IProgressMonitor progressMonitor) {

    checkNotNull(hierarchyNodeIds);

    // create sub monitor
    final SubMonitor subMonitor = progressMonitor != null ? SubMonitor.convert(progressMonitor, hierarchyNodeIds.length)
        : null;

    //
    for (int i = 0; i < hierarchyNodeIds.length; i++) {

      // increase sub monitor
      if (subMonitor != null) {
        subMonitor.split(1);
      }

      // JsonArray row = hierachyResult.get(i).getAsJsonArray();
      HGNode moduleNode = createNodeIfAbsent(hierarchyNodeIds[i][0], rootElement, null, nodeSourceCreator);
      createNodeIfAbsent(hierarchyNodeIds[i][1], rootElement, moduleNode, nodeSourceCreator);
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
  public static List<HGCoreDependency> createDependencies(List<Neo4jRelationship> neo4jRelationships,
      HGRootNode rootElement, BiFunction<Long, String, IDependencySource> dependencySourceCreator,
      boolean proxyDependency, boolean reinitializeCaches, IProgressMonitor progressMonitor) {

    // create sub monitor
    final SubMonitor subMonitor = progressMonitor != null
        ? SubMonitor.convert(progressMonitor, neo4jRelationships.size()) : null;

    //
    List<HGCoreDependency> result = new LinkedList<HGCoreDependency>();

    //
    neo4jRelationships.forEach((element) -> {

      // increase sub monitor
      if (subMonitor != null) {
        subMonitor.split(1);
      }

      result.add(createDependency(element.getIdStart(), element.getIdTarget(), element.getIdTarget(), element.getType(),
          rootElement, dependencySourceCreator, proxyDependency, reinitializeCaches));
    });

    //
    return result;
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
  public static HGCoreDependency createDependency(Long from, Long to, Long idRel, String type, HGRootNode rootElement,
      BiFunction<Long, String, IDependencySource> dependencySourceCreator, boolean proxyDependency,
      boolean reinitializeCaches) {

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
    if (proxyDependency) {
      return HierarchicalgraphFactoryMethods.createNewProxyDependency(fromElement, toElement, type,
          () -> dependencySourceCreator.apply(idRel, type), reinitializeCaches);
    }

    //
    else {
      return HierarchicalgraphFactoryMethods.createNewCoreDependency(fromElement, toElement, type,
          () -> dependencySourceCreator.apply(idRel, type), reinitializeCaches);
    }
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
      final Function<Long, INodeSource> nodeSourceCreator) {

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
   * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
   */
  public static class Neo4jRelationship {

    /** - */
    public long   _idStart;

    /** - */
    public long   _idTarget;

    /** - */
    public long   _idRel;

    /** - */
    public String _type;

    public Neo4jRelationship(long idStart, long idTarget, long idRel, String type) {
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

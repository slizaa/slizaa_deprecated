package org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;
import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.HierarchicalGraphMappingException;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.IHierarchicalGraphMappingService;

import com.google.common.base.Stopwatch;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@Component
public class HierarchicalgraphMappingService implements IHierarchicalGraphMappingService {

  @Override
  public HGRootNode convert(HierarchicalGraphMappingDescriptor mappingDescriptor, Neo4JRemoteRepository repository) {

    //
    Stopwatch stopwatch = Stopwatch.createStarted();

    //
    GraphCreator creator = new GraphCreator(repository);

    // create the future lists
    List<Future<JsonObject>> rootQueries = new LinkedList<Future<JsonObject>>();
    List<Future<JsonObject>> hierachyQueries = new LinkedList<Future<JsonObject>>();
    List<Future<JsonObject>> dependencyQueries = new LinkedList<Future<JsonObject>>();

    // query the hierarchy from neo4j
    mappingDescriptor.getRootMappings().forEach((cypherQuery) -> {
      Future<JsonObject> future = repository.executeCypherQuery(cypherQuery.getCypherQuery());
      rootQueries.add(future);
    });

    //
    mappingDescriptor.getHierarchyMappings().forEach((cypherQuery) -> {
      Future<JsonObject> future = repository.executeCypherQuery(cypherQuery);
      hierachyQueries.add(future);
    });

    //
    mappingDescriptor.getDependencyMappers().forEach((cypherQuery) -> {
      Future<JsonObject> future = repository.executeCypherQuery(cypherQuery);
      dependencyQueries.add(future);
    });

    // create the hierarchy
    rootQueries.forEach((f) -> {
      try {
        createRootElements(f.get().getAsJsonArray("data"), creator);
      } catch (Exception e) {
        throw new HierarchicalGraphMappingException(e);
      }
    });

    hierachyQueries.forEach((f) -> {
      try {
        createHierarchy(f.get().getAsJsonArray("data"), creator);
      } catch (Exception e) {
        throw new HierarchicalGraphMappingException(e);
      }
    });

    dependencyQueries.forEach((f) -> {
      try {
        createDependencies(f.get().getAsJsonArray("data"), creator);
      } catch (Exception e) {
        throw new HierarchicalGraphMappingException(e);
      }
    });

    //
    stopwatch.stop();
    System.out.println("Model created in " + stopwatch.elapsed(TimeUnit.MILLISECONDS));

    // set label provider
    creator.getRootNode().setItemLabelProvider(new ItemProviderImpl(mappingDescriptor));

    //
    return creator.getRootNode();
  }

  /**
   * <p>
   * </p>
   *
   * @param dependencyResult
   * @param creator
   */
  private void createDependencies(JsonArray dependencyResult, GraphCreator creator) {
    System.out.println("Create Dependencies: " + dependencyResult.size());
    dependencyResult.forEach((element) -> {
      JsonArray row = element.getAsJsonArray();
      long idStart = row.get(0).getAsLong();
      long idTarget = row.get(1).getAsLong();
      String type = row.get(2).getAsString();
      creator.createDependency(idStart, idTarget, type);
    });
  }

  /**
   * <p>
   * </p>
   *
   * @param hierachyResult
   * @param creator
   */
  private void createRootElements(JsonArray hierachyResult, GraphCreator creator) {

    //
    Function<Long, HGNodeSource> createNodeSourceFunction = (id) -> {
      HGNodeSource nodeSource = Neo4jHierarchicalgraphFactory.eINSTANCE.createNeo4JBackedNodeSource();
      nodeSource.setIdentifier(id);
      return nodeSource;
    };

    //
    for (int i = 0; i < hierachyResult.size(); i++) {

      JsonArray row = hierachyResult.get(i).getAsJsonArray();

      // create the module element (always set)
      creator.createNodeIfAbsent(asLong(row, 0), creator.getRootNode(), createNodeSourceFunction);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param hierachyResult
   * @param creator
   */
  private void createHierarchy(JsonArray hierachyResult, GraphCreator creator) {

    //
    Function<Long, HGNodeSource> createNodeSourceFunction = (id) -> {
      HGNodeSource nodeSource = Neo4jHierarchicalgraphFactory.eINSTANCE.createNeo4JBackedNodeSource();
      nodeSource.setIdentifier(id);
      return nodeSource;
    };

    //
    for (int i = 0; i < hierachyResult.size(); i++) {
      JsonArray row = hierachyResult.get(i).getAsJsonArray();
      HGNode moduleNode = creator.createNodeIfAbsent(asLong(row, 0), null, createNodeSourceFunction);
      creator.createNodeIfAbsent(asLong(row, 1), moduleNode, createNodeSourceFunction);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param array
   * @param i
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

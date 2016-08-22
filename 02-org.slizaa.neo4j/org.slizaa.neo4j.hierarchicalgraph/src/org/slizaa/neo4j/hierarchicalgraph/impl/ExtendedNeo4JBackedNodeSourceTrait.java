package org.slizaa.neo4j.hierarchicalgraph.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;
import org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedNeo4JBackedNodeSourceTrait {

  /** - */
  private static final String       BATCH_UPDATE_QUERY = "MATCH (p) where id(p) in { ids } RETURN p";

  /** - */
  private Neo4JBackedNodeSourceImpl _nodeSource;

  /**
   * <p>
   * Creates a new instance of type {@link ExtendedNeo4JBackedNodeSourceTrait}.
   * </p>
   *
   * @param nodeSource
   */
  public ExtendedNeo4JBackedNodeSourceTrait(Neo4JBackedNodeSourceImpl nodeSource) {
    _nodeSource = nodeSource;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public EMap<String, String> getProperties() {

    // lazy load...
    if (_nodeSource.properties == null) {
      reloadProperties();
    }

    // return the result
    return _nodeSource.properties;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public EList<String> getLabels() {

    // lazy load...
    if (_nodeSource.labels == null) {
      reloadLabels();
    }

    // return the result
    return _nodeSource.labels;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public EList<String> reloadLabels() {

    // request properties
    return setLabels(getJQAssistantRemoteService().getNodeLabels((long) _nodeSource.getIdentifier()));
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public EMap<String, String> reloadProperties() {

    // request properties
    return setProperties(getJQAssistantRemoteService().getNodeProperties((long) _nodeSource.getIdentifier()));
  }

  /**
   * <p>
   * </p>
   */
  public void loadPropertiesAndLabelsForChildren() {
    batchUpdate(_nodeSource.getNode().getChildren());
  }

  /**
   * <p>
   * </p>
   *
   * @param nodeProperties
   * @return
   */
  private EList<String> setLabels(JsonArray jsonArray) {
    checkNotNull(jsonArray);

    // lazy init
    if (_nodeSource.labels == null) {
      _nodeSource.labels = new EDataTypeUniqueEList<String>(String.class, _nodeSource,
          Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__LABELS);
    }

    //
    jsonArray.forEach((e) -> _nodeSource.labels.add(e.getAsString()));

    // return the result
    return _nodeSource.labels;
  }

  public void onExpand() {
    loadPropertiesAndLabelsForChildren();
  }

  public void onCollapse() {
  }

  /**
   * <p>
   * </p>
   *
   * @param jsonObject
   * @return
   */
  private EMap<String, String> setProperties(JsonObject jsonObject) {
    checkNotNull(jsonObject);

    // lazy init
    if (_nodeSource.properties == null) {
      _nodeSource.properties = new EcoreEMap<String, String>(HierarchicalgraphPackage.Literals.STRING_TO_STRING_MAP,
          org.slizaa.hierarchicalgraph.impl.StringToStringMapImpl.class, _nodeSource,
          Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE__PROPERTIES);
    }

    // clear the properties first
    _nodeSource.properties.clear();

    // re-populate
    jsonObject.entrySet().forEach((e) -> {
      _nodeSource.properties.put(e.getKey(), e.getValue().getAsString());
    });

    // return the result
    return _nodeSource.properties;
  }

  /**
   * <p>
   * </p>
   *
   * @param hgNodes
   */
  private void batchUpdate(List<HGNode> hgNodes) {

    Map<Long, HGNode> nodes = new HashMap<>();
    hgNodes.forEach((n) -> nodes.put((Long) n.getIdentifier(), n));

    // query
    Map<String, String> params = new HashMap<>();
    params.put("ids", nodes.keySet().toString());
    Future<JsonObject> result = getJQAssistantRemoteService().executeCypherQuery(BATCH_UPDATE_QUERY, params);

    try {
      JsonObject jsonObject = result.get();
      for (JsonElement jsonElement : jsonObject.getAsJsonArray("data")) {

        for (JsonElement nodeElement : jsonElement.getAsJsonArray()) {

          JsonObject metadata = nodeElement.getAsJsonObject().get("metadata").getAsJsonObject();

          long identifier = metadata.get("id").getAsLong();
          HGNode hgNode = nodes.get(identifier);

          ((ExtendedNeo4JBackedNodeSourceImpl) hgNode.getNodeSource()).getTrait()
              .setLabels(metadata.get("labels").getAsJsonArray());

          //
          JsonObject data = nodeElement.getAsJsonObject().get("data").getAsJsonObject();

          ((ExtendedNeo4JBackedNodeSourceImpl) hgNode.getNodeSource()).getTrait().setProperties(data);
        }
      }
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ExecutionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public INeo4JRepository getJQAssistantRemoteService() {
    //
    Neo4JBackedRootNodeSource rootNodeSource = (Neo4JBackedRootNodeSource) _nodeSource.getNode().getRootNode()
        .getNodeSource();

    //
    return (INeo4JRepository) rootNodeSource.getRepository();
  }

  public boolean isAutoExpand() {
    // TODO
    return true;
  }
}

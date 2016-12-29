package org.slizaa.neo4j.queryresult.ui;

import java.util.List;
import java.util.concurrent.Future;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.serializer.ISerializer;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.DbAdapterConstants;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.opencypher.openCypher.Cypher;
import org.slizaa.neo4j.opencypher.openCypher.Limit;
import org.slizaa.neo4j.opencypher.openCypher.NumberConstant;
import org.slizaa.neo4j.opencypher.openCypher.OpenCypherFactory;
import org.slizaa.neo4j.opencypher.openCypher.ReturnBody;
import org.slizaa.neo4j.opencypher.ui.custom.spi.IGraphDatabaseClientAdapter;
import org.slizaa.neo4j.opencypher.util.CypherNormalizer;

import com.google.gson.JsonObject;

@Component(factory = "Neo4jGraphDatabaseClientAdapterProvider", service = IGraphDatabaseClientAdapter.class)
public class Neo4jGraphDatabaseClientAdapterProvider implements IGraphDatabaseClientAdapter {

  /** - */
  private Neo4jRestClient _client;

  @Activate
  public void activate(ComponentContext context) {
    _client = (Neo4jRestClient) context.getProperties().get(DbAdapterConstants.PROPERTY_NEO4J_REST_CLIENT);
  }

  /**
   * <p>
   * </p>
   *
   * @param cypher
   * @param serializer
   * @param defaultLimit
   */
  @Override
  public void executeCypherQuery(Cypher cypher, ISerializer serializer, int defaultLimit) {

    //
    String cypherString = serializer.serialize(cypher);
    cypherString = CypherNormalizer.normalize(cypherString);

    //
    ReturnBody returnBody = getReturnBody(cypher);
    if (returnBody != null && returnBody.getLimit() == null && defaultLimit >= 0) {
      if (cypherString.endsWith(";")) {
        cypherString = cypherString.substring(0, cypherString.length() - 1) + " limit " + defaultLimit + ";";
      } else {
        cypherString = cypherString + " limit " + defaultLimit;
      }
    }

    //
   Future<?> future = _client.executeCypherQuery(cypherString, c -> System.out.println(c));
  }

  @Override
  public String getName() {
    return _client.getName() != null ? _client.getName() : _client.getBaseURI();
  }

  @Override
  public boolean isAvailable() {
    return _client.isConnected();
  }

  @Override
  public List<String> getNodeLabels() {
    return _client.getAllLabels();
  }

  @Override
  public List<String> getRelationhipTypes() {
    return _client.getAllRelationshipTypes();
  }

  @Override
  public List<String> getPropertyKeys() {
    return _client.getAllPropertyKeys();
  }

  /**
   * <p>
   * </p>
   *
   * @param eObject
   * @return
   */
  private static ReturnBody getReturnBody(EObject eObject) {
    List<ReturnBody> returnBodies = EcoreUtil2.eAllOfType(eObject, ReturnBody.class);
    if (returnBodies != null && returnBodies.size() > 0) {
      return returnBodies.get(0);
    }
    return null;
  }

}

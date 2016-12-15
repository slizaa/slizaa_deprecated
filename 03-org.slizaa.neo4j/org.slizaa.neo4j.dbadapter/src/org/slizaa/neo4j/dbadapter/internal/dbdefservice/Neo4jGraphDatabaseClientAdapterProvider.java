package org.slizaa.neo4j.dbadapter.internal.dbdefservice;

import java.util.List;

import org.eclipse.xtext.serializer.ISerializer;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.opencypher.openCypher.Cypher;
import org.slizaa.neo4j.opencypher.ui.custom.spi.IGraphDatabaseClientAdapter;
import org.slizaa.neo4j.opencypher.util.CypherNormalizer;

@Component(factory = "Neo4jGraphDatabaseClientAdapterProvider", service = IGraphDatabaseClientAdapter.class)
public class Neo4jGraphDatabaseClientAdapterProvider implements IGraphDatabaseClientAdapter {

  /** - */
  public static final String PROPERTY_NEO4J_REST_CLIENT = "PROPERTY_NEO4J_REST_CLIENT";

  /** - */
  private Neo4jRestClient    _client;

  @Activate
  public void activate(ComponentContext context) {
    _client = (Neo4jRestClient) context.getProperties().get(PROPERTY_NEO4J_REST_CLIENT);
  }

  @Override
  public void executeCypherQuery(Cypher cypher, ISerializer serializer) {
    String cypherString = serializer.serialize(cypher);
    cypherString = CypherNormalizer.normalize(cypherString);
    _client.executeCypherQuery(cypherString, c -> System.out.println(c));
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
}

package org.slizaa.neo4j.queryresult.ui.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;
import java.util.concurrent.Future;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.serializer.ISerializer;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.opencypher.openCypher.Cypher;
import org.slizaa.neo4j.opencypher.openCypher.ReturnBody;
import org.slizaa.neo4j.opencypher.ui.custom.spi.IGraphDatabaseClientAdapter;
import org.slizaa.neo4j.opencypher.util.CypherNormalizer;

import com.google.gson.JsonObject;

public class Neo4JRestServiceGraphDatabaseClientAdapter implements IGraphDatabaseClientAdapter, IQueryResultProvider {

  /** - */
  private Neo4jRestClient                _client;

  /** - */
  private BiConsumer<String, JsonObject> _queryResultReceivedHandler;

  /** - */
  private Consumer<String>               _queryStartedHandler;

  /**
   * <p>
   * Creates a new instance of type {@link Neo4JRestServiceGraphDatabaseClientAdapter}.
   * </p>
   *
   * @param client
   */
  public Neo4JRestServiceGraphDatabaseClientAdapter(Neo4jRestClient client) {
    _client = checkNotNull(client);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void onQueryResultReceived(BiConsumer<String, JsonObject> queryResultReceivedHandler) {
    _queryResultReceivedHandler = queryResultReceivedHandler;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void onQueryStarted(Consumer<String> queryStartedHandler) {
    _queryStartedHandler = queryStartedHandler;
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
  public Future<?> executeCypherQuery(Cypher cypher, ISerializer serializer, int defaultLimit) {

    //
    String cypherString = serializer.serialize(cypher);
    cypherString = CypherNormalizer.normalize(cypherString);

    //
    if (_queryStartedHandler != null) {
      _queryStartedHandler.accept(cypherString);
    }

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
    String finalCypherQuery = cypherString;
    Future<?> future = _client.executeCypherQuery(cypherString, result -> {
      if (_queryResultReceivedHandler != null) {
        _queryResultReceivedHandler.accept(finalCypherQuery, result);
      }
    });
    return future;
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

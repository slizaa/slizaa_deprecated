package org.slizaa.neo4j.dbadapter.test;

import static com.google.common.base.Preconditions.checkNotNull;

import org.junit.After;
import org.junit.Before;
import org.slizaa.neo4j.dbadapter.DbAdapterFactory;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.graphdb.testfwk.AbstractNeo4JServerTest;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractRemoteRepositoryTest extends AbstractNeo4JServerTest {

  /** - */
  private Neo4jRestClient _neo4JRestClient;

  /**
   * <p>
   * </p>
   *
   * @throws Exception
   */
  @Before
  public void init() throws Exception {
    _neo4JRestClient = createNeo4jRestClient("http://localhost:7474");
  }

  /**
   * <p>
   * </p>
   */
  @After
  public void dispose() {
  }

  /**
   * <p>
   * </p>
   *
   * @return the neo4JRemoteRepository
   */
  public Neo4jRestClient getNeo4jRestClient() {
    return _neo4JRestClient;
  }

  /**
   * <p>
   * </p>
   *
   * @param baseUri
   * @return
   */
  public static Neo4jRestClient createNeo4jRestClient(String baseUri) {

    // create the remote repository
    final Neo4jRestClient remoteRepository = DbAdapterFactory.eINSTANCE.createNeo4jRestClient();

    //
    remoteRepository.setBaseURI(checkNotNull(baseUri));

    //
    return remoteRepository;
  }
}

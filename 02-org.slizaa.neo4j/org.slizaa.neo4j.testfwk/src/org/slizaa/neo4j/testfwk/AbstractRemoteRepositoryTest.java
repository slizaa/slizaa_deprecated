package org.slizaa.neo4j.testfwk;

import org.junit.After;
import org.junit.Before;
import org.slizaa.hierarchicalgraph.HGRootNode;
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
  private Neo4jRestClient _neo4JRemoteRepository;

  @Before
  public void init() throws Exception {
    _neo4JRemoteRepository = TestModelFactory.createNeo4JRemoteRepository("http://localhost:7474");
  }

  @After
  public void dispose() {
    _neo4JRemoteRepository.dispose();
  }

  /**
   * <p>
   * </p>
   *
   * @return the neo4JRemoteRepository
   */
  public Neo4jRestClient getNeo4JRemoteRepository() {
    return _neo4JRemoteRepository;
  }

  /**
   * <p>
   * </p>
   *
   * @param remoteRepository
   * @return
   * @throws Exception
   */
  public HGRootNode createGraphFromDefaultMapping(Neo4jRestClient remoteRepository) throws Exception {
    return TestModelFactory.createGraphFromDefaultMapping(remoteRepository);
  }
}

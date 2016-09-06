package org.slizaa.neo4j.hierarchicalgraph;

import static org.slizaa.neo4j.testfwk.testmodel.TestModelFactory.createNeo4JRemoteRepository;

import org.junit.After;
import org.junit.Before;
import org.slizaa.neo4j.testfwk.restserver.AbstractNeo4JServerTest;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractRemoteRepositoryTest extends AbstractNeo4JServerTest {

  /** - */
  private Neo4JRemoteRepository _neo4JRemoteRepository;

  @Before
  public void init() throws Exception {
    _neo4JRemoteRepository = createNeo4JRemoteRepository("http://localhost:7474");
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
  Neo4JRemoteRepository getNeo4JRemoteRepository() {
    return _neo4JRemoteRepository;
  }
}

package org.slizaa.neo4j.hierarchicalgraph;

import org.junit.After;
import org.junit.Before;
import org.slizaa.neo4j.hierarchicalgraph.impl.ExtendedNeo4JRemoteRepositoryImpl;
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
  public void init() {
    _neo4JRemoteRepository = new ExtendedNeo4JRemoteRepositoryImpl();
    _neo4JRemoteRepository.setBaseURI("http://localhost:7474");
    _neo4JRemoteRepository.setThreadPoolSize(10);
    _neo4JRemoteRepository.init();
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

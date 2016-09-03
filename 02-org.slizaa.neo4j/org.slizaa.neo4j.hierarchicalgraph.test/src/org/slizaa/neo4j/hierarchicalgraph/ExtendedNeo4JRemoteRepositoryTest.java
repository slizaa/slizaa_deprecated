package org.slizaa.neo4j.hierarchicalgraph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slizaa.neo4j.hierarchicalgraph.impl.ExtendedNeo4JRemoteRepositoryImpl;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtendedNeo4JRemoteRepositoryTest extends AbstractTest {

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

  @Test
  public void blabla() {
    System.out.println(_neo4JRemoteRepository.getNodeProperties(4532));
  }
  
  @Test
  public void blabla2() {
    System.out.println(_neo4JRemoteRepository.getNodeProperties(5146));
  }
  
  @Test
  public void blabla3() {
    System.out.println(_neo4JRemoteRepository.getNodeProperties(72578));
  }
  
  @Test
  public void blabla4() {
    System.out.println(_neo4JRemoteRepository.getNodeProperties(7282));
  }
  
  @Test
  public void blabla5() {
    System.out.println(_neo4JRemoteRepository.getNodeProperties(6438));
  }
  
  @Test
  public void blabla6() {
    System.out.println(_neo4JRemoteRepository.getNodeProperties(3384));
  }
  
  @Test
  public void blabla7() {
    System.out.println(_neo4JRemoteRepository.getNodeProperties(1));
  }
}

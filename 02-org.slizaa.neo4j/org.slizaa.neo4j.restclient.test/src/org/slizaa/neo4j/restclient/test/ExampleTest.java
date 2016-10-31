package org.slizaa.neo4j.restclient.test;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class ExampleTest extends AbstractRemoteRepositoryTest {

  @Test
  public void test() throws InterruptedException, ExecutionException {
    System.out.println(this.getNeo4jRestClient().executeCypherQuery("MATCH (c:Class) RETURN c LIMIT 10").get());
  }
}

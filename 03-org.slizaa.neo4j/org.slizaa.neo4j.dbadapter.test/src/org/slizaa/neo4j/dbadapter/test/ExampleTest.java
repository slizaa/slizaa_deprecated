package org.slizaa.neo4j.dbadapter.test;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class ExampleTest extends AbstractRemoteRepositoryTest {

  @Test
  public void test() throws InterruptedException, ExecutionException {
    System.out.println(this.getNeo4jRestClient().executeCypherQuery("MATCH (c:Class) RETURN c LIMIT 10").get());
  }
  
//  executeCypherQuery(String)
//  executeCypherQuery(String, Consumer<JsonObject>)
//  executeCypherQuery(String, Map<String, String>)
//  executeCypherQuery(String, Map<String, String>, Consumer<JsonObject>)
//  getAllLabels()
//  getAllPropertyKeys()
//  getAllRelationshipTypes()
//  getBaseURI()
//  getExtension(Class<T>)
//  getLabelsForNode(long)
//  getName()
//  getPropertiesForNode(long)
//  getPropertiesForRelationship(long)
//  getThreadPoolSize()
//  hasExtension(Class<T>)
//  registerExtension(Class<T>)
//  setBaseURI(String)
//  setName(String)
//  setThreadPoolSize(int)
}

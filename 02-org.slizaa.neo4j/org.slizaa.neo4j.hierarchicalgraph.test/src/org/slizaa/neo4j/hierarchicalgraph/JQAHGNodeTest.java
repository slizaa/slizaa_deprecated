package org.slizaa.neo4j.hierarchicalgraph;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;

import com.google.gson.JsonObject;

public class JQAHGNodeTest {

	@Test
	public void testMeinModel() throws InterruptedException, ExecutionException {

		Neo4JRemoteRepository remoteService = Neo4jHierarchicalgraphFactory.eINSTANCE.createNeo4JRemoteRepository();
		remoteService.setBaseURI("http://localhost:7474");
		remoteService.setThreadPoolSize(20);
		remoteService.init();

		Future<JsonObject> result = remoteService.executeCypherQuery(
				"MATCH (n:Jar),n-[:CONTAINS]->(d:Directory)-[:CONTAINS]->(t:File) WHERE id(n)=60081 OPTIONAL MATCH (t)-[:DECLARES]->(m) RETURN id(n), id(d), id(t), id(m);");

		System.out.println(result.get().getAsJsonArray("data"));
	}
}

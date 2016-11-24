package org.slizaa.neo4j.hierarchicalgraph;

import static net.javacrumbs.jsonunit.fluent.JsonFluentAssert.assertThatJson;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slizaa.neo4j.testfwk.AbstractRemoteRepositoryTest;

import com.google.gson.JsonObject;

/**
 * <p>
 * https://github.com/lukas-krecan/JsonUnit
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@RunWith(value = Parameterized.class)
public class ExtendedNeo4JRemoteRepository_GetRelationshipProperties_Test extends AbstractRemoteRepositoryTest {

  /** - */
  private long   _nodeId;

  /** - */
  private String _expectedJsonString;

  /**
   * <p>
   * Creates a new instance of type {@link ExtendedNeo4JRemoteRepository_GetRelationshipProperties_Test}.
   * </p>
   *
   * @param nodeId
   * @param expectedJsonString
   */
  public ExtendedNeo4JRemoteRepository_GetRelationshipProperties_Test(long nodeId, String expectedJsonString) {
    this._nodeId = nodeId;
    this._expectedJsonString = expectedJsonString;
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void getNodeProperties() {
    JsonObject jsonObject = getNeo4JRemoteRepository().getPropertiesForRelationship(_nodeId);
    System.out.println(jsonObject);
    assertThatJson(jsonObject).isEqualTo(_expectedJsonString);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  @Parameters(name = "{index}: getNodeProperties({0}) = {1}")
  public static Collection<Object[]> data() {
    return Arrays.asList(
        new Object[][] { { 28559, "{'scope':'test','optional':false}" }, { 619, "{}" }, { 786, "{}" }, { 306, "{}" } });
  }
}

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
public class ExtendedNeo4JRemoteRepository_GetNodeProperties_Test extends AbstractRemoteRepositoryTest {

  /** - */
  private long   _nodeId;

  /** - */
  private String _expectedJsonString;

  /**
   * <p>
   * Creates a new instance of type {@link ExtendedNeo4JRemoteRepository_GetNodeProperties_Test}.
   * </p>
   *
   * @param nodeId
   * @param expectedJsonString
   */
  public ExtendedNeo4JRemoteRepository_GetNodeProperties_Test(long nodeId, String expectedJsonString) {
    this._nodeId = nodeId;
    this._expectedJsonString = expectedJsonString;
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void getNodeProperties() {
    JsonObject jsonObject = getNeo4JRemoteRepository().getNodeProperties(_nodeId);
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
    return Arrays.asList(new Object[][] {
        { 4532,
            "{'static':true,'visibility':'private','signature':'java.util.List getValueAsList(javax.lang.model.element.AnnotationValue)','name':'getValueAsList','cyclomaticComplexity':1}" },
        { 5146,
            "{'visibility':'private','signature':'java.util.List getArrayValues(java.lang.String,java.lang.Class)','name':'getArrayValues','cyclomaticComplexity':2}" },
        { 7282,
            "{'visibility':'public','signature':'void closeTemplateSource(java.lang.Object)','name':'closeTemplateSource','cyclomaticComplexity':1}" },
        { 6438,
            "{'visibility':'default','signature':'int consecutiveLineBreaks','transient':false,'name':'consecutiveLineBreaks','volatile':false}" },
        { 1, "{'valid':true,'fileName':'/mapstruct-1.1.0.Beta2.jar'}" } });
  }
}

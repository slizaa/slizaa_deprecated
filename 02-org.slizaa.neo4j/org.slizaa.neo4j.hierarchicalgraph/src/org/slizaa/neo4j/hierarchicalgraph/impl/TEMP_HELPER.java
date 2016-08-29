package org.slizaa.neo4j.hierarchicalgraph.impl;

public class TEMP_HELPER {

  public static final String QUERY = "MATCH (n1)-[rel]->(n2) "
      + "WHERE id(n1) in [98364, 98847, 98851, 98850, 98854, 98846, 98848,98853,98855,98852,98849,98895,98844,98365,98868,98870,98887,98865] "
      + "AND ( " + "(n1:Type)-[rel:EXTENDS|:IMPLEMENTS]->(n2:Type) OR " + "(n1:Method)-[rel:INVOKES]->(n2:Method) OR "
      + "(n1:Method)-[rel:READS|:WRITES]->(n2:Field) OR " + "(n1:Field)-[rel:OF_TYPE]->(n2:Type) OR "
      + "(n1:Method)-[rel:THROWS]->(n2:Type) OR " + "(n1:Method)-[rel:RETURNS]->(n2:Type) OR "
      + "(n1:Method)-[rel:RETURNS]->(n2:Type) " + ") " + "RETURN id(n1), id(n2), id(rel), type(rel)";
}

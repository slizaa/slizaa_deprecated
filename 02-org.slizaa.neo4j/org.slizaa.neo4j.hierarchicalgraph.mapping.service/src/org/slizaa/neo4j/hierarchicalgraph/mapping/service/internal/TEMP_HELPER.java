package org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal;

public class TEMP_HELPER {

  public static final String QUERY = "MATCH (n1)-[rel]->(n2) "
      + "WHERE id(n1) in {from} "
      + "AND id(n2) in {to} "
      + "AND ( " + "(n1:Type)-[rel:EXTENDS|:IMPLEMENTS]->(n2:Type) OR " + "(n1:Method)-[rel:INVOKES]->(n2:Method) OR "
      + "(n1:Method)-[rel:READS|:WRITES]->(n2:Field) OR " + "(n1:Field)-[rel:OF_TYPE]->(n2:Type) OR "
      + "(n1:Method)-[rel:THROWS]->(n2:Type) OR " + "(n1:Method)-[rel:RETURNS]->(n2:Type) OR "
      + "(n1:Method)-[rel:RETURNS]->(n2:Type) " + ") " + "RETURN id(n1), id(n2), id(rel), type(rel)";
}

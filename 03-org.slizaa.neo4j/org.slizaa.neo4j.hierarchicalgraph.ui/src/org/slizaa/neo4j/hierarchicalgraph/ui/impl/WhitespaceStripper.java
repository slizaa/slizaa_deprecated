package org.slizaa.neo4j.hierarchicalgraph.ui.impl;

public class WhitespaceStripper {

  public static String stripWhitespace(String string) {

    String lines[] = string.split("\r?\n");
    StringBuffer result = new StringBuffer();
    for (int i = 0; i < lines.length; i++) {
      result.append(lines[i].trim());
      if(i+1 < lines.length) {
        result.append("\n");
      }
    }
    return result.toString();
  }
}

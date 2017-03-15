package org.slizaa.testfwk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.slizaa.hierarchicalgraph.DefaultNodeSource;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.INodeSource;

public class HGNodeUtils {

  /**
   * <p>
   * </p>
   *
   * @param node
   * @return
   */
  public static Map<String, String> getProperties(HGNode node) {

    //
    INodeSource nodeSource = (INodeSource) node.getNodeSource();

    //
    if (nodeSource instanceof DefaultNodeSource) {
      return ((DefaultNodeSource) nodeSource).getProperties();
    }

    //
    else {
      return Collections.emptyMap();
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param node
   * @return
   */
  public static List<String> getLabels(HGNode node) {

    //
    Map<String, String> props = getProperties(node);

    //
    if (props.containsKey("labels")) {
      String arrayString = props.get("labels");
      arrayString = arrayString.substring(1, arrayString.length() - 1);
      return Arrays.asList(arrayString.split("\\s*,\\s*"));
    }

    //
    return Collections.emptyList();
  }

}

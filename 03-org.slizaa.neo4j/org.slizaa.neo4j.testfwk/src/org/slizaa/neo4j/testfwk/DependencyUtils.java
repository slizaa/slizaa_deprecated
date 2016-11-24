package org.slizaa.neo4j.testfwk;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;

public class DependencyUtils {
  
  /**
   * <p>
   * </p>
   *
   * @param hgNode
   * @return
   */
  public static List<String> outDeps(HGNode hgNode) {
    return asStringList(hgNode.getOutgoingCoreDependencies());
  }

  public static List<String> asStringList(Collection<HGCoreDependency> dependencies) {
    return checkNotNull(dependencies).stream().map(dep -> String.format("(%s)-[%s]->(%s)",
        dep.getFrom().getIdentifier(), dep.getType(), dep.getTo().getIdentifier())).sorted()
        .collect(Collectors.toList());
  }
}

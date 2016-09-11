/*******************************************************************************
 * Copyright (c) Gerd Wütherich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd Wütherich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.hierarchicalgraph.util;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;

/**
 * <p>
 * Helper class that provides several static methods useful when working with analysis models.
 * </p>
 * 
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class HierarchicalGraphUtils {

  /**
   * <p>
   * </p>
   * 
   * @return
   */
  public static List<HGCoreDependency> getCoreDependencies(Collection<AbstractHGDependency> dependencies) {

    //
    if (dependencies == null) {
      return Collections.emptyList();
    }

    //
    final List<HGCoreDependency> result = new LinkedList<>();

    for (AbstractHGDependency dependency : dependencies) {
      if (dependency instanceof HGCoreDependency) {
        result.add((HGCoreDependency) dependency);
      }
      //
      else if (dependency instanceof HGAggregatedDependency) {
        result.addAll(((HGAggregatedDependency) dependency).getCoreDependencies());
      }
    }

    return result;
  }

  // public static void prettyPrint(Collection<HGDependency> dependencies) {
  // for (HGDependency dependency : dependencies) {
  // prettyPrint(dependency);
  // }
  // }
  //
  // public static void prettyPrint(HGDependency dependency) {
  // System.out.println(String.format("%s -(%s)-> %s", dependency.getTo().getNodeSource().toString(),
  // dependency.getWeight(), dependency.getFrom().getNodeSource().toString()));
  // }
  //
  // /**
  // * <p>
  // * </p>
  // *
  // * @param node
  // * @param level
  // * @param stringBuilder
  // */
  // private static void dump(HGNode node, int level, StringBuilder stringBuilder, int limit) {
  //
  // // limit
  // if (limit != -1 && level >= limit) {
  // return;
  // }
  //
  // //
  // for (int i = 0; i < level; i++) {
  // stringBuilder.append(" ");
  // }
  //
  // //
  // stringBuilder.append("[");
  // stringBuilder.append(node.getIdentifier());
  // stringBuilder.append("] ");
  // stringBuilder.append(node.getNodeSource().toString());
  // stringBuilder.append("\n");
  //
  // for (HGNode child : node.getChildren()) {
  // dump(child, level + 1, stringBuilder, limit);
  // }
  // }
  //
  // /**
  // * <p>
  // * </p>
  // *
  // * @param artifact
  // */
  // public static void printPretty(HGNode artifact) {
  //
  // if (artifact == null) {
  // System.out.println("Artifact is 'null'.");
  // return;
  // }
  //
  // StringBuilder builder = new StringBuilder();
  // dump(artifact, 0, builder, -1);
  // System.out.println(builder.toString());
  // }
  //
  // /**
  // * <p>
  // * </p>
  // *
  // * @param artifact
  // */
  // public static void dumpArtifact(HGNode artifact, int limit) {
  // StringBuilder builder = new StringBuilder();
  // dump(artifact, 0, builder, limit);
  // System.out.println(builder.toString());
  // }
  //
  // /**
  // * <p>
  // * </p>
  // *
  // * @param artifact
  // */
  // public static void dumpArtifact(HGNode artifact) {
  // dumpArtifact(artifact, -1);
  // }
}

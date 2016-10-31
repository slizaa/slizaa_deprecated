
package org.slizaa.neo4j.graphdb.testfwk.internal.aether;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.collection.CollectRequest;
import org.eclipse.aether.collection.DependencyCollectionException;
import org.eclipse.aether.graph.Dependency;
import org.eclipse.aether.graph.DependencyNode;
import org.eclipse.aether.resolution.ArtifactResult;
import org.eclipse.aether.resolution.DependencyRequest;
import org.eclipse.aether.resolution.DependencyResolutionException;
import org.eclipse.aether.resolution.DependencyResult;

/**
 * <p>
 * Resolves the transitive (compile) dependencies of an artifact.
 * </p>
 */
public class TransitiveDependenciesResolver
{
  /**
   * <p>
   * </p>
   *
   * @param coords
   * @return
   */
  public static URL[] resolve(String coords) {

    //
    try {

      //
      RepositorySystem repoSystem = Booter.newRepositorySystem();
      RepositorySystemSession session = Booter.newRepositorySystemSession(repoSystem);

      Dependency dependency =
          new Dependency(new DefaultArtifact(coords), "test");

      CollectRequest collectRequest = new CollectRequest();
      collectRequest.setRoot(dependency);
      collectRequest.addRepository(Booter.newCentralRepository());
      DependencyNode node = repoSystem.collectDependencies(session, collectRequest).getRoot();

      DependencyRequest dependencyRequest = new DependencyRequest();
      dependencyRequest.setRoot(node);
      DependencyResult result = repoSystem.resolveDependencies(session, dependencyRequest);

      //
      List<URL> resolvedFiles = new LinkedList<>();
      for (ArtifactResult artifactResult : result.getArtifactResults())
      {
        resolvedFiles.add(artifactResult.getArtifact().getFile().toURI().toURL());
      }
      return resolvedFiles.toArray(new URL[0]);
    }
    //
    catch (DependencyCollectionException e) {
      throw new RuntimeException(e);
    }
    //
    catch (DependencyResolutionException e) {
      throw new RuntimeException(e);
    }
    //
    catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param args
   * @throws Exception
   */
  public static void main(String[] args)
      throws Exception {

    //
    for (URL url : TransitiveDependenciesResolver
        .resolve("org.neo4j.test:neo4j-harness:2.3.3")) {
      System.out.println(url.getFile());
    }
  }
}

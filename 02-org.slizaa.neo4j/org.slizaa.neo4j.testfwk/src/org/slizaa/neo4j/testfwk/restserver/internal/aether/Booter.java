
package org.slizaa.neo4j.testfwk.restserver.internal.aether;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.maven.repository.internal.MavenRepositorySystemUtils;
import org.eclipse.aether.DefaultRepositorySystemSession;
import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.repository.LocalRepository;
import org.eclipse.aether.repository.RemoteRepository;

/**
 * A helper to boot the repository system and a repository system session.
 */
public class Booter
{

  /** - */
  private static final String LOCAL_REPO = System.getProperty("user.home") + File.separator + ".m2"
      + File.separator + "repository";

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public static RepositorySystem newRepositorySystem()
  {
    return ManualRepositorySystemFactory.newRepositorySystem();
  }

  /**
   * <p>
   * </p>
   *
   * @param system
   * @return
   */
  public static DefaultRepositorySystemSession newRepositorySystemSession(RepositorySystem system)
  {
    DefaultRepositorySystemSession session = MavenRepositorySystemUtils.newSession();

    LocalRepository localRepo = new LocalRepository(LOCAL_REPO);
    session.setLocalRepositoryManager(system.newLocalRepositoryManager(session, localRepo));

    session.setTransferListener(new ConsoleTransferListener());
    session.setRepositoryListener(new ConsoleRepositoryListener());

    // uncomment to generate dirty trees
    // session.setDependencyGraphTransformer( null );

    return session;
  }

  /**
   * <p>
   * </p>
   *
   * @param system
   * @param session
   * @return
   */
  public static List<RemoteRepository> newRepositories(RepositorySystem system,
      RepositorySystemSession session)
  {
    return new ArrayList<RemoteRepository>(Arrays.asList(newCentralRepository()));
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public static RemoteRepository newCentralRepository()
  {
    return new RemoteRepository.Builder("central", "default", "http://repo1.maven.org/maven2")
        .build();
  }
}

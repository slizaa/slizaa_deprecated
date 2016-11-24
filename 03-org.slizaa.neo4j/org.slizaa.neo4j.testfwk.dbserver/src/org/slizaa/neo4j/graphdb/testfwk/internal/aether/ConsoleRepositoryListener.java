
package org.slizaa.neo4j.graphdb.testfwk.internal.aether;

import org.eclipse.aether.AbstractRepositoryListener;
import org.eclipse.aether.RepositoryEvent;

/**
 * A simplistic repository listener that logs events to the console.
 */
public class ConsoleRepositoryListener
    extends AbstractRepositoryListener
{

  @Override
  public void artifactDeployed(RepositoryEvent event)
  {
    System.out.println("Deployed " + event.getArtifact() + " to " + event.getRepository());
  }

  @Override
  public void artifactDeploying(RepositoryEvent event)
  {
    System.out.println("Deploying " + event.getArtifact() + " to " + event.getRepository());
  }

  @Override
  public void artifactDescriptorInvalid(RepositoryEvent event)
  {
    System.out.println("Invalid artifact descriptor for " + event.getArtifact() + ": "
        + event.getException().getMessage());
  }

  @Override
  public void artifactDescriptorMissing(RepositoryEvent event)
  {
    System.out.println("Missing artifact descriptor for " + event.getArtifact());
  }

  @Override
  public void artifactInstalled(RepositoryEvent event)
  {
    System.out.println("Installed " + event.getArtifact() + " to " + event.getFile());
  }

  @Override
  public void artifactInstalling(RepositoryEvent event)
  {
    System.out.println("Installing " + event.getArtifact() + " to " + event.getFile());
  }

  @Override
  public void artifactResolved(RepositoryEvent event)
  {
    System.out.println("Resolved artifact " + event.getArtifact() + " from " + event.getRepository());
  }

  @Override
  public void artifactDownloading(RepositoryEvent event)
  {
    System.out.println("Downloading artifact " + event.getArtifact() + " from " + event.getRepository());
  }

  @Override
  public void artifactDownloaded(RepositoryEvent event)
  {
    System.out.println("Downloaded artifact " + event.getArtifact() + " from " + event.getRepository());
  }

  @Override
  public void artifactResolving(RepositoryEvent event)
  {
    System.out.println("Resolving artifact " + event.getArtifact());
  }

  @Override
  public void metadataDeployed(RepositoryEvent event)
  {
    System.out.println("Deployed " + event.getMetadata() + " to " + event.getRepository());
  }

  @Override
  public void metadataDeploying(RepositoryEvent event)
  {
    System.out.println("Deploying " + event.getMetadata() + " to " + event.getRepository());
  }

  @Override
  public void metadataInstalled(RepositoryEvent event)
  {
    System.out.println("Installed " + event.getMetadata() + " to " + event.getFile());
  }

  @Override
  public void metadataInstalling(RepositoryEvent event)
  {
    System.out.println("Installing " + event.getMetadata() + " to " + event.getFile());
  }

  @Override
  public void metadataInvalid(RepositoryEvent event)
  {
    System.out.println("Invalid metadata " + event.getMetadata());
  }

  @Override
  public void metadataResolved(RepositoryEvent event)
  {
    System.out.println("Resolved metadata " + event.getMetadata() + " from " + event.getRepository());
  }

  @Override
  public void metadataResolving(RepositoryEvent event)
  {
    System.out.println("Resolving metadata " + event.getMetadata() + " from " + event.getRepository());
  }
}

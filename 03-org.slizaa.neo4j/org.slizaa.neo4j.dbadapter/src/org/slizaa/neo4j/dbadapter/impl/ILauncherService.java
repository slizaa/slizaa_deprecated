package org.slizaa.neo4j.dbadapter.impl;

import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public interface ILauncherService {

  void enrich(ManagedNeo4jInstance managedInstance) throws Exception;

  void scan(ManagedNeo4jInstance managedInstance) throws Exception;

  void start(ManagedNeo4jInstance managedInstance) throws Exception;

  boolean isScanned(ManagedNeo4jInstance managedInstance);

  void stop(ManagedNeo4jInstance managedInstance);
}

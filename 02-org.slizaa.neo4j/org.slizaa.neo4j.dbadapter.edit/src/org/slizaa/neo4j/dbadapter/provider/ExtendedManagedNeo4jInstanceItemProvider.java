/**
 */
package org.slizaa.neo4j.dbadapter.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;

/**
 */
public class ExtendedManagedNeo4jInstanceItemProvider extends ManagedNeo4jInstanceItemProvider {

  public ExtendedManagedNeo4jInstanceItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  @Override
  public String getText(Object object) {
    return ((ManagedNeo4jInstance) object).getName();
  }
}

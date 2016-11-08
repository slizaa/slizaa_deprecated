package org.slizaa.neo4j.dbadapter.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.slizaa.neo4j.dbadapter.DbadapterContainer;
import org.slizaa.neo4j.dbadapter.provider.DbadapterContainerItemProvider;

public class ExtendedDbadapterContainerItemProvider extends DbadapterContainerItemProvider {

  public ExtendedDbadapterContainerItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  @Override
  public String getText(Object object) {
    return  ((DbadapterContainer)object).getName();
  }
}

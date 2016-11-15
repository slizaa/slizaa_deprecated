package org.slizaa.neo4j.dbadapter.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.slizaa.neo4j.dbadapter.DbAdapterContainer;

public class ExtendedDbAdapterContainerItemProvider extends DbAdapterContainerItemProvider {

  public ExtendedDbAdapterContainerItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  @Override
  public String getText(Object object) {
    return  ((DbAdapterContainer<?>)object).getName();
  }
}

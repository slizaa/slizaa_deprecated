package org.slizaa.neo4j.queryresult.ui.internal;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slizaa.neo4j.dbadapter.IRestClientConnectionListener;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.opencypher.ui.custom.spi.IGraphDatabaseClientAdapter;

@Component(service = { IRestClientConnectionListener.class })
public class Neo4JRestServiceGraphDatabaseClientAdapterFactory implements IRestClientConnectionListener {

  /** - */
  private BundleContext                                _bundleContext;

  /** - */
  private Map<Neo4jRestClient, ServiceRegistration<?>> _serviceRegistration;

  @Activate
  public void init(BundleContext bundleContext) {
    _bundleContext = bundleContext;
    _serviceRegistration = new HashMap<Neo4jRestClient, ServiceRegistration<?>>();
  }

  @Deactivate
  public void dispose() {

    // unregister
    for (ServiceRegistration<?> serviceRegistration : _serviceRegistration.values()) {
      serviceRegistration.unregister();
    }

    //
    _bundleContext = null;
    _serviceRegistration = null;
  }

  @Override
  public void restClientConnected(Neo4jRestClient restClient) {

    //
    Neo4JRestServiceGraphDatabaseClientAdapter adapterImpl = new Neo4JRestServiceGraphDatabaseClientAdapter(restClient);
    ServiceRegistration<?> serviceRegistration = _bundleContext.registerService(
        new String[] { IQueryResultProvider.class.getName(), IGraphDatabaseClientAdapter.class.getName() }, adapterImpl,
        null);

    //
    _serviceRegistration.put(restClient, serviceRegistration);
  }

  @Override
  public void restClientDisconnected(Neo4jRestClient restClient) {

    //
    ServiceRegistration<?> serviceRegistration = _serviceRegistration.remove(restClient);
    if (serviceRegistration != null) {
      serviceRegistration.unregister();
    }
  }
}

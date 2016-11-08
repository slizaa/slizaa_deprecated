package org.slizaa.neo4j.workbenchmodel.service.internal;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.dbadapter.DbadapterFactory;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;
import org.slizaa.neo4j.workbenchmodel.WorkbenchModel;
import org.slizaa.neo4j.workbenchmodel.WorkbenchmodelFactory;
import org.slizaa.neo4j.workbenchmodel.service.WorkbenchModelService;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@Component
public class WorkbenchModelServiceImpl implements WorkbenchModelService {

  /** - */
  private WorkbenchModel _workbenchModel;

  /**
   * <p>
   * </p>
   */
  @Activate
  public void activate() {

    // initialize your model
    _workbenchModel = WorkbenchmodelFactory.eINSTANCE.createWorkbenchModel();
    _workbenchModel.setDatabases(DbadapterFactory.eINSTANCE.createDbAdapterRegistry());
    _workbenchModel.setMappedGraphs(WorkbenchmodelFactory.eINSTANCE.createMappedGraphs());

    //
    Neo4jRestClient neo4jRestClient = DbadapterFactory.eINSTANCE.createNeo4jRestClient();
    neo4jRestClient.setThreadPoolSize(20);
    neo4jRestClient.setName("http://localhost:7474");
    neo4jRestClient.setBaseURI("http://localhost:7474");
    neo4jRestClient.init();
    _workbenchModel.getDatabases().getClients().add(neo4jRestClient);

    //
    Resource resource = new ResourceSetImpl().createResource(URI.createURI("memory://localhost/slizaaWorkbenchModel"));

    //
    BasicCommandStack basicCommandStack = new BasicCommandStack();
    AdapterFactoryEditingDomain adapterFactoryEditingDomain = new AdapterFactoryEditingDomain(
        new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE), basicCommandStack);
    resource.eAdapters().add(new AdapterFactoryEditingDomain.EditingDomainProvider(adapterFactoryEditingDomain));
    resource.getContents().add(_workbenchModel);
  }

  @Override
  public WorkbenchModel getWorkbenchModel() {
    return _workbenchModel;
  }
}

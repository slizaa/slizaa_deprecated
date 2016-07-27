package org.slizaa.neo4j.workbenchmodel.service.internal;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;
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
    _workbenchModel.setDatabases(WorkbenchmodelFactory.eINSTANCE.createDatabases());
    _workbenchModel.setMappedGraphs(WorkbenchmodelFactory.eINSTANCE.createMappedGraphs());

    //
    Neo4JRemoteRepository neo4jRemoteRepository = Neo4jHierarchicalgraphFactory.eINSTANCE.createNeo4JRemoteRepository();
    neo4jRemoteRepository.setThreadPoolSize(20);
    neo4jRemoteRepository.setName("http://localhost:7474");
    neo4jRemoteRepository.setBaseURI("http://localhost:7474");
    neo4jRemoteRepository.init();
    _workbenchModel.getDatabases().getContent().add(neo4jRemoteRepository);

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

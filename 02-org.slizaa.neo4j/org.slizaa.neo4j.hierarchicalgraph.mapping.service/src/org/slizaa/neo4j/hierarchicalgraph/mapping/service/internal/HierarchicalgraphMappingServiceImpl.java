package org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal.GraphFactoryFunctions.createDependencies;
import static org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal.GraphFactoryFunctions.createFirstLevelElements;
import static org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal.GraphFactoryFunctions.createHierarchy;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.IDependencySource;
import org.slizaa.hierarchicalgraph.INodeSource;
import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;
import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.HierarchicalGraphMappingException;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.IHierarchicalGraphMappingService;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@Component
public class HierarchicalgraphMappingServiceImpl implements IHierarchicalGraphMappingService {

  /** create the node source creator function */
  static Function<Long, INodeSource>                 createNodeSourceFunction       = (id) -> {

                                                                                      // create the node source
                                                                                      INodeSource nodeSource = Neo4jHierarchicalgraphFactory.eINSTANCE
                                                                                          .createNeo4JBackedNodeSource();
                                                                                      nodeSource.setIdentifier(id);

                                                                                      // return the result
                                                                                      return nodeSource;
                                                                                    };

  /** the node source creator function */
  static BiFunction<Long, String, IDependencySource> createDependencySourceFunction = (id, type) -> {

                                                                                      // create the dependency
                                                                                      // source
                                                                                      Neo4JBackedDependencySource dependencySource = Neo4jHierarchicalgraphFactory.eINSTANCE
                                                                                          .createNeo4JBackedDependencySource();
                                                                                      dependencySource
                                                                                          .setIdentifier(id);

                                                                                      // set the type
                                                                                      dependencySource.setType(type);

                                                                                      // return the result
                                                                                      return dependencySource;
                                                                                    };

  @Override
  public HGRootNode convert(HierarchicalGraphMappingDescriptor mappingDescriptor,
      final Neo4JRemoteRepository remoteRepository, IProgressMonitor progressMonitor)
      throws HierarchicalGraphMappingException {

    checkNotNull(mappingDescriptor);
    checkNotNull(remoteRepository);

    // create the sub monitor
    SubMonitor subMonitor = progressMonitor != null ? SubMonitor.convert(progressMonitor, 100) : null;

    // create the root element
    final HGRootNode rootNode = HierarchicalgraphFactory.eINSTANCE.createHGRootNode();
    Neo4JBackedRootNodeSource rootNodeSource = Neo4jHierarchicalgraphFactory.eINSTANCE
        .createNeo4JBackedRootNodeSource();
    rootNodeSource.setIdentifier(-1l);
    rootNodeSource.setRepository(remoteRepository);
    rootNode.setNodeSource(rootNodeSource);

    // create the future lists
    List<Future<JsonObject>> rootQueries = new LinkedList<>();
    List<Future<JsonObject>> hierachyQueries = new LinkedList<>();
    List<DependencyQueryHolder> dependencyQueries = new LinkedList<>();

    // process root, hierarchy and dependency queries
    mappingDescriptor.getRootMappings().forEach((cypherQuery) -> {
      rootQueries.add(remoteRepository.executeCypherQuery(cypherQuery));
    });
    mappingDescriptor.getHierarchyMappings().forEach((cypherQuery) -> {
      hierachyQueries.add(remoteRepository.executeCypherQuery(cypherQuery));
    });
    mappingDescriptor.getDependencyMappings().forEach((dependencyMapping) -> {
      dependencyQueries.add(new DependencyQueryHolder(dependencyMapping,
          remoteRepository.executeCypherQuery(dependencyMapping.getMainQuery())));
    });

    //
    SubMonitor rootLoopMonitor = subMonitor != null ? subMonitor.split(33).setWorkRemaining(rootQueries.size()) : null;

    rootQueries.forEach((f) -> {
      try {
        SubMonitor iterationMonitor = rootLoopMonitor != null ? rootLoopMonitor.split(1) : null;
        iterationMonitor.setTaskName("Requesting root nodes...");
        JsonArray jsonArray = f.get().getAsJsonArray("data");
        iterationMonitor.setTaskName("Creating root nodes...");
        createFirstLevelElements(jsonArray, rootNode, createNodeSourceFunction, iterationMonitor);
      } catch (Exception e) {
        throw new HierarchicalGraphMappingException(e);
      }
    });

    //
    SubMonitor hierarchyLoopMonitor = subMonitor != null ? subMonitor.split(33).setWorkRemaining(hierachyQueries.size())
        : null;

    hierachyQueries.forEach((f) -> {
      try {
        SubMonitor iterationMonitor = hierarchyLoopMonitor != null ? hierarchyLoopMonitor.split(1) : null;
        iterationMonitor.setTaskName("Requesting nodes...");
        JsonArray jsonArray = f.get().getAsJsonArray("data");
        iterationMonitor.setTaskName("Creating nodes...");
        createHierarchy(jsonArray, rootNode, createNodeSourceFunction, iterationMonitor);
      } catch (Exception e) {
        throw new HierarchicalGraphMappingException(e);
      }
    });

    //
    SubMonitor dependencyLoopMonitor = subMonitor != null
        ? subMonitor.split(33).setWorkRemaining(dependencyQueries.size()) : null;

    dependencyQueries.forEach((dependencyQuery) -> {
      try {
        SubMonitor iterationMonitor = hierarchyLoopMonitor != null ? dependencyLoopMonitor.split(1) : null;
        iterationMonitor.setTaskName("Requesting dependencies...");
        JsonArray jsonArray = dependencyQuery.getFuture().get().getAsJsonArray("data");
        iterationMonitor.setTaskName("Creating dependencies...");
        createDependencies(jsonArray, rootNode, createDependencySourceFunction,
            dependencyQuery.getDepencyMapping().isAggregatedCoreDependency(), false, iterationMonitor);
      } catch (Exception e) {
        throw new HierarchicalGraphMappingException(e);
      }
    });

    // set label provider
    rootNode.registerExtension(IItemLabelProvider.class,
        new MappingDescriptorBasedItemLabelProviderImpl(mappingDescriptor));

    // set aggregated core dependency resolver
    rootNode.registerExtension(IAggregatedCoreDependencyResolver.class, new CustomAggregatedDependencyResolver());

    //
    return addEditingDomain(rootNode);
  }

  /**
   * <p>
   * </p>
   *
   * @param rootNode
   * @return
   */
  private HGRootNode addEditingDomain(HGRootNode rootNode) {

    //
    Resource resource = new ResourceSetImpl().createResource(URI.createURI("memory://localhost/hierarchicalgraph"));

    //
    BasicCommandStack basicCommandStack = new BasicCommandStack();
    AdapterFactoryEditingDomain adapterFactoryEditingDomain = new AdapterFactoryEditingDomain(
        new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE), basicCommandStack);
    resource.eAdapters().add(new AdapterFactoryEditingDomain.EditingDomainProvider(adapterFactoryEditingDomain));

    //
    resource.getContents().add(rootNode);

    //
    return rootNode;
  }
}

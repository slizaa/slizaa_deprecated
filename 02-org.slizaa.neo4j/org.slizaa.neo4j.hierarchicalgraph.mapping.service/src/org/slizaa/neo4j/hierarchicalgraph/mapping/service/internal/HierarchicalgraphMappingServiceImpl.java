package org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal.GraphFactoryFunctions.createDependencies;
import static org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal.GraphFactoryFunctions.createFirstLevelElements;
import static org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal.GraphFactoryFunctions.createHierarchy;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.osgi.service.component.annotations.Component;
import org.slizaa.hierarchicalgraph.DefaultHGNodeSource;
import org.slizaa.hierarchicalgraph.HGDependencySource;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;
import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.HierarchicalGraphMappingException;
import org.slizaa.neo4j.hierarchicalgraph.mapping.service.IHierarchicalGraphMappingService;

import com.google.common.base.Stopwatch;
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
  private Function<Long, HGNodeSource>                 createNodeSourceFunction       = (id) -> {

                                                                                        // create the node source
                                                                                        HGNodeSource nodeSource = Neo4jHierarchicalgraphFactory.eINSTANCE
                                                                                            .createNeo4JBackedNodeSource();
                                                                                        nodeSource.setIdentifier(id);

                                                                                        // return the result
                                                                                        return nodeSource;
                                                                                      };

  /** the node source creator function */
  private BiFunction<Long, String, HGDependencySource> createDependencySourceFunction = (id, type) -> {

                                                                                        // create the dependency source
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

    // create the root element
    final HGRootNode rootNode = HierarchicalgraphFactory.eINSTANCE.createHGRootNode();
    Neo4JBackedRootNodeSource rootNodeSource = Neo4jHierarchicalgraphFactory.eINSTANCE.createNeo4JBackedRootNodeSource();
    rootNodeSource.setIdentifier(-1l);
    rootNodeSource.setRepository(remoteRepository);
    rootNode.setNodeSource(rootNodeSource);
    
    //
    Stopwatch stopwatch = Stopwatch.createStarted();

    // create the future lists
    List<Future<JsonObject>> rootQueries = new LinkedList<Future<JsonObject>>();
    List<Future<JsonObject>> hierachyQueries = new LinkedList<Future<JsonObject>>();
    List<Future<JsonObject>> dependencyQueries = new LinkedList<Future<JsonObject>>();

    // process the root queries
    mappingDescriptor.getRootMappings().forEach((cypherQuery) -> {
      rootQueries.add(remoteRepository.executeCypherQuery(cypherQuery.getCypherQuery()));
    });

    // process the hierarchy queries
    mappingDescriptor.getHierarchyMappings().forEach((cypherQuery) -> {
      hierachyQueries.add(remoteRepository.executeCypherQuery(cypherQuery));
    });

    // process the dependency queries
    mappingDescriptor.getDependencyMappers().forEach((cypherQuery) -> {
      dependencyQueries.add(remoteRepository.executeCypherQuery(cypherQuery));
    });

    System.out.println("Compute root queries " + stopwatch.elapsed(TimeUnit.MILLISECONDS));

    // create the hierarchy
    rootQueries.forEach((f) -> {
      try {
        System.out.println("Compute root queries " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
        createFirstLevelElements(f.get().getAsJsonArray("data"), rootNode, createNodeSourceFunction);
        System.out.println("Done " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
      } catch (Exception e) {
        throw new HierarchicalGraphMappingException(e);
      }
    });

    System.out.println("Compute hierarchies queries " + stopwatch.elapsed(TimeUnit.MILLISECONDS));

    hierachyQueries.forEach((f) -> {
      try {
        System.out.println("Compute hierarchies queries " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
        createHierarchy(f.get().getAsJsonArray("data"), rootNode, createNodeSourceFunction);
        System.out.println("Done " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
      } catch (Exception e) {
        throw new HierarchicalGraphMappingException(e);
      }
    });

    System.out.println("Compute dependencies " + stopwatch.elapsed(TimeUnit.MILLISECONDS));

    dependencyQueries.forEach((f) -> {
      try {
        System.out.println("Create dependencies " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
        createDependencies(f.get().getAsJsonArray("data"), rootNode, createDependencySourceFunction);
        System.out.println("Done " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
      } catch (Exception e) {
        throw new HierarchicalGraphMappingException(e);
      }
    });

    //
    stopwatch.stop();
    System.out.println("Model created in " + stopwatch.elapsed(TimeUnit.MILLISECONDS));

    // set label provider
    rootNode.setItemLabelProvider(new MappingDescriptorBasedItemLabelProviderImpl(mappingDescriptor));

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

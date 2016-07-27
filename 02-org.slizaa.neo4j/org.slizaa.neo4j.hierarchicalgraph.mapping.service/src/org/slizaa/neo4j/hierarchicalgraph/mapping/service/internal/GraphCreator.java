package org.slizaa.neo4j.hierarchicalgraph.mapping.service.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.function.Function;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.slizaa.hierarchicalgraph.Factory;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.impl.ExtendedHGRootNodeImpl;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;

public class GraphCreator {

  /** the root artifact */
  private HGRootNode _rootElement;

  /**
   * <p>
   * Creates a new instance of type {@link GraphCreator}.
   * </p>
   */
  public GraphCreator(Neo4JRemoteRepository remoteService) {

    checkNotNull(remoteService);

    //
    this._rootElement = HierarchicalgraphFactory.eINSTANCE.createHGRootNode();
    Neo4JBackedRootNodeSource rootNodeSource = Neo4jHierarchicalgraphFactory.eINSTANCE.createNeo4JBackedRootNodeSource();
    rootNodeSource.setIdentifier(-1l);
    rootNodeSource.setRepository(remoteService);
    _rootElement.setNodeSource(rootNodeSource);
    
    //
    Resource resource = new ResourceSetImpl().createResource(URI.createURI("memory://localhost/hierarchicalgraph"));

    //
    BasicCommandStack basicCommandStack = new BasicCommandStack();
    AdapterFactoryEditingDomain adapterFactoryEditingDomain = new AdapterFactoryEditingDomain(
        new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE), basicCommandStack);
    resource.eAdapters().add(new AdapterFactoryEditingDomain.EditingDomainProvider(adapterFactoryEditingDomain));
    
    resource.getContents().add(_rootElement);
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public HGRootNode getRootNode() {
    return this._rootElement;
  }

  public HGNode createNodeIfAbsent(final Long identifier, final HGNode parent,
      final Function<Long, HGNodeSource> nodeSourceCreator) {

    checkNotNull(identifier);

    try {

      //

      HGNode newNode = ((ExtendedHGRootNodeImpl) _rootElement).getIdToNodeMap().get(identifier);
      if (newNode == null) {

        // create new node
        newNode = HierarchicalgraphFactory.eINSTANCE.createHGNode();
        newNode.setNodeSource(nodeSourceCreator.apply(identifier));
        newNode.setParent(parent);

        // put in cache
        ((ExtendedHGRootNodeImpl) _rootElement).getIdToNodeMap().put(identifier, newNode);
      }

      // may be the node has been created before - so we have to set the parent yet...
      else if (newNode.getParent() == null) {
        newNode.setParent(parent);
      }

      //
      return newNode;

    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  public HGDependency createDependency(Long from, Long to, String string) {

    // get the from...
    HGNode fromElement = ((ExtendedHGRootNodeImpl) _rootElement).getIdToNodeMap().get(from);
    if (fromElement == null) {
      return null;
    }

    // ...and to nodes
    HGNode toElement = ((ExtendedHGRootNodeImpl) _rootElement).getIdToNodeMap().get(to);
    if (toElement == null) {
      return null;
    }

    //
    return Factory.createDependency(fromElement, toElement);
  }
}

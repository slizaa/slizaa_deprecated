package org.slizaa.neo4j.testfwk.internal.exporter;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

public class XmiUtils {

  /**
   * <p>
   * </p>
   *
   * @param fileName
   * @return
   */
  public static HGRootNode load(String fileName) {

    // register extension
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("hggraph", new XMIResourceFactoryImpl());

    // Obtain a new resource set
    ResourceSet resSet = new ResourceSetImpl();

    // Get the resource
    Resource resource = resSet.getResource(URI.createFileURI(fileName), true);

    //
    return (HGRootNode) resource.getContents().get(0);
  }

  /**
   * <p>
   * </p>
   *
   * @param fileName
   * @param rootNode
   * @throws IOException
   */
  public static void save(String fileName, HGRootNode rootNode) throws IOException {

    //
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("hggraph", new XMIResourceFactoryImpl());

    ResourceSet resSet = new ResourceSetImpl();
    Resource resource = resSet.createResource(URI.createFileURI(fileName));
    resource.getContents().add(rootNode);

    //
    for (Iterator<?> iter = EcoreUtil.getAllContents(Collections.singleton(rootNode)); iter.hasNext();) {

      Object containedElement = iter.next();

      //
      if (containedElement instanceof HGNode) {
        HGNode node = (HGNode) containedElement;
        resource.getContents().addAll(node.getOutgoingCoreDependencies());
      }
    }

    resource.save(Collections.EMPTY_MAP);
  }
}

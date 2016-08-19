package org.slizaa.hierarchicalgraph.util;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;

public class XmiUtils {

  /**
   * <p>
   * </p>
   *
   * @param fileName
   * @return
   * @throws IOException 
   */
  public static HGRootNode load(String fileName) throws IOException {
  
    // register extension
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("hggraph", new XMIResourceFactoryImpl());
  
    // Obtain a new resource set
    //    ResourceSet resSet = new ResourceSetImpl();
    // Get the resource
    //    Resource resource = resSet.getResource(URI.createFileURI(fileName), true);
  
    ResourceImpl resource = new XMIResourceImpl();
    resource.load(XmiUtils.class.getClassLoader().getResourceAsStream(fileName), null);
    
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
  
        for (List<HGDependency> dependencies : node.getOutgoingCoreDependenciesMap().values()) {
          System.out.println(dependencies);
          resource.getContents().addAll(dependencies);
        }
      }
    }
  
    resource.save(Collections.EMPTY_MAP);
  }
}

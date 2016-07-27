package org.slizaa.hierarchicalgraph;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class MainSave {

  public static void main(String[] args) throws IOException {
    //
    HGRootNode _rootNode = HierarchicalgraphFactory.eINSTANCE.createHGRootNode();
   HGNode  _child = Factory.createNode(_rootNode);
   HGNode  _child2 = Factory.createNode(_rootNode);
   HGNode  _grandChild = Factory.createNode(_child);
   HGNode _grandChild2 = Factory.createNode(_child2);
   HGNode _greatGrandChild = Factory.createNode(_grandChild);
   HGNode _greatGrandChild2 = Factory.createNode(_grandChild2);

    Factory.createDependency(_child, _child2);
    Factory.createDependency(_grandChild, _grandChild2);
    Factory.createDependency(_greatGrandChild, _greatGrandChild2);
    
    saveData("C:\\temp\\emf.hggraph", _rootNode);
  }
  
  public static void saveData(String fileName, HGRootNode rootNode) throws IOException {
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("hggraph", new XMIResourceFactoryImpl());

    ResourceSet resSet = new ResourceSetImpl();
    Resource resource = resSet.createResource(URI.createFileURI(fileName));
    resource.getContents().add(rootNode);
    resource.save(Collections.EMPTY_MAP);
  }
}

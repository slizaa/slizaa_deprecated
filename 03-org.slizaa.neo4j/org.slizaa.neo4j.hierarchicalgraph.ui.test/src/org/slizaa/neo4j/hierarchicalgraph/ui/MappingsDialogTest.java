package org.slizaa.neo4j.hierarchicalgraph.ui;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.slizaa.neo4j.dbadapter.dsl.DbAdapterDslStandaloneSetup;
import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.MappingDslStandaloneSetup;
import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;
import org.slizaa.testfwk.ui.AbstractSlizaaPartTest;

public class MappingsDialogTest extends AbstractSlizaaPartTest {

  @Test
  public void test() throws IOException {

    //
    MappingDslStandaloneSetup.doSetup();
    DbAdapterDslStandaloneSetup.doSetup();
    
    ResourceSet resourceSet = new ResourceSetImpl();
    URI uri = URI.createFileURI("src/org/slizaa/neo4j/hierarchicalgraph/ui/SimpleFlatPackagesMapping.mapping");
    Resource resource = resourceSet.getResource(uri, true);
    MappingDescriptor mappingDescriptor = (MappingDescriptor) resource.getContents().get(0);
    
    //
    System.out.println(mappingDescriptor);
//    for (org.xtext.example.myDsl.Class clazz : model.getElements()) {
//     System.out.println(clazz.getName());  
//    }
    
//    XtextParser parser = new XtextParser();
//    MappingDescriptor mappingDescriptor = (MappingDescriptor) parser
//        .parse(this.getClass().getResource("SimpleFlatPackagesMapping.mapping").openStream());
//
//    //
//    System.out.println(mappingDescriptor);
  }
}
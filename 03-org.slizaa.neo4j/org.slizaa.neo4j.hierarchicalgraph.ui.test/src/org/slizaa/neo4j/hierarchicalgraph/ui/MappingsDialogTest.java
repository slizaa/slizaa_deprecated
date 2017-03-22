package org.slizaa.neo4j.hierarchicalgraph.ui;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.junit.Test;
import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.MappingDslStandaloneSetup;
import org.slizaa.neo4j.hierarchicalgraph.mapping.dsl.mappingDsl.MappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.mappingsdialog.SelectMappingDialog;
import org.slizaa.neo4j.hierarchicalgraph.ui.provider.HierarchicalGraphUIItemProviderAdapterFactory;
import org.slizaa.testfwk.ui.AbstractSlizaaPartTest;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;

public class MappingsDialogTest extends AbstractSlizaaPartTest {

  @Override
  protected void configureTestAdapterFactory(ComposedAdapterFactory composedAdapterFactory) {
    composedAdapterFactory.addAdapterFactory(new HierarchicalGraphUIItemProviderAdapterFactory());
  }

  @Test
  public void test() throws IOException {

    //
    MappingDslStandaloneSetup.doSetup();

    // create the mapping descriptor
    ResourceSet resourceSet = new ResourceSetImpl();

    URI uri = URI.createFileURI("testdata/SimpleFlatPackagesMapping.mapping");
    // URI uri = URI.createURI("classpath:testdata/SimpleFlatPackagesMapping.mapping");
    Resource resource = resourceSet.getResource(uri, true);
    MappingDescriptor mappingDescriptor = (MappingDescriptor) resource.getContents().get(0);
    System.out.println(mappingDescriptor);

    //
    BundleBasedMappingDescriptor descriptor = HierarchicalGraphUIFactory.eINSTANCE.createBundleBasedMappingDescriptor();
    descriptor.setMappingDescriptor(mappingDescriptor);

    //
    MappingDescriptorContainer container = HierarchicalGraphUIFactory.eINSTANCE.createMappingDescriptorContainer();
    MappingDescriptorList mappingDescriptorList = HierarchicalGraphUIFactory.eINSTANCE.createMappingDescriptorList();
    mappingDescriptorList.setName("Built-In Mappings");
    container.setBundleBasedMappingDescriptors(mappingDescriptorList);
    container.getBundleBasedMappingDescriptors().getMappingDescriptors().add(descriptor);
    
    mappingDescriptorList = HierarchicalGraphUIFactory.eINSTANCE.createMappingDescriptorList();
    mappingDescriptorList.setName("User-Defined Mappings");
    container.setWorkspaceBasedMappingDescriptors(mappingDescriptorList);

//    //
//    ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
//        new HierarchicalGraphUIItemProviderAdapterFactory());
//
//    AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(composedAdapterFactory);
//    AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(composedAdapterFactory);

    //
    SelectMappingDialog dialog = new SelectMappingDialog(shell(), container);
    dialog.open();
  }
}
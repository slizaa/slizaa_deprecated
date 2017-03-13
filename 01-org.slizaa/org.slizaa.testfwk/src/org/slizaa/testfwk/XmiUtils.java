package org.slizaa.testfwk;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

public class XmiUtils {

  /**
   * <p>
   * </p>
   *
   * @param fileName
   * @return
   * @throws IOException
   */
  public static HGRootNode load(String fileName) {

    //
    HierarchicalgraphPackage packageInstance = HierarchicalgraphPackage.eINSTANCE;

    // register extension
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("hggraph", new XMIResourceFactoryImpl());

    // Obtain a new resource set
    // ResourceSet resSet = new ResourceSetImpl();
    // Get the resource
    // Resource resource = resSet.getResource(URI.createFileURI(fileName), true);

    ResourceImpl resource = new XMIResourceImpl();
    InputStream inputStream = AbstractXmiBasedTest.class.getClassLoader().getResourceAsStream(fileName);
    assertThat(inputStream).isNotNull();
    try {
      resource.load(inputStream, null);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    //
    return (HGRootNode) resource.getContents().get(0);
  }
}

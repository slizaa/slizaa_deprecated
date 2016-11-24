package org.slizaa.neo4j.hierarchicalgraph.mapping.service;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.testfwk.AbstractRemoteRepositoryTest;

public abstract class AbstractMappingServiceTest extends AbstractRemoteRepositoryTest {

  private static final String                DEFAULT_MAPPING = "org/slizaa/neo4j/hierarchicalgraph/mapping/service/default.mapping";

  /** - */
  private IHierarchicalGraphMappingService   _mappingService;

  /** - */
  private HierarchicalGraphMappingDescriptor _mappingDescriptor;

  /**
   * <p>
   * Creates a new instance of type {@link AbstractMappingServiceTest}.
   * </p>
   *
   * @param mappingDescriptionFile
   */
  public AbstractMappingServiceTest(String mappingDescriptionFile) {
    _mappingDescriptor = load(checkNotNull(mappingDescriptionFile));
  }

  /**
   * <p>
   * Creates a new instance of type {@link AbstractMappingServiceTest}.
   * </p>
   */
  public AbstractMappingServiceTest() {
    this(DEFAULT_MAPPING);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void init() throws Exception {
    super.init();

    //
    _mappingService = IHierarchicalGraphMappingService.createHierarchicalgraphMappingService();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void dispose() {
    super.dispose();

    _mappingService = null;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public IHierarchicalGraphMappingService mappingService() {
    return _mappingService;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public HierarchicalGraphMappingDescriptor mappingDescriptor() {
    return _mappingDescriptor;
  }

  /**
   * <p>
   * </p>
   *
   * @param fileName
   * @return
   * @throws IOException
   */
  public HierarchicalGraphMappingDescriptor load(String fileName) {

    // register extension
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("mapping", new XMIResourceFactoryImpl());

    ResourceImpl resource = new XMIResourceImpl();
    InputStream inputStream = AbstractMappingServiceTest.class.getClassLoader().getResourceAsStream(fileName);
    assertThat(inputStream).isNotNull();

    try {
      resource.load(inputStream, null);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    //
    return (HierarchicalGraphMappingDescriptor) resource.getContents().get(0);
  }

  /**
   * <p>
   * </p>
   *
   * @param fileName
   * @param rootNode
   * @throws IOException
   */
  public void save(String fileName, EObject eObject) {

    //
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("mapping", new XMIResourceFactoryImpl());

    ResourceSet resSet = new ResourceSetImpl();
    Resource resource = resSet.createResource(URI.createFileURI(fileName));
    resource.getContents().add(eObject);

    try {
      resource.save(Collections.EMPTY_MAP);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}

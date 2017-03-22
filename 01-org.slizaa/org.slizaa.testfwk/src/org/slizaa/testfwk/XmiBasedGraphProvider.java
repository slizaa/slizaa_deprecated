package org.slizaa.testfwk;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class XmiBasedGraphProvider implements IHierarchicalGraphProvider {

  /** the root node */
  private HGRootNode _rootNode;

  /** - */
  private String     _xmiModelPath;

  /**
   * <p>
   * Creates a new instance of type {@link XmiBasedGraphProvider}.
   * </p>
   *
   * @param _miModelPath
   */
  public XmiBasedGraphProvider(String xmiModelPath) {
    this._xmiModelPath = checkNotNull(xmiModelPath);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setup() throws IOException {
    _rootNode = load(_xmiModelPath);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void dispose() throws IOException {
    //
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public HGNode node(Long id) {
    return _rootNode.lookupNode(checkNotNull(id));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public HGNode node(long id) {
    return _rootNode.lookupNode(new Long(id));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public HGRootNode rootNode() {
    return _rootNode;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void dumpChildren(HGNode hgNode) {
    for (HGNode node : checkNotNull(hgNode).getChildren()) {
      System.out.println(node.getIdentifier() + " : " + HGNodeUtils.getProperties(node));
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param fileName
   * @return
   */
  private static HGRootNode load(String fileName) {

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

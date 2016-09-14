package org.slizaa.hierarchicalgraph.algorithms;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.junit.Before;
import org.slizaa.hierarchicalgraph.DefaultHGNodeSource;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGNodeSource;
import org.slizaa.hierarchicalgraph.HGRootNode;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public abstract class AbstractXmiBasedTest {

  /** - */
  private HGRootNode _rootNode;

  /** - */
  private String     _xmiModelPath;

  /**
   * <p>
   * Creates a new instance of type {@link AbstractXmiBasedTest}.
   * </p>
   *
   * @param _miModelPath
   */
  public AbstractXmiBasedTest(String xmiModelPath) {
    this._xmiModelPath = checkNotNull(xmiModelPath);
  }

  /**
   * <p>
   * </p>
   *
   * @throws IOException
   */
  @Before
  public void setup() throws IOException {
    _rootNode = load(_xmiModelPath);
    // dumpChildren(node(new Long(6308)));
  }

  /**
   * <p>
   * </p>
   *
   * @param id
   * @return
   */
  public HGNode node(Long id) {
    return _rootNode.lookupNode(checkNotNull(id));
  }

  public HGNode node(long id) {
    return _rootNode.lookupNode(new Long(id));
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public HGRootNode rootNode() {
    return _rootNode;
  }

  /**
   * <p>
   * </p>
   *
   * @param node
   * @return
   */
  public Map<String, String> getProperties(HGNode node) {

    //
    HGNodeSource nodeSource = (HGNodeSource) node.getNodeSource();

    //
    if (nodeSource instanceof DefaultHGNodeSource) {
      return ((DefaultHGNodeSource) nodeSource).getProperties().map();
    }

    //
    else {
      return Collections.emptyMap();
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param hgNode
   */
  protected void dumpChildren(HGNode hgNode) {
    for (HGNode node : checkNotNull(hgNode).getChildren()) {
      System.out.println(node.getIdentifier() + " : " + getProperties(node));
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param fileName
   * @return
   * @throws IOException
   */
  public HGRootNode load(String fileName) throws IOException {

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
    resource.load(inputStream, null);

    //
    return (HGRootNode) resource.getContents().get(0);
  }

}

package org.slizaa.testfwk.ui;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.provider.HierarchicalgraphItemProviderAdapterFactory;
import org.slizaa.hierarchicalgraph.spi.INodeLabelProvider;
import org.slizaa.testfwk.AbstractXmiBasedTest;
import org.slizaa.ui.tree.internal.Activator;

@RunWith(SWTBotJunit4ClassRunner.class)
public abstract class AbstractSlizaaPartTest extends AbstractXmiBasedTest {

  /** - */
  private Shell   _shell;

  /** - */
  private Display _display;

  /** - */
  private SWTBot  _swtbot;

  /**
   * <p>
   * Creates a new instance of type {@link ${enclosing_type}}.
   * </p>
   */
  public AbstractSlizaaPartTest() {
    super("eureka_1-4-10.hggraph");
  }

  /**
   * {@inheritDoc}
   */
  @Before
  public final void setup() throws IOException {
    super.setup();

    MockitoAnnotations.initMocks(this);
    
    // manual add the adapter factory
    ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory();
    adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new HierarchicalgraphItemProviderAdapterFactory());
    Activator.setComposedAdapterFactory(adapterFactory);
    
    _display = new Display();
    _shell = new Shell(_display);
    _shell.setLayout(new FillLayout());
    _shell.setSize(800, 400);

    //
    onPrepareRootNode(rootNode());

    //
    onSetup(_shell);
    
    //
    shell().open();

    // create SWTBot
    _swtbot = new SWTBot(shell());
  }

  /**
   * <p>
   * </p>
   */
  protected void onPrepareRootNode(HGRootNode rootNode) {
    rootNode.registerExtension(INodeLabelProvider.class, new TestNodeLabelProvider());    
  }

  /**
   * <p>
   * </p>
   */
  protected abstract void onSetup(Shell shell);

  /**
   * <p>
   * </p>
   */
  @After
  public final void dispose() throws IOException {
    _display.dispose();
  }

  /**
   * <p>
   * </p>
   */
  public final SWTBot swtbot() {
    return _swtbot;
  }

  /**
   * <p>
   * </p>
   */
  public final Shell shell() {
    return _shell;
  }

  /**
   * <p>
   * </p>
   */
  public final Display display() {
    return _display;
  }

  /**
   * <p>
   * </p>
   */
  public final Set<AbstractHGDependency> toAbstractHGDependencySet(Collection<? extends AbstractHGDependency> collection) {
    return new HashSet<>(collection);
  }
  
  /**
   * <p>
   * </p>
   */
  public final void displaySleep() {
    while (!shell().isDisposed()) {
      if (!display().readAndDispatch())
        display().sleep();
    }
  }
}
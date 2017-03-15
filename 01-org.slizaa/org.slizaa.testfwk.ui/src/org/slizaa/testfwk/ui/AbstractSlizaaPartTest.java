package org.slizaa.testfwk.ui;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.swt.graphics.Image;
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
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

@RunWith(SWTBotJunit4ClassRunner.class)
public abstract class AbstractSlizaaPartTest extends AbstractXmiBasedTest implements IImageProvider {

  /** - */
  private Shell                             _shell;

  /** - */
  private Display                           _display;

  /** - */
  private SWTBot                            _swtbot;

  /** - */
  private IEclipseContext                   _eclipseContext;

  private DefaultActionContributionProvider _defaultActionContributionProvider;

  /** - */
  private LoadingCache<String, Image>       _imageCache;

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

    _eclipseContext = EclipseContextFactory.create();
    _defaultActionContributionProvider = new DefaultActionContributionProvider();

    // manual add the adapter factory
    ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory();
    composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    composedAdapterFactory.addAdapterFactory(new HierarchicalgraphItemProviderAdapterFactory());
    SlizaaTreeViewerFactory.setSlizaaTreeViewerCreator(_defaultActionContributionProvider, composedAdapterFactory,
        () -> _eclipseContext);

    //
    _display = new Display();
    _shell = new Shell(_display);
    _shell.setLayout(new FillLayout());
    _shell.setSize(800, 400);

    //
    _imageCache = CacheBuilder.newBuilder().build(new CacheLoader<String, Image>() {
      public Image load(String key) {
        try {
          try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(key)) {
            if (inputStream != null) {
              return new Image(_display, inputStream);
            } else {
              throw new RuntimeException(String.format("No image for path '%s'.", key));
            }
          }
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
      }
    });

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
    rootNode.registerExtension(INodeLabelProvider.class, new DefaultNodeLabelProvider(this));
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

    // dispose images
    _imageCache.asMap().values().forEach(image -> image.dispose());
    _imageCache.invalidateAll();
    _imageCache = null;

    // dispose display
    _display.dispose();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public final IEclipseContext eclipseContext() {
    return _eclipseContext;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public final DefaultActionContributionProvider defaultActionContributionProvider() {
    return _defaultActionContributionProvider;
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

  public final Image getImage(String path) {
    return _imageCache.getUnchecked(path);
  }

  /**
   * <p>
   * </p>
   */
  public final Set<AbstractHGDependency> toAbstractHGDependencySet(
      Collection<? extends AbstractHGDependency> collection) {
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
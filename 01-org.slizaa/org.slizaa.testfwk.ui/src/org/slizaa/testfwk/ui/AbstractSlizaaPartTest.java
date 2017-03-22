package org.slizaa.testfwk.ui;

import java.io.IOException;
import java.io.InputStream;

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
import org.slizaa.hierarchicalgraph.provider.HierarchicalgraphItemProviderAdapterFactory;
import org.slizaa.ui.tree.SlizaaTreeViewerFactory;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

@RunWith(SWTBotJunit4ClassRunner.class)
public abstract class AbstractSlizaaPartTest implements IImageProvider {

  /** - */
  private Shell                             _shell;

  /** - */
  private Display                           _display;

  /** - */
  private SWTBot                            _swtbot;

  /** - */
  private IEclipseContext                   _eclipseContext;

  /** - */
  private DefaultActionContributionProvider _defaultActionContributionProvider;

  /** - */
  private LoadingCache<String, Image>       _imageCache;

  /**
   * {@inheritDoc}
   */
  @Before
  public void setup() throws IOException {

    MockitoAnnotations.initMocks(this);

    _eclipseContext = EclipseContextFactory.create();
    _defaultActionContributionProvider = new DefaultActionContributionProvider();

    // manual add the adapter factory
    ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory();
    composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    composedAdapterFactory.addAdapterFactory(new HierarchicalgraphItemProviderAdapterFactory());
    configureTestAdapterFactory(composedAdapterFactory);
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
    onSetup(_shell);

    //
    shell().open();

    // create SWTBot
    _swtbot = new SWTBot(shell());
  }

  protected void configureTestAdapterFactory(ComposedAdapterFactory composedAdapterFactory) {
    //
  }

  /**
   * <p>
   * </p>
   */
  protected void onSetup(Shell shell) {
    //
  }

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

  /**
   * {@inheritDoc}
   */
  public final Image getImage(String path) {
    return _imageCache.getUnchecked(path);
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
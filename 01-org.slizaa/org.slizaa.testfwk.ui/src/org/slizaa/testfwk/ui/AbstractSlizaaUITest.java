package org.slizaa.testfwk.ui;

import java.io.InputStream;

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

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

@RunWith(SWTBotJunit4ClassRunner.class)
public abstract class AbstractSlizaaUITest implements IImageProvider, SlizaaUITest {

  /** - */
  private SWTBot                      _swtbot;

  /** - */
  private Shell                       _shell;

  /** - */
  private Display                     _display;

  /** - */
  private LoadingCache<String, Image> _imageCache;

  @Before
  public void setupAbstractSlizaaUITest() {

    //
    MockitoAnnotations.initMocks(this);

    //
    _display = Display.getCurrent() != null ? Display.getCurrent() : new Display();
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
    beforeShellOpens(_shell);

    _shell.open();

    //
    _swtbot = new SWTBot(shell());
  }

  @After
  public void tearAbstractSlizaaUITest() {

    // dispose images
    if (_imageCache != null) {
      _imageCache.asMap().values().forEach(image -> image.dispose());
      _imageCache.invalidateAll();
      _imageCache = null;
    }

    if (_shell != null && !_shell.isDisposed()) {
      _shell.dispose();
      _shell = null;
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param shell
   */
  public void beforeShellOpens(Shell shell) {
    // default
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Shell shell() {
    return _shell;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public Display display() {
    return _display;
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
   *
   * @return
   */
  public LoadingCache<String, Image> imageCache() {
    return _imageCache;
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

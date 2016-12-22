package org.slizaa.neo4j.hierarchicalgraph.ui;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.swt.graphics.Image;
import org.slizaa.neo4j.hierarchicalgraph.ui.internal.Activator;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class OverlayImageRegistry {

  /** - */
  private ImageRegistry _imageRegistry;

  /**
   * <p>
   * Creates a new instance of type {@link OverlayImageRegistry}.
   * </p>
   *
   * @param imageRegistry
   */
  public OverlayImageRegistry(ImageRegistry imageRegistry) {
    _imageRegistry = checkNotNull(imageRegistry);
  }

  /**
   * <p>
   * Creates a new instance of type {@link OverlayImageRegistry}.
   * </p>
   */
  public OverlayImageRegistry() {
    _imageRegistry = Activator.getDefault().getImageRegistry();
  }

  /**
   * <p>
   * </p>
   * 
   * @param basePath
   * @param overlayPaths
   * @param quadrant
   * @return
   */
  public Image getOverlayImage(String basePath, String[] overlayPaths) {

    //
    if (basePath == null) {
      return null;
    }

    //
    if (overlayPaths == null) {
      return getImageRegistry().get(basePath);
    }

    StringBuilder key = new StringBuilder(basePath);
    for (String overlayPath : overlayPaths) {
      key.append(overlayPath != null ? overlayPath : "<null>");
      key.append("|");
    }

    //
    ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key.toString());
    if (imageDescriptor == null) {

      ImageDescriptor[] descriptors = new ImageDescriptor[overlayPaths.length];
      for (int i = 0; i < overlayPaths.length; i++) {
        descriptors[i] = overlayPaths[i] != null ? getImageDescriptor(overlayPaths[i]) : null;
      }

      Image baseImage = getImage(basePath);
      checkNotNull(baseImage, basePath);
      imageDescriptor = new DecorationOverlayIcon(baseImage, descriptors);
      getImageRegistry().put(key.toString(), imageDescriptor);
    }

    //
    return getImageRegistry().get(key.toString());
  }

  /**
   * Returns an image. Clients do not need to dispose the image, it will be disposed automatically.
   * 
   * @return an {@link Image}
   */
  public Image getImage(String path) {
    final ImageRegistry imageRegistry = getImageRegistry();
    Image image = imageRegistry.get(path);
    if (image == null) {
      addImageDescriptor(path);
      image = imageRegistry.get(path);
    }

    return image;
  }

  /**
   * Returns an image descriptor.
   * 
   * @return an {@link ImageDescriptor}
   */
  public ImageDescriptor getImageDescriptor(String path) {
    final ImageRegistry imageRegistry = getImageRegistry();
    ImageDescriptor imageDescriptor = imageRegistry.getDescriptor(path);
    if (imageDescriptor == null) {
      addImageDescriptor(path);
      imageDescriptor = imageRegistry.getDescriptor(path);
    }

    return imageDescriptor;
  }

  public URL getImageUrl(String path) {
    return imageUrl(path);
  }

  /**
   * <p>
   * </p>
   */
  private void addImageDescriptor(String path) {
    final ImageDescriptor id = ImageDescriptor.createFromURL(getImageUrl(path));
    getImageRegistry().put(path, id);
  }

  private URL imageUrl(String path) {

    if (Activator.getDefault() != null) {
      final Activator plugin = Activator.getDefault();

      URL entry = plugin.getBundle().getEntry(path);
      if (entry != null) {
        return entry;
      }
    }
    
    try {
      return new File(path).toURL();
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private ImageRegistry getImageRegistry() {

    //
    if (_imageRegistry == null) {
      throw new RuntimeException();
    }

    // return result
    return _imageRegistry;
  }
}

package org.slizaa.neo4j.hierarchicalgraph.ui.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.swt.graphics.Image;

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
      return _imageRegistry.get(basePath);
    }

    StringBuilder key = new StringBuilder(basePath);
    for (String overlayPath : overlayPaths) {
      key.append(overlayPath != null ? overlayPath : "<null>");
      key.append("|");
    }

    //
    ImageDescriptor imageDescriptor = _imageRegistry.getDescriptor(key.toString());
    if (imageDescriptor == null) {

      ImageDescriptor[] descriptors = new ImageDescriptor[overlayPaths.length];
      for (int i = 0; i < overlayPaths.length; i++) {
        descriptors[i] = overlayPaths[i] != null ? getImageDescriptor(overlayPaths[i]) : null;
      }

      Image baseImage = getImage(basePath);
      checkNotNull(baseImage, basePath);
      imageDescriptor = new DecorationOverlayIcon(baseImage, descriptors);
      _imageRegistry.put(key.toString(), imageDescriptor);
    }

    //
    return _imageRegistry.get(key.toString());
  }

  /**
   * Returns an image. Clients do not need to dispose the image, it will be disposed automatically.
   * 
   * @return an {@link Image}
   */
  public Image getImage(String path) {
    Image image = _imageRegistry.get(path);
    if (image == null) {
      addImageDescriptor(path);
      image = _imageRegistry.get(path);
    }

    return image;
  }

  /**
   * Returns an image descriptor.
   * 
   * @return an {@link ImageDescriptor}
   */
  public ImageDescriptor getImageDescriptor(String path) {
    ImageDescriptor imageDescriptor = _imageRegistry.getDescriptor(path);
    if (imageDescriptor == null) {
      addImageDescriptor(path);
      imageDescriptor = _imageRegistry.getDescriptor(path);
    }

    return imageDescriptor;
  }
  /**
   * <p>
   * </p>
   */
  private void addImageDescriptor(String path) {
    final ImageDescriptor id = ImageDescriptor.createFromURL(imageUrl(path));
    _imageRegistry.put(path, id);
  }

  private URL imageUrl(String path) {
    
    try {
      return new URL(path);
    } catch (MalformedURLException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
//
//    if (Activator.getDefault() != null) {
//      final Activator plugin = Activator.getDefault();
//
//      URL entry = plugin.getBundle().getEntry(path);
//      if (entry != null) {
//        return entry;
//      }
//    }
//
//    try {
//      return new File(path).toURL();
//    } catch (MalformedURLException e) {
//      throw new RuntimeException(e);
//    }
  }
}

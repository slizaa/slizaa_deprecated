package org.slizaa.testfwk.ui;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import org.eclipse.emf.edit.provider.StyledString;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.spi.INodeLabelProvider;
import org.slizaa.testfwk.HGNodeUtils;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class TestNodeLabelProvider implements INodeLabelProvider {

  private final IImageProvider _imageProvider;

  /**
   * <p>
   * Creates a new instance of type {@link TestNodeLabelProvider}.
   * </p>
   *
   * @param imageProvider
   */
  public TestNodeLabelProvider(IImageProvider imageProvider) {
    _imageProvider = checkNotNull(imageProvider);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getText(Object object) {
    return (String) getStyledText(object);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Object getImage(Object object) {
    HGNode hgNode = (HGNode) object;

    //
    List<String> labels = HGNodeUtils.getLabels(hgNode);
    
    //
    String[][] mappings = { { "Artifact", "org/slizaa/testfwk/ui/icons/jar_obj.png" },
        { "Package", "org/slizaa/testfwk/ui/icons/package_obj.png" },
        { "Method", "org/slizaa/testfwk/ui/icons/methdef_obj.png" },
        { "Field", "org/slizaa/testfwk/ui/icons/field_default_obj.png" },
        { "Class", "org/slizaa/testfwk/ui/icons/class_obj.png" },
        { "Annotation", "org/slizaa/testfwk/ui/icons/annotation_obj.png" },
        { "Enum", "org/slizaa/testfwk/ui/icons/enum_obj.png" },
        { "Interface", "org/slizaa/testfwk/ui/icons/int_obj.png" },
        { "Directory", "org/slizaa/testfwk/ui/icons/fldr_obj.png" },
        { "File", "org/slizaa/testfwk/ui/icons/file_obj.png" } };

    //
    for (String[] mapping : mappings) {
      if (labels.contains(mapping[0])) {
        return _imageProvider.getImage(mapping[1]);
      }
    }

    //
    return null;

  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Object getStyledText(Object object) {

    HGNode hgNode = (HGNode) object;

    //
    List<String> labels = HGNodeUtils.getLabels(hgNode);

    //
    String[][] mappings = { { "Artifact", "fileName" }, { "Package", "fqn" }, { "Method", "signature" },
        { "Field", "name" }, { "Class", "name" }, { "Annotation", "name" }, { "Enum", "name" }, { "Interface", "name" },
        { "Directory", "fileName" }, { "File", "fileName" } };

    //
    for (String[] mapping : mappings) {
      if (labels.contains(mapping[0])) {
        return new StyledString(HGNodeUtils.getProperties(hgNode).get((mapping[1])));
      }
    }

    //
    return new StyledString(HGNodeUtils.getLabels((HGNode) object).toString());
  }

}

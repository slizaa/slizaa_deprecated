/*******************************************************************************
 * Copyright (c) Gerd Wütherich 2012-2016.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *    Gerd Wütherich (gerd@gerd-wuetherich.de) - initial API and implementation
 ******************************************************************************/
package org.slizaa.neo4j.hierarchicalgraph.ui;

import static com.google.common.base.Preconditions.checkNotNull;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemStyledLabelProvider;
import org.eclipse.emf.edit.provider.StyledString;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper;
import org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper;
import org.slizaa.neo4j.hierarchicalgraph.mappingdsl.mappingDsl.MappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mappingdsl.mappingDsl.NodeVisualizationDefinition;

public class MappingDescriptorBasedItemLabelProviderImpl implements IItemLabelProvider, IItemStyledLabelProvider {

  private OverlayImageRegistry _imageRegistry;

  private MappingDescriptor    _descriptor;

  /**
   * <p>
   * Creates a new instance of type {@link MappingDescriptorBasedItemLabelProviderImpl}.
   * </p>
   *
   * @param imageRegistry
   */
  public MappingDescriptorBasedItemLabelProviderImpl(MappingDescriptor descriptor) {
    _imageRegistry = new OverlayImageRegistry();
    _descriptor = descriptor;
  }

  @Override
  public Object getStyledText(Object object) {
    return new StyledString(getText(object));
  }

  @Override
  public String getText(Object object) {
    Neo4JBackedNodeSource nodeSource = getNodeSource(object);
    LabelDefinition labelDefinition = getLabelDefinition(nodeSource);
    if (nodeSource.getLabels().contains("Method")) {
      return new MethodSignatureParser().parse(labelDefinition.text) + " (" + nodeSource.getIdentifier() + ")";
    }
    return labelDefinition.text /* + " (" + nodeSource.getIdentifier() + ")" */;
  }

  @Override
  public Object getImage(Object object) {
    Neo4JBackedNodeSource nodeSource = getNodeSource(object);
    LabelDefinition labelDefinition = getLabelDefinition(nodeSource);
    if (labelDefinition.image != null) {
      return _imageRegistry.getOverlayImage(labelDefinition.image, new String[] { labelDefinition.ovl_topLeft,
          labelDefinition.ovl_topRight, labelDefinition.ovl_bottomLeft, labelDefinition.ovl_bottomRight });
    }
    return null;
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  public LabelDefinition getLabelDefinition(Neo4JBackedNodeSource nodeSource) {
    checkNotNull(nodeSource);

    //
    LabelDefinition result = new LabelDefinition();

    result.text = "Node: " + nodeSource.getIdentifier();

    //
    for (NodeVisualizationDefinition visualizationDefinition : _descriptor.getVisualisationDescriptor()
        .getNodeVisualizationDefinition()) {

      // // TODO: cache?
      // if (containsAll(nodeSource.getLabels(), labelMapper.getRequiredNeo4jLabel())) {
      //
      // EMap<String, String> properties = nodeSource.getProperties();
      //
      // // System.out.println("---------------------------------");
      // // System.out.println("Contains all: " + nodeSource.getLabels() + " : " + labelMapper.getRequiredNeo4jLabel());
      // // System.out.println("Properties: " + properties);
      // // System.out.println("---------------------------------");
      // //
      //
      // result.text = properties.get(labelMapper.getTextPropertyName());
      //
      // //
      // if (result.image == null) {
      // result.image = labelMapper.getDefaultImage();
      // }
      //
      // //
      // for (PropertyBasedImageMapper mapper : labelMapper.getPropertyBasedImages()) {
      //
      // //
      // String propertyValue = properties.get(mapper.getPropertyName());
      //
      // if (mapper.getPropertyValue().equals(propertyValue)) {
      //
      // switch (mapper.getPosition()) {
      // case BASE:
      // result.image = mapper.getImage();
      // break;
      // case OVERLAY_BOTTOM_LEFT:
      // result.ovl_bottomLeft = mapper.getImage();
      // break;
      // case OVERLAY_BOTTOM_RIGHT:
      // result.ovl_bottomRight = mapper.getImage();
      // break;
      // case OVERLAY_TOP_LEFT:
      // result.ovl_topLeft = mapper.getImage();
      // break;
      // case OVERLAY_TOP_RIGHT:
      // result.ovl_topRight = mapper.getImage();
      // break;
      // }
      // }
      // }
      //
      // return result;
      // }
    }

    //
    return result;
  }

  /**
   * <p>
   * </p>
   *
   * @param labels
   * @param requiredNeo4jLabel
   * @return
   */
  private boolean containsAll(EList<String> labels, EList<String> requiredNeo4jLabels) {

    for (String requiredNeo4jLabel : requiredNeo4jLabels) {
      if (!labels.contains(requiredNeo4jLabel)) {
        return false;
      }
    }

    //
    return true;
  }

  public Neo4JBackedNodeSource getNodeSource(Object object) {

    //
    if (object instanceof HGNode) {

      //
      HGNode node = ((HGNode) object);

      // TODO check
      return (Neo4JBackedNodeSource) node.getNodeSource();
    }

    //
    return null;
  }

  private class LabelDefinition {

    public String image           = null;

    public String ovl_topRight    = null;

    public String ovl_bottomRight = null;

    public String ovl_topLeft     = null;

    public String ovl_bottomLeft  = null;

    public String text;

    @Override
    public String toString() {
      return "LabelDefinition [image=" + image + ", ovl_topRight=" + ovl_topRight + ", ovl_bottomRight="
          + ovl_bottomRight + ", ovl_topLeft=" + ovl_topLeft + ", ovl_bottomLeft=" + ovl_bottomLeft + ", text=" + text
          + "]";
    }
  }

}

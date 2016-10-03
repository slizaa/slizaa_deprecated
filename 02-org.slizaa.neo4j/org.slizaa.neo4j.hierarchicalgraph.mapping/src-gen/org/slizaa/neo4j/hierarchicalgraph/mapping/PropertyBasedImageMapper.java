/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Based Image Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPosition <em>Position</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getPropertyBasedImageMapper()
 * @model
 * @generated
 */
public interface PropertyBasedImageMapper extends EObject {
  /**
   * Returns the value of the '<em><b>Position</b></em>' attribute.
   * The literals are from the enumeration {@link org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' attribute.
   * @see org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition
   * @see #setPosition(ImagePosition)
   * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getPropertyBasedImageMapper_Position()
   * @model required="true"
   * @generated
   */
  ImagePosition getPosition();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPosition <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' attribute.
   * @see org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition
   * @see #getPosition()
   * @generated
   */
  void setPosition(ImagePosition value);

  /**
   * Returns the value of the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Name</em>' attribute.
   * @see #setPropertyName(String)
   * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getPropertyBasedImageMapper_PropertyName()
   * @model required="true"
   * @generated
   */
  String getPropertyName();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPropertyName <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Name</em>' attribute.
   * @see #getPropertyName()
   * @generated
   */
  void setPropertyName(String value);

  /**
   * Returns the value of the '<em><b>Property Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Value</em>' attribute.
   * @see #setPropertyValue(String)
   * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getPropertyBasedImageMapper_PropertyValue()
   * @model required="true"
   * @generated
   */
  String getPropertyValue();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPropertyValue <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Value</em>' attribute.
   * @see #getPropertyValue()
   * @generated
   */
  void setPropertyValue(String value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' attribute.
   * @see #setImage(String)
   * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getPropertyBasedImageMapper_Image()
   * @model required="true"
   * @generated
   */
  String getImage();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getImage <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' attribute.
   * @see #getImage()
   * @generated
   */
  void setImage(String value);

} // PropertyBasedImageMapper

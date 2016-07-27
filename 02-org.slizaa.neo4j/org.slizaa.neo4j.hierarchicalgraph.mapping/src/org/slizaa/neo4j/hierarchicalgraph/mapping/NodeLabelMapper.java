/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Label Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getRequiredNeo4jLabel <em>Required Neo4j Label</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getDefaultImage <em>Default Image</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getTextPropertyName <em>Text Property Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getPropertyBasedImages <em>Property Based Images</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getNodeLabelMapper()
 * @model
 * @generated
 */
public interface NodeLabelMapper extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Neo4j Label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Neo4j Label</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Neo4j Label</em>' attribute list.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getNodeLabelMapper_RequiredNeo4jLabel()
	 * @model
	 * @generated
	 */
	EList<String> getRequiredNeo4jLabel();

	/**
	 * Returns the value of the '<em><b>Default Image</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Image</em>' attribute.
	 * @see #setDefaultImage(String)
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getNodeLabelMapper_DefaultImage()
	 * @model default=""
	 * @generated
	 */
	String getDefaultImage();

	/**
	 * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getDefaultImage <em>Default Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Image</em>' attribute.
	 * @see #getDefaultImage()
	 * @generated
	 */
	void setDefaultImage(String value);

	/**
	 * Returns the value of the '<em><b>Text Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Property Name</em>' attribute.
	 * @see #setTextPropertyName(String)
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getNodeLabelMapper_TextPropertyName()
	 * @model
	 * @generated
	 */
	String getTextPropertyName();

	/**
	 * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getTextPropertyName <em>Text Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Property Name</em>' attribute.
	 * @see #getTextPropertyName()
	 * @generated
	 */
	void setTextPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Property Based Images</b></em>' containment reference list.
	 * The list contents are of type {@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Based Images</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Based Images</em>' containment reference list.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getNodeLabelMapper_PropertyBasedImages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyBasedImageMapper> getPropertyBasedImages();

} // NodeLabelMapper

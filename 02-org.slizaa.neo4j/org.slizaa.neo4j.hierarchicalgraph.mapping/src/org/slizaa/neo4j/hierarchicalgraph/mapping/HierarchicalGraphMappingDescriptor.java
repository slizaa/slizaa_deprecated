/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchical Graph Mapping Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getDescription <em>Description</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getRootMappings <em>Root Mappings</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getHierarchyMappings <em>Hierarchy Mappings</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getDependencyMappers <em>Dependency Mappers</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getLabelMappers <em>Label Mappers</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getHierarchicalGraphMappingDescriptor()
 * @model
 * @generated
 */
public interface HierarchicalGraphMappingDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getHierarchicalGraphMappingDescriptor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getHierarchicalGraphMappingDescriptor_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Root Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.slizaa.neo4j.hierarchicalgraph.mapping.CypherQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Mappings</em>' containment reference list.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getHierarchicalGraphMappingDescriptor_RootMappings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CypherQuery> getRootMappings();

	/**
	 * Returns the value of the '<em><b>Hierarchy Mappings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy Mappings</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Mappings</em>' attribute list.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getHierarchicalGraphMappingDescriptor_HierarchyMappings()
	 * @model
	 * @generated
	 */
	EList<String> getHierarchyMappings();

	/**
	 * Returns the value of the '<em><b>Dependency Mappers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency Mappers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Mappers</em>' attribute list.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getHierarchicalGraphMappingDescriptor_DependencyMappers()
	 * @model
	 * @generated
	 */
	EList<String> getDependencyMappers();

	/**
	 * Returns the value of the '<em><b>Label Mappers</b></em>' containment reference list.
	 * The list contents are of type {@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Mappers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Mappers</em>' containment reference list.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#getHierarchicalGraphMappingDescriptor_LabelMappers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeLabelMapper> getLabelMappers();

} // HierarchicalGraphMappingDescriptor

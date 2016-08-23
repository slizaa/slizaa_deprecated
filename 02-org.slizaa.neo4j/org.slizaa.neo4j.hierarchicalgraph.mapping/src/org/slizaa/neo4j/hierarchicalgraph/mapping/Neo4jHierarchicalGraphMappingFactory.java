/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage
 * @generated
 */
public interface Neo4jHierarchicalGraphMappingFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	Neo4jHierarchicalGraphMappingFactory eINSTANCE = org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Hierarchical Graph Mapping Descriptor</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Hierarchical Graph Mapping Descriptor</em>'.
   * @generated
   */
	HierarchicalGraphMappingDescriptor createHierarchicalGraphMappingDescriptor();

	/**
   * Returns a new object of class '<em>Dependency Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency Mapping</em>'.
   * @generated
   */
  DependencyMapping createDependencyMapping();

  /**
   * Returns a new object of class '<em>Node Label Mapper</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Label Mapper</em>'.
   * @generated
   */
	NodeLabelMapper createNodeLabelMapper();

	/**
   * Returns a new object of class '<em>Property Based Image Mapper</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Based Image Mapper</em>'.
   * @generated
   */
	PropertyBasedImageMapper createPropertyBasedImageMapper();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	Neo4jHierarchicalGraphMappingPackage getNeo4jHierarchicalGraphMappingPackage();

} //Neo4jHierarchicalGraphMappingFactory

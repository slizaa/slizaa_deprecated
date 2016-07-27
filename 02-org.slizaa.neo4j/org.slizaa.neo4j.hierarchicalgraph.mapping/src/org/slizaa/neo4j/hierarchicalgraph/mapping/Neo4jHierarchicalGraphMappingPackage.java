/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingFactory
 * @model kind="package"
 * @generated
 */
public interface Neo4jHierarchicalGraphMappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/slizaa/neo4j/hierarchicalgraph/mapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.slizaa.neo4j.hierarchicalgraph.mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Neo4jHierarchicalGraphMappingPackage eINSTANCE = org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.HierarchicalGraphMappingDescriptorImpl <em>Hierarchical Graph Mapping Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.HierarchicalGraphMappingDescriptorImpl
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingPackageImpl#getHierarchicalGraphMappingDescriptor()
	 * @generated
	 */
	int HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Root Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__ROOT_MAPPINGS = 2;

	/**
	 * The feature id for the '<em><b>Hierarchy Mappings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__HIERARCHY_MAPPINGS = 3;

	/**
	 * The feature id for the '<em><b>Dependency Mappers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DEPENDENCY_MAPPERS = 4;

	/**
	 * The feature id for the '<em><b>Label Mappers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS = 5;

	/**
	 * The number of structural features of the '<em>Hierarchical Graph Mapping Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Hierarchical Graph Mapping Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.NodeLabelMapperImpl <em>Node Label Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.NodeLabelMapperImpl
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingPackageImpl#getNodeLabelMapper()
	 * @generated
	 */
	int NODE_LABEL_MAPPER = 1;

	/**
	 * The feature id for the '<em><b>Required Neo4j Label</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_MAPPER__REQUIRED_NEO4J_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Default Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_MAPPER__DEFAULT_IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Text Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_MAPPER__TEXT_PROPERTY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Property Based Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_MAPPER__PROPERTY_BASED_IMAGES = 3;

	/**
	 * The number of structural features of the '<em>Node Label Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_MAPPER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Node Label Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_LABEL_MAPPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.PropertyBasedImageMapperImpl <em>Property Based Image Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.PropertyBasedImageMapperImpl
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingPackageImpl#getPropertyBasedImageMapper()
	 * @generated
	 */
	int PROPERTY_BASED_IMAGE_MAPPER = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_IMAGE_MAPPER__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_IMAGE_MAPPER__IMAGE = 3;

	/**
	 * The number of structural features of the '<em>Property Based Image Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_IMAGE_MAPPER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Property Based Image Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BASED_IMAGE_MAPPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.CypherQueryImpl <em>Cypher Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.CypherQueryImpl
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingPackageImpl#getCypherQuery()
	 * @generated
	 */
	int CYPHER_QUERY = 3;

	/**
	 * The feature id for the '<em><b>Cypher Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_QUERY__CYPHER_QUERY = 0;

	/**
	 * The number of structural features of the '<em>Cypher Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_QUERY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cypher Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYPHER_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition <em>Image Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingPackageImpl#getImagePosition()
	 * @generated
	 */
	int IMAGE_POSITION = 4;


	/**
	 * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor <em>Hierarchical Graph Mapping Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchical Graph Mapping Descriptor</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor
	 * @generated
	 */
	EClass getHierarchicalGraphMappingDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getName()
	 * @see #getHierarchicalGraphMappingDescriptor()
	 * @generated
	 */
	EAttribute getHierarchicalGraphMappingDescriptor_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getDescription()
	 * @see #getHierarchicalGraphMappingDescriptor()
	 * @generated
	 */
	EAttribute getHierarchicalGraphMappingDescriptor_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getRootMappings <em>Root Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Mappings</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getRootMappings()
	 * @see #getHierarchicalGraphMappingDescriptor()
	 * @generated
	 */
	EReference getHierarchicalGraphMappingDescriptor_RootMappings();

	/**
	 * Returns the meta object for the attribute list '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getHierarchyMappings <em>Hierarchy Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Hierarchy Mappings</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getHierarchyMappings()
	 * @see #getHierarchicalGraphMappingDescriptor()
	 * @generated
	 */
	EAttribute getHierarchicalGraphMappingDescriptor_HierarchyMappings();

	/**
	 * Returns the meta object for the attribute list '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getDependencyMappers <em>Dependency Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dependency Mappers</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getDependencyMappers()
	 * @see #getHierarchicalGraphMappingDescriptor()
	 * @generated
	 */
	EAttribute getHierarchicalGraphMappingDescriptor_DependencyMappers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getLabelMappers <em>Label Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Mappers</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor#getLabelMappers()
	 * @see #getHierarchicalGraphMappingDescriptor()
	 * @generated
	 */
	EReference getHierarchicalGraphMappingDescriptor_LabelMappers();

	/**
	 * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper <em>Node Label Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Label Mapper</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper
	 * @generated
	 */
	EClass getNodeLabelMapper();

	/**
	 * Returns the meta object for the attribute list '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getRequiredNeo4jLabel <em>Required Neo4j Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Neo4j Label</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getRequiredNeo4jLabel()
	 * @see #getNodeLabelMapper()
	 * @generated
	 */
	EAttribute getNodeLabelMapper_RequiredNeo4jLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getDefaultImage <em>Default Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Image</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getDefaultImage()
	 * @see #getNodeLabelMapper()
	 * @generated
	 */
	EAttribute getNodeLabelMapper_DefaultImage();

	/**
	 * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getTextPropertyName <em>Text Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Property Name</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getTextPropertyName()
	 * @see #getNodeLabelMapper()
	 * @generated
	 */
	EAttribute getNodeLabelMapper_TextPropertyName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getPropertyBasedImages <em>Property Based Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Based Images</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper#getPropertyBasedImages()
	 * @see #getNodeLabelMapper()
	 * @generated
	 */
	EReference getNodeLabelMapper_PropertyBasedImages();

	/**
	 * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper <em>Property Based Image Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Based Image Mapper</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper
	 * @generated
	 */
	EClass getPropertyBasedImageMapper();

	/**
	 * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPosition()
	 * @see #getPropertyBasedImageMapper()
	 * @generated
	 */
	EAttribute getPropertyBasedImageMapper_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPropertyName()
	 * @see #getPropertyBasedImageMapper()
	 * @generated
	 */
	EAttribute getPropertyBasedImageMapper_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getPropertyValue()
	 * @see #getPropertyBasedImageMapper()
	 * @generated
	 */
	EAttribute getPropertyBasedImageMapper_PropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper#getImage()
	 * @see #getPropertyBasedImageMapper()
	 * @generated
	 */
	EAttribute getPropertyBasedImageMapper_Image();

	/**
	 * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.CypherQuery <em>Cypher Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cypher Query</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.CypherQuery
	 * @generated
	 */
	EClass getCypherQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.CypherQuery#getCypherQuery <em>Cypher Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cypher Query</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.CypherQuery#getCypherQuery()
	 * @see #getCypherQuery()
	 * @generated
	 */
	EAttribute getCypherQuery_CypherQuery();

	/**
	 * Returns the meta object for enum '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition <em>Image Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Image Position</em>'.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition
	 * @generated
	 */
	EEnum getImagePosition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Neo4jHierarchicalGraphMappingFactory getNeo4jHierarchicalGraphMappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.HierarchicalGraphMappingDescriptorImpl <em>Hierarchical Graph Mapping Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.HierarchicalGraphMappingDescriptorImpl
		 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingPackageImpl#getHierarchicalGraphMappingDescriptor()
		 * @generated
		 */
		EClass HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR = eINSTANCE.getHierarchicalGraphMappingDescriptor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__NAME = eINSTANCE.getHierarchicalGraphMappingDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DESCRIPTION = eINSTANCE.getHierarchicalGraphMappingDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Root Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__ROOT_MAPPINGS = eINSTANCE.getHierarchicalGraphMappingDescriptor_RootMappings();

		/**
		 * The meta object literal for the '<em><b>Hierarchy Mappings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__HIERARCHY_MAPPINGS = eINSTANCE.getHierarchicalGraphMappingDescriptor_HierarchyMappings();

		/**
		 * The meta object literal for the '<em><b>Dependency Mappers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DEPENDENCY_MAPPERS = eINSTANCE.getHierarchicalGraphMappingDescriptor_DependencyMappers();

		/**
		 * The meta object literal for the '<em><b>Label Mappers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS = eINSTANCE.getHierarchicalGraphMappingDescriptor_LabelMappers();

		/**
		 * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.NodeLabelMapperImpl <em>Node Label Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.NodeLabelMapperImpl
		 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingPackageImpl#getNodeLabelMapper()
		 * @generated
		 */
		EClass NODE_LABEL_MAPPER = eINSTANCE.getNodeLabelMapper();

		/**
		 * The meta object literal for the '<em><b>Required Neo4j Label</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LABEL_MAPPER__REQUIRED_NEO4J_LABEL = eINSTANCE.getNodeLabelMapper_RequiredNeo4jLabel();

		/**
		 * The meta object literal for the '<em><b>Default Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LABEL_MAPPER__DEFAULT_IMAGE = eINSTANCE.getNodeLabelMapper_DefaultImage();

		/**
		 * The meta object literal for the '<em><b>Text Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_LABEL_MAPPER__TEXT_PROPERTY_NAME = eINSTANCE.getNodeLabelMapper_TextPropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Based Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_LABEL_MAPPER__PROPERTY_BASED_IMAGES = eINSTANCE.getNodeLabelMapper_PropertyBasedImages();

		/**
		 * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.PropertyBasedImageMapperImpl <em>Property Based Image Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.PropertyBasedImageMapperImpl
		 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingPackageImpl#getPropertyBasedImageMapper()
		 * @generated
		 */
		EClass PROPERTY_BASED_IMAGE_MAPPER = eINSTANCE.getPropertyBasedImageMapper();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BASED_IMAGE_MAPPER__POSITION = eINSTANCE.getPropertyBasedImageMapper_Position();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_NAME = eINSTANCE.getPropertyBasedImageMapper_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_VALUE = eINSTANCE.getPropertyBasedImageMapper_PropertyValue();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_BASED_IMAGE_MAPPER__IMAGE = eINSTANCE.getPropertyBasedImageMapper_Image();

		/**
		 * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.CypherQueryImpl <em>Cypher Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.CypherQueryImpl
		 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingPackageImpl#getCypherQuery()
		 * @generated
		 */
		EClass CYPHER_QUERY = eINSTANCE.getCypherQuery();

		/**
		 * The meta object literal for the '<em><b>Cypher Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYPHER_QUERY__CYPHER_QUERY = eINSTANCE.getCypherQuery_CypherQuery();

		/**
		 * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition <em>Image Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition
		 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.impl.Neo4jHierarchicalGraphMappingPackageImpl#getImagePosition()
		 * @generated
		 */
		EEnum IMAGE_POSITION = eINSTANCE.getImagePosition();

	}

} //Neo4jHierarchicalGraphMappingPackage

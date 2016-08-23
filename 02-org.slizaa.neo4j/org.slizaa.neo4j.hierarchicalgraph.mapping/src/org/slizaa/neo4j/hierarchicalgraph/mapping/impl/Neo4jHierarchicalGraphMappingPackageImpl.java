/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.slizaa.neo4j.hierarchicalgraph.mapping.DependencyMapping;
import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition;
import org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingFactory;
import org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage;
import org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper;
import org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Neo4jHierarchicalGraphMappingPackageImpl extends EPackageImpl implements Neo4jHierarchicalGraphMappingPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass hierarchicalGraphMappingDescriptorEClass = null;

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass nodeLabelMapperEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass propertyBasedImageMapperEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum imagePositionEEnum = null;

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType cyperQueryEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private Neo4jHierarchicalGraphMappingPackageImpl() {
    super(eNS_URI, Neo4jHierarchicalGraphMappingFactory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Neo4jHierarchicalGraphMappingPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static Neo4jHierarchicalGraphMappingPackage init() {
    if (isInited) return (Neo4jHierarchicalGraphMappingPackage)EPackage.Registry.INSTANCE.getEPackage(Neo4jHierarchicalGraphMappingPackage.eNS_URI);

    // Obtain or create and register package
    Neo4jHierarchicalGraphMappingPackageImpl theNeo4jHierarchicalGraphMappingPackage = (Neo4jHierarchicalGraphMappingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Neo4jHierarchicalGraphMappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Neo4jHierarchicalGraphMappingPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theNeo4jHierarchicalGraphMappingPackage.createPackageContents();

    // Initialize created meta-data
    theNeo4jHierarchicalGraphMappingPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theNeo4jHierarchicalGraphMappingPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Neo4jHierarchicalGraphMappingPackage.eNS_URI, theNeo4jHierarchicalGraphMappingPackage);
    return theNeo4jHierarchicalGraphMappingPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getHierarchicalGraphMappingDescriptor() {
    return hierarchicalGraphMappingDescriptorEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getHierarchicalGraphMappingDescriptor_Name() {
    return (EAttribute)hierarchicalGraphMappingDescriptorEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getHierarchicalGraphMappingDescriptor_Description() {
    return (EAttribute)hierarchicalGraphMappingDescriptorEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getHierarchicalGraphMappingDescriptor_RootMappings() {
    return (EAttribute)hierarchicalGraphMappingDescriptorEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getHierarchicalGraphMappingDescriptor_HierarchyMappings() {
    return (EAttribute)hierarchicalGraphMappingDescriptorEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHierarchicalGraphMappingDescriptor_DependencyMappings() {
    return (EReference)hierarchicalGraphMappingDescriptorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getHierarchicalGraphMappingDescriptor_LabelMappers() {
    return (EReference)hierarchicalGraphMappingDescriptorEClass.getEStructuralFeatures().get(5);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependencyMapping() {
    return dependencyMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependencyMapping_MainQuery() {
    return (EAttribute)dependencyMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependencyMapping_DetailQueries() {
    return (EAttribute)dependencyMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNodeLabelMapper() {
    return nodeLabelMapperEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNodeLabelMapper_RequiredNeo4jLabel() {
    return (EAttribute)nodeLabelMapperEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNodeLabelMapper_DefaultImage() {
    return (EAttribute)nodeLabelMapperEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNodeLabelMapper_TextPropertyName() {
    return (EAttribute)nodeLabelMapperEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getNodeLabelMapper_PropertyBasedImages() {
    return (EReference)nodeLabelMapperEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getPropertyBasedImageMapper() {
    return propertyBasedImageMapperEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getPropertyBasedImageMapper_Position() {
    return (EAttribute)propertyBasedImageMapperEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getPropertyBasedImageMapper_PropertyName() {
    return (EAttribute)propertyBasedImageMapperEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getPropertyBasedImageMapper_PropertyValue() {
    return (EAttribute)propertyBasedImageMapperEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getPropertyBasedImageMapper_Image() {
    return (EAttribute)propertyBasedImageMapperEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getImagePosition() {
    return imagePositionEEnum;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getCyperQuery() {
    return cyperQueryEDataType;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Neo4jHierarchicalGraphMappingFactory getNeo4jHierarchicalGraphMappingFactory() {
    return (Neo4jHierarchicalGraphMappingFactory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isCreated = false;

	/**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    hierarchicalGraphMappingDescriptorEClass = createEClass(HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR);
    createEAttribute(hierarchicalGraphMappingDescriptorEClass, HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__NAME);
    createEAttribute(hierarchicalGraphMappingDescriptorEClass, HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DESCRIPTION);
    createEAttribute(hierarchicalGraphMappingDescriptorEClass, HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__ROOT_MAPPINGS);
    createEAttribute(hierarchicalGraphMappingDescriptorEClass, HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__HIERARCHY_MAPPINGS);
    createEReference(hierarchicalGraphMappingDescriptorEClass, HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DEPENDENCY_MAPPINGS);
    createEReference(hierarchicalGraphMappingDescriptorEClass, HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS);

    dependencyMappingEClass = createEClass(DEPENDENCY_MAPPING);
    createEAttribute(dependencyMappingEClass, DEPENDENCY_MAPPING__MAIN_QUERY);
    createEAttribute(dependencyMappingEClass, DEPENDENCY_MAPPING__DETAIL_QUERIES);

    nodeLabelMapperEClass = createEClass(NODE_LABEL_MAPPER);
    createEAttribute(nodeLabelMapperEClass, NODE_LABEL_MAPPER__REQUIRED_NEO4J_LABEL);
    createEAttribute(nodeLabelMapperEClass, NODE_LABEL_MAPPER__DEFAULT_IMAGE);
    createEAttribute(nodeLabelMapperEClass, NODE_LABEL_MAPPER__TEXT_PROPERTY_NAME);
    createEReference(nodeLabelMapperEClass, NODE_LABEL_MAPPER__PROPERTY_BASED_IMAGES);

    propertyBasedImageMapperEClass = createEClass(PROPERTY_BASED_IMAGE_MAPPER);
    createEAttribute(propertyBasedImageMapperEClass, PROPERTY_BASED_IMAGE_MAPPER__POSITION);
    createEAttribute(propertyBasedImageMapperEClass, PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_NAME);
    createEAttribute(propertyBasedImageMapperEClass, PROPERTY_BASED_IMAGE_MAPPER__PROPERTY_VALUE);
    createEAttribute(propertyBasedImageMapperEClass, PROPERTY_BASED_IMAGE_MAPPER__IMAGE);

    // Create enums
    imagePositionEEnum = createEEnum(IMAGE_POSITION);

    // Create data types
    cyperQueryEDataType = createEDataType(CYPER_QUERY);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(hierarchicalGraphMappingDescriptorEClass, HierarchicalGraphMappingDescriptor.class, "HierarchicalGraphMappingDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHierarchicalGraphMappingDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, HierarchicalGraphMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchicalGraphMappingDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1, HierarchicalGraphMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchicalGraphMappingDescriptor_RootMappings(), this.getCyperQuery(), "rootMappings", null, 1, -1, HierarchicalGraphMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchicalGraphMappingDescriptor_HierarchyMappings(), this.getCyperQuery(), "hierarchyMappings", null, 0, -1, HierarchicalGraphMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHierarchicalGraphMappingDescriptor_DependencyMappings(), this.getDependencyMapping(), null, "dependencyMappings", null, 0, -1, HierarchicalGraphMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHierarchicalGraphMappingDescriptor_LabelMappers(), this.getNodeLabelMapper(), null, "labelMappers", null, 0, -1, HierarchicalGraphMappingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyMappingEClass, DependencyMapping.class, "DependencyMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDependencyMapping_MainQuery(), this.getCyperQuery(), "mainQuery", null, 1, 1, DependencyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDependencyMapping_DetailQueries(), this.getCyperQuery(), "detailQueries", null, 0, -1, DependencyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeLabelMapperEClass, NodeLabelMapper.class, "NodeLabelMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeLabelMapper_RequiredNeo4jLabel(), ecorePackage.getEString(), "requiredNeo4jLabel", null, 0, -1, NodeLabelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeLabelMapper_DefaultImage(), ecorePackage.getEString(), "defaultImage", "", 0, 1, NodeLabelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeLabelMapper_TextPropertyName(), ecorePackage.getEString(), "textPropertyName", null, 0, 1, NodeLabelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeLabelMapper_PropertyBasedImages(), this.getPropertyBasedImageMapper(), null, "propertyBasedImages", null, 0, -1, NodeLabelMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyBasedImageMapperEClass, PropertyBasedImageMapper.class, "PropertyBasedImageMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyBasedImageMapper_Position(), this.getImagePosition(), "position", null, 1, 1, PropertyBasedImageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyBasedImageMapper_PropertyName(), ecorePackage.getEString(), "propertyName", null, 1, 1, PropertyBasedImageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyBasedImageMapper_PropertyValue(), ecorePackage.getEString(), "propertyValue", null, 1, 1, PropertyBasedImageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyBasedImageMapper_Image(), ecorePackage.getEString(), "image", null, 1, 1, PropertyBasedImageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(imagePositionEEnum, ImagePosition.class, "ImagePosition");
    addEEnumLiteral(imagePositionEEnum, ImagePosition.BASE);
    addEEnumLiteral(imagePositionEEnum, ImagePosition.OVERLAY_TOP_LEFT);
    addEEnumLiteral(imagePositionEEnum, ImagePosition.OVERLAY_TOP_RIGHT);
    addEEnumLiteral(imagePositionEEnum, ImagePosition.OVERLAY_BOTTOM_LEFT);
    addEEnumLiteral(imagePositionEEnum, ImagePosition.OVERLAY_BOTTOM_RIGHT);

    // Initialize data types
    initEDataType(cyperQueryEDataType, String.class, "CyperQuery", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //Neo4jHierarchicalGraphMappingPackageImpl

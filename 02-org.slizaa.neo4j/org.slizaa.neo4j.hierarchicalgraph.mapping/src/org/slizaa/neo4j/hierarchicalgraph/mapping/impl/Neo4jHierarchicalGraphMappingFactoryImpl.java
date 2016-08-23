/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.slizaa.neo4j.hierarchicalgraph.mapping.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Neo4jHierarchicalGraphMappingFactoryImpl extends EFactoryImpl implements Neo4jHierarchicalGraphMappingFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static Neo4jHierarchicalGraphMappingFactory init() {
    try {
      Neo4jHierarchicalGraphMappingFactory theNeo4jHierarchicalGraphMappingFactory = (Neo4jHierarchicalGraphMappingFactory)EPackage.Registry.INSTANCE.getEFactory(Neo4jHierarchicalGraphMappingPackage.eNS_URI);
      if (theNeo4jHierarchicalGraphMappingFactory != null) {
        return theNeo4jHierarchicalGraphMappingFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Neo4jHierarchicalGraphMappingFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Neo4jHierarchicalGraphMappingFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR: return createHierarchicalGraphMappingDescriptor();
      case Neo4jHierarchicalGraphMappingPackage.DEPENDENCY_MAPPING: return createDependencyMapping();
      case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER: return createNodeLabelMapper();
      case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER: return createPropertyBasedImageMapper();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case Neo4jHierarchicalGraphMappingPackage.IMAGE_POSITION:
        return createImagePositionFromString(eDataType, initialValue);
      case Neo4jHierarchicalGraphMappingPackage.CYPER_QUERY:
        return createCyperQueryFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case Neo4jHierarchicalGraphMappingPackage.IMAGE_POSITION:
        return convertImagePositionToString(eDataType, instanceValue);
      case Neo4jHierarchicalGraphMappingPackage.CYPER_QUERY:
        return convertCyperQueryToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HierarchicalGraphMappingDescriptor createHierarchicalGraphMappingDescriptor() {
    HierarchicalGraphMappingDescriptorImpl hierarchicalGraphMappingDescriptor = new HierarchicalGraphMappingDescriptorImpl();
    return hierarchicalGraphMappingDescriptor;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyMapping createDependencyMapping() {
    DependencyMappingImpl dependencyMapping = new DependencyMappingImpl();
    return dependencyMapping;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NodeLabelMapper createNodeLabelMapper() {
    NodeLabelMapperImpl nodeLabelMapper = new NodeLabelMapperImpl();
    return nodeLabelMapper;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PropertyBasedImageMapper createPropertyBasedImageMapper() {
    PropertyBasedImageMapperImpl propertyBasedImageMapper = new PropertyBasedImageMapperImpl();
    return propertyBasedImageMapper;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImagePosition createImagePositionFromString(EDataType eDataType, String initialValue) {
    ImagePosition result = ImagePosition.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertImagePositionToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createCyperQueryFromString(EDataType eDataType, String initialValue) {
    return (String)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCyperQueryToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Neo4jHierarchicalGraphMappingPackage getNeo4jHierarchicalGraphMappingPackage() {
    return (Neo4jHierarchicalGraphMappingPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static Neo4jHierarchicalGraphMappingPackage getPackage() {
    return Neo4jHierarchicalGraphMappingPackage.eINSTANCE;
  }

} //Neo4jHierarchicalGraphMappingFactoryImpl

/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIFactory
 * @model kind="package"
 * @generated
 */
public interface HierarchicalGraphUIPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ui";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org/slizaa/neo4j/hierarchicalgraph/ui";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.slizaa.neo4j.hierarchicalgraph.ui";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HierarchicalGraphUIPackage eINSTANCE = org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl.init();

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor <em>ISlizaa Mapping Descriptor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getISlizaaMappingDescriptor()
   * @generated
   */
  int ISLIZAA_MAPPING_DESCRIPTOR = 0;

  /**
   * The feature id for the '<em><b>Mapping Descriptor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISLIZAA_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR = 0;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISLIZAA_MAPPING_DESCRIPTOR__QUALIFIED_NAME = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISLIZAA_MAPPING_DESCRIPTOR__NAME = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISLIZAA_MAPPING_DESCRIPTOR__DESCRIPTION = 3;

  /**
   * The number of structural features of the '<em>ISlizaa Mapping Descriptor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISLIZAA_MAPPING_DESCRIPTOR_FEATURE_COUNT = 4;

  /**
   * The operation id for the '<em>Resolve Image</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISLIZAA_MAPPING_DESCRIPTOR___RESOLVE_IMAGE__STRING = 0;

  /**
   * The number of operations of the '<em>ISlizaa Mapping Descriptor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISLIZAA_MAPPING_DESCRIPTOR_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.BundleBasedMappingDescriptorImpl <em>Bundle Based Mapping Descriptor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.BundleBasedMappingDescriptorImpl
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getBundleBasedMappingDescriptor()
   * @generated
   */
  int BUNDLE_BASED_MAPPING_DESCRIPTOR = 1;

  /**
   * The feature id for the '<em><b>Mapping Descriptor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_BASED_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR = ISLIZAA_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_BASED_MAPPING_DESCRIPTOR__QUALIFIED_NAME = ISLIZAA_MAPPING_DESCRIPTOR__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_BASED_MAPPING_DESCRIPTOR__NAME = ISLIZAA_MAPPING_DESCRIPTOR__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_BASED_MAPPING_DESCRIPTOR__DESCRIPTION = ISLIZAA_MAPPING_DESCRIPTOR__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Bundle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_BASED_MAPPING_DESCRIPTOR__BUNDLE = ISLIZAA_MAPPING_DESCRIPTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Base Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_BASED_MAPPING_DESCRIPTOR__BASE_PATH = ISLIZAA_MAPPING_DESCRIPTOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bundle Based Mapping Descriptor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_BASED_MAPPING_DESCRIPTOR_FEATURE_COUNT = ISLIZAA_MAPPING_DESCRIPTOR_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Resolve Image</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_BASED_MAPPING_DESCRIPTOR___RESOLVE_IMAGE__STRING = ISLIZAA_MAPPING_DESCRIPTOR___RESOLVE_IMAGE__STRING;

  /**
   * The number of operations of the '<em>Bundle Based Mapping Descriptor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_BASED_MAPPING_DESCRIPTOR_OPERATION_COUNT = ISLIZAA_MAPPING_DESCRIPTOR_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.WorkspaceBasedMappingDescriptorImpl <em>Workspace Based Mapping Descriptor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.WorkspaceBasedMappingDescriptorImpl
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getWorkspaceBasedMappingDescriptor()
   * @generated
   */
  int WORKSPACE_BASED_MAPPING_DESCRIPTOR = 2;

  /**
   * The feature id for the '<em><b>Mapping Descriptor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_BASED_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR = ISLIZAA_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_BASED_MAPPING_DESCRIPTOR__QUALIFIED_NAME = ISLIZAA_MAPPING_DESCRIPTOR__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_BASED_MAPPING_DESCRIPTOR__NAME = ISLIZAA_MAPPING_DESCRIPTOR__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_BASED_MAPPING_DESCRIPTOR__DESCRIPTION = ISLIZAA_MAPPING_DESCRIPTOR__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Base Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_BASED_MAPPING_DESCRIPTOR__BASE_PATH = ISLIZAA_MAPPING_DESCRIPTOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Workspace Based Mapping Descriptor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_BASED_MAPPING_DESCRIPTOR_FEATURE_COUNT = ISLIZAA_MAPPING_DESCRIPTOR_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Resolve Image</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_BASED_MAPPING_DESCRIPTOR___RESOLVE_IMAGE__STRING = ISLIZAA_MAPPING_DESCRIPTOR___RESOLVE_IMAGE__STRING;

  /**
   * The number of operations of the '<em>Workspace Based Mapping Descriptor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_BASED_MAPPING_DESCRIPTOR_OPERATION_COUNT = ISLIZAA_MAPPING_DESCRIPTOR_OPERATION_COUNT + 0;


  /**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorContainerImpl <em>Mapping Descriptor Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorContainerImpl
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getMappingDescriptorContainer()
   * @generated
   */
  int MAPPING_DESCRIPTOR_CONTAINER = 3;

  /**
   * The feature id for the '<em><b>Bundle Based Mapping Descriptors</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS = 0;

  /**
   * The feature id for the '<em><b>Workspace Based Mapping Descriptors</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS = 1;

  /**
   * The number of structural features of the '<em>Mapping Descriptor Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DESCRIPTOR_CONTAINER_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Mapping Descriptor Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DESCRIPTOR_CONTAINER_OPERATION_COUNT = 0;


  /**
   * The meta object id for the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorListImpl <em>Mapping Descriptor List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorListImpl
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getMappingDescriptorList()
   * @generated
   */
  int MAPPING_DESCRIPTOR_LIST = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DESCRIPTOR_LIST__NAME = 0;

  /**
   * The feature id for the '<em><b>Mapping Descriptors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DESCRIPTOR_LIST__MAPPING_DESCRIPTORS = 1;

  /**
   * The number of structural features of the '<em>Mapping Descriptor List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DESCRIPTOR_LIST_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Mapping Descriptor List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_DESCRIPTOR_LIST_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '<em>Bundle</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osgi.framework.Bundle
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getBundle()
   * @generated
   */
  int BUNDLE = 5;


  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor <em>ISlizaa Mapping Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ISlizaa Mapping Descriptor</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor
   * @generated
   */
  EClass getISlizaaMappingDescriptor();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getMappingDescriptor <em>Mapping Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mapping Descriptor</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getMappingDescriptor()
   * @see #getISlizaaMappingDescriptor()
   * @generated
   */
  EReference getISlizaaMappingDescriptor_MappingDescriptor();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getQualifiedName()
   * @see #getISlizaaMappingDescriptor()
   * @generated
   */
  EAttribute getISlizaaMappingDescriptor_QualifiedName();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getName()
   * @see #getISlizaaMappingDescriptor()
   * @generated
   */
  EAttribute getISlizaaMappingDescriptor_Name();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#getDescription()
   * @see #getISlizaaMappingDescriptor()
   * @generated
   */
  EAttribute getISlizaaMappingDescriptor_Description();

  /**
   * Returns the meta object for the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#resolveImage(java.lang.String) <em>Resolve Image</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Resolve Image</em>' operation.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor#resolveImage(java.lang.String)
   * @generated
   */
  EOperation getISlizaaMappingDescriptor__ResolveImage__String();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor <em>Bundle Based Mapping Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bundle Based Mapping Descriptor</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor
   * @generated
   */
  EClass getBundleBasedMappingDescriptor();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor#getBundle <em>Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bundle</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor#getBundle()
   * @see #getBundleBasedMappingDescriptor()
   * @generated
   */
  EAttribute getBundleBasedMappingDescriptor_Bundle();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor#getBasePath <em>Base Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Path</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor#getBasePath()
   * @see #getBundleBasedMappingDescriptor()
   * @generated
   */
  EAttribute getBundleBasedMappingDescriptor_BasePath();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor <em>Workspace Based Mapping Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workspace Based Mapping Descriptor</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor
   * @generated
   */
  EClass getWorkspaceBasedMappingDescriptor();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor#getBasePath <em>Base Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Path</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor#getBasePath()
   * @see #getWorkspaceBasedMappingDescriptor()
   * @generated
   */
  EAttribute getWorkspaceBasedMappingDescriptor_BasePath();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer <em>Mapping Descriptor Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Descriptor Container</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer
   * @generated
   */
  EClass getMappingDescriptorContainer();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer#getBundleBasedMappingDescriptors <em>Bundle Based Mapping Descriptors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Bundle Based Mapping Descriptors</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer#getBundleBasedMappingDescriptors()
   * @see #getMappingDescriptorContainer()
   * @generated
   */
  EReference getMappingDescriptorContainer_BundleBasedMappingDescriptors();

  /**
   * Returns the meta object for the reference '{@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer#getWorkspaceBasedMappingDescriptors <em>Workspace Based Mapping Descriptors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Workspace Based Mapping Descriptors</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer#getWorkspaceBasedMappingDescriptors()
   * @see #getMappingDescriptorContainer()
   * @generated
   */
  EReference getMappingDescriptorContainer_WorkspaceBasedMappingDescriptors();

  /**
   * Returns the meta object for class '{@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList <em>Mapping Descriptor List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Descriptor List</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList
   * @generated
   */
  EClass getMappingDescriptorList();

  /**
   * Returns the meta object for the attribute '{@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList#getName()
   * @see #getMappingDescriptorList()
   * @generated
   */
  EAttribute getMappingDescriptorList_Name();

  /**
   * Returns the meta object for the reference list '{@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList#getMappingDescriptors <em>Mapping Descriptors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Mapping Descriptors</em>'.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorList#getMappingDescriptors()
   * @see #getMappingDescriptorList()
   * @generated
   */
  EReference getMappingDescriptorList_MappingDescriptors();

  /**
   * Returns the meta object for data type '{@link org.osgi.framework.Bundle <em>Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Bundle</em>'.
   * @see org.osgi.framework.Bundle
   * @model instanceClass="org.osgi.framework.Bundle"
   * @generated
   */
  EDataType getBundle();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HierarchicalGraphUIFactory getHierarchicalGraphUIFactory();

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
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor <em>ISlizaa Mapping Descriptor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescriptor
     * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getISlizaaMappingDescriptor()
     * @generated
     */
    EClass ISLIZAA_MAPPING_DESCRIPTOR = eINSTANCE.getISlizaaMappingDescriptor();

    /**
     * The meta object literal for the '<em><b>Mapping Descriptor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ISLIZAA_MAPPING_DESCRIPTOR__MAPPING_DESCRIPTOR = eINSTANCE.getISlizaaMappingDescriptor_MappingDescriptor();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISLIZAA_MAPPING_DESCRIPTOR__QUALIFIED_NAME = eINSTANCE.getISlizaaMappingDescriptor_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISLIZAA_MAPPING_DESCRIPTOR__NAME = eINSTANCE.getISlizaaMappingDescriptor_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ISLIZAA_MAPPING_DESCRIPTOR__DESCRIPTION = eINSTANCE.getISlizaaMappingDescriptor_Description();

    /**
     * The meta object literal for the '<em><b>Resolve Image</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation ISLIZAA_MAPPING_DESCRIPTOR___RESOLVE_IMAGE__STRING = eINSTANCE.getISlizaaMappingDescriptor__ResolveImage__String();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.BundleBasedMappingDescriptorImpl <em>Bundle Based Mapping Descriptor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.BundleBasedMappingDescriptorImpl
     * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getBundleBasedMappingDescriptor()
     * @generated
     */
    EClass BUNDLE_BASED_MAPPING_DESCRIPTOR = eINSTANCE.getBundleBasedMappingDescriptor();

    /**
     * The meta object literal for the '<em><b>Bundle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE_BASED_MAPPING_DESCRIPTOR__BUNDLE = eINSTANCE.getBundleBasedMappingDescriptor_Bundle();

    /**
     * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE_BASED_MAPPING_DESCRIPTOR__BASE_PATH = eINSTANCE.getBundleBasedMappingDescriptor_BasePath();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.WorkspaceBasedMappingDescriptorImpl <em>Workspace Based Mapping Descriptor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.WorkspaceBasedMappingDescriptorImpl
     * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getWorkspaceBasedMappingDescriptor()
     * @generated
     */
    EClass WORKSPACE_BASED_MAPPING_DESCRIPTOR = eINSTANCE.getWorkspaceBasedMappingDescriptor();

    /**
     * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORKSPACE_BASED_MAPPING_DESCRIPTOR__BASE_PATH = eINSTANCE.getWorkspaceBasedMappingDescriptor_BasePath();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorContainerImpl <em>Mapping Descriptor Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorContainerImpl
     * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getMappingDescriptorContainer()
     * @generated
     */
    EClass MAPPING_DESCRIPTOR_CONTAINER = eINSTANCE.getMappingDescriptorContainer();

    /**
     * The meta object literal for the '<em><b>Bundle Based Mapping Descriptors</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_DESCRIPTOR_CONTAINER__BUNDLE_BASED_MAPPING_DESCRIPTORS = eINSTANCE.getMappingDescriptorContainer_BundleBasedMappingDescriptors();

    /**
     * The meta object literal for the '<em><b>Workspace Based Mapping Descriptors</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_DESCRIPTOR_CONTAINER__WORKSPACE_BASED_MAPPING_DESCRIPTORS = eINSTANCE.getMappingDescriptorContainer_WorkspaceBasedMappingDescriptors();

    /**
     * The meta object literal for the '{@link org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorListImpl <em>Mapping Descriptor List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.MappingDescriptorListImpl
     * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getMappingDescriptorList()
     * @generated
     */
    EClass MAPPING_DESCRIPTOR_LIST = eINSTANCE.getMappingDescriptorList();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_DESCRIPTOR_LIST__NAME = eINSTANCE.getMappingDescriptorList_Name();

    /**
     * The meta object literal for the '<em><b>Mapping Descriptors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_DESCRIPTOR_LIST__MAPPING_DESCRIPTORS = eINSTANCE.getMappingDescriptorList_MappingDescriptors();

    /**
     * The meta object literal for the '<em>Bundle</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osgi.framework.Bundle
     * @see org.slizaa.neo4j.hierarchicalgraph.ui.impl.HierarchicalGraphUIPackageImpl#getBundle()
     * @generated
     */
    EDataType BUNDLE = eINSTANCE.getBundle();

  }

} //HierarchicalGraphUIPackage

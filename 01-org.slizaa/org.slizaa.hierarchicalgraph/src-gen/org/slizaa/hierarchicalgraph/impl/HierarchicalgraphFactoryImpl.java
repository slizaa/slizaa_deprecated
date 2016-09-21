/**
 */
package org.slizaa.hierarchicalgraph.impl;

import java.util.List;
import java.util.Map;

import java.util.concurrent.Future;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.edit.provider.IItemLabelProvider;

import org.slizaa.hierarchicalgraph.*;

import org.slizaa.hierarchicalgraph.spi.IAggregatedCoreDependencyResolver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchicalgraphFactoryImpl extends EFactoryImpl implements HierarchicalgraphFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HierarchicalgraphFactory init() {
    try {
      HierarchicalgraphFactory theHierarchicalgraphFactory = (HierarchicalgraphFactory)EPackage.Registry.INSTANCE.getEFactory(HierarchicalgraphPackage.eNS_URI);
      if (theHierarchicalgraphFactory != null) {
        return theHierarchicalgraphFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HierarchicalgraphFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalgraphFactoryImpl() {
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
      case HierarchicalgraphPackage.HG_NODE: return createHGNode();
      case HierarchicalgraphPackage.HG_ROOT_NODE: return createHGRootNode();
      case HierarchicalgraphPackage.DEFAULT_NODE_SOURCE: return createDefaultNodeSource();
      case HierarchicalgraphPackage.DEFAULT_DEPENDENCY_SOURCE: return createDefaultDependencySource();
      case HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY: return createHGAggregatedDependency();
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY: return createHGCoreDependency();
      case HierarchicalgraphPackage.HG_AGGREGATED_CORE_DEPENDENCY: return createHGAggregatedCoreDependency();
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP: return (EObject)createNodeToCoreDependencyMap();
      case HierarchicalgraphPackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
      case HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP: return (EObject)createIdentifierToNodeMap();
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCIES_MAP: return (EObject)createNodeToCoreDependenciesMap();
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
      case HierarchicalgraphPackage.SOURCE_OR_TARGET:
        return createSourceOrTargetFromString(eDataType, initialValue);
      case HierarchicalgraphPackage.IITEM_LABEL_PROVIDER:
        return createIItemLabelProviderFromString(eDataType, initialValue);
      case HierarchicalgraphPackage.FUTURE:
        return createFutureFromString(eDataType, initialValue);
      case HierarchicalgraphPackage.IAGGREGATED_CORE_DEPENDENCY_RESOLVER:
        return createIAggregatedCoreDependencyResolverFromString(eDataType, initialValue);
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
      case HierarchicalgraphPackage.SOURCE_OR_TARGET:
        return convertSourceOrTargetToString(eDataType, instanceValue);
      case HierarchicalgraphPackage.IITEM_LABEL_PROVIDER:
        return convertIItemLabelProviderToString(eDataType, instanceValue);
      case HierarchicalgraphPackage.FUTURE:
        return convertFutureToString(eDataType, instanceValue);
      case HierarchicalgraphPackage.IAGGREGATED_CORE_DEPENDENCY_RESOLVER:
        return convertIAggregatedCoreDependencyResolverToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public HGNode createHGNode() {
    HGNodeImpl hgNode = new ExtendedHGNodeImpl();
    return hgNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public HGRootNode createHGRootNode() {
    HGRootNodeImpl hgRootNode = new ExtendedHGRootNodeImpl();
    return hgRootNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultNodeSource createDefaultNodeSource() {
    DefaultNodeSourceImpl defaultNodeSource = new DefaultNodeSourceImpl();
    return defaultNodeSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultDependencySource createDefaultDependencySource() {
    DefaultDependencySourceImpl defaultDependencySource = new DefaultDependencySourceImpl();
    return defaultDependencySource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public HGAggregatedDependency createHGAggregatedDependency() {
    HGAggregatedDependencyImpl hgAggregatedDependency = new ExtendedHGAggregatedDependencyImpl();
    return hgAggregatedDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public HGCoreDependency createHGCoreDependency() {
    HGCoreDependencyImpl hgCoreDependency = new ExtendedHGCoreDependencyImpl();
    return hgCoreDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public HGAggregatedCoreDependency createHGAggregatedCoreDependency() {
    HGAggregatedCoreDependencyImpl hgAggregatedCoreDependency = new ExtendedHGAggregatedCoreDependencyImpl();
    return hgAggregatedCoreDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<HGNode, HGCoreDependency> createNodeToCoreDependencyMap() {
    NodeToCoreDependencyMapImpl nodeToCoreDependencyMap = new NodeToCoreDependencyMapImpl();
    return nodeToCoreDependencyMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<String, String> createStringToStringMap() {
    StringToStringMapImpl stringToStringMap = new StringToStringMapImpl();
    return stringToStringMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<Object, HGNode> createIdentifierToNodeMap() {
    IdentifierToNodeMapImpl identifierToNodeMap = new IdentifierToNodeMapImpl();
    return identifierToNodeMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<HGNode, List<HGCoreDependency>> createNodeToCoreDependenciesMap() {
    NodeToCoreDependenciesMapImpl nodeToCoreDependenciesMap = new NodeToCoreDependenciesMapImpl();
    return nodeToCoreDependenciesMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceOrTarget createSourceOrTargetFromString(EDataType eDataType, String initialValue) {
    SourceOrTarget result = SourceOrTarget.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSourceOrTargetToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IItemLabelProvider createIItemLabelProviderFromString(EDataType eDataType, String initialValue) {
    return (IItemLabelProvider)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIItemLabelProviderToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Future<?> createFutureFromString(EDataType eDataType, String initialValue) {
    return (Future<?>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFutureToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IAggregatedCoreDependencyResolver createIAggregatedCoreDependencyResolverFromString(EDataType eDataType, String initialValue) {
    return (IAggregatedCoreDependencyResolver)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIAggregatedCoreDependencyResolverToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalgraphPackage getHierarchicalgraphPackage() {
    return (HierarchicalgraphPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HierarchicalgraphPackage getPackage() {
    return HierarchicalgraphPackage.eINSTANCE;
  }

} //HierarchicalgraphFactoryImpl

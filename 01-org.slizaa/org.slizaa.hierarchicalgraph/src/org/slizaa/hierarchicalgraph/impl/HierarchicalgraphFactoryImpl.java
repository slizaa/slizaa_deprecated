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
import org.slizaa.hierarchicalgraph.DefaultHGNodeSource;
import org.slizaa.hierarchicalgraph.HGDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.HierarchicalgraphPackage;

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
      case HierarchicalgraphPackage.HG_DEPENDENCY_SOURCE: return createHGDependencySource();
      case HierarchicalgraphPackage.HG_ROOT_NODE: return createHGRootNode();
      case HierarchicalgraphPackage.DEFAULT_HG_NODE_SOURCE: return createDefaultHGNodeSource();
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE: return createDefaultHGDependencySource();
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY: return createHGCoreDependency();
      case HierarchicalgraphPackage.HG_AGGREGATED_CORE_DEPENDENCY: return createHGAggregatedCoreDependency();
      case HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY: return createHGAggregatedDependency();
      case HierarchicalgraphPackage.NODE_TO_DEPENDENCY_MAP: return (EObject)createNodeToDependencyMap();
      case HierarchicalgraphPackage.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
      case HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP: return (EObject)createIdentifierToNodeMap();
      case HierarchicalgraphPackage.NODE_TO_DEPENDENCIES_MAP: return (EObject)createNodeToDependenciesMap();
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
      case HierarchicalgraphPackage.IITEM_LABEL_PROVIDER:
        return createIItemLabelProviderFromString(eDataType, initialValue);
      case HierarchicalgraphPackage.FUTURE:
        return createFutureFromString(eDataType, initialValue);
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
      case HierarchicalgraphPackage.IITEM_LABEL_PROVIDER:
        return convertIItemLabelProviderToString(eDataType, instanceValue);
      case HierarchicalgraphPackage.FUTURE:
        return convertFutureToString(eDataType, instanceValue);
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
    ExtendedHGNodeImpl hgNode = new ExtendedHGNodeImpl();
    return hgNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGDependencySource createHGDependencySource() {
    HGDependencySourceImpl hgDependencySource = new HGDependencySourceImpl();
    return hgDependencySource;
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
  public DefaultHGNodeSource createDefaultHGNodeSource() {
    DefaultHGNodeSourceImpl defaultHGNodeSource = new DefaultHGNodeSourceImpl();
    return defaultHGNodeSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultHGDependencySource createDefaultHGDependencySource() {
    DefaultHGDependencySourceImpl defaultHGDependencySource = new DefaultHGDependencySourceImpl();
    return defaultHGDependencySource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public HGDependency createHGDependency() {
    HGDependencyImpl hgDependency = new ExtendedHGDependencyImpl();
    return hgDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGCoreDependency createHGCoreDependency() {
    HGCoreDependencyImpl hgCoreDependency = new HGCoreDependencyImpl();
    return hgCoreDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGAggregatedCoreDependency createHGAggregatedCoreDependency() {
    HGAggregatedCoreDependencyImpl hgAggregatedCoreDependency = new HGAggregatedCoreDependencyImpl();
    return hgAggregatedCoreDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HGAggregatedDependency createHGAggregatedDependency() {
    HGAggregatedDependencyImpl hgAggregatedDependency = new HGAggregatedDependencyImpl();
    return hgAggregatedDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<HGNode, HGDependency> createNodeToDependencyMap() {
    NodeToDependencyMapImpl nodeToDependencyMap = new NodeToDependencyMapImpl();
    return nodeToDependencyMap;
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
  public Map.Entry<HGNode, List<HGDependency>> createNodeToDependenciesMap() {
    NodeToDependenciesMapImpl nodeToDependenciesMap = new NodeToDependenciesMapImpl();
    return nodeToDependenciesMap;
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

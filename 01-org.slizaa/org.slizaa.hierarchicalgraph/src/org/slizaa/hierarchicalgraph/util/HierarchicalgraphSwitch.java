/**
 */
package org.slizaa.hierarchicalgraph.util;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.slizaa.hierarchicalgraph.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage
 * @generated
 */
public class HierarchicalgraphSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HierarchicalgraphPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalgraphSwitch() {
    if (modelPackage == null) {
      modelPackage = HierarchicalgraphPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case HierarchicalgraphPackage.HG_NODE: {
        HGNode hgNode = (HGNode)theEObject;
        T result = caseHGNode(hgNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.HG_NODE_SOURCE: {
        HGNodeSource hgNodeSource = (HGNodeSource)theEObject;
        T result = caseHGNodeSource(hgNodeSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.HG_DEPENDENCY_SOURCE: {
        HGDependencySource hgDependencySource = (HGDependencySource)theEObject;
        T result = caseHGDependencySource(hgDependencySource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.HG_ROOT_NODE: {
        HGRootNode hgRootNode = (HGRootNode)theEObject;
        T result = caseHGRootNode(hgRootNode);
        if (result == null) result = caseHGNode(hgRootNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.DEFAULT_HG_NODE_SOURCE: {
        DefaultHGNodeSource defaultHGNodeSource = (DefaultHGNodeSource)theEObject;
        T result = caseDefaultHGNodeSource(defaultHGNodeSource);
        if (result == null) result = caseHGNodeSource(defaultHGNodeSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.DEFAULT_HG_DEPENDENCY_SOURCE: {
        DefaultHGDependencySource defaultHGDependencySource = (DefaultHGDependencySource)theEObject;
        T result = caseDefaultHGDependencySource(defaultHGDependencySource);
        if (result == null) result = caseHGDependencySource(defaultHGDependencySource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.ABSTRACT_HG_DEPENDENCY: {
        AbstractHGDependency abstractHGDependency = (AbstractHGDependency)theEObject;
        T result = caseAbstractHGDependency(abstractHGDependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.HG_AGGREGATED_DEPENDENCY: {
        HGAggregatedDependency hgAggregatedDependency = (HGAggregatedDependency)theEObject;
        T result = caseHGAggregatedDependency(hgAggregatedDependency);
        if (result == null) result = caseAbstractHGDependency(hgAggregatedDependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.HG_CORE_DEPENDENCY: {
        HGCoreDependency hgCoreDependency = (HGCoreDependency)theEObject;
        T result = caseHGCoreDependency(hgCoreDependency);
        if (result == null) result = caseAbstractHGDependency(hgCoreDependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCY_MAP: {
        @SuppressWarnings("unchecked") Map.Entry<HGNode, HGCoreDependency> nodeToCoreDependencyMap = (Map.Entry<HGNode, HGCoreDependency>)theEObject;
        T result = caseNodeToCoreDependencyMap(nodeToCoreDependencyMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.STRING_TO_STRING_MAP: {
        @SuppressWarnings("unchecked") Map.Entry<String, String> stringToStringMap = (Map.Entry<String, String>)theEObject;
        T result = caseStringToStringMap(stringToStringMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.IDENTIFIER_TO_NODE_MAP: {
        @SuppressWarnings("unchecked") Map.Entry<Object, HGNode> identifierToNodeMap = (Map.Entry<Object, HGNode>)theEObject;
        T result = caseIdentifierToNodeMap(identifierToNodeMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalgraphPackage.NODE_TO_CORE_DEPENDENCIES_MAP: {
        @SuppressWarnings("unchecked") Map.Entry<HGNode, List<HGCoreDependency>> nodeToCoreDependenciesMap = (Map.Entry<HGNode, List<HGCoreDependency>>)theEObject;
        T result = caseNodeToCoreDependenciesMap(nodeToCoreDependenciesMap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HG Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HG Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHGNode(HGNode object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HG Node Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HG Node Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHGNodeSource(HGNodeSource object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HG Dependency Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HG Dependency Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHGDependencySource(HGDependencySource object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HG Root Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HG Root Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHGRootNode(HGRootNode object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default HG Node Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default HG Node Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultHGNodeSource(DefaultHGNodeSource object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default HG Dependency Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default HG Dependency Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultHGDependencySource(DefaultHGDependencySource object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract HG Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract HG Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractHGDependency(AbstractHGDependency object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HG Aggregated Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HG Aggregated Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHGAggregatedDependency(HGAggregatedDependency object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HG Core Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HG Core Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHGCoreDependency(HGCoreDependency object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node To Core Dependency Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node To Core Dependency Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeToCoreDependencyMap(Map.Entry<HGNode, HGCoreDependency> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String To String Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String To String Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringToStringMap(Map.Entry<String, String> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identifier To Node Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifier To Node Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentifierToNodeMap(Map.Entry<Object, HGNode> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node To Core Dependencies Map</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node To Core Dependencies Map</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeToCoreDependenciesMap(Map.Entry<HGNode, List<HGCoreDependency>> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} //HierarchicalgraphSwitch

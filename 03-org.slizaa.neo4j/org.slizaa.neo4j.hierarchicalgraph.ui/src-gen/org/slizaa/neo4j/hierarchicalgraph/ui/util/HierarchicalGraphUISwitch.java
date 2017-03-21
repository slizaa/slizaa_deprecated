/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.slizaa.neo4j.hierarchicalgraph.ui.*;

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
 * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage
 * @generated
 */
public class HierarchicalGraphUISwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HierarchicalGraphUIPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalGraphUISwitch() {
    if (modelPackage == null) {
      modelPackage = HierarchicalGraphUIPackage.eINSTANCE;
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
      case HierarchicalGraphUIPackage.ISLIZAA_MAPPING_DESCRIPTION: {
        ISlizaaMappingDescription iSlizaaMappingDescription = (ISlizaaMappingDescription)theEObject;
        T result = caseISlizaaMappingDescription(iSlizaaMappingDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalGraphUIPackage.BUNDLE_BASED_MAPPING_DESCRIPTOR: {
        BundleBasedMappingDescriptor bundleBasedMappingDescriptor = (BundleBasedMappingDescriptor)theEObject;
        T result = caseBundleBasedMappingDescriptor(bundleBasedMappingDescriptor);
        if (result == null) result = caseISlizaaMappingDescription(bundleBasedMappingDescriptor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalGraphUIPackage.WORKSPACE_BASED_MAPPING_DESCRIPTOR: {
        WorkspaceBasedMappingDescriptor workspaceBasedMappingDescriptor = (WorkspaceBasedMappingDescriptor)theEObject;
        T result = caseWorkspaceBasedMappingDescriptor(workspaceBasedMappingDescriptor);
        if (result == null) result = caseISlizaaMappingDescription(workspaceBasedMappingDescriptor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HierarchicalGraphUIPackage.MAPPING_DESCRIPTOR_CONTAINER: {
        MappingDescriptorContainer mappingDescriptorContainer = (MappingDescriptorContainer)theEObject;
        T result = caseMappingDescriptorContainer(mappingDescriptorContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ISlizaa Mapping Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ISlizaa Mapping Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseISlizaaMappingDescription(ISlizaaMappingDescription object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bundle Based Mapping Descriptor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bundle Based Mapping Descriptor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBundleBasedMappingDescriptor(BundleBasedMappingDescriptor object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workspace Based Mapping Descriptor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workspace Based Mapping Descriptor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkspaceBasedMappingDescriptor(WorkspaceBasedMappingDescriptor object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Descriptor Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Descriptor Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingDescriptorContainer(MappingDescriptorContainer object) {
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

} //HierarchicalGraphUISwitch

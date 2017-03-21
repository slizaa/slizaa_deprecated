/**
 */
package org.slizaa.neo4j.hierarchicalgraph.ui.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.slizaa.neo4j.hierarchicalgraph.ui.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.hierarchicalgraph.ui.HierarchicalGraphUIPackage
 * @generated
 */
public class HierarchicalGraphUIAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HierarchicalGraphUIPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalGraphUIAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = HierarchicalGraphUIPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HierarchicalGraphUISwitch<Adapter> modelSwitch =
    new HierarchicalGraphUISwitch<Adapter>() {
      @Override
      public Adapter caseISlizaaMappingDescription(ISlizaaMappingDescription object) {
        return createISlizaaMappingDescriptionAdapter();
      }
      @Override
      public Adapter caseBundleBasedMappingDescriptor(BundleBasedMappingDescriptor object) {
        return createBundleBasedMappingDescriptorAdapter();
      }
      @Override
      public Adapter caseWorkspaceBasedMappingDescriptor(WorkspaceBasedMappingDescriptor object) {
        return createWorkspaceBasedMappingDescriptorAdapter();
      }
      @Override
      public Adapter caseMappingDescriptorContainer(MappingDescriptorContainer object) {
        return createMappingDescriptorContainerAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescription <em>ISlizaa Mapping Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.ISlizaaMappingDescription
   * @generated
   */
  public Adapter createISlizaaMappingDescriptionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor <em>Bundle Based Mapping Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.BundleBasedMappingDescriptor
   * @generated
   */
  public Adapter createBundleBasedMappingDescriptorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor <em>Workspace Based Mapping Descriptor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.WorkspaceBasedMappingDescriptor
   * @generated
   */
  public Adapter createWorkspaceBasedMappingDescriptorAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer <em>Mapping Descriptor Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.hierarchicalgraph.ui.MappingDescriptorContainer
   * @generated
   */
  public Adapter createMappingDescriptorContainerAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //HierarchicalGraphUIAdapterFactory

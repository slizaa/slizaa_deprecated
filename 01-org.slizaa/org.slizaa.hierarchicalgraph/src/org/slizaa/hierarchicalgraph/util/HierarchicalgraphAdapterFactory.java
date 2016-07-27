/**
 */
package org.slizaa.hierarchicalgraph.util;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.slizaa.hierarchicalgraph.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.hierarchicalgraph.HierarchicalgraphPackage
 * @generated
 */
public class HierarchicalgraphAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HierarchicalgraphPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchicalgraphAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = HierarchicalgraphPackage.eINSTANCE;
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
  protected HierarchicalgraphSwitch<Adapter> modelSwitch =
    new HierarchicalgraphSwitch<Adapter>() {
      @Override
      public Adapter caseHGNode(HGNode object) {
        return createHGNodeAdapter();
      }
      @Override
      public Adapter caseHGNodeSource(HGNodeSource object) {
        return createHGNodeSourceAdapter();
      }
      @Override
      public Adapter caseHGRootNode(HGRootNode object) {
        return createHGRootNodeAdapter();
      }
      @Override
      public Adapter caseDefaultHGNodeSource(DefaultHGNodeSource object) {
        return createDefaultHGNodeSourceAdapter();
      }
      @Override
      public Adapter caseHGDependency(HGDependency object) {
        return createHGDependencyAdapter();
      }
      @Override
      public Adapter caseNodeToDependencyMap(Map.Entry<HGNode, HGDependency> object) {
        return createNodeToDependencyMapAdapter();
      }
      @Override
      public Adapter caseStringToStringMap(Map.Entry<String, String> object) {
        return createStringToStringMapAdapter();
      }
      @Override
      public Adapter caseIdentifierToNodeMap(Map.Entry<Object, HGNode> object) {
        return createIdentifierToNodeMapAdapter();
      }
      @Override
      public Adapter caseNodeToDependenciesMap(Map.Entry<HGNode, List<HGDependency>> object) {
        return createNodeToDependenciesMapAdapter();
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
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.HGNode <em>HG Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.HGNode
   * @generated
   */
  public Adapter createHGNodeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.HGNodeSource <em>HG Node Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.HGNodeSource
   * @generated
   */
  public Adapter createHGNodeSourceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.HGRootNode <em>HG Root Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.HGRootNode
   * @generated
   */
  public Adapter createHGRootNodeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.DefaultHGNodeSource <em>Default HG Node Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.DefaultHGNodeSource
   * @generated
   */
  public Adapter createDefaultHGNodeSourceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.HGDependency <em>HG Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.HGDependency
   * @generated
   */
  public Adapter createHGDependencyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Node To Dependency Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see java.util.Map.Entry
   * @generated
   */
  public Adapter createNodeToDependencyMapAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see java.util.Map.Entry
   * @generated
   */
  public Adapter createStringToStringMapAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Identifier To Node Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see java.util.Map.Entry
   * @generated
   */
  public Adapter createIdentifierToNodeMapAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Node To Dependencies Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see java.util.Map.Entry
   * @generated
   */
  public Adapter createNodeToDependenciesMapAdapter() {
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

} //HierarchicalgraphAdapterFactory

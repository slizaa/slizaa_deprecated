/**
 */
package org.slizaa.hierarchicalgraph.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EList;

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
      public Adapter caseINodeSource(INodeSource object) {
        return createINodeSourceAdapter();
      }
      @Override
      public Adapter caseIDependencySource(IDependencySource object) {
        return createIDependencySourceAdapter();
      }
      @Override
      public Adapter caseHGRootNode(HGRootNode object) {
        return createHGRootNodeAdapter();
      }
      @Override
      public Adapter caseDefaultNodeSource(DefaultNodeSource object) {
        return createDefaultNodeSourceAdapter();
      }
      @Override
      public Adapter caseDefaultDependencySource(DefaultDependencySource object) {
        return createDefaultDependencySourceAdapter();
      }
      @Override
      public Adapter caseAbstractHGDependency(AbstractHGDependency object) {
        return createAbstractHGDependencyAdapter();
      }
      @Override
      public Adapter caseHGAggregatedDependency(HGAggregatedDependency object) {
        return createHGAggregatedDependencyAdapter();
      }
      @Override
      public Adapter caseHGCoreDependency(HGCoreDependency object) {
        return createHGCoreDependencyAdapter();
      }
      @Override
      public Adapter caseHGAggregatedCoreDependency(HGAggregatedCoreDependency object) {
        return createHGAggregatedCoreDependencyAdapter();
      }
      @Override
      public Adapter caseNodeToCoreDependencyMap(Map.Entry<HGNode, HGCoreDependency> object) {
        return createNodeToCoreDependencyMapAdapter();
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
      public Adapter caseNodeToCoreDependenciesMap(Map.Entry<HGNode, EList<HGCoreDependency>> object) {
        return createNodeToCoreDependenciesMapAdapter();
      }
      @Override
      public Adapter caseICoreDependenciesList(ICoreDependenciesList object) {
        return createICoreDependenciesListAdapter();
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
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.INodeSource <em>INode Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.INodeSource
   * @generated
   */
  public Adapter createINodeSourceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.IDependencySource <em>IDependency Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.IDependencySource
   * @generated
   */
  public Adapter createIDependencySourceAdapter() {
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
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.DefaultNodeSource <em>Default Node Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.DefaultNodeSource
   * @generated
   */
  public Adapter createDefaultNodeSourceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.DefaultDependencySource <em>Default Dependency Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.DefaultDependencySource
   * @generated
   */
  public Adapter createDefaultDependencySourceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.AbstractHGDependency <em>Abstract HG Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.AbstractHGDependency
   * @generated
   */
  public Adapter createAbstractHGDependencyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.HGAggregatedDependency <em>HG Aggregated Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.HGAggregatedDependency
   * @generated
   */
  public Adapter createHGAggregatedDependencyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.HGCoreDependency <em>HG Core Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.HGCoreDependency
   * @generated
   */
  public Adapter createHGCoreDependencyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency <em>HG Aggregated Core Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.HGAggregatedCoreDependency
   * @generated
   */
  public Adapter createHGAggregatedCoreDependencyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Node To Core Dependency Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see java.util.Map.Entry
   * @generated
   */
  public Adapter createNodeToCoreDependencyMapAdapter() {
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
   * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Node To Core Dependencies Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see java.util.Map.Entry
   * @generated
   */
  public Adapter createNodeToCoreDependenciesMapAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.hierarchicalgraph.ICoreDependenciesList <em>ICore Dependencies List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.hierarchicalgraph.ICoreDependenciesList
   * @generated
   */
  public Adapter createICoreDependenciesListAdapter() {
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

/**
 */
package org.slizaa.neo4j.hierarchicalgraph.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.slizaa.hierarchicalgraph.IDependencySource;
import org.slizaa.hierarchicalgraph.INodeSource;
import org.slizaa.neo4j.hierarchicalgraph.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage
 * @generated
 */
public class Neo4jHierarchicalgraphAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static Neo4jHierarchicalgraphPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Neo4jHierarchicalgraphAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = Neo4jHierarchicalgraphPackage.eINSTANCE;
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
	protected Neo4jHierarchicalgraphSwitch<Adapter> modelSwitch =
		new Neo4jHierarchicalgraphSwitch<Adapter>() {
      @Override
      public Adapter caseNeo4JBackedNodeSource(Neo4JBackedNodeSource object) {
        return createNeo4JBackedNodeSourceAdapter();
      }
      @Override
      public Adapter caseNeo4JBackedRootNodeSource(Neo4JBackedRootNodeSource object) {
        return createNeo4JBackedRootNodeSourceAdapter();
      }
      @Override
      public Adapter caseNeo4JBackedDependencySource(Neo4JBackedDependencySource object) {
        return createNeo4JBackedDependencySourceAdapter();
      }
      @Override
      public Adapter caseINeo4JRepository(INeo4JRepository object) {
        return createINeo4JRepositoryAdapter();
      }
      @Override
      public Adapter caseNeo4JRemoteRepository(Neo4JRemoteRepository object) {
        return createNeo4JRemoteRepositoryAdapter();
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
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource <em>Neo4 JBacked Node Source</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource
   * @generated
   */
	public Adapter createNeo4JBackedNodeSourceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource <em>Neo4 JBacked Root Node Source</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource
   * @generated
   */
	public Adapter createNeo4JBackedRootNodeSourceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository <em>INeo4 JRepository</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository
   * @generated
   */
	public Adapter createINeo4JRepositoryAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository <em>Neo4 JRemote Repository</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository
   * @generated
   */
	public Adapter createNeo4JRemoteRepositoryAdapter() {
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
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource <em>Neo4 JBacked Dependency Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedDependencySource
   * @generated
   */
  public Adapter createNeo4JBackedDependencySourceAdapter() {
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

} //Neo4jHierarchicalgraphAdapterFactory

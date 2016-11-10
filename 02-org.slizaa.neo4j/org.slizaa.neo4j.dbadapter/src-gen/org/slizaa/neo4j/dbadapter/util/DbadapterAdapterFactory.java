/**
 */
package org.slizaa.neo4j.dbadapter.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.slizaa.neo4j.dbadapter.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.dbadapter.DbadapterPackage
 * @generated
 */
public class DbadapterAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DbadapterPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbadapterAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = DbadapterPackage.eINSTANCE;
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
  protected DbadapterSwitch<Adapter> modelSwitch =
    new DbadapterSwitch<Adapter>() {
      @Override
      public Adapter caseNeo4jRestClient(Neo4jRestClient object) {
        return createNeo4jRestClientAdapter();
      }
      @Override
      public Adapter caseDbAdapterRegistry(DbAdapterRegistry object) {
        return createDbAdapterRegistryAdapter();
      }
      @Override
      public Adapter caseDbadapterContainer(DbadapterContainer object) {
        return createDbadapterContainerAdapter();
      }
      @Override
      public Adapter caseManagedNeo4jInstance(ManagedNeo4jInstance object) {
        return createManagedNeo4jInstanceAdapter();
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
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.dbadapter.Neo4jRestClient <em>Neo4j Rest Client</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.dbadapter.Neo4jRestClient
   * @generated
   */
  public Adapter createNeo4jRestClientAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.dbadapter.DbAdapterRegistry <em>Db Adapter Registry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.dbadapter.DbAdapterRegistry
   * @generated
   */
  public Adapter createDbAdapterRegistryAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.dbadapter.DbadapterContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.dbadapter.DbadapterContainer
   * @generated
   */
  public Adapter createDbadapterContainerAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance <em>Managed Neo4j Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance
   * @generated
   */
  public Adapter createManagedNeo4jInstanceAdapter() {
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

} //DbadapterAdapterFactory

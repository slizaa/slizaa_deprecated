/**
 */
package org.slizaa.neo4j.dbadapter.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.slizaa.neo4j.dbadapter.*;

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
 * @see org.slizaa.neo4j.dbadapter.DbAdapterPackage
 * @generated
 */
public class DbAdapterSwitch<T1> extends Switch<T1> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DbAdapterPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbAdapterSwitch() {
    if (modelPackage == null) {
      modelPackage = DbAdapterPackage.eINSTANCE;
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
  protected T1 doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case DbAdapterPackage.NEO4J_REST_CLIENT: {
        Neo4jRestClient neo4jRestClient = (Neo4jRestClient)theEObject;
        T1 result = caseNeo4jRestClient(neo4jRestClient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DbAdapterPackage.DB_ADAPTER_REGISTRY: {
        DbAdapterRegistry dbAdapterRegistry = (DbAdapterRegistry)theEObject;
        T1 result = caseDbAdapterRegistry(dbAdapterRegistry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DbAdapterPackage.DB_ADAPTER_CONTAINER: {
        DbAdapterContainer<?> dbAdapterContainer = (DbAdapterContainer<?>)theEObject;
        T1 result = caseDbAdapterContainer(dbAdapterContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE: {
        ManagedNeo4jInstance managedNeo4jInstance = (ManagedNeo4jInstance)theEObject;
        T1 result = caseManagedNeo4jInstance(managedNeo4jInstance);
        if (result == null) result = caseNeo4jRestClient(managedNeo4jInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neo4j Rest Client</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neo4j Rest Client</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseNeo4jRestClient(Neo4jRestClient object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Registry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Registry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseDbAdapterRegistry(DbAdapterRegistry object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <T extends Neo4jRestClient> T1 caseDbAdapterContainer(DbAdapterContainer<T> object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Managed Neo4j Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Managed Neo4j Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseManagedNeo4jInstance(ManagedNeo4jInstance object) {
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
  public T1 defaultCase(EObject object) {
    return null;
  }

} //DbAdapterSwitch

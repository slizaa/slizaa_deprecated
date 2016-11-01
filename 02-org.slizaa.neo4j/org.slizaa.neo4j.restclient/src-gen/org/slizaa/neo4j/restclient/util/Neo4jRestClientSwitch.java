/**
 */
package org.slizaa.neo4j.restclient.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.slizaa.neo4j.restclient.*;

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
 * @see org.slizaa.neo4j.restclient.Neo4jRestClientPackage
 * @generated
 */
public class Neo4jRestClientSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Neo4jRestClientPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Neo4jRestClientSwitch() {
    if (modelPackage == null) {
      modelPackage = Neo4jRestClientPackage.eINSTANCE;
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
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT: {
        Neo4jRestClient neo4jRestClient = (Neo4jRestClient)theEObject;
        T result = caseNeo4jRestClient(neo4jRestClient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_REGISTRY: {
        Neo4jRestClientRegistry neo4jRestClientRegistry = (Neo4jRestClientRegistry)theEObject;
        T result = caseNeo4jRestClientRegistry(neo4jRestClientRegistry);
        if (result == null) result = caseNeo4jRestClientContainer(neo4jRestClientRegistry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER: {
        Neo4jRestClientContainer neo4jRestClientContainer = (Neo4jRestClientContainer)theEObject;
        T result = caseNeo4jRestClientContainer(neo4jRestClientContainer);
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
  public T caseNeo4jRestClient(Neo4jRestClient object) {
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
  public T caseNeo4jRestClientRegistry(Neo4jRestClientRegistry object) {
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
  public T caseNeo4jRestClientContainer(Neo4jRestClientContainer object) {
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

} //Neo4jRestClientSwitch

/**
 */
package org.slizaa.neo4j.hierarchicalgraph.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.slizaa.hierarchicalgraph.IDependencySource;
import org.slizaa.hierarchicalgraph.INodeSource;
import org.slizaa.neo4j.hierarchicalgraph.*;

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
 * @see org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage
 * @generated
 */
public class Neo4jHierarchicalgraphSwitch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static Neo4jHierarchicalgraphPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Neo4jHierarchicalgraphSwitch() {
    if (modelPackage == null) {
      modelPackage = Neo4jHierarchicalgraphPackage.eINSTANCE;
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
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE: {
        Neo4JBackedNodeSource neo4JBackedNodeSource = (Neo4JBackedNodeSource)theEObject;
        T result = caseNeo4JBackedNodeSource(neo4JBackedNodeSource);
        if (result == null) result = caseINodeSource(neo4JBackedNodeSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE: {
        Neo4JBackedRootNodeSource neo4JBackedRootNodeSource = (Neo4JBackedRootNodeSource)theEObject;
        T result = caseNeo4JBackedRootNodeSource(neo4JBackedRootNodeSource);
        if (result == null) result = caseNeo4JBackedNodeSource(neo4JBackedRootNodeSource);
        if (result == null) result = caseINodeSource(neo4JBackedRootNodeSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE: {
        Neo4JBackedDependencySource neo4JBackedDependencySource = (Neo4JBackedDependencySource)theEObject;
        T result = caseNeo4JBackedDependencySource(neo4JBackedDependencySource);
        if (result == null) result = caseIDependencySource(neo4JBackedDependencySource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Neo4jHierarchicalgraphPackage.INEO4_JREPOSITORY: {
        INeo4JRepository iNeo4JRepository = (INeo4JRepository)theEObject;
        T result = caseINeo4JRepository(iNeo4JRepository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY: {
        Neo4JRemoteRepository neo4JRemoteRepository = (Neo4JRemoteRepository)theEObject;
        T result = caseNeo4JRemoteRepository(neo4JRemoteRepository);
        if (result == null) result = caseINeo4JRepository(neo4JRemoteRepository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Neo4 JBacked Node Source</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neo4 JBacked Node Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNeo4JBackedNodeSource(Neo4JBackedNodeSource object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Neo4 JBacked Root Node Source</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neo4 JBacked Root Node Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNeo4JBackedRootNodeSource(Neo4JBackedRootNodeSource object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>INeo4 JRepository</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>INeo4 JRepository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseINeo4JRepository(INeo4JRepository object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Neo4 JRemote Repository</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neo4 JRemote Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNeo4JRemoteRepository(Neo4JRemoteRepository object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>INode Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>INode Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseINodeSource(INodeSource object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IDependency Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IDependency Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIDependencySource(IDependencySource object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neo4 JBacked Dependency Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neo4 JBacked Dependency Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNeo4JBackedDependencySource(Neo4JBackedDependencySource object) {
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

} //Neo4jHierarchicalgraphSwitch

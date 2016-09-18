/**
 */
package org.slizaa.neo4j.hierarchicalgraph.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.slizaa.neo4j.hierarchicalgraph.INeo4JRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4 JBacked Root Node Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.impl.Neo4JBackedRootNodeSourceImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Neo4JBackedRootNodeSourceImpl extends Neo4JBackedNodeSourceImpl implements Neo4JBackedRootNodeSource {
  /**
   * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepository()
   * @generated
   * @ordered
   */
  protected INeo4JRepository repository;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Neo4JBackedRootNodeSourceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Neo4jHierarchicalgraphPackage.Literals.NEO4_JBACKED_ROOT_NODE_SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INeo4JRepository getRepository() {
    if (repository != null && repository.eIsProxy()) {
      InternalEObject oldRepository = (InternalEObject)repository;
      repository = (INeo4JRepository)eResolveProxy(oldRepository);
      if (repository != oldRepository) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY, oldRepository, repository));
      }
    }
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INeo4JRepository basicGetRepository() {
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepository(INeo4JRepository newRepository) {
    INeo4JRepository oldRepository = repository;
    repository = newRepository;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY, oldRepository, repository));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY:
        if (resolve) return getRepository();
        return basicGetRepository();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY:
        setRepository((INeo4JRepository)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY:
        setRepository((INeo4JRepository)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE__REPOSITORY:
        return repository != null;
    }
    return super.eIsSet(featureID);
  }

} //Neo4JBackedRootNodeSourceImpl

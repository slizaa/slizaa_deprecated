/**
 */
package org.slizaa.neo4j.restclient.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slizaa.neo4j.restclient.Neo4jRestClient;
import org.slizaa.neo4j.restclient.Neo4jRestClientPackage;
import org.slizaa.neo4j.restclient.Neo4jRestClientRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.restclient.impl.Neo4jRestClientRegistryImpl#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Neo4jRestClientRegistryImpl extends MinimalEObjectImpl.Container implements Neo4jRestClientRegistry {
  /**
   * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClients()
   * @generated
   * @ordered
   */
  protected EList<Neo4jRestClient> clients;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Neo4jRestClientRegistryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Neo4jRestClientPackage.Literals.NEO4J_REST_CLIENT_REGISTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Neo4jRestClient> getClients() {
    if (clients == null) {
      clients = new EObjectContainmentEList<Neo4jRestClient>(Neo4jRestClient.class, this, Neo4jRestClientPackage.NEO4J_REST_CLIENT_REGISTRY__CLIENTS);
    }
    return clients;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_REGISTRY__CLIENTS:
        return ((InternalEList<?>)getClients()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_REGISTRY__CLIENTS:
        return getClients();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_REGISTRY__CLIENTS:
        getClients().clear();
        getClients().addAll((Collection<? extends Neo4jRestClient>)newValue);
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
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_REGISTRY__CLIENTS:
        getClients().clear();
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
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_REGISTRY__CLIENTS:
        return clients != null && !clients.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Neo4jRestClientRegistryImpl

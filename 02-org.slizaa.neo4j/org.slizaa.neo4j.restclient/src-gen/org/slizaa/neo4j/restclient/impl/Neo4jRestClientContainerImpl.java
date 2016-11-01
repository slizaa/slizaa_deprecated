/**
 */
package org.slizaa.neo4j.restclient.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slizaa.neo4j.restclient.Neo4jRestClientContainer;
import org.slizaa.neo4j.restclient.Neo4jRestClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.restclient.impl.Neo4jRestClientContainerImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link org.slizaa.neo4j.restclient.impl.Neo4jRestClientContainerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Neo4jRestClientContainerImpl extends MinimalEObjectImpl.Container implements Neo4jRestClientContainer {
  /**
   * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClients()
   * @generated
   * @ordered
   */
  protected EList<EObject> clients;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Neo4jRestClientContainerImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Neo4jRestClientPackage.Literals.NEO4J_REST_CLIENT_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getClients() {
    if (clients == null) {
      clients = new EObjectContainmentEList<EObject>(EObject.class, this, Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER__CLIENTS);
    }
    return clients;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER__CLIENTS:
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
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER__CLIENTS:
        return getClients();
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER__NAME:
        return getName();
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
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER__CLIENTS:
        getClients().clear();
        getClients().addAll((Collection<? extends EObject>)newValue);
        return;
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER__NAME:
        setName((String)newValue);
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
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER__CLIENTS:
        getClients().clear();
        return;
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER__NAME:
        setName(NAME_EDEFAULT);
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
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER__CLIENTS:
        return clients != null && !clients.isEmpty();
      case Neo4jRestClientPackage.NEO4J_REST_CLIENT_CONTAINER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //Neo4jRestClientContainerImpl

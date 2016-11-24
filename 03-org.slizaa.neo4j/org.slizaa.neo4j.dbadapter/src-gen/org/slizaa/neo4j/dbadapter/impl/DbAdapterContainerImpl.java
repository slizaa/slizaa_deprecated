/**
 */
package org.slizaa.neo4j.dbadapter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.neo4j.dbadapter.ContainerType;
import org.slizaa.neo4j.dbadapter.DbAdapterContainer;
import org.slizaa.neo4j.dbadapter.DbAdapterPackage;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.DbAdapterContainerImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.DbAdapterContainerImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.DbAdapterContainerImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DbAdapterContainerImpl extends MinimalEObjectImpl.Container implements DbAdapterContainer {
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ContainerType TYPE_EDEFAULT = ContainerType.MANAGED;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ContainerType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<Neo4jRestClient> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DbAdapterContainerImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DbAdapterPackage.Literals.DB_ADAPTER_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerType getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ContainerType newType) {
    ContainerType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.DB_ADAPTER_CONTAINER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbAdapterRegistry getParent() {
    if (eContainerFeatureID() != DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT) return null;
    return (DbAdapterRegistry)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(DbAdapterRegistry newParent, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newParent, DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(DbAdapterRegistry newParent) {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT && newParent != null)) {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, DbAdapterPackage.DB_ADAPTER_REGISTRY__CHILDREN, DbAdapterRegistry.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Neo4jRestClient> getChildren() {
    if (children == null) {
      children = new EObjectContainmentWithInverseEList<Neo4jRestClient>(Neo4jRestClient.class, this, DbAdapterPackage.DB_ADAPTER_CONTAINER__CHILDREN, DbAdapterPackage.NEO4J_REST_CLIENT__PARENT);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((DbAdapterRegistry)otherEnd, msgs);
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__CHILDREN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT:
        return basicSetParent(null, msgs);
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT:
        return eInternalContainer().eInverseRemove(this, DbAdapterPackage.DB_ADAPTER_REGISTRY__CHILDREN, DbAdapterRegistry.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__TYPE:
        return getType();
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT:
        return getParent();
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__CHILDREN:
        return getChildren();
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
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__TYPE:
        setType((ContainerType)newValue);
        return;
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT:
        setParent((DbAdapterRegistry)newValue);
        return;
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends Neo4jRestClient>)newValue);
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
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT:
        setParent((DbAdapterRegistry)null);
        return;
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__CHILDREN:
        getChildren().clear();
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
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__TYPE:
        return type != TYPE_EDEFAULT;
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT:
        return getParent() != null;
      case DbAdapterPackage.DB_ADAPTER_CONTAINER__CHILDREN:
        return children != null && !children.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //DbAdapterContainerImpl

/**
 */
package org.slizaa.neo4j.dbadapter.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slizaa.neo4j.dbadapter.ContainerType;
import org.slizaa.neo4j.dbadapter.DbAdapterContainer;
import org.slizaa.neo4j.dbadapter.DbAdapterPackage;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.DbAdapterRegistryImpl#getActiveDbAdapter <em>Active Db Adapter</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.DbAdapterRegistryImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DbAdapterRegistryImpl extends MinimalEObjectImpl.Container implements DbAdapterRegistry {
  /**
   * The cached value of the '{@link #getActiveDbAdapter() <em>Active Db Adapter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActiveDbAdapter()
   * @generated
   * @ordered
   */
  protected Neo4jRestClient activeDbAdapter;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<DbAdapterContainer> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DbAdapterRegistryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DbAdapterPackage.Literals.DB_ADAPTER_REGISTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Neo4jRestClient getActiveDbAdapter() {
    if (activeDbAdapter != null && activeDbAdapter.eIsProxy()) {
      InternalEObject oldActiveDbAdapter = (InternalEObject)activeDbAdapter;
      activeDbAdapter = (Neo4jRestClient)eResolveProxy(oldActiveDbAdapter);
      if (activeDbAdapter != oldActiveDbAdapter) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbAdapterPackage.DB_ADAPTER_REGISTRY__ACTIVE_DB_ADAPTER, oldActiveDbAdapter, activeDbAdapter));
      }
    }
    return activeDbAdapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Neo4jRestClient basicGetActiveDbAdapter() {
    return activeDbAdapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActiveDbAdapter(Neo4jRestClient newActiveDbAdapter) {
    Neo4jRestClient oldActiveDbAdapter = activeDbAdapter;
    activeDbAdapter = newActiveDbAdapter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.DB_ADAPTER_REGISTRY__ACTIVE_DB_ADAPTER, oldActiveDbAdapter, activeDbAdapter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DbAdapterContainer> getChildren() {
    if (children == null) {
      children = new EObjectContainmentWithInverseEList<DbAdapterContainer>(DbAdapterContainer.class, this, DbAdapterPackage.DB_ADAPTER_REGISTRY__CHILDREN, DbAdapterPackage.DB_ADAPTER_CONTAINER__PARENT);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbAdapterContainer getDbAdapterContainer(ContainerType type) {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__CHILDREN:
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
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__CHILDREN:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__ACTIVE_DB_ADAPTER:
        if (resolve) return getActiveDbAdapter();
        return basicGetActiveDbAdapter();
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__CHILDREN:
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
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__ACTIVE_DB_ADAPTER:
        setActiveDbAdapter((Neo4jRestClient)newValue);
        return;
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends DbAdapterContainer>)newValue);
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
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__ACTIVE_DB_ADAPTER:
        setActiveDbAdapter((Neo4jRestClient)null);
        return;
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__CHILDREN:
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
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__ACTIVE_DB_ADAPTER:
        return activeDbAdapter != null;
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__CHILDREN:
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
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case DbAdapterPackage.DB_ADAPTER_REGISTRY___GET_DB_ADAPTER_CONTAINER__CONTAINERTYPE:
        return getDbAdapterContainer((ContainerType)arguments.get(0));
    }
    return super.eInvoke(operationID, arguments);
  }

} //DbAdapterRegistryImpl

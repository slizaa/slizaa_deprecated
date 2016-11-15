/**
 */
package org.slizaa.neo4j.dbadapter.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.slizaa.neo4j.dbadapter.DbAdapterContainer;
import org.slizaa.neo4j.dbadapter.DbAdapterPackage;
import org.slizaa.neo4j.dbadapter.DbAdapterRegistry;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;
import org.slizaa.neo4j.dbadapter.Neo4jRestClient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.DbAdapterRegistryImpl#getManaged <em>Managed</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.DbAdapterRegistryImpl#getUnmanaged <em>Unmanaged</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DbAdapterRegistryImpl extends MinimalEObjectImpl.Container implements DbAdapterRegistry {
  /**
   * The cached value of the '{@link #getManaged() <em>Managed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManaged()
   * @generated
   * @ordered
   */
  protected DbAdapterContainer<ManagedNeo4jInstance> managed;

  /**
   * The cached value of the '{@link #getUnmanaged() <em>Unmanaged</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnmanaged()
   * @generated
   * @ordered
   */
  protected DbAdapterContainer<Neo4jRestClient> unmanaged;

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
  public DbAdapterContainer<ManagedNeo4jInstance> getManaged() {
    return managed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManaged(DbAdapterContainer<ManagedNeo4jInstance> newManaged, NotificationChain msgs) {
    DbAdapterContainer<ManagedNeo4jInstance> oldManaged = managed;
    managed = newManaged;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DbAdapterPackage.DB_ADAPTER_REGISTRY__MANAGED, oldManaged, newManaged);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManaged(DbAdapterContainer<ManagedNeo4jInstance> newManaged) {
    if (newManaged != managed) {
      NotificationChain msgs = null;
      if (managed != null)
        msgs = ((InternalEObject)managed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DbAdapterPackage.DB_ADAPTER_REGISTRY__MANAGED, null, msgs);
      if (newManaged != null)
        msgs = ((InternalEObject)newManaged).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DbAdapterPackage.DB_ADAPTER_REGISTRY__MANAGED, null, msgs);
      msgs = basicSetManaged(newManaged, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.DB_ADAPTER_REGISTRY__MANAGED, newManaged, newManaged));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbAdapterContainer<Neo4jRestClient> getUnmanaged() {
    return unmanaged;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnmanaged(DbAdapterContainer<Neo4jRestClient> newUnmanaged, NotificationChain msgs) {
    DbAdapterContainer<Neo4jRestClient> oldUnmanaged = unmanaged;
    unmanaged = newUnmanaged;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DbAdapterPackage.DB_ADAPTER_REGISTRY__UNMANAGED, oldUnmanaged, newUnmanaged);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnmanaged(DbAdapterContainer<Neo4jRestClient> newUnmanaged) {
    if (newUnmanaged != unmanaged) {
      NotificationChain msgs = null;
      if (unmanaged != null)
        msgs = ((InternalEObject)unmanaged).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DbAdapterPackage.DB_ADAPTER_REGISTRY__UNMANAGED, null, msgs);
      if (newUnmanaged != null)
        msgs = ((InternalEObject)newUnmanaged).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DbAdapterPackage.DB_ADAPTER_REGISTRY__UNMANAGED, null, msgs);
      msgs = basicSetUnmanaged(newUnmanaged, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.DB_ADAPTER_REGISTRY__UNMANAGED, newUnmanaged, newUnmanaged));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean hasHierarchicalGraph() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__MANAGED:
        return basicSetManaged(null, msgs);
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__UNMANAGED:
        return basicSetUnmanaged(null, msgs);
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
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__MANAGED:
        return getManaged();
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__UNMANAGED:
        return getUnmanaged();
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
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__MANAGED:
        setManaged((DbAdapterContainer<ManagedNeo4jInstance>)newValue);
        return;
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__UNMANAGED:
        setUnmanaged((DbAdapterContainer<Neo4jRestClient>)newValue);
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
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__MANAGED:
        setManaged((DbAdapterContainer<ManagedNeo4jInstance>)null);
        return;
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__UNMANAGED:
        setUnmanaged((DbAdapterContainer<Neo4jRestClient>)null);
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
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__MANAGED:
        return managed != null;
      case DbAdapterPackage.DB_ADAPTER_REGISTRY__UNMANAGED:
        return unmanaged != null;
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
      case DbAdapterPackage.DB_ADAPTER_REGISTRY___HAS_HIERARCHICAL_GRAPH:
        return hasHierarchicalGraph();
    }
    return super.eInvoke(operationID, arguments);
  }

} //DbAdapterRegistryImpl

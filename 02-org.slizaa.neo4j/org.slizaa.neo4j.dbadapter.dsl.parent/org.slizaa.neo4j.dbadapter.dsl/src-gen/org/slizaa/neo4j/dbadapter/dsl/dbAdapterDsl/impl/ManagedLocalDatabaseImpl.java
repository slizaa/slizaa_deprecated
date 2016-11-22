/**
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.DbAdapterDslPackage;
import org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.ManagedLocalDatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Managed Local Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.ManagedLocalDatabaseImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.ManagedLocalDatabaseImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.dsl.dbAdapterDsl.impl.ManagedLocalDatabaseImpl#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagedLocalDatabaseImpl extends DbAdapterDefinitionImpl implements ManagedLocalDatabase
{
  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final int PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected int port = PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getStorage() <em>Storage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorage()
   * @generated
   * @ordered
   */
  protected static final String STORAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorage()
   * @generated
   * @ordered
   */
  protected String storage = STORAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFiles() <em>Files</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFiles()
   * @generated
   * @ordered
   */
  protected EList<String> files;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ManagedLocalDatabaseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DbAdapterDslPackage.Literals.MANAGED_LOCAL_DATABASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(int newPort)
  {
    int oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStorage()
  {
    return storage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStorage(String newStorage)
  {
    String oldStorage = storage;
    storage = newStorage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__STORAGE, oldStorage, storage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFiles()
  {
    if (files == null)
    {
      files = new EDataTypeEList<String>(String.class, this, DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__FILES);
    }
    return files;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__PORT:
        return getPort();
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__STORAGE:
        return getStorage();
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__FILES:
        return getFiles();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__PORT:
        setPort((Integer)newValue);
        return;
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__STORAGE:
        setStorage((String)newValue);
        return;
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__FILES:
        getFiles().clear();
        getFiles().addAll((Collection<? extends String>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__STORAGE:
        setStorage(STORAGE_EDEFAULT);
        return;
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__FILES:
        getFiles().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__PORT:
        return port != PORT_EDEFAULT;
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__STORAGE:
        return STORAGE_EDEFAULT == null ? storage != null : !STORAGE_EDEFAULT.equals(storage);
      case DbAdapterDslPackage.MANAGED_LOCAL_DATABASE__FILES:
        return files != null && !files.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (port: ");
    result.append(port);
    result.append(", storage: ");
    result.append(storage);
    result.append(", files: ");
    result.append(files);
    result.append(')');
    return result.toString();
  }

} //ManagedLocalDatabaseImpl
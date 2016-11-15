/**
 */
package org.slizaa.neo4j.dbadapter.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.debug.core.ILaunch;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.slizaa.neo4j.dbadapter.DbAdapterPackage;
import org.slizaa.neo4j.dbadapter.ManagedNeo4jInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Managed Neo4j Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl#isRunning <em>Running</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl#getStorageArea <em>Storage Area</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl#getDirectoriesToScan <em>Directories To Scan</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl#getLaunch <em>Launch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagedNeo4jInstanceImpl extends Neo4jRestClientImpl implements ManagedNeo4jInstance {
  /**
   * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRunning()
   * @generated
   * @ordered
   */
  protected static final boolean RUNNING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRunning()
   * @generated
   * @ordered
   */
  protected boolean running = RUNNING_EDEFAULT;

  /**
   * The default value of the '{@link #getStorageArea() <em>Storage Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageArea()
   * @generated
   * @ordered
   */
  protected static final String STORAGE_AREA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStorageArea() <em>Storage Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageArea()
   * @generated
   * @ordered
   */
  protected String storageArea = STORAGE_AREA_EDEFAULT;

  /**
   * The cached value of the '{@link #getDirectoriesToScan() <em>Directories To Scan</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectoriesToScan()
   * @generated
   * @ordered
   */
  protected EList<String> directoriesToScan;

  /**
   * The default value of the '{@link #getLaunch() <em>Launch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLaunch()
   * @generated
   * @ordered
   */
  protected static final ILaunch LAUNCH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLaunch() <em>Launch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLaunch()
   * @generated
   * @ordered
   */
  protected ILaunch launch = LAUNCH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ManagedNeo4jInstanceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DbAdapterPackage.Literals.MANAGED_NEO4J_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRunning() {
    return running;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRunning(boolean newRunning) {
    boolean oldRunning = running;
    running = newRunning;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.MANAGED_NEO4J_INSTANCE__RUNNING, oldRunning, running));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStorageArea() {
    return storageArea;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStorageArea(String newStorageArea) {
    String oldStorageArea = storageArea;
    storageArea = newStorageArea;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA, oldStorageArea, storageArea));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDirectoriesToScan() {
    if (directoriesToScan == null) {
      directoriesToScan = new EDataTypeUniqueEList<String>(String.class, this, DbAdapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN);
    }
    return directoriesToScan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ILaunch getLaunch() {
    return launch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLaunch(ILaunch newLaunch) {
    ILaunch oldLaunch = launch;
    launch = newLaunch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.MANAGED_NEO4J_INSTANCE__LAUNCH, oldLaunch, launch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void scan() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isScanned() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void start() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void stop() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void delete() {
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
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__RUNNING:
        return isRunning();
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        return getStorageArea();
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
        return getDirectoriesToScan();
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__LAUNCH:
        return getLaunch();
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
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__RUNNING:
        setRunning((Boolean)newValue);
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        setStorageArea((String)newValue);
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
        getDirectoriesToScan().clear();
        getDirectoriesToScan().addAll((Collection<? extends String>)newValue);
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__LAUNCH:
        setLaunch((ILaunch)newValue);
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
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__RUNNING:
        setRunning(RUNNING_EDEFAULT);
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        setStorageArea(STORAGE_AREA_EDEFAULT);
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
        getDirectoriesToScan().clear();
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__LAUNCH:
        setLaunch(LAUNCH_EDEFAULT);
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
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__RUNNING:
        return running != RUNNING_EDEFAULT;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        return STORAGE_AREA_EDEFAULT == null ? storageArea != null : !STORAGE_AREA_EDEFAULT.equals(storageArea);
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
        return directoriesToScan != null && !directoriesToScan.isEmpty();
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__LAUNCH:
        return LAUNCH_EDEFAULT == null ? launch != null : !LAUNCH_EDEFAULT.equals(launch);
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
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE___SCAN:
        scan();
        return null;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE___IS_SCANNED:
        return isScanned();
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE___START:
        start();
        return null;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE___STOP:
        stop();
        return null;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE___DELETE:
        delete();
        return null;
    }
    return super.eInvoke(operationID, arguments);
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
    result.append(" (running: ");
    result.append(running);
    result.append(", storageArea: ");
    result.append(storageArea);
    result.append(", directoriesToScan: ");
    result.append(directoriesToScan);
    result.append(", launch: ");
    result.append(launch);
    result.append(')');
    return result.toString();
  }

} //ManagedNeo4jInstanceImpl

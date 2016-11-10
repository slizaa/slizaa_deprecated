/**
 */
package org.slizaa.neo4j.dbadapter.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.slizaa.neo4j.dbadapter.DbadapterPackage;
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
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl#isScanned <em>Scanned</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl#getStorageArea <em>Storage Area</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl#getDirectoriesToScan <em>Directories To Scan</em>}</li>
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
   * The default value of the '{@link #isScanned() <em>Scanned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScanned()
   * @generated
   * @ordered
   */
  protected static final boolean SCANNED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isScanned() <em>Scanned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isScanned()
   * @generated
   * @ordered
   */
  protected boolean scanned = SCANNED_EDEFAULT;

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
    return DbadapterPackage.Literals.MANAGED_NEO4J_INSTANCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DbadapterPackage.MANAGED_NEO4J_INSTANCE__RUNNING, oldRunning, running));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isScanned() {
    return scanned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScanned(boolean newScanned) {
    boolean oldScanned = scanned;
    scanned = newScanned;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbadapterPackage.MANAGED_NEO4J_INSTANCE__SCANNED, oldScanned, scanned));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DbadapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA, oldStorageArea, storageArea));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDirectoriesToScan() {
    if (directoriesToScan == null) {
      directoriesToScan = new EDataTypeUniqueEList<String>(String.class, this, DbadapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN);
    }
    return directoriesToScan;
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
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__RUNNING:
        return isRunning();
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__SCANNED:
        return isScanned();
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        return getStorageArea();
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
        return getDirectoriesToScan();
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
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__RUNNING:
        setRunning((Boolean)newValue);
        return;
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__SCANNED:
        setScanned((Boolean)newValue);
        return;
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        setStorageArea((String)newValue);
        return;
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
        getDirectoriesToScan().clear();
        getDirectoriesToScan().addAll((Collection<? extends String>)newValue);
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
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__RUNNING:
        setRunning(RUNNING_EDEFAULT);
        return;
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__SCANNED:
        setScanned(SCANNED_EDEFAULT);
        return;
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        setStorageArea(STORAGE_AREA_EDEFAULT);
        return;
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
        getDirectoriesToScan().clear();
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
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__RUNNING:
        return running != RUNNING_EDEFAULT;
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__SCANNED:
        return scanned != SCANNED_EDEFAULT;
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        return STORAGE_AREA_EDEFAULT == null ? storageArea != null : !STORAGE_AREA_EDEFAULT.equals(storageArea);
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
        return directoriesToScan != null && !directoriesToScan.isEmpty();
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
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE___SCAN:
        scan();
        return null;
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE___START:
        start();
        return null;
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE___STOP:
        stop();
        return null;
      case DbadapterPackage.MANAGED_NEO4J_INSTANCE___DELETE:
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
    result.append(", scanned: ");
    result.append(scanned);
    result.append(", storageArea: ");
    result.append(storageArea);
    result.append(", directoriesToScan: ");
    result.append(directoriesToScan);
    result.append(')');
    return result.toString();
  }

} //ManagedNeo4jInstanceImpl

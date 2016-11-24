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
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl#isInProgress <em>In Progress</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl#isStarted <em>Started</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl#getStorageArea <em>Storage Area</em>}</li>
 *   <li>{@link org.slizaa.neo4j.dbadapter.impl.ManagedNeo4jInstanceImpl#getDirectoriesToScan <em>Directories To Scan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagedNeo4jInstanceImpl extends Neo4jRestClientImpl implements ManagedNeo4jInstance {
  /**
   * The default value of the '{@link #isInProgress() <em>In Progress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInProgress()
   * @generated
   * @ordered
   */
  protected static final boolean IN_PROGRESS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInProgress() <em>In Progress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInProgress()
   * @generated
   * @ordered
   */
  protected boolean inProgress = IN_PROGRESS_EDEFAULT;

  /**
   * The default value of the '{@link #isStarted() <em>Started</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStarted()
   * @generated
   * @ordered
   */
  protected static final boolean STARTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStarted() <em>Started</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStarted()
   * @generated
   * @ordered
   */
  protected boolean started = STARTED_EDEFAULT;

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
    return DbAdapterPackage.Literals.MANAGED_NEO4J_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInProgress() {
    return inProgress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInProgress(boolean newInProgress) {
    boolean oldInProgress = inProgress;
    inProgress = newInProgress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.MANAGED_NEO4J_INSTANCE__IN_PROGRESS, oldInProgress, inProgress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStarted() {
    return started;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStarted(boolean newStarted) {
    boolean oldStarted = started;
    started = newStarted;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STARTED, oldStarted, started));
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
  public boolean isDatabaseInstallationAvailable() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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
  public void enrich() {
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
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__IN_PROGRESS:
        return isInProgress();
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STARTED:
        return isStarted();
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        return getStorageArea();
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
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
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__IN_PROGRESS:
        setInProgress((Boolean)newValue);
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STARTED:
        setStarted((Boolean)newValue);
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        setStorageArea((String)newValue);
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
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
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__IN_PROGRESS:
        setInProgress(IN_PROGRESS_EDEFAULT);
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STARTED:
        setStarted(STARTED_EDEFAULT);
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        setStorageArea(STORAGE_AREA_EDEFAULT);
        return;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
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
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__IN_PROGRESS:
        return inProgress != IN_PROGRESS_EDEFAULT;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STARTED:
        return started != STARTED_EDEFAULT;
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__STORAGE_AREA:
        return STORAGE_AREA_EDEFAULT == null ? storageArea != null : !STORAGE_AREA_EDEFAULT.equals(storageArea);
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE__DIRECTORIES_TO_SCAN:
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
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE___IS_DATABASE_INSTALLATION_AVAILABLE:
        return isDatabaseInstallationAvailable();
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
      case DbAdapterPackage.MANAGED_NEO4J_INSTANCE___ENRICH:
        enrich();
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
    result.append(" (inProgress: ");
    result.append(inProgress);
    result.append(", started: ");
    result.append(started);
    result.append(", storageArea: ");
    result.append(storageArea);
    result.append(", directoriesToScan: ");
    result.append(directoriesToScan);
    result.append(')');
    return result.toString();
  }

} //ManagedNeo4jInstanceImpl
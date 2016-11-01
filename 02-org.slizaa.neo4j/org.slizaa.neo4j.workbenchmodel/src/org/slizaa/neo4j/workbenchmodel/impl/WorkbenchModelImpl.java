/**
 */
package org.slizaa.neo4j.workbenchmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.slizaa.neo4j.restclient.Neo4jRestClientRegistry;
import org.slizaa.neo4j.workbenchmodel.MappedGraphs;
import org.slizaa.neo4j.workbenchmodel.WorkbenchModel;
import org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workbench Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.workbenchmodel.impl.WorkbenchModelImpl#getDatabases <em>Databases</em>}</li>
 *   <li>{@link org.slizaa.neo4j.workbenchmodel.impl.WorkbenchModelImpl#getMappedGraphs <em>Mapped Graphs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkbenchModelImpl extends MinimalEObjectImpl.Container implements WorkbenchModel {
  /**
   * The cached value of the '{@link #getDatabases() <em>Databases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabases()
   * @generated
   * @ordered
   */
  protected Neo4jRestClientRegistry databases;

  /**
   * The cached value of the '{@link #getMappedGraphs() <em>Mapped Graphs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedGraphs()
   * @generated
   * @ordered
   */
  protected MappedGraphs mappedGraphs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkbenchModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return WorkbenchmodelPackage.Literals.WORKBENCH_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Neo4jRestClientRegistry getDatabases() {
    return databases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatabases(Neo4jRestClientRegistry newDatabases, NotificationChain msgs) {
    Neo4jRestClientRegistry oldDatabases = databases;
    databases = newDatabases;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkbenchmodelPackage.WORKBENCH_MODEL__DATABASES, oldDatabases, newDatabases);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatabases(Neo4jRestClientRegistry newDatabases) {
    if (newDatabases != databases) {
      NotificationChain msgs = null;
      if (databases != null)
        msgs = ((InternalEObject)databases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkbenchmodelPackage.WORKBENCH_MODEL__DATABASES, null, msgs);
      if (newDatabases != null)
        msgs = ((InternalEObject)newDatabases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkbenchmodelPackage.WORKBENCH_MODEL__DATABASES, null, msgs);
      msgs = basicSetDatabases(newDatabases, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchmodelPackage.WORKBENCH_MODEL__DATABASES, newDatabases, newDatabases));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappedGraphs getMappedGraphs() {
    if (mappedGraphs != null && mappedGraphs.eIsProxy()) {
      InternalEObject oldMappedGraphs = (InternalEObject)mappedGraphs;
      mappedGraphs = (MappedGraphs)eResolveProxy(oldMappedGraphs);
      if (mappedGraphs != oldMappedGraphs) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkbenchmodelPackage.WORKBENCH_MODEL__MAPPED_GRAPHS, oldMappedGraphs, mappedGraphs));
      }
    }
    return mappedGraphs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappedGraphs basicGetMappedGraphs() {
    return mappedGraphs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappedGraphs(MappedGraphs newMappedGraphs) {
    MappedGraphs oldMappedGraphs = mappedGraphs;
    mappedGraphs = newMappedGraphs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchmodelPackage.WORKBENCH_MODEL__MAPPED_GRAPHS, oldMappedGraphs, mappedGraphs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case WorkbenchmodelPackage.WORKBENCH_MODEL__DATABASES:
        return basicSetDatabases(null, msgs);
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
      case WorkbenchmodelPackage.WORKBENCH_MODEL__DATABASES:
        return getDatabases();
      case WorkbenchmodelPackage.WORKBENCH_MODEL__MAPPED_GRAPHS:
        if (resolve) return getMappedGraphs();
        return basicGetMappedGraphs();
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
      case WorkbenchmodelPackage.WORKBENCH_MODEL__DATABASES:
        setDatabases((Neo4jRestClientRegistry)newValue);
        return;
      case WorkbenchmodelPackage.WORKBENCH_MODEL__MAPPED_GRAPHS:
        setMappedGraphs((MappedGraphs)newValue);
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
      case WorkbenchmodelPackage.WORKBENCH_MODEL__DATABASES:
        setDatabases((Neo4jRestClientRegistry)null);
        return;
      case WorkbenchmodelPackage.WORKBENCH_MODEL__MAPPED_GRAPHS:
        setMappedGraphs((MappedGraphs)null);
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
      case WorkbenchmodelPackage.WORKBENCH_MODEL__DATABASES:
        return databases != null;
      case WorkbenchmodelPackage.WORKBENCH_MODEL__MAPPED_GRAPHS:
        return mappedGraphs != null;
    }
    return super.eIsSet(featureID);
  }

} //WorkbenchModelImpl

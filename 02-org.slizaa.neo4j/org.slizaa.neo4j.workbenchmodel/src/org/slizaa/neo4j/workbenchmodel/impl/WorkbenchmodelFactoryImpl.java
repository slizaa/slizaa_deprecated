/**
 */
package org.slizaa.neo4j.workbenchmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.slizaa.neo4j.workbenchmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkbenchmodelFactoryImpl extends EFactoryImpl implements WorkbenchmodelFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WorkbenchmodelFactory init() {
    try {
      WorkbenchmodelFactory theWorkbenchmodelFactory = (WorkbenchmodelFactory)EPackage.Registry.INSTANCE.getEFactory(WorkbenchmodelPackage.eNS_URI);
      if (theWorkbenchmodelFactory != null) {
        return theWorkbenchmodelFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WorkbenchmodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkbenchmodelFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case WorkbenchmodelPackage.WORKBENCH_MODEL: return createWorkbenchModel();
      case WorkbenchmodelPackage.DATABASES: return createDatabases();
      case WorkbenchmodelPackage.MAPPED_GRAPHS: return createMappedGraphs();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkbenchModel createWorkbenchModel() {
    WorkbenchModelImpl workbenchModel = new WorkbenchModelImpl();
    return workbenchModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Databases createDatabases() {
    DatabasesImpl databases = new DatabasesImpl();
    return databases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappedGraphs createMappedGraphs() {
    MappedGraphsImpl mappedGraphs = new MappedGraphsImpl();
    return mappedGraphs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkbenchmodelPackage getWorkbenchmodelPackage() {
    return (WorkbenchmodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WorkbenchmodelPackage getPackage() {
    return WorkbenchmodelPackage.eINSTANCE;
  }

} //WorkbenchmodelFactoryImpl

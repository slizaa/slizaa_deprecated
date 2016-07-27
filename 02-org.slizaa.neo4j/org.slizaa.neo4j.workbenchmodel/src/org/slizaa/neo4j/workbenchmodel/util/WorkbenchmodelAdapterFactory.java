/**
 */
package org.slizaa.neo4j.workbenchmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.slizaa.neo4j.workbenchmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage
 * @generated
 */
public class WorkbenchmodelAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static WorkbenchmodelPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public WorkbenchmodelAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = WorkbenchmodelPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected WorkbenchmodelSwitch<Adapter> modelSwitch =
		new WorkbenchmodelSwitch<Adapter>() {
      @Override
      public Adapter caseWorkbenchModel(WorkbenchModel object) {
        return createWorkbenchModelAdapter();
      }
      @Override
      public Adapter caseDatabases(Databases object) {
        return createDatabasesAdapter();
      }
      @Override
      public Adapter caseMappedGraphs(MappedGraphs object) {
        return createMappedGraphsAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.workbenchmodel.WorkbenchModel <em>Workbench Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.workbenchmodel.WorkbenchModel
   * @generated
   */
  public Adapter createWorkbenchModelAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.workbenchmodel.Databases <em>Databases</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.workbenchmodel.Databases
   * @generated
   */
  public Adapter createDatabasesAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.workbenchmodel.MappedGraphs <em>Mapped Graphs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.slizaa.neo4j.workbenchmodel.MappedGraphs
   * @generated
   */
  public Adapter createMappedGraphsAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //WorkbenchmodelAdapterFactory

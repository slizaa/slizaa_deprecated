/**
 */
package org.slizaa.neo4j.workbenchmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.workbenchmodel.WorkbenchmodelPackage
 * @generated
 */
public interface WorkbenchmodelFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WorkbenchmodelFactory eINSTANCE = org.slizaa.neo4j.workbenchmodel.impl.WorkbenchmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Workbench Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workbench Model</em>'.
   * @generated
   */
  WorkbenchModel createWorkbenchModel();

  /**
   * Returns a new object of class '<em>Mapped Graphs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapped Graphs</em>'.
   * @generated
   */
  MappedGraphs createMappedGraphs();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WorkbenchmodelPackage getWorkbenchmodelPackage();

} //WorkbenchmodelFactory

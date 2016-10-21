/**
 */
package org.slizaa.hierarchicalgraph.selection;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.hierarchicalgraph.selection.SelectionPackage
 * @generated
 */
public interface SelectionFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SelectionFactory eINSTANCE = org.slizaa.hierarchicalgraph.selection.impl.SelectionFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Dependency Selection Stack</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency Selection Stack</em>'.
   * @generated
   */
  DependencySelectionStack createDependencySelectionStack();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SelectionPackage getSelectionPackage();

} //SelectionFactory

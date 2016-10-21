/**
 */
package org.slizaa.hierarchicalgraph.selection.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.slizaa.hierarchicalgraph.selection.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionFactoryImpl extends EFactoryImpl implements SelectionFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SelectionFactory init() {
    try {
      SelectionFactory theSelectionFactory = (SelectionFactory)EPackage.Registry.INSTANCE.getEFactory(SelectionPackage.eNS_URI);
      if (theSelectionFactory != null) {
        return theSelectionFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SelectionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionFactoryImpl() {
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
      case SelectionPackage.DEPENDENCY_SELECTION_STACK: return createDependencySelectionStack();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public DependencySelectionStack createDependencySelectionStack() {
    DependencySelectionStackImpl dependencySelectionStack = new ExtendedDependencySelectionStack();
    return dependencySelectionStack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionPackage getSelectionPackage() {
    return (SelectionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SelectionPackage getPackage() {
    return SelectionPackage.eINSTANCE;
  }

} //SelectionFactoryImpl

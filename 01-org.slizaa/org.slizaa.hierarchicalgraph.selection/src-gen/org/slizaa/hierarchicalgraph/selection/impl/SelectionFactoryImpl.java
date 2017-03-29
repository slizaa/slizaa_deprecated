/**
 */
package org.slizaa.hierarchicalgraph.selection.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.slizaa.hierarchicalgraph.selection.DependencySelection;
import org.slizaa.hierarchicalgraph.selection.DependencySelectionStack;
import org.slizaa.hierarchicalgraph.selection.NodeSelection;
import org.slizaa.hierarchicalgraph.selection.SelectionFactory;
import org.slizaa.hierarchicalgraph.selection.SelectionPackage;

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
      case SelectionPackage.NODE_SELECTION: return createNodeSelection();
      case SelectionPackage.DEPENDENCY_SELECTION: return createDependencySelection();
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
  public NodeSelection createNodeSelection() {
    NodeSelectionImpl nodeSelection = new NodeSelectionImpl();
    return nodeSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencySelection createDependencySelection() {
    DependencySelectionImpl dependencySelection = new DependencySelectionImpl();
    return dependencySelection;
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

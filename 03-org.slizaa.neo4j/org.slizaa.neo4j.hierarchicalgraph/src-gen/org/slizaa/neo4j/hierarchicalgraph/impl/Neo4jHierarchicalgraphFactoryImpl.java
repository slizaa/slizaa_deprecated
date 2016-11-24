/**
 */
package org.slizaa.neo4j.hierarchicalgraph.impl;

import java.util.Optional;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.slizaa.neo4j.hierarchicalgraph.*;
import org.slizaa.neo4j.hierarchicalgraph.impl.ExtendedNeo4JBackedDependencySourceImpl;
import org.slizaa.neo4j.hierarchicalgraph.impl.ExtendedNeo4JBackedNodeSourceImpl;
import org.slizaa.neo4j.hierarchicalgraph.impl.ExtendedNeo4JBackedRootNodeSourceImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class Neo4jHierarchicalgraphFactoryImpl extends EFactoryImpl implements Neo4jHierarchicalgraphFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static Neo4jHierarchicalgraphFactory init() {
    try {
      Neo4jHierarchicalgraphFactory theNeo4jHierarchicalgraphFactory = (Neo4jHierarchicalgraphFactory)EPackage.Registry.INSTANCE.getEFactory(Neo4jHierarchicalgraphPackage.eNS_URI);
      if (theNeo4jHierarchicalgraphFactory != null) {
        return theNeo4jHierarchicalgraphFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Neo4jHierarchicalgraphFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Neo4jHierarchicalgraphFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE: return createNeo4JBackedNodeSource();
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE: return createNeo4JBackedRootNodeSource();
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE: return createNeo4JBackedDependencySource();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case Neo4jHierarchicalgraphPackage.OPTIONAL:
        return createOptionalFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case Neo4jHierarchicalgraphPackage.OPTIONAL:
        return convertOptionalToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Neo4JBackedNodeSource createNeo4JBackedNodeSource() {
    Neo4JBackedNodeSourceImpl neo4JBackedNodeSource = new ExtendedNeo4JBackedNodeSourceImpl();
    return neo4JBackedNodeSource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Neo4JBackedRootNodeSource createNeo4JBackedRootNodeSource() {
    Neo4JBackedRootNodeSourceImpl neo4JBackedRootNodeSource = new ExtendedNeo4JBackedRootNodeSourceImpl();
    return neo4JBackedRootNodeSource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Neo4JBackedDependencySource createNeo4JBackedDependencySource() {
    Neo4JBackedDependencySourceImpl neo4JBackedDependencySource = new ExtendedNeo4JBackedDependencySourceImpl();
    return neo4JBackedDependencySource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Optional<?> createOptionalFromString(EDataType eDataType, String initialValue) {
    return (Optional<?>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertOptionalToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Neo4jHierarchicalgraphPackage getNeo4jHierarchicalgraphPackage() {
    return (Neo4jHierarchicalgraphPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Neo4jHierarchicalgraphPackage getPackage() {
    return Neo4jHierarchicalgraphPackage.eINSTANCE;
  }

} // Neo4jHierarchicalgraphFactoryImpl

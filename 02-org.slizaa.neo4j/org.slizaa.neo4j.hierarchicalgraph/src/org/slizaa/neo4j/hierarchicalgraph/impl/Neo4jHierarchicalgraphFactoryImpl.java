/**
 */
package org.slizaa.neo4j.hierarchicalgraph.impl;

import java.util.concurrent.Future;

import java.util.function.Consumer;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.slizaa.neo4j.hierarchicalgraph.*;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JBackedRootNodeSource;
import org.slizaa.neo4j.hierarchicalgraph.Neo4JRemoteRepository;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphFactory;
import org.slizaa.neo4j.hierarchicalgraph.Neo4jHierarchicalgraphPackage;
import org.slizaa.neo4j.hierarchicalgraph.internal.ExtendedNeo4JBackedDependencySourceImpl;
import org.slizaa.neo4j.hierarchicalgraph.internal.ExtendedNeo4JBackedNodeSourceImpl;
import org.slizaa.neo4j.hierarchicalgraph.internal.ExtendedNeo4JBackedRootNodeSourceImpl;
import org.slizaa.neo4j.hierarchicalgraph.internal.ExtendedNeo4JRemoteRepositoryImpl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Neo4jHierarchicalgraphFactoryImpl extends EFactoryImpl implements Neo4jHierarchicalgraphFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Neo4jHierarchicalgraphFactoryImpl() {
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
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_NODE_SOURCE: return createNeo4JBackedNodeSource();
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_ROOT_NODE_SOURCE: return createNeo4JBackedRootNodeSource();
      case Neo4jHierarchicalgraphPackage.NEO4_JBACKED_DEPENDENCY_SOURCE: return createNeo4JBackedDependencySource();
      case Neo4jHierarchicalgraphPackage.NEO4_JREMOTE_REPOSITORY: return createNeo4JRemoteRepository();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case Neo4jHierarchicalgraphPackage.FUTURE:
        return createFutureFromString(eDataType, initialValue);
      case Neo4jHierarchicalgraphPackage.CONSUMER:
        return createConsumerFromString(eDataType, initialValue);
      case Neo4jHierarchicalgraphPackage.JSON_ARRAY:
        return createJsonArrayFromString(eDataType, initialValue);
      case Neo4jHierarchicalgraphPackage.JSON_OBJECT:
        return createJsonObjectFromString(eDataType, initialValue);
      case Neo4jHierarchicalgraphPackage.IAGGREGATED_DEPENDENCY_RESOLVER:
        return createIAggregatedDependencyResolverFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case Neo4jHierarchicalgraphPackage.FUTURE:
        return convertFutureToString(eDataType, instanceValue);
      case Neo4jHierarchicalgraphPackage.CONSUMER:
        return convertConsumerToString(eDataType, instanceValue);
      case Neo4jHierarchicalgraphPackage.JSON_ARRAY:
        return convertJsonArrayToString(eDataType, instanceValue);
      case Neo4jHierarchicalgraphPackage.JSON_OBJECT:
        return convertJsonObjectToString(eDataType, instanceValue);
      case Neo4jHierarchicalgraphPackage.IAGGREGATED_DEPENDENCY_RESOLVER:
        return convertIAggregatedDependencyResolverToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Neo4JBackedNodeSource createNeo4JBackedNodeSource() {
		Neo4JBackedNodeSourceImpl neo4JBackedNodeSource = new ExtendedNeo4JBackedNodeSourceImpl();
		return neo4JBackedNodeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Neo4JBackedRootNodeSource createNeo4JBackedRootNodeSource() {
		Neo4JBackedRootNodeSourceImpl neo4JBackedRootNodeSource = new ExtendedNeo4JBackedRootNodeSourceImpl();
		return neo4JBackedRootNodeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Neo4JRemoteRepository createNeo4JRemoteRepository() {
		Neo4JRemoteRepositoryImpl neo4JRemoteRepository = new ExtendedNeo4JRemoteRepositoryImpl();
		return neo4JRemoteRepository;
	}

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Neo4JBackedDependencySource createNeo4JBackedDependencySource() {
    Neo4JBackedDependencySourceImpl neo4JBackedDependencySource = new ExtendedNeo4JBackedDependencySourceImpl();
    return neo4JBackedDependencySource;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Future<?> createFutureFromString(EDataType eDataType, String initialValue) {
    return (Future<?>)super.createFromString(initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertFutureToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Consumer<?> createConsumerFromString(EDataType eDataType, String initialValue) {
    return (Consumer<?>)super.createFromString(initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConsumerToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public JsonArray createJsonArrayFromString(EDataType eDataType, String initialValue) {
    return (JsonArray)super.createFromString(eDataType, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertJsonArrayToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public JsonObject createJsonObjectFromString(EDataType eDataType, String initialValue) {
    return (JsonObject)super.createFromString(eDataType, initialValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertJsonObjectToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IAggregatedDependencyResolver createIAggregatedDependencyResolverFromString(EDataType eDataType, String initialValue) {
    return (IAggregatedDependencyResolver)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIAggregatedDependencyResolverToString(EDataType eDataType, Object instanceValue) {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Neo4jHierarchicalgraphPackage getNeo4jHierarchicalgraphPackage() {
    return (Neo4jHierarchicalgraphPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static Neo4jHierarchicalgraphPackage getPackage() {
    return Neo4jHierarchicalgraphPackage.eINSTANCE;
  }

} //Neo4jHierarchicalgraphFactoryImpl

/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.slizaa.neo4j.hierarchicalgraph.mapping.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage
 * @generated
 */
public class Neo4jHierarchicalGraphMappingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Neo4jHierarchicalGraphMappingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neo4jHierarchicalGraphMappingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Neo4jHierarchicalGraphMappingPackage.eINSTANCE;
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
	protected Neo4jHierarchicalGraphMappingSwitch<Adapter> modelSwitch =
		new Neo4jHierarchicalGraphMappingSwitch<Adapter>() {
			@Override
			public Adapter caseHierarchicalGraphMappingDescriptor(HierarchicalGraphMappingDescriptor object) {
				return createHierarchicalGraphMappingDescriptorAdapter();
			}
			@Override
			public Adapter caseNodeLabelMapper(NodeLabelMapper object) {
				return createNodeLabelMapperAdapter();
			}
			@Override
			public Adapter casePropertyBasedImageMapper(PropertyBasedImageMapper object) {
				return createPropertyBasedImageMapperAdapter();
			}
			@Override
			public Adapter caseCypherQuery(CypherQuery object) {
				return createCypherQueryAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor <em>Hierarchical Graph Mapping Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor
	 * @generated
	 */
	public Adapter createHierarchicalGraphMappingDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper <em>Node Label Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper
	 * @generated
	 */
	public Adapter createNodeLabelMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper <em>Property Based Image Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper
	 * @generated
	 */
	public Adapter createPropertyBasedImageMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.slizaa.neo4j.hierarchicalgraph.mapping.CypherQuery <em>Cypher Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.CypherQuery
	 * @generated
	 */
	public Adapter createCypherQueryAdapter() {
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

} //Neo4jHierarchicalGraphMappingAdapterFactory

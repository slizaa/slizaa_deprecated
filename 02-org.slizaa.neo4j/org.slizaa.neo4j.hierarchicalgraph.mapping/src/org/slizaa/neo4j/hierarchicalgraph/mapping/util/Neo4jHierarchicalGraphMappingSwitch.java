/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.slizaa.neo4j.hierarchicalgraph.mapping.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage
 * @generated
 */
public class Neo4jHierarchicalGraphMappingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Neo4jHierarchicalGraphMappingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neo4jHierarchicalGraphMappingSwitch() {
		if (modelPackage == null) {
			modelPackage = Neo4jHierarchicalGraphMappingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR: {
				HierarchicalGraphMappingDescriptor hierarchicalGraphMappingDescriptor = (HierarchicalGraphMappingDescriptor)theEObject;
				T result = caseHierarchicalGraphMappingDescriptor(hierarchicalGraphMappingDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Neo4jHierarchicalGraphMappingPackage.NODE_LABEL_MAPPER: {
				NodeLabelMapper nodeLabelMapper = (NodeLabelMapper)theEObject;
				T result = caseNodeLabelMapper(nodeLabelMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Neo4jHierarchicalGraphMappingPackage.PROPERTY_BASED_IMAGE_MAPPER: {
				PropertyBasedImageMapper propertyBasedImageMapper = (PropertyBasedImageMapper)theEObject;
				T result = casePropertyBasedImageMapper(propertyBasedImageMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Neo4jHierarchicalGraphMappingPackage.CYPHER_QUERY: {
				CypherQuery cypherQuery = (CypherQuery)theEObject;
				T result = caseCypherQuery(cypherQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchical Graph Mapping Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchical Graph Mapping Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchicalGraphMappingDescriptor(HierarchicalGraphMappingDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Label Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Label Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeLabelMapper(NodeLabelMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Based Image Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Based Image Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyBasedImageMapper(PropertyBasedImageMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cypher Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cypher Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCypherQuery(CypherQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Neo4jHierarchicalGraphMappingSwitch

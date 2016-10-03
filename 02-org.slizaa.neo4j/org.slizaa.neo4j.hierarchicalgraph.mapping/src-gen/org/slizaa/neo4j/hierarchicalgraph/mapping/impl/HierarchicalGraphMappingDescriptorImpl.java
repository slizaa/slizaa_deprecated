/**
 */
package org.slizaa.neo4j.hierarchicalgraph.mapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.slizaa.neo4j.hierarchicalgraph.mapping.DependencyMapping;
import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingPackage;
import org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchical Graph Mapping Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.HierarchicalGraphMappingDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.HierarchicalGraphMappingDescriptorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.HierarchicalGraphMappingDescriptorImpl#getRootMappings <em>Root Mappings</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.HierarchicalGraphMappingDescriptorImpl#getHierarchyMappings <em>Hierarchy Mappings</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.HierarchicalGraphMappingDescriptorImpl#getDependencyMappings <em>Dependency Mappings</em>}</li>
 *   <li>{@link org.slizaa.neo4j.hierarchicalgraph.mapping.impl.HierarchicalGraphMappingDescriptorImpl#getLabelMappers <em>Label Mappers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HierarchicalGraphMappingDescriptorImpl extends MinimalEObjectImpl.Container implements HierarchicalGraphMappingDescriptor {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getRootMappings() <em>Root Mappings</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootMappings()
   * @generated
   * @ordered
   */
  protected EList<String> rootMappings;

  /**
   * The cached value of the '{@link #getHierarchyMappings() <em>Hierarchy Mappings</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHierarchyMappings()
   * @generated
   * @ordered
   */
  protected EList<String> hierarchyMappings;

  /**
   * The cached value of the '{@link #getDependencyMappings() <em>Dependency Mappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencyMappings()
   * @generated
   * @ordered
   */
  protected EList<DependencyMapping> dependencyMappings;

  /**
   * The cached value of the '{@link #getLabelMappers() <em>Label Mappers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelMappers()
   * @generated
   * @ordered
   */
  protected EList<NodeLabelMapper> labelMappers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HierarchicalGraphMappingDescriptorImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return Neo4jHierarchicalGraphMappingPackage.Literals.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRootMappings() {
    if (rootMappings == null) {
      rootMappings = new EDataTypeUniqueEList<String>(String.class, this, Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__ROOT_MAPPINGS);
    }
    return rootMappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getHierarchyMappings() {
    if (hierarchyMappings == null) {
      hierarchyMappings = new EDataTypeUniqueEList<String>(String.class, this, Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__HIERARCHY_MAPPINGS);
    }
    return hierarchyMappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DependencyMapping> getDependencyMappings() {
    if (dependencyMappings == null) {
      dependencyMappings = new EObjectContainmentEList<DependencyMapping>(DependencyMapping.class, this, Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DEPENDENCY_MAPPINGS);
    }
    return dependencyMappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeLabelMapper> getLabelMappers() {
    if (labelMappers == null) {
      labelMappers = new EObjectContainmentEList<NodeLabelMapper>(NodeLabelMapper.class, this, Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS);
    }
    return labelMappers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DEPENDENCY_MAPPINGS:
        return ((InternalEList<?>)getDependencyMappings()).basicRemove(otherEnd, msgs);
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS:
        return ((InternalEList<?>)getLabelMappers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__NAME:
        return getName();
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DESCRIPTION:
        return getDescription();
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__ROOT_MAPPINGS:
        return getRootMappings();
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__HIERARCHY_MAPPINGS:
        return getHierarchyMappings();
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DEPENDENCY_MAPPINGS:
        return getDependencyMappings();
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS:
        return getLabelMappers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__NAME:
        setName((String)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__ROOT_MAPPINGS:
        getRootMappings().clear();
        getRootMappings().addAll((Collection<? extends String>)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__HIERARCHY_MAPPINGS:
        getHierarchyMappings().clear();
        getHierarchyMappings().addAll((Collection<? extends String>)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DEPENDENCY_MAPPINGS:
        getDependencyMappings().clear();
        getDependencyMappings().addAll((Collection<? extends DependencyMapping>)newValue);
        return;
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS:
        getLabelMappers().clear();
        getLabelMappers().addAll((Collection<? extends NodeLabelMapper>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__ROOT_MAPPINGS:
        getRootMappings().clear();
        return;
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__HIERARCHY_MAPPINGS:
        getHierarchyMappings().clear();
        return;
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DEPENDENCY_MAPPINGS:
        getDependencyMappings().clear();
        return;
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS:
        getLabelMappers().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__ROOT_MAPPINGS:
        return rootMappings != null && !rootMappings.isEmpty();
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__HIERARCHY_MAPPINGS:
        return hierarchyMappings != null && !hierarchyMappings.isEmpty();
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__DEPENDENCY_MAPPINGS:
        return dependencyMappings != null && !dependencyMappings.isEmpty();
      case Neo4jHierarchicalGraphMappingPackage.HIERARCHICAL_GRAPH_MAPPING_DESCRIPTOR__LABEL_MAPPERS:
        return labelMappers != null && !labelMappers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", rootMappings: ");
    result.append(rootMappings);
    result.append(", hierarchyMappings: ");
    result.append(hierarchyMappings);
    result.append(')');
    return result.toString();
  }

} //HierarchicalGraphMappingDescriptorImpl

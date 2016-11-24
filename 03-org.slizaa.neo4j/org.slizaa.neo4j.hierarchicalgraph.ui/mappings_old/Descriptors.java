package org.slizaa.neo4j.hierarchicalgraph.ui.deprecated;

import org.slizaa.neo4j.hierarchicalgraph.mapping.DependencyMapping;
import org.slizaa.neo4j.hierarchicalgraph.mapping.HierarchicalGraphMappingDescriptor;
import org.slizaa.neo4j.hierarchicalgraph.mapping.ImagePosition;
import org.slizaa.neo4j.hierarchicalgraph.mapping.Neo4jHierarchicalGraphMappingFactory;
import org.slizaa.neo4j.hierarchicalgraph.mapping.NodeLabelMapper;
import org.slizaa.neo4j.hierarchicalgraph.mapping.PropertyBasedImageMapper;

public class Descriptors {

  /** HIERARCHY_QUERY */
  public static final String HIERARCHY_ROOT_MODULES_QUERY          = "MATCH (module:Java:Artifact) WHERE (module:Directory OR module:Jar:Archive) RETURN id(module)";

  public static final String HIERARCHY_TOP_LEVEL_DIRECTORIES       = "MATCH (module:Java:Artifact)-[:CONTAINS]->(d:Directory) WHERE (module:Directory OR module:Jar:Archive) AND NOT (:Directory)-[:CONTAINS]->(d) RETURN id(module), id(d)";

  public static final String HIERARCHY_DIRECTORIES                 = "MATCH (d1:Directory)-[:CONTAINS]->(d2:Directory) RETURN id(d1), id(d2)";

  public static final String HIERARCHY_TOPLEVEL_FILES              = "MATCH (d:Directory)-[:CONTAINS]->(f:File) WHERE NOT (f:Type) RETURN id(d), id(f)";

  // HIER HAT JQASSISTANT einen BUG (glaube ich)
  public static final String HIERARCHY_INNER_CLASSES               = "MATCH (t1:Type)-[:DECLARES]->(t2:Type) RETURN id(t1), id(t2)";

  public static final String HIERARCHY_TOPLEVEL_CLASSES            = "MATCH (d:Directory)-[:CONTAINS]->(t:Type) RETURN id(d), id(t)";

  public static final String HIERARCHY_METHODS_AND_FIELDS          = "MATCH (t:Type)-[:DECLARES]->(e) WHERE ((e:Method) OR (e:Field)) AND NOT e.visibility IS NULL RETURN id(t), id(e)";

  public static final String QUERY_DEPENDENCIES_EXTENDS_IMPLEMENTS = "MATCH (t)-[rel:EXTENDS|:IMPLEMENTS]->(t2), (:Artifact)-[:CONTAINS]->(t2) RETURN id(t), id(t2), id(rel), type(rel)";

  public static final String QUERY_DEPENDENCIES_INVOKE             = "MATCH (m:Method)-[rel:INVOKES]->(m2:Method) WHERE (:Artifact)-[:CONTAINS]->(:Type)-[:DECLARES]->(m2) AND (:Artifact)-[:CONTAINS]->(:Type)-[:DECLARES]->(m)  RETURN id(m), id(m2), id(rel), 'INVOKES'";

  public static final String QUERY_DEPENDENCIES_READS_WRITES       = "MATCH (m:Method)-[rel:READS|:WRITES]->(f:Field) WHERE (:Artifact)-[:CONTAINS]->(:Type)-[:DECLARES]->(f) RETURN id(m), id(f), id(rel), type(rel)";

  public static final String QUERY_DEPENDENCIES_FIELD_OF_TYPE      = "MATCH  (f:Field)-[rel:OF_TYPE]->(t:Type)<-[:CONTAINS]-(:Artifact) RETURN id(f), id(t), id(rel), 'FIELD_OF_TYPE'";

  public static final String QUERY_DEPENDENCIES_THROWS             = "MATCH (m:Method)-[rel:THROWS]->(t:Type)<-[:CONTAINS]-(:Artifact) RETURN id(m), id(t), id(rel), 'THROWS'";

  public static final String QUERY_DEPENDENCIES_RETURNS            = "MATCH (m:Method)-[rel:RETURNS]->(t:Type)<-[:CONTAINS]-(:Artifact) RETURN id(m), id(t), id(rel), 'RETURNS'";

  public static final String QUERY_DEPENDENCIES_HAS_PARAM_OF_TYPE  = "MATCH (m:Method)-[rel:HAS]->(p:Parameter)-[rel2:OF_TYPE]->(t:Type)<-[:CONTAINS]-(:Artifact) RETURN id(m), id(t), id(rel), 'HAS_PARAM_OF_TYPE'";

  public static final String QUERY_SIMPLE_DEPENDENCIES             = "MATCH (t1:File:Type:Java)-[r:DEPENDS_ON]->(t2:File:Type:Java) RETURN id(t1),id(t2),id(r),type(r)";

  // MISSING TYPES:
  // match (t:Type) WHERE (NOT ()-[:CONTAINS]->(t)) AND (NOT (t)-[:RESOLVES_TO]->()) AND (NOT (t.fqn IN
  // ['void','int','boolean','long','char','double','byte'])) return distinct t.fqn, id(t) order by t.fqn
  
  public static final String DETAIL_QUERY                          = "MATCH (n1)-[rel]->(n2) "
      + "WHERE id(n1) in {from} " + "AND id(n2) in {to} " + "AND ( "
      + "(n1:Type)-[rel:EXTENDS|:IMPLEMENTS]->(n2:Type) OR " + "(n1:Method)-[rel:INVOKES]->(n2:Method) OR "
      + "(n1:Method)-[rel:READS|:WRITES]->(n2:Field) OR " + "(n1:Field)-[rel:OF_TYPE]->(n2:Type) OR "
      + "(n1:Method)-[rel:THROWS]->(n2:Type) OR " + "(n1:Method)-[rel:RETURNS]->(n2:Type) OR "
      + "(n1:Method)-[rel:RETURNS]->(n2:Type) " + ") " + "RETURN id(n1), id(n2), id(rel), type(rel)";

  public static HierarchicalGraphMappingDescriptor createHierarchicalGraphMappingDescriptor() {

    //
    HierarchicalGraphMappingDescriptor graphProviderDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE
        .createHierarchicalGraphMappingDescriptor();

    // hierachy
    graphProviderDescriptor.getRootMappings().add(HIERARCHY_ROOT_MODULES_QUERY);
    graphProviderDescriptor.getHierarchyMappings().add(HIERARCHY_TOP_LEVEL_DIRECTORIES);
    graphProviderDescriptor.getHierarchyMappings().add(HIERARCHY_DIRECTORIES);
    graphProviderDescriptor.getHierarchyMappings().add(HIERARCHY_TOPLEVEL_FILES);
    graphProviderDescriptor.getHierarchyMappings().add(HIERARCHY_TOPLEVEL_CLASSES);
    graphProviderDescriptor.getHierarchyMappings().add(HIERARCHY_METHODS_AND_FIELDS);

    DependencyMapping dependencyMapping = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createDependencyMapping();
    dependencyMapping.setMainQuery(QUERY_SIMPLE_DEPENDENCIES);
    dependencyMapping.getDetailQueries().add(DETAIL_QUERY);
    graphProviderDescriptor.getDependencyMappings().add(dependencyMapping);
    
    // graphProviderDescriptor.getDependencyMappers().add(QUERY_DEPENDENCIES_EXTENDS_IMPLEMENTS);
    // graphProviderDescriptor.getDependencyMappers().add(QUERY_DEPENDENCIES_INVOKE);
    // graphProviderDescriptor.getDependencyMappers().add(QUERY_DEPENDENCIES_READS_WRITES);
    // graphProviderDescriptor.getDependencyMappers().add(QUERY_DEPENDENCIES_FIELD_OF_TYPE);
    // graphProviderDescriptor.getDependencyMappers().add(QUERY_DEPENDENCIES_THROWS);
    // graphProviderDescriptor.getDependencyMappers().add(QUERY_DEPENDENCIES_RETURNS);
    // graphProviderDescriptor.getDependencyMappers().add(QUERY_DEPENDENCIES_HAS_PARAM_OF_TYPE);

    // label
    NodeLabelMapper labelDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createNodeLabelMapper();
    graphProviderDescriptor.getLabelMappers().add(labelDescriptor);
    labelDescriptor.getRequiredNeo4jLabel().add("Artifact");
    labelDescriptor.setTextPropertyName("fileName");
    labelDescriptor.setDefaultImage("icons/jdt/obj16/jar_obj.png");

    //
    labelDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createNodeLabelMapper();
    graphProviderDescriptor.getLabelMappers().add(labelDescriptor);
    labelDescriptor.getRequiredNeo4jLabel().add("Package");
    labelDescriptor.setTextPropertyName("name");
    labelDescriptor.setDefaultImage("icons/jdt/obj16/package_obj.png");

    //
    labelDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createNodeLabelMapper();
    graphProviderDescriptor.getLabelMappers().add(labelDescriptor);
    labelDescriptor.getRequiredNeo4jLabel().add("Method");
    labelDescriptor.setTextPropertyName("signature");
    // text = methodSignatureParser.parse(properties.get("signature"));
    labelDescriptor.setDefaultImage("icons/jdt/obj16/methdef_obj.png");

    addPropertyBasedImageMapper(labelDescriptor, "visibility", "public", ImagePosition.BASE,
        "icons/jdt/obj16/methpub_obj.png");
    addPropertyBasedImageMapper(labelDescriptor, "visibility", "private", ImagePosition.BASE,
        "icons/jdt/obj16/methpri_obj.png");
    addPropertyBasedImageMapper(labelDescriptor, "visibility", "protected", ImagePosition.BASE,
        "icons/jdt/obj16/methpri_obj.png");
    addPropertyBasedImageMapper(labelDescriptor, "visibility", "default", ImagePosition.BASE,
        "icons/jdt/obj16/methdef_obj.png");

    // imageProvider =
    // HierarchicalgraphMappingFactory.eINSTANCE.createPropertyBasedImageProvider();
    // imageProvider.setPropertyKey("final");
    // imageProvider.getImageMap().put("true",
    // "icons/jdt/ovr16/final_co.png");
    // labelDescriptor.getBottomRightOverlayImages().add(imageProvider);
    // graphProviderDescriptor.getLabelDescriptors().add(labelDescriptor);

    labelDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createNodeLabelMapper();
    graphProviderDescriptor.getLabelMappers().add(labelDescriptor);
    labelDescriptor.getRequiredNeo4jLabel().add("Field");
    labelDescriptor.setTextPropertyName("name");
    labelDescriptor.setDefaultImage("icons/jdt/obj16/field_default_obj.png");

    addPropertyBasedImageMapper(labelDescriptor, "visibility", "public", ImagePosition.BASE,
        "icons/jdt/obj16/field_public_obj.png");
    addPropertyBasedImageMapper(labelDescriptor, "visibility", "private", ImagePosition.BASE,
        "icons/jdt/obj16/field_private_obj.png");
    addPropertyBasedImageMapper(labelDescriptor, "visibility", "protected", ImagePosition.BASE,
        "icons/jdt/obj16/field_protected_obj.png");
    addPropertyBasedImageMapper(labelDescriptor, "visibility", "default", ImagePosition.BASE,
        "icons/jdt/obj16/field_default_obj.png");

    labelDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createNodeLabelMapper();
    graphProviderDescriptor.getLabelMappers().add(labelDescriptor);
    labelDescriptor.getRequiredNeo4jLabel().add("Class");
    labelDescriptor.setTextPropertyName("name");
    labelDescriptor.setDefaultImage("icons/jdt/obj16/class_obj.png");

    labelDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createNodeLabelMapper();
    graphProviderDescriptor.getLabelMappers().add(labelDescriptor);
    labelDescriptor.getRequiredNeo4jLabel().add("Annotation");
    labelDescriptor.setTextPropertyName("name");
    labelDescriptor.setDefaultImage("icons/jdt/obj16/annotation_obj.png");

    labelDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createNodeLabelMapper();
    graphProviderDescriptor.getLabelMappers().add(labelDescriptor);
    labelDescriptor.getRequiredNeo4jLabel().add("Enum");
    labelDescriptor.setTextPropertyName("name");
    labelDescriptor.setDefaultImage("icons/jdt/obj16/enum_obj.png");

    labelDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createNodeLabelMapper();
    graphProviderDescriptor.getLabelMappers().add(labelDescriptor);
    labelDescriptor.getRequiredNeo4jLabel().add("Interface");
    labelDescriptor.setTextPropertyName("name");
    labelDescriptor.setDefaultImage("icons/jdt/obj16/int_obj.png");

    labelDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createNodeLabelMapper();
    graphProviderDescriptor.getLabelMappers().add(labelDescriptor);
    labelDescriptor.getRequiredNeo4jLabel().add("Directory");
    labelDescriptor.setTextPropertyName("fileName");
    labelDescriptor.setDefaultImage("icons/core/obj16/fldr_obj.png");

    labelDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createNodeLabelMapper();
    graphProviderDescriptor.getLabelMappers().add(labelDescriptor);
    labelDescriptor.getRequiredNeo4jLabel().add("File");
    labelDescriptor.setTextPropertyName("fileName");
    labelDescriptor.setDefaultImage("icons/core/obj16/file_obj.png");

    return graphProviderDescriptor;
  }

  public static PropertyBasedImageMapper addPropertyBasedImageMapper(NodeLabelMapper labelDescriptor,
      String propertyName, String propertyValue, ImagePosition imagePosition, String image) {

    PropertyBasedImageMapper imageProvider = Neo4jHierarchicalGraphMappingFactory.eINSTANCE
        .createPropertyBasedImageMapper();
    imageProvider.setPropertyName("visibility");
    imageProvider.setPropertyValue("public");
    imageProvider.setPosition(ImagePosition.BASE);
    imageProvider.setImage("icons/jdt/obj16/methpub_obj.png");
    labelDescriptor.getPropertyBasedImages().add(imageProvider);
    return imageProvider;
  }
}

package org.slizaa.neo4j.hierarchicalgraph.ui.deprecated;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.slizaa.neo4j.hierarchicalgraph.mapping.CypherQuery;
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

  public static HierarchicalGraphMappingDescriptor createHierarchicalGraphMappingDescriptor() {

    //
    HierarchicalGraphMappingDescriptor graphProviderDescriptor = Neo4jHierarchicalGraphMappingFactory.eINSTANCE
        .createHierarchicalGraphMappingDescriptor();

    // hierachy
    graphProviderDescriptor.getRootMappings().add(cypherQuery(HIERARCHY_ROOT_MODULES_QUERY));
    graphProviderDescriptor.getHierarchyMappings().add(HIERARCHY_TOP_LEVEL_DIRECTORIES);
    graphProviderDescriptor.getHierarchyMappings().add(HIERARCHY_DIRECTORIES);
    graphProviderDescriptor.getHierarchyMappings().add(HIERARCHY_TOPLEVEL_FILES);
    graphProviderDescriptor.getHierarchyMappings().add(HIERARCHY_TOPLEVEL_CLASSES);
    graphProviderDescriptor.getHierarchyMappings().add(HIERARCHY_METHODS_AND_FIELDS);

    graphProviderDescriptor.getDependencyMappers().add(QUERY_SIMPLE_DEPENDENCIES);
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

    // //
    // // parallelExecuter.handle((j) ->
    // createHierarchy(j.getAsJsonArray("data"), creator));
    // Future<JsonObject> queryHierarchy =
    // repository.executeCypherQuery(HIERARCHY_ROOT_MODULES_QUERY);
    // createRootElements(queryHierarchy.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created RootElements " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    //
    // queryHierarchy =
    // repository.executeCypherQuery(HIERARCHY_TOP_LEVEL_DIRECTORIES);
    // createHierarchy(queryHierarchy.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created Toplevel directories " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    //
    // queryHierarchy =
    // repository.executeCypherQuery(HIERARCHY_DIRECTORIES);
    // createHierarchy(queryHierarchy.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created directories " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    //
    // queryHierarchy =
    // repository.executeCypherQuery(HIERARCHY_TOPLEVEL_FILES);
    // createHierarchy(queryHierarchy.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created toplevel files " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    //
    // // queryHierarchy =
    // repository.executeCypherQuery(HIERARCHY_INNER_CLASSES);
    // // createHierarchy(queryHierarchy.get().getAsJsonArray("data"),
    // creator);
    // // System.out.println("Created directories " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    //
    // queryHierarchy =
    // repository.executeCypherQuery(HIERARCHY_TOPLEVEL_CLASSES);
    // createHierarchy(queryHierarchy.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created toplevel classes " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    //
    // queryHierarchy =
    // repository.executeCypherQuery(HIERARCHY_METHODS_AND_FIELDS);
    // createHierarchy(queryHierarchy.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created method and fields " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));

    // createDependencies(dependenciesInvoke.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created Invoke " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    // createDependencies(dependenciesExtendsImplements.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created Extends/Implements " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    // createDependencies(dependencyReadsWrites.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created Reads/Writes " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    // createDependencies(dependenciesFieldOfType.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created Field of Type " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    // createDependencies(dependenciesThrows.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created Throws " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    // createDependencies(dependenciesReturns.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created Returns " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));
    // createDependencies(dependenciesHasParamOfType.get().getAsJsonArray("data"),
    // creator);
    // System.out.println("Created Has Param Of Type " +
    // stopwatch.elapsed(TimeUnit.MILLISECONDS));

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

  private static CypherQuery cypherQuery(String query) {
    CypherQuery cypherQuery = Neo4jHierarchicalGraphMappingFactory.eINSTANCE.createCypherQuery();
    cypherQuery.setCypherQuery(query);
    return cypherQuery;
  }

  // public static void main(String[] args) {
  //
  // //
  // HierarchicalGraphMappingDescriptor descriptor = createHierarchicalGraphMappingDescriptor();
  //
  // //
  // Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
  // Map<String, Object> m = reg.getExtensionToFactoryMap();
  // m.put("neo4j2sl", new XMIResourceFactoryImpl());
  //
  // // Obtain a new resource set
  // ResourceSet resSet = new ResourceSetImpl();
  //
  // // create a resource
  // Resource resource = resSet.createResource(URI.createURI("neo4j2sl/mapping.neo4j2sl"));
  // // Get the first model element and cast it to the right type, in my
  // // example everything is hierarchical included in this first node
  // resource.getContents().add(descriptor);
  //
  // // now save the content.
  // try {
  // resource.save(Collections.EMPTY_MAP);
  // } catch (IOException e) {
  // // TODO Auto-generated catch block
  // e.printStackTrace();
  // }
  // }
}

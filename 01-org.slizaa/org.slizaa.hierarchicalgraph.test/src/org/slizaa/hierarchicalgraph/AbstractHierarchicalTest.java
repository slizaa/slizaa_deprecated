package org.slizaa.hierarchicalgraph;

import org.junit.Before;

public class AbstractHierarchicalTest {

  private HGRootNode _rootNode;

  private HGNode     _child;

  private HGNode     _grandChild;

  private HGNode     _greatGrandChild;

  private HGNode     _child2;

  private HGNode     _grandChild2;

  private HGNode     _greatGrandChild2;

  @Before
  public void setup() {

    //
    _rootNode = HierarchicalgraphFactory.eINSTANCE.createHGRootNode();
    _child = Factory.createNode(_rootNode);
    _child2 = Factory.createNode(_rootNode);
    _grandChild = Factory.createNode(_child);
    _grandChild2 = Factory.createNode(_child2);
    _greatGrandChild = Factory.createNode(_grandChild);
    _greatGrandChild2 = Factory.createNode(_grandChild2);

    Factory.createDependency(_child, _child2);
    Factory.createDependency(_grandChild, _grandChild2);
    Factory.createDependency(_greatGrandChild, _greatGrandChild2);
  }

  public HGRootNode rootNode() {
    return _rootNode;
  }

  public HGNode child() {
    return _child;
  }

  public HGNode grandChild() {
    return _grandChild;
  }

  public HGNode greatGrandChild() {
    return _greatGrandChild;
  }

  public HGNode child2() {
    return _child2;
  }

  public HGNode grandChild2() {
    return _grandChild2;
  }

  public HGNode greatGrandChild2() {
    return _greatGrandChild2;
  }
}

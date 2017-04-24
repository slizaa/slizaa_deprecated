package org.slizaa.hierarchicalgraph.selection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;
import org.slizaa.hierarchicalgraph.HGNode;

public class SlizaaNodesAssert extends AbstractAssert<SlizaaNodesAssert, Collection<HGNode>> {

  public SlizaaNodesAssert(Collection<HGNode> slizaaNodes) {
    super(slizaaNodes, SlizaaNodesAssert.class);
  }

  public static SlizaaNodesAssert assertThat(Collection<HGNode> slizaaNodes) {
    return new SlizaaNodesAssert(slizaaNodes);
  }

  public SlizaaNodesAssert containsNodesWithId(long... l) {

    // check that actual nodes collection we want to make assertions on is not null.
    isNotNull();

    // prepare asserted identifiers
    List<Long> assertedIdentifiers = new ArrayList<Long>();
    for (Long id : assertedIdentifiers) {
      assertedIdentifiers.add(new Long(id));
    }

    // check condition
    for (HGNode node : actual) {
      assertedIdentifiers.remove(node.getIdentifier());
    }
    
    //
    if (!assertedIdentifiers.isEmpty()) {
      failWithMessage("Expected node collection to contain <%s>, but is doesn't.", assertedIdentifiers);
    }
    
    // return the current assertion for method chaining
    return this;
  }
  
  public SlizaaNodesAssert isEmpty() {
    Assertions.assertThat(actual).isEmpty();
    return this;
  }
  
  public SlizaaNodesAssert hasSize(int size) {
    Assertions.assertThat(actual).hasSize(size);
    return this;
  }
}
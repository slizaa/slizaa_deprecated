package org.slizaa.hierarchicalgraph.selection.xmi;

import static org.slizaa.hierarchicalgraph.selection.SlizaaNodesAssert.assertThat;

import java.util.Collections;

import org.junit.Test;

public class XRefStack_CropAndCutCropList_Test extends AbstractXRefStack_Test {

  @Test
  public void test() {

    /** STEP 1: select '/WEB-INF/lib/aws-java-sdk-autoscaling-1.11.9.jar (124105)' */
    xRefStack().pruneDependenciesForUncroppedCenterNodes(Collections.singletonList(node(124105)),node(124105).getAccumulatedIncomingCoreDependencies(),
        node(124105).getAccumulatedOutgoingCoreDependencies());
    assertSelection_1();

    /** STEP 2: crop selection */
    xRefStack().cropSelection();
    // TODO: CROP MODE!!
    assertSelection_1();

    /** Step 3: select right-sided node '/WEB-INF/lib/commons-logging-1.2.jar (346380)' */
    xRefStack().setSelectedRightsidedNodes(nodes(346380));
    xRefStack().cropSelection();
    assertSelection_2_a();

    /** Step 4: go back */
    xRefStack().goBack();
    assertSelection_1();

    /** Step 5: select right-sided node '/WEB-INF/lib/aws-java-sdk-core-1.11.9.jar (83045)' */
    xRefStack().setSelectedRightsidedNodes(nodes(83045));
    xRefStack().cropSelection();
    assertSelection_2b();
    
    /** Step 6: go back */
    xRefStack().goBack();
    assertSelection_1();
    
    /** Step 7: go back */
    // TODO: CHECK THIS!!
    // xRefStack().goBack();
    // assertSelection_1();
  }

  /**
   * <p>
   * </p>
   */
  private void assertSelection_1() {

    // assert center:
    // - '/WEB-INF/lib/aws-java-sdk-autoscaling-1.11.9.jar (124105)'
    assertCenterNodes(320, 124105);

    // assert left:
    // - '/WEB-INF/lib/eureka-core-1.6.1.jar (6303)'
    // - '/WEB-INF/lib/aws-java-sdk-autoscaling-1.11.9.jar (124105)'
    assertLeftsidedNodes(220, 6303, 124105);

    // assert right:
    // - '/WEB-INF/lib/aws-java-sdk-core-1.11.9.jar (83045)'
    // - '/WEB-INF/lib/aws-java-sdk-autoscaling-1.11.9.jar (124105)'
    // - '/WEB-INF/lib/stax-api-1.0-2.jar (251957)'
    // - '/WEB-INF/lib/stax-api-1.0.1.jar (281112)'
    // - '/WEB-INF/lib/commons-logging-1.2.jar (346380)'
    assertRightsidedNodes(378, 83045, 124105, 251957, 281112, 346380);
  }

  /**
   * <p>
   * </p>
   */
  private void assertSelection_2_a() {

    // assert center:
    // - '/WEB-INF/lib/aws-java-sdk-autoscaling-1.11.9.jar (124105)'
    assertCenterNodes(4, 124105);

    // assert left:
    // - '/WEB-INF/lib/eureka-core-1.6.1.jar (6303)'
    // - '/WEB-INF/lib/aws-java-sdk-autoscaling-1.11.9.jar (124105)'
    assertLeftsidedNodes(7, 6303, 124105);

    // assert right:
    // - '/WEB-INF/lib/commons-logging-1.2.jar (346380)'
    assertRightsidedNodes(5, 346380);
  }

  /**
   * <p>
   * </p>
   */
  private void assertSelection_2b() {

    // assert center:
    // - '/WEB-INF/lib/aws-java-sdk-autoscaling-1.11.9.jar (124105)'
    assertCenterNodes(268, 124105);

    // assert left:
    // - '/WEB-INF/lib/eureka-core-1.6.1.jar (6303)'
    // - '/WEB-INF/lib/aws-java-sdk-autoscaling-1.11.9.jar (124105)'
    assertLeftsidedNodes(147, 6303, 124105);

    // assert right:
    // - '/WEB-INF/lib/aws-java-sdk-core-1.11.9.jar (83045)'
    assertRightsidedNodes(54, 83045);
  }
}

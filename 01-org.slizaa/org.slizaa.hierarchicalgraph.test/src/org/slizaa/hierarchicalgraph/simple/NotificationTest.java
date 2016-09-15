package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewCoreDependency;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGAggregatedDependency;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;

public class NotificationTest extends AbstractSimpleModelTest {

  @Test
  public void testNotification() {

    //
    HGAggregatedDependency aggregatedDependency = model().a1().getOutgoingDependenciesTo(model().b1());
    assertThat(aggregatedDependency).isNotNull();
    assertThat(aggregatedDependency.getAggregatedWeight()).isEqualTo(4);
    assertThat(aggregatedDependency.getCoreDependencies()).hasSize(4).containsOnly(model().a1_b1_core1(),
        model().a1_b1_core2(), model().a2_b2_core1(), model().a3_b3_core1());

    //
    Adapter adapter = new AdapterImpl() {
      public void notifyChanged(Notification notification) {
        System.out.println("Notfication received from the data model. Data model has changed!!!");
        System.out.println(notification.getNotifier());
        System.out.println(notification.getFeature());
      }
    };
    aggregatedDependency.eAdapters().add(adapter);

    //
    createNewCoreDependency(model().a2(), model().b2(), "NEW_USAGE",
        () -> HierarchicalgraphFactory.eINSTANCE.createDefaultHGDependencySource());
    
    //
    model().root().invalidateAllCaches();
  }
}

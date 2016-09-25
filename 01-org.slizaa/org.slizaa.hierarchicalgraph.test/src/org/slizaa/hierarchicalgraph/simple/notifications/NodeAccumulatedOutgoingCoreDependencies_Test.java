package org.slizaa.hierarchicalgraph.simple.notifications;

import static org.assertj.core.api.Assertions.assertThat;
import static org.slizaa.hierarchicalgraph.HierarchicalgraphFactoryMethods.createNewCoreDependency;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HierarchicalgraphFactory;
import org.slizaa.hierarchicalgraph.simple.AbstractSimpleModelTest;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class NodeAccumulatedOutgoingCoreDependencies_Test extends AbstractSimpleModelTest {

  /** - */
  private List<Notification> _notifications;

  /** - */
  private Adapter            _adapter;

  /** - */
  private HGNode             _node;

  /**
   * <p>
   * </p>
   */
  @Before
  public void setup() {

    //
    _notifications = new ArrayList<>();

    //
    _node = model().a1();
    assertThat(_node).isNotNull();
    assertThat(_node.getAccumulatedOutgoingCoreDependencies()).isNotNull();
    assertThat(_node.getAccumulatedOutgoingCoreDependencies()).hasSize(4);
    assertThat(_node.getAccumulatedOutgoingCoreDependencies()).containsOnly(model().a1_b1_core1(), model().a1_b1_core2(), model().a2_b2_core1(), model().a3_b3_core1());

    //
    _adapter = new AdapterImpl() {
      public void notifyChanged(Notification notification) {
        System.out.println("Notification: " + notification);
        _notifications.add(notification);
      }
    };

    //
    _node.eAdapters().add(_adapter);
  }

  /**
   * <p>
   * </p>
   */
  @After
  public void teardown() {

    //
    _node.eAdapters().remove(_adapter);
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void testHGNodeOutgoingDependenciesNotification() {

    //
    HGCoreDependency newCoreDependency = createNewCoreDependency(model().a2(), model().b2(), "NEW_USAGE",
        () -> HierarchicalgraphFactory.eINSTANCE.createDefaultDependencySource(), true);

    //
    assertThat(_notifications).hasSize(1);

    //
    assertThat(_node.getAccumulatedOutgoingCoreDependencies()).hasSize(5);
    assertThat(_node.getAccumulatedOutgoingCoreDependencies()).containsOnly(model().a1_b1_core1(), model().a1_b1_core2(), model().a2_b2_core1(), model().a3_b3_core1(), newCoreDependency);
  }

}

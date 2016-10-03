package org.slizaa.hierarchicalgraph.simple.resolvedeps;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class AggregatedCoreDependencyResolve_NotificationTest extends AbstractResolverTest {

  /** - */
  private List<Notification> _notifications;

  /** - */
  private Adapter            _adapter;

  /**
   * <p>
   * </p>
   */
  @Before
  public void setup() {

    //
    _notifications = new ArrayList<>();

    //
    _adapter = new AdapterImpl() {
      public void notifyChanged(Notification notification) {
        if (notification.getEventType() == Notification.SET ) {
          System.out.println("Notification: " + notification.getFeature());
          _notifications.add(notification);
        }
      }
    };
  }

  @Test
  public void coreDependencyResolve() {

    //
    model().a3_b3_core1().eAdapters().add(_adapter);

    //
    resolve(() -> {
      model().a3_b3_core1().resolveAggregatedCoreDependencies();
    });

    //
    model().a3_b3_core1().eAdapters().remove(_adapter);
  }
}
package org.slizaa.hierarchicalgraph.simple;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.junit.Test;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class ExtensionNotification_Test extends AbstractSimpleModelTest {

  private List<Notification> _notifcations = new LinkedList<>();
  
  /**
   * <p>
   * </p>
   */
  @Test
  public void testExtensionNotification() {

    //
    model().root().eAdapters().add(new AdapterImpl() {
      @Override
      public void notifyChanged(Notification msg) {
        System.out.println(msg.getEventType());
        System.out.println(msg.getFeature());
        System.out.println(msg.getNewValue());
          _notifcations.add(msg);
      }
    });
    
    //

    model().root().registerExtension(ExtensionNotification_Test.class, this);
    
    //
    assertThat(_notifcations).hasSize(1);
  }
}

package org.slizaa.neo4j.jqassistant.application.perspectiveswitcher;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.osgi.service.event.Event;

/**
 * <p>
 * e4-hack: https://www.eclipse.org/forums/index.php/t/489322/
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
public class TrimbarAddon {

  @Inject
  @Optional
  private void closeHandler(@UIEventTopic(UIEvents.UILifeCycle.APP_STARTUP_COMPLETE) Event event, MApplication app) {
    MTrimmedWindow window = (MTrimmedWindow) app.getChildren().get(0);
    window.getTrimBars().get(0).setVisible(true);
  }
}

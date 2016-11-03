package org.slizaa.jqassistant;

import org.eclipse.e4.ui.workbench.UIEvents;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

@Component(service = EventHandler.class, property = {
    EventConstants.EVENT_TOPIC + "=" + UIEvents.ElementContainer.TOPIC_SELECTEDELEMENT })
public class MyEventListener implements EventHandler {

  @Override
  public void handleEvent(Event event) {

    // IEclipseContext context = (IEclipseContext) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
    // .getService(IEclipseContext.class);
    // EModelService modelService = context.get(EModelService.class);
    //
    // Object element = event.getProperty(EventTags.ELEMENT);
    // Object newValue = event.getProperty(EventTags.NEW_VALUE);
    // // ensure that the selected element of a perspective stack is changed and that this is a perspective
    // if (!(element instanceof MPerspectiveStack) || !(newValue instanceof MPerspective)) {
    // return;
    // }
    //
    // MPerspectiveStack perspectiveStack = (MPerspectiveStack) element;
    // MPerspective perspective = (MPerspective) newValue;
    //
    // // MApplication application = (MApplication)
    // // perspectiveStack.getParent().getParent().getParent().getSelectedElement();
    // System.out.println("getParent = " + ((MApplication) perspectiveStack.getParent().getParent().getCurSharedRef()));
    //
    // MWindow window = modelService.getTopLevelWindowFor(perspectiveStack.getParent());
    //
    // for (MMenuElement menuElement : window.getMainMenu().getChildren()) {
    //// if (menuElement.getElementId().equals("project")) {
    //// menuElement.setToBeRendered(false);
    //// menuElement.setVisible(false);
    //// }
    // System.out.println("menuElement: " + menuElement);
    // }
    //
    // MTrimBar trimBar = modelService.getTrim((MTrimmedWindow) window, SideValue.TOP);
    // trimBar.getChildren().forEach(e -> {
    //// if (e.getElementId().startsWith("org.eclipse.ui.workbench")) {
    //// e.setToBeRendered(false);
    //// }
    // });
    //
    // //
    // IWorkbenchPage workbenchPage = context.getActive(IWorkbenchPage.class);
    // if (workbenchPage != null) {
    // workbenchPage.hideActionSet("org.eclipse.search.searchActionSet");
    //// workbenchPage.hideActionSet("org.eclipse.ui.externaltools.ExternalToolsSet");
    // }
    //// for (IWorkbenchPage workbenchPage : workbenchWindow.getPages()) {
    //// }
    //
    // System.out.println(trimBar);
    // System.out.println("Selected perspective of " + perspectiveStack + " is " + perspective.getLabel());
  }
}
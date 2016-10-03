package org.slizaa.neo4j.jqassistant.application.perspectiveswitcher;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.slizaa.neo4j.jqassistant.application.Activator;

public class PerspectiveSwitcherControl {

  @Inject
  private MWindow window;
  
  @Inject
  private EPartService partService; 

  @PostConstruct
  public void createGui(final Composite parent) {

    Composite comp = new Composite(parent, SWT.NONE);
    GridLayout gridLayout = new GridLayout();
    gridLayout.marginHeight = 8;
    gridLayout.marginWidth = 5;
    comp.setLayout(gridLayout);

    //
//   

    ToolBar toolBar = new ToolBar(comp, SWT.FLAT | SWT.HORIZONTAL | SWT.RIGHT);

    for (final MPerspective perspective : getPerspectives()) {
      ToolItem item = new ToolItem(toolBar, SWT.PUSH);
      
      if (perspective.getIconURI() != null) {
        if (Activator.getDefault().getImageRegistry().get(perspective.getIconURI()) == null) {
          try {
            ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(new URL(perspective.getIconURI()));
            Activator.getDefault().getImageRegistry().put(perspective.getIconURI(), imageDescriptor);
          } catch (MalformedURLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
          }
        }
        item.setImage(Activator.getDefault().getImageRegistry().get(perspective.getIconURI()));
      }
      
      item.setText(perspective.getLabel());
      item.addSelectionListener(new SelectionListener() {
        
        @Override
        public void widgetSelected(SelectionEvent e) {
          partService.switchPerspective(perspective);
        }
        
        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
        }
      });
    }

    toolBar.pack();
  }

  /**
   * <p>
   * </p>
   *
   * @return
   */
  private List<MPerspective> getPerspectives() {

    //
    List<MPerspective> result = new LinkedList<>();

    // The perspectives currently open
    List<MPerspectiveStack> appPerspectiveStacks = E4Util.getMatchingChildren(window, MPerspectiveStack.class);
    if (appPerspectiveStacks.size() > 0) {
      for (MPerspectiveStack stack : appPerspectiveStacks)
        for (MPerspective perspective : stack.getChildren()) {
          if (perspective.isToBeRendered())
            result.add(perspective);
        }
    }

    //
    return result;
  }
}
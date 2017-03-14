package org.slizaa.ui.xref.internal;

import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;
import org.mockito.Mock;
import org.slizaa.testfwk.ui.AbstractSlizaaPartTest;

public class XRefPartTest extends AbstractSlizaaPartTest {

  /** - */
  private XRefPart _part;
  
  @Mock
  private MPerspective _perspective;

  /**
   * {@inheritDoc}
   */
  @Override
  protected void onSetup(Shell shell) {

    //
    _part = new XRefPart();
    _part.createComposite(shell());
    
    //
    System.out.println(_perspective);
    
    //
    _part.setPerspective(_perspective);
  }

  @Test
  public void test() {

    //
    _part.handleChangedRootNode(rootNode());

    displaySleep();
  }
}
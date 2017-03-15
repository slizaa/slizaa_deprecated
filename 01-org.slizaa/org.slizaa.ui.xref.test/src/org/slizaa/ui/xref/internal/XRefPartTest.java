package org.slizaa.ui.xref.internal;

import static org.mockito.Mockito.when;

import org.eclipse.e4.core.internal.contexts.EclipseContext;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;
import org.mockito.Mock;
import org.slizaa.testfwk.ui.AbstractSlizaaPartTest;

@SuppressWarnings("restriction")
public class XRefPartTest extends AbstractSlizaaPartTest {

  /** - */
  private XRefPart       _part;

  @Mock
  private MPerspective   _perspective;

  private EclipseContext _eclipseContext;

  /**
   * {@inheritDoc}
   */
  @Override
  protected void onSetup(Shell shell) {

    //
    _part = new XRefPart();
    _part.createComposite(shell());

    //
    _part.setPerspective(_perspective);

    //
    _eclipseContext = new EclipseContext(null);
    when(_perspective.getContext()).thenReturn(_eclipseContext);
  }

  @Test
  public void test() {

    //
    _part.handleChangedRootNode(rootNode());

    displaySleep();
  }
}
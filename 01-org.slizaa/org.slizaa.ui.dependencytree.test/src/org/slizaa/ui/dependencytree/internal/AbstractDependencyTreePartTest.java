package org.slizaa.ui.dependencytree.internal;

import static org.mockito.Mockito.when;

import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.junit.Before;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;
import org.slizaa.testfwk.ui.AbstractXmiBasedSlizaaPartTest;
import org.slizaa.testfwk.ui.SlizaaUITest;

/**
 * <p>
 * </p>
 *
 * @author Gerd W&uuml;therich (gerd@gerd-wuetherich.de)
 */
@Category(SlizaaUITest.class)
public class AbstractDependencyTreePartTest extends AbstractXmiBasedSlizaaPartTest {

  /** - */
  @Mock
  private MPerspective       _perspective;

  /** - */
  private DependencyTreePart _part;

  /** - */
  private SWTBotTree         _fromTree;

  /** - */
  private SWTBotTree         _toTree;


  /**
   * {@inheritDoc}
   */
  public void beforeShellOpens(Shell shell) {

    // create the xref part
    _part = new DependencyTreePart();
    _part.createComposite(shell());

    // ...and mock the perspective
    _part.setPerspective(_perspective);
    when(_perspective.getContext()).thenReturn(eclipseContext());
  }

  /**
   * <p>
   * </p>
   *
   */
  @Before
  public void setup() {

    // create the SWTBotTrees
    _fromTree = swtbot().treeWithId("slizaa-id", DependencyTreeComposite.SLIZAA_ID_DEPENDENCY_TREE_FROM_TREE);
    _toTree = swtbot().treeWithId("slizaa-id", DependencyTreeComposite.SLIZAA_ID_DEPENDENCY_TREE_TO_TREE);
  }

  /**
   * <p>
   * </p>
   */
  public SWTBotTree fromTree() {
    return _fromTree;
  }

  /**
   * <p>
   * </p>
   */
  public SWTBotTree toTree() {
    return _toTree;
  }

  /**
   * <p>
   * </p>
   */
  public DependencyTreePart part() {
    return _part;
  }
}
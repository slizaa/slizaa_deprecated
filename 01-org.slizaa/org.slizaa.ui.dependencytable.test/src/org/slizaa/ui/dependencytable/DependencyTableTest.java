package org.slizaa.ui.dependencytable;

import static org.slizaa.hierarchicalgraph.selection.SelectionFactoryMethods.createDependencySelection;

import java.util.Collection;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.testfwk.ui.AbstractXmiBasedSlizaaPartTest;
import org.slizaa.testfwk.ui.SlizaaUITest;

@Category(SlizaaUITest.class)
public class DependencyTableTest extends AbstractXmiBasedSlizaaPartTest {

  /** - */
  private DependencyTablePart _part;

  /**
   * {@inheritDoc}
   */
  @Override
  public void beforeShellOpens(Shell shell) {
    _part = new DependencyTablePart();
    _part.createComposite(shell());
  }

  /**
   * <p>
   * </p>
   */
  @Test
  public void test() {

    //
    SWTBotTable tableBot = swtbot().table();

    //
    Collection<HGCoreDependency> dependencies = node(28232).getOutgoingDependenciesTo(node(267432))
        .getCoreDependencies();

    //
    _part.handleDetailDependencySelectionChanged(null, createDependencySelection(dependencies));

    //
    swtbot().waitUntil(Conditions.tableHasRows(tableBot, dependencies.size()));

    // TODO: sort/filter/etc.
    // assert (tableBot.getTableItem(0).getText(0))
    // .equals("com.amazonaws.services.ec2.model.transform.DhcpConfigurationStaxUnmarshaller");

    // displaySleep();
  }
}
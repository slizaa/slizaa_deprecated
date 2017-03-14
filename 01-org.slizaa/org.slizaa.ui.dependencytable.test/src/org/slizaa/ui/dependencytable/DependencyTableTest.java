package org.slizaa.ui.dependencytable;

import java.util.Set;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.junit.Test;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.testfwk.ui.AbstractSlizaaPartTest;

public class DependencyTableTest extends AbstractSlizaaPartTest {

  /** - */
  private DependencyTablePart _part;

  /**
   * {@inheritDoc}
   */
  @Override
  protected void onSetup(Shell shell) {

    //
    _part = new DependencyTablePart();
    _part.createComposite(shell());
  }

  @Test
  public void test() {

    //
    SWTBotTable tableBot = swtbot().table();

    //
    Set<AbstractHGDependency> dependencies = toAbstractHGDependencySet(
        node(28232).getOutgoingDependenciesTo(node(267432)).getCoreDependencies());

    //
    _part.initSelection(dependencies);

    //
    swtbot().waitUntil(Conditions.tableHasRows(tableBot, dependencies.size()));

    // TODO: sort/filter/etc.
    // assert (tableBot.getTableItem(0).getText(0))
    // .equals("com.amazonaws.services.ec2.model.transform.DhcpConfigurationStaxUnmarshaller");

    displaySleep();
  }
}
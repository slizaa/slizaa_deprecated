package org.slizaa.ui.dependencytable;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slizaa.hierarchicalgraph.AbstractHGDependency;
import org.slizaa.hierarchicalgraph.HGCoreDependency;
import org.slizaa.hierarchicalgraph.HGNode;
import org.slizaa.hierarchicalgraph.HGRootNode;
import org.slizaa.hierarchicalgraph.spi.INodeLabelProvider;
import org.slizaa.testfwk.AbstractXmiBasedTest;
import org.slizaa.testfwk.XmiUtils;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SWTBotDemo extends AbstractXmiBasedTest {

  public SWTBotDemo() {
    super("eureka_1-4-10.hggraph");
  }

  @Test
  public void test() {

    Display display = new Display();
    Shell shell = new Shell(display);
    shell.setLayout(new FillLayout());
    shell.setSize(800, 400);

    //
    DependencyTablePart part = new DependencyTablePart();
    part.createComposite(shell);

    //
    HGRootNode rootNode = XmiUtils.load("eureka_1-4-10.hggraph");
    rootNode.registerExtension(INodeLabelProvider.class, new DummyProvider());

    //
    shell.open();

    //
    SWTBot bot = new SWTBot(shell);
    SWTBotTable table = bot.table();

    //
    HGNode node_1 = rootNode.lookupNode(new Long(28232));
    HGNode node_2 = rootNode.lookupNode(new Long(267432));
    Set dependencies = new HashSet<HGCoreDependency>(node_1.getOutgoingDependenciesTo(node_2).getCoreDependencies());
    part.initSelection((Set<AbstractHGDependency>) dependencies);

    //
    bot.waitUntil(Conditions.tableHasRows(table, dependencies.size()));
    assert(table.getTableItem(0).getText(0)).equals("/com/amazonaws/services/ec2/model/transform/PlacementStaxUnmarshaller.class");

//    //
//    while (!shell.isDisposed()) {
//      if (!display.readAndDispatch())
//        display.sleep();
//    }

    display.dispose();
  }
}
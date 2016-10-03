package org.slizaa.neo4j.testfwk;

import org.junit.BeforeClass;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;
import org.slizaa.neo4j.testfwk.restserver.ITestJqaDatabaseCreatorService;
import org.slizaa.neo4j.testfwk.restserver.TestDB;

public class AbstractNeo4JServerTest {

  /** - */
  private static AutoCloseable _server;

  @BeforeClass
  public static void before() {

    if (_server == null) {

      //
      BundleContext bundleContext = FrameworkUtil.getBundle(ITestJqaDatabaseCreatorService.class).getBundleContext();
      ServiceTracker<ITestJqaDatabaseCreatorService, ITestJqaDatabaseCreatorService> serviceTracker = new ServiceTracker<>(
          bundleContext, ITestJqaDatabaseCreatorService.class, null);
      serviceTracker.open();

      //
      _server = serviceTracker.getService().createJqaServer(TestDB.MAPSTRUCT);
    }
  }
}

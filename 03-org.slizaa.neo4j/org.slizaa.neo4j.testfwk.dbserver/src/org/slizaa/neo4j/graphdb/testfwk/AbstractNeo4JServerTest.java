package org.slizaa.neo4j.graphdb.testfwk;

import org.junit.Before;
import org.junit.BeforeClass;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

public class AbstractNeo4JServerTest {

  /** - */
  private static AutoCloseable _server;

  @Before
  public void before() throws InterruptedException {

    if (_server == null) {

      //
      BundleContext bundleContext = FrameworkUtil.getBundle(ITestJqaDatabaseCreatorService.class).getBundleContext();
      ServiceTracker<ITestJqaDatabaseCreatorService, ITestJqaDatabaseCreatorService> serviceTracker = new ServiceTracker<>(
          bundleContext, ITestJqaDatabaseCreatorService.class, null);
      serviceTracker.open();

      //
      _server = serviceTracker.waitForService(5000l).createJqaServer(TestDB.MAPSTRUCT);
    }
  }
}

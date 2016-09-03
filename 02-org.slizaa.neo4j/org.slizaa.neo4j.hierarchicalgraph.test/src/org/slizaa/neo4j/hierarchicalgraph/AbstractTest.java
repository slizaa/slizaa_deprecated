package org.slizaa.neo4j.hierarchicalgraph;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;
import org.slizaa.neo4j.hierarchicalgraph.impl.ExtendedNeo4JRemoteRepositoryImpl;
import org.slizaa.neo4j.testfwk.restserver.ITestJqaDatabaseCreatorService;
import org.slizaa.neo4j.testfwk.restserver.TestDB;

public class AbstractTest {

  /** - */
  private static AutoCloseable _server;

  @BeforeClass
  public static void before() {
    if (_server == null) {
      
      //
      BundleContext bundleContext = FrameworkUtil.getBundle(ExtendedNeo4JRemoteRepositoryImpl.class).getBundleContext();
      ServiceTracker<ITestJqaDatabaseCreatorService, ITestJqaDatabaseCreatorService> serviceTracker = new ServiceTracker<>(
          bundleContext, ITestJqaDatabaseCreatorService.class, null);
      serviceTracker.open();
      
      //
      _server = serviceTracker.getService().createJqaServer(TestDB.MAPSTRUCT);
    }
  }
  
  @AfterClass
  public static void after() throws Exception {
//    _server.close();
  }
}

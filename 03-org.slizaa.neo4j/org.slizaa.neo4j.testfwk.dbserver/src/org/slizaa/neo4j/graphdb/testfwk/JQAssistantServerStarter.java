package org.slizaa.neo4j.graphdb.testfwk;

import java.io.IOException;

import org.slizaa.neo4j.graphdb.testfwk.internal.TestJqaDatabaseCreatorServiceImpl;

public class JQAssistantServerStarter {

  public static void main(String[] args) throws Exception {

    // start the test jqa server
    TestJqaDatabaseCreatorServiceImpl service = new TestJqaDatabaseCreatorServiceImpl();
    service.activate();

    //
    try (AutoCloseable server = service.createJqaServer(TestDB.MAPSTRUCT)) {

      //
      System.out.println("jQAssistant server started on port 7474.");

      //
      promptEnterKey();

      //
      System.out.println("Shutting down jQAssistant server...");
    }

    // deactivate
    service.deactivate();

    //
    System.out.println("Done!");
  }

  /**
   * <p>
   * </p>
   * 
   * @throws IOException
   */
  private static void promptEnterKey() throws IOException {
    System.out.println("Press \"ENTER\" to continue...");
    while (System.in.available() == 0) {
      // Do whatever you want
    }
  }
}

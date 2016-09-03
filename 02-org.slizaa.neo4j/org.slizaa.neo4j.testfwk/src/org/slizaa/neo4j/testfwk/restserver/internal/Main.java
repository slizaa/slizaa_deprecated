package org.slizaa.neo4j.testfwk.restserver.internal;

import org.slizaa.neo4j.testfwk.restserver.TestDB;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    // start the test jqa server
    TestJqaDatabaseCreatorServiceImpl service = new TestJqaDatabaseCreatorServiceImpl();
    service.activate();
    service.createJqaServer(TestDB.MAPSTRUCT);

    //
    System.out.println("Done");

    //
    Thread.sleep(25000);
  }
}

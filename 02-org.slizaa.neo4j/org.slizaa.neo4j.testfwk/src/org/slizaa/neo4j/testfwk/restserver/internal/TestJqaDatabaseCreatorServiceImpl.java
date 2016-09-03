package org.slizaa.neo4j.testfwk.restserver.internal;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.joor.Reflect.on;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slizaa.neo4j.testfwk.restserver.ITestJqaDatabaseCreatorService;
import org.slizaa.neo4j.testfwk.restserver.ITestJqaDatabaseHandle;
import org.slizaa.neo4j.testfwk.restserver.TestDB;
import org.slizaa.neo4j.testfwk.restserver.internal.aether.TransitiveDependenciesResolver;

@Component(immediate = true, service = ITestJqaDatabaseCreatorService.class)
public class TestJqaDatabaseCreatorServiceImpl implements ITestJqaDatabaseCreatorService {

  /** - */
  private Path _tempDirectoryPath;

  /**
   * <p>
   * </p>
   */
  @Activate
  public void activate() {

    //
    try {
      _tempDirectoryPath = Files.createTempDirectory("jqaTempDirectory");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * <p>
   * </p>
   */
  @Deactivate
  public void deactivate() {
    cleanUp();
  }

  /**
   * {@inheritDoc}
   */
  public void cleanUp() {

    if (_tempDirectoryPath != null) {
      try {
        Delete.delete(_tempDirectoryPath);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param databaseDirectory
   * @return
   */
  public ITestJqaDatabaseHandle createJqaServer(TestDB testDB) {
    checkNotNull(testDB);

    try {

      // resolve all required dependencies
      URL[] urls = TransitiveDependenciesResolver.resolve("org.neo4j.test:neo4j-harness:2.3.3");

      // create the ULR class loader
      ClassLoader classLoader = new URLClassLoader(urls);

      //
      return TCCLExecuter.execute(classLoader, () -> {

        // TestServerBuilders.newInProcessBuilder(new File("blablabal"))
        AutoCloseable server = on("org.neo4j.harness.TestServerBuilders", classLoader).call("newInProcessBuilder")
            .call("copyFrom", unzip(testDB)).call("newServer").get();

        //
        return new TestJqaDatabaseHandleImpl(server);
      });

    } catch (Throwable e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * <p>
   * </p>
   *
   * @param testDB
   */
  private File unzip(TestDB testDB) {

    //
    checkNotNull(testDB);

    //
    if (_tempDirectoryPath == null) {
      activate();
    }

    //
    File databaseDirectory = new File(_tempDirectoryPath.toFile(), testDB.getName());

    //
    if (!databaseDirectory.exists()) {
      try (InputStream inputStream = TestJqaDatabaseCreatorServiceImpl.class.getResourceAsStream(testDB.getPath())) {
        UnZip.unzip(inputStream, databaseDirectory);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    //
    return databaseDirectory;
  }
}

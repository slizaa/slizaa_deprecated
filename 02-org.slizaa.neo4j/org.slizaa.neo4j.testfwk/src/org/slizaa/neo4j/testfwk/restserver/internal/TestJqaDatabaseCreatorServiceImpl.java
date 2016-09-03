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
import org.slizaa.neo4j.testfwk.restserver.TestDB;
import org.slizaa.neo4j.testfwk.restserver.internal.aether.TransitiveDependenciesResolver;

@Component(immediate = true, service = ITestJqaDatabaseCreatorService.class)
public class TestJqaDatabaseCreatorServiceImpl implements ITestJqaDatabaseCreatorService {

  /** - */
  private Path        _tempDirectoryPath;

  /** - */
  private ClassLoader _classLoader;

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

    // resolve all required dependencies
    URL[] urls = TransitiveDependenciesResolver.resolve("org.neo4j.test:neo4j-harness:2.3.3");
    _classLoader = new URLClassLoader(urls);
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
  public AutoCloseable createJqaServer(TestDB testDB) {
    checkNotNull(testDB);

    try {

      //
      return TCCLExecuter.execute(_classLoader, () -> {

        // TestServerBuilders.newInProcessBuilder(new File("blablabal"))
        AutoCloseable server = on("org.neo4j.harness.TestServerBuilders", _classLoader).call("newInProcessBuilder")
            .call("copyFrom", unzip(testDB)).call("newServer").get();

        //
        return server;
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

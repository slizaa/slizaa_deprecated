package org.slizaa.neo4j.testfwk.restserver.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Delete {

  /**
   * <p>
   * </p>
   *
   * @param directory
   * @throws IOException
   */
  public static void delete(File directory) throws IOException {

    //
    if (!checkNotNull(directory).exists()) {
      return;
    }

    //
    Files.walkFileTree(Paths.get(directory.getAbsolutePath()), new SimpleFileVisitor<Path>() {

      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Files.delete(file);
        System.out.println("Delete " + file);
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        Files.delete(dir);
        System.out.println("Delete " + dir);
        return FileVisitResult.CONTINUE;
      }

    });
  }

  public static void delete(Path path) throws IOException {

    //
    Files.walkFileTree(path, new SimpleFileVisitor<Path>() {

      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Files.delete(file);
        System.out.println("Delete " + file);
        return FileVisitResult.CONTINUE;
      }

      @Override
      public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        Files.delete(dir);
        System.out.println("Delete " + dir);
        return FileVisitResult.CONTINUE;
      }

    });
  }
}

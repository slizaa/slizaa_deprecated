package org.slizaa.neo4j.testfwk.restserver.internal;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZip {

  /**
   * <p>
   * </p>
   *
   * @param zipFile
   * @param outputFolder
   */
  public static void unzip(InputStream inputStream, File folder) {
    
    checkNotNull(inputStream);
    checkNotNull(folder);

    byte[] buffer = new byte[1024];

    try {

      // create output directory is not exists
      if (!folder.exists()) {
        folder.mkdir();
      }

      // get the zip file content
      try (ZipInputStream zis = new ZipInputStream(inputStream)) {
        // get the zipped file list entry
        ZipEntry ze = zis.getNextEntry();

        while (ze != null) {

          if (!ze.isDirectory()) {

            String fileName = ze.getName();
            File newFile = new File(folder + File.separator + fileName);

            // create all non exists folders
            // else you will hit FileNotFoundException for compressed folder
            new File(newFile.getParent()).mkdirs();

            try (FileOutputStream fos = new FileOutputStream(newFile)) {
              int len;
              while ((len = zis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
              }
            }
          }
          ze = zis.getNextEntry();
        }

        zis.closeEntry();
        zis.close();
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
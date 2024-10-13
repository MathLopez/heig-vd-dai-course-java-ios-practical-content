package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * A class that reads binary files. This implementation reads the file byte per byte. It manages the
 * file input stream properly with a try-catch-finally block.
 */
public class BinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    try(InputStream fis = new FileInputStream(filename)) {

      int b;
      while ((b = fis.read()) != -1) {
        System.out.print((char) b);
      }
    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }

    // throw new UnsupportedOperationException("Please remove this exception and implement this method.");
  }
}

package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Writable;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that writes text files. This implementation write the file byte per byte. It manages the
 * file writer properly with a try-catch-finally block.
 */
public class TextFileWriter implements Writable {

  @Override
  public void write(String filename, int sizeInBytes) {
    try (Writer writer = new FileWriter(filename, StandardCharsets.UTF_8)) {

      int counter = 0;
      while (counter++ < sizeInBytes) {
        writer.write('a');
      }

    } catch (IOException e) {
      System.out.println("Exception: " + e);
    }
    // throw new UnsupportedOperationException("Please remove this exception and implement this method.");
  }
}

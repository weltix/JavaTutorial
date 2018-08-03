package com.weltix.java.tutorial.basicio.fileio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;
import java.io.IOException;

/**
 * Created by ASUS on 12.09.14.
 */
public class RandomAccessFiles {
    public static void main(String... args) {
        Path file = Paths.get("C:\\file.txt");
        String s = "I was here!\n";
        byte data[] = s.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data);

        ByteBuffer copy = ByteBuffer.allocate(12);

        try (FileChannel fc = FileChannel.open(file, READ, WRITE)) {
            // Read the first 12
            // bytes of the file.
            int nread;
            do {
                nread = fc.read(copy);
            } while (nread != -1 && copy.hasRemaining());

            // Write "I was here!" at the beginning of the file.
            fc.position(0);
            while (out.hasRemaining())
                fc.write(out);
            out.rewind();

            // Move to the end of the file.  Copy the first 12 bytes to
            // the end of the file.  Then write "I was here!" again.
            long length = fc.size();
            fc.position(length);
            copy.flip();
            while (copy.hasRemaining())
                fc.write(copy);
            while (out.hasRemaining())
                fc.write(out);
        } catch (IOException x) {
            System.out.println("I/O Exception: " + x);
        }
    }
}

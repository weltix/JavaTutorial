package com.weltix.java.tutorial.basicio;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;

/**
 * Created by ASUS on 12.10.14.
 */
public class FindInt {
    private Path file;

    FindInt(Path file) {
        this.file = file;
    }

    public int seek() throws IOException {
        int num = -1;

        try (SeekableByteChannel fc = Files.newByteChannel(file)) {

            ByteBuffer buf = ByteBuffer.allocate(8);

            //Get the offset into the file.
            fc.read(buf);
            long offset = buf.getLong(0);

            //Seek to the offset location.
            fc.position(offset);
            buf.rewind();

            //Read the 'secret' value.
            fc.read(buf);
            num = buf.getInt(0);
        } catch (IOException x) {
            System.err.println(x);
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        Path file = Paths.get("datafile");
        int num = new FindInt(file).seek();
        System.out.println("The value is " + num);
    }
}
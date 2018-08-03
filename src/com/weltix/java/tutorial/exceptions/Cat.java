package com.weltix.java.tutorial.exceptions;

import java.io.*;

/**
 * Created by ASUS on 24.08.14.
 */
class Cat {

    public static void cat(File file) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException fnf) {
            System.err.format("File: %s not found%n", file);
        } catch (IOException e) {
            System.err.println(e.toString());
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException io) {
                }
            }
        }
    }

    public static void main(String[] args) {
        Cat.cat(new File("files/exceptions_ListOfNumbers2_infile.txt"));
    }
}
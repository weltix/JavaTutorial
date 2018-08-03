package com.weltix.java.tutorial.basicio.fileio;

import java.nio.file.*;
import java.io.IOException;

/**
 * Created by ASUS on 03.09.14.
 */
public class FileTest {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("usage: FileTest file");
            System.exit(-1);
        }
        // Converts the input string to a Path object.
        Path inputPath = Paths.get(args[0]);
        // Converts the input Path to an absolute path.
        // Generally, this means prepending the current working directory.
        // If this example were called like this: java FileTest foo
        // the getRoot and getParent methods would return null on the original "inputPath" instance.
        // Invoking getRoot and getParent on the "fullPath" instance returns expected values.
        Path fullPath = inputPath.toAbsolutePath();
        System.out.println(fullPath);


        Path path = inputPath;
        try {
            Path fp = path.toRealPath();
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", path);
            // Logic for case when file doesn't exist.
        } catch (IOException x) {
            System.err.format("%s%n", x);
            // Logic for other sort of file error.
        }


        // Solaris
        Path p1 = Paths.get("/home/joe/foo");
        // Result is /home/joe/foo/bar
        System.out.format("%s%n", p1.resolve("bar"));
        // Microsoft Windows
        p1 = Paths.get("C:\\home\\joe\\foo");
        // Result is C:\home\joe\foo\bar
        System.out.format("%s%n", p1.resolve("bar"));
        // Result is /home/joe
        Paths.get("foo").resolve("/home/joe");
    }
}
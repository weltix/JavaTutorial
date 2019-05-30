/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.basic_io.file_io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        // None of these methods requires that the file corresponding
        // to the Path exists.
        // Microsoft Windows syntax
        Path path = Paths.get("C:\\home\\joe\\foo");
        // Solaris syntax
        //Path path = Paths.get("/home/joe/foo");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0, 2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n%n", path.getRoot());

        // Solaris syntax
        //Path path = Paths.get("sally/bar");
        //or
        // Microsoft Windows syntax
        path = Paths.get("sally\\bar");
        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0, 2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n%n", path.getRoot());

        Path p1 = Paths.get("/home/logfile");
        // Result is file:///home/logfile
        System.out.format("%s%n", p1.toUri());
    }
}

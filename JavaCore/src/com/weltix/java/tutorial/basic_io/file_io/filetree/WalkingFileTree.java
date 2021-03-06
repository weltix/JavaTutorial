/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.basic_io.file_io.filetree;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.EnumSet;

import static java.nio.file.FileVisitOption.FOLLOW_LINKS;

public class WalkingFileTree{
    public static void main(String... args) throws IOException {
        Path startingDir = Paths.get("D:\\Programs\\Winamp\\");
        PrintFiles pf = new PrintFiles();
        Files.walkFileTree(startingDir, pf);

        startingDir = Paths.get("C:\\");
        EnumSet<FileVisitOption> opts = EnumSet.of(FOLLOW_LINKS);
        PrintFiles finder = new PrintFiles();
        Files.walkFileTree(startingDir, opts, 1, finder);

    }
}

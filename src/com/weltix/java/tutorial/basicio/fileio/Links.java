package com.weltix.java.tutorial.basicio.fileio;

import sun.awt.image.ImageWatched;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by ASUS on 27.09.14.
 */
public class Links {
    private static void creatingSymbolicLinks() {
        Path newLink = Paths.get("C:\\symbolicLink.lnk");
        Path target = Paths.get("C:\\target.txt");
        try {
            Files.createSymbolicLink(newLink, target);
        } catch (IOException x) {
            System.err.println(x);
        } catch (UnsupportedOperationException x) {
            // Some file systems do not support symbolic links.
            System.err.println(x);
        }
    }

    private static void createHardLink() {
        Path newLink = Paths.get("C:\\hardLink.lnk");
        Path existingFile = Paths.get("C:\\target.txt");
        try {
            Files.createLink(newLink, existingFile);
        } catch (IOException x) {
            System.err.println(x);
        } catch (UnsupportedOperationException x) {
            // Some file systems do not
            // support adding an existing
            // file to a directory.
            System.err.println(x);
        }
    }

    private static void detectingSymbolicLink() {
        Path file = Paths.get("C:\\symbolicLink.lnk");
        boolean isSymbolicLink =
                Files.isSymbolicLink(file);
        System.out.format("%s is symbolic link = %b%n", file, isSymbolicLink);
    }

    private static void findingTargetOfLink() {
        Path link = Paths.get("C:\\symbolicLink.lnk");
        try {
            System.out.format("Target of link" +
                            " '%s' is '%s'%n", link,
                    Files.readSymbolicLink(link));
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    public static void main(String... args) {
        Links.creatingSymbolicLinks();
        Links.createHardLink();
        Links.detectingSymbolicLink();
        Links.findingTargetOfLink();
    }


}

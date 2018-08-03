package com.weltix.java.tutorial.basicio.fileio;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by ASUS on 20.09.14.
 */
public class CreatingAndReadingDirectories {
    private CreatingAndReadingDirectories() throws IOException {
        this.getRootDirectories();
        this.creatingDirectory();
        this.listingDirectoryContent();
        this.directoryFilter();
    }

    private void getRootDirectories() {
        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
        for (Path name : dirs) {
            System.err.println(name);
        }
    }

    private void creatingDirectory() throws IOException {
        Files.createDirectory(Paths.get("C:\\1"));
        Files.createDirectories(Paths.get("C:\\1\\2\\3"));
        Files.createTempDirectory(Paths.get("C:\\1\\"), "MyTemp");
    }

    private void listingDirectoryContent() {
        Path dir = Paths.get("C:\\1");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file : stream) {
                System.out.println("listing " + file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException x) {
            // IOException can never be thrown by the iteration.
            // In this snippet, it can only be thrown by newDirectoryStream.
            System.err.println(x);
        }
    }

    private void directoryFilter() {
        DirectoryStream.Filter<Path> filter =
                new DirectoryStream.Filter<Path>() {
                    public boolean accept(Path file) throws IOException {
                        try {
                            return (Files.isDirectory(file));
                        } finally {
                        }
                    }
                };
        Path dir = Paths.get("C:\\1");
        try (DirectoryStream<Path>
                     stream = Files.newDirectoryStream(dir, filter)) {
            for (Path entry : stream) {
                System.out.println("filter only dir-s inside C:\\1\\ " + entry.getFileName());
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    public static void main(String... args) throws IOException {
        new CreatingAndReadingDirectories();
    }
}

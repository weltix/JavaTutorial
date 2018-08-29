package com.weltix.java.tutorial.basic_io.file_io.metadata;

import java.io.IOException;
import java.nio.file.*;
import java.nio.ByteBuffer;
import java.nio.file.attribute.*;
import java.nio.charset.Charset;

/**
 * Created by ASUS on 10.09.14.
 */
public class Metadata {

    private void basicFileAttributes(Path path) throws IOException {
        Path file = path;
        BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

        System.out.println("creationTime: " + attr.creationTime());
        System.out.println("lastAccessTime: " + attr.lastAccessTime());
        System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

        System.out.println("isDirectory: " + attr.isDirectory());
        System.out.println("isOther: " + attr.isOther());
        System.out.println("isRegularFile: " + attr.isRegularFile());
        System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
        System.out.println("size: " + attr.size());
    }

    private void settingTimeStamp(Path path) throws IOException {
        Path file = path;
        long currentTime = System.currentTimeMillis();
        FileTime ft = FileTime.fromMillis(currentTime);
        Files.setLastModifiedTime(file, ft);
        BasicFileAttributes attr =
                Files.readAttributes(file, BasicFileAttributes.class);
        System.out.println("newLastModifiedTime: " + attr.lastModifiedTime());
    }

    private void dosFileAttributes(Path path) throws IOException {
        Path file = path;
        try {
            DosFileAttributes attr =
                    Files.readAttributes(file, DosFileAttributes.class);
            System.out.println("isReadOnly is " + attr.isReadOnly());
            System.out.println("isHidden is " + attr.isHidden());
            System.out.println("isArchive is " + attr.isArchive());
            System.out.println("isSystem is " + attr.isSystem());
            //to set attribute hidden
            //Files.setAttribute(file, "dos:hidden", true);
        } catch (UnsupportedOperationException x) {
            System.err.println("DOS file" +
                    " attributes not supported:" + x);
        }
    }

    /*
    public void posixFilePermissions(Path path) throws IOException {
        Path file = path;
        PosixFileAttributes attr =
                Files.readAttributes(file, PosixFileAttributes.class);
        System.out.format("%s %s %s%n",
                attr.owner().getName(),
                attr.group().getName(),
                PosixFilePermissions.toString(attr.permissions()));
    }
    */

    /*
    public void settingFileOwner(Path path) throws IOException {
        Path file = path;
        UserPrincipal owner = file.getFileSystem().getUserPrincipalLookupService()
                .lookupPrincipalByName("sally");
        Files.setOwner(file, owner);
        GroupPrincipal group = file.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByGroupName("green");
        Files.getFileAttributeView(file, PosixFileAttributeView.class).setGroup(group);
    }
    */

    private void userDefinedFileAtribute(Path path) throws  IOException {
        Path file = path;
        String name = "user.mimetype";
        UserDefinedFileAttributeView view = Files.getFileAttributeView(file, UserDefinedFileAttributeView.class);
        view.write(name, Charset.defaultCharset().encode("text/html"));

        ByteBuffer buf = ByteBuffer.allocate(view.size(name));
        view.read(name, buf);
        buf.flip();
        String value = Charset.defaultCharset().decode(buf).toString();
        System.out.println(value);
    }

    private void fileStoreAtribute(Path path) throws IOException {
        Path file = path;
        FileStore store = Files.getFileStore(file);

        long total = store.getTotalSpace() / 1;
        long used = (store.getTotalSpace() - store.getUnallocatedSpace()) / 1;
        long avail = store.getUsableSpace() / 1;
        System.out.format("Total: %d%nUsed: %d%nAvailable: %d%n", total, used, avail);
    }

    public static void main(String... args) throws IOException {
        Path path = Paths.get("C:\\file");
        Metadata m = new Metadata();
        m.basicFileAttributes(path);
        m.settingTimeStamp(path);
        m.dosFileAttributes(path);
        //m.posixFilePermissions(path);
        //m.settingFileOwner(path);
        m.userDefinedFileAtribute(path);
        m.fileStoreAtribute(path);
    }
}

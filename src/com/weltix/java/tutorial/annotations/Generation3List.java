package com.weltix.java.tutorial.annotations;

/**
 * Created by ASUS on 29.05.14.
 */
@ClassPreamble(
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        // Note array notation
        reviewers = {"Alice", "Bob", "Cindy"}
)
public class Generation3List {

    public static void main(String[] args) {
        System.out.println();
    }
}
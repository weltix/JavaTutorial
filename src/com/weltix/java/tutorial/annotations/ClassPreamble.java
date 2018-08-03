package com.weltix.java.tutorial.annotations;

/**
 * Created by ASUS on 29.05.14.
 */

// import this to use @Documented

import java.lang.annotation.*;

@Documented
public @interface ClassPreamble {
    String author();

    String date();

    int currentRevision() default 1;

    String lastModified() default "N/A";

    String lastModifiedBy() default "N/A";

    // Note use of array
    String[] reviewers();
}
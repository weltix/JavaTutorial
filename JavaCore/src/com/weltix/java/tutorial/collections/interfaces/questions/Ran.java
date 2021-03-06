/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.collections.interfaces.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ran {

    public static void main(String[] args) {

        // Get and shuffle the list of arguments
        List<String> argList = Arrays.asList(args);
        Collections.shuffle(argList);

        // Print out the elements using JDK 8 Streams
        argList.stream()
                .forEach(e -> System.out.format("%s ", e));

        // Print out the elements using for-each
        for (String arg : argList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}
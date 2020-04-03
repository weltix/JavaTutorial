/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.regex.pattern;

import java.util.regex.Pattern;

public class SplitDemo {

    private static final String REGEX = ":";
    private static final String INPUT =
            "one:two:three:four:five";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        String[] items = p.split(INPUT);
        for (String s : items) {
            System.out.println(s);
        }
    }
}
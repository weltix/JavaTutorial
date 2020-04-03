/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.collections.interfaces.questions;

import java.util.SortedSet;
import java.util.TreeSet;

public class FindDups3 {
    public static void main(String[] args) {
        SortedSet<String> s = new TreeSet<>(String::compareToIgnoreCase);
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}
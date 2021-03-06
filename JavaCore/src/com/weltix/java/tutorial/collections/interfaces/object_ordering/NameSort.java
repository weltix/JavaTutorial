/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.collections.interfaces.object_ordering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameSort {
    public static void main(String[] args) {
        Name nameArray[] = {
                new Name("John", "Smith"),
                new Name("Karl", "Ng"),
                new Name("Jeff", "Smith"),
                new Name("Tom", "Rich")
        };

        List<Name> names = Arrays.asList(nameArray);
        Collections.sort(names);
        System.out.println(names);
    }
}
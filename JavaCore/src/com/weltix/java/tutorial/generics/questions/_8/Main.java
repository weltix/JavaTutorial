/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.generics.questions._8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(2,648,54,500,152);
        List<Integer> li = new ArrayList<>();
        li.addAll(ci);

        int max = Algorithm.max(li, 1, 3);
        System.out.println("Full list: " + li);
        System.out.println("Sublist:   " + li.subList(1,4).toString());
        System.out.println("Max value: " + max);
    }
}

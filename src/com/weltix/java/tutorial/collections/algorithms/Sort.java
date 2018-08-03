package com.weltix.java.tutorial.collections.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ASUS on 13.05.15.
 */
public class Sort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.sort(list);
        System.out.println(list);
    }
}
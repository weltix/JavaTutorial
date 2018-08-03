package com.weltix.java.tutorial.generics;

import java.util.List;
import java.util.Arrays;

/**
 * Created by ASUS on 23.07.14.
 */
public class ArrayBuilder {

    public static <T> void addToList (List<T> listArg, T... elements)
    {
        for (T x : elements) {
            listArg.add(x);
        }
    }

    public static void faultyMethod(List<String>... l) {
        Object[] objectArray = l;     // Valid
        objectArray[0] = Arrays.asList(42);
        String s = l[0].get(0);       // ClassCastException thrown here
    }
}
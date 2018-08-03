package com.weltix.java.tutorial.generics;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ASUS on 23.07.14.
 */
public class HeapPollutionExample {

    public static void main(String[] args) {

        List<String> stringListA = new ArrayList<String>();
        List<String> stringListB = new ArrayList<String>();

        ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
        ArrayBuilder.addToList(stringListA, "Ten", "Eleven", "Twelve");
        List<List<String>> listOfStringLists =
                new ArrayList<List<String>>();
        ArrayBuilder.addToList(listOfStringLists,
                stringListA, stringListB);

        ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
    }
}
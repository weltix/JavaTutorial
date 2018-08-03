package com.weltix.java.tutorial.collections.interfaces.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ASUS on 19.03.15.
 */
public class Shuffle1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
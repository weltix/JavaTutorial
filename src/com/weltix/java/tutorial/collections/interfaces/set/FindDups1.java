package com.weltix.java.tutorial.collections.interfaces.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ASUS on 08.03.15.
 */
public class FindDups1 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}
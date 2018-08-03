package com.weltix.java.tutorial.collections.interfaces.set;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by ASUS on 08.03.15.
 */
public class FindDups {
    public static void main(String[] args) {
        Set<String> distinctWords = Arrays.asList(args).stream()
                .collect(Collectors.toSet());
        System.out.println(distinctWords.size()+
                " distinct words: " +
                distinctWords);
    }
}

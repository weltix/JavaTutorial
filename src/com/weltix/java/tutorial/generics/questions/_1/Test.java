package com.weltix.java.tutorial.generics.questions._1;

import java.util.*;

/**
 * Created by ASUS on 03.08.14.
 */

class OddPredicate implements UnaryPredicate<Integer> {
    @Override
    public boolean test(Integer i) {
        return i % 2 != 0;
    }
}

public class Test {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }
}
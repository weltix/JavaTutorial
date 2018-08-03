package com.weltix.java.tutorial.generics.questions._1;

import java.util.*;

/**
 * Created by ASUS on 03.08.14.
 */
public final class Algorithm {
    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
}
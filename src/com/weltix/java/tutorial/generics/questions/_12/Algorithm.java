package com.weltix.java.tutorial.generics.questions._12;

import java.util.*;

/**
 * Created by ASUS on 09.08.14.
 */
public final class Algorithm {

    public static <T>
    int findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p) {
        for (; begin < end; ++begin)
            if (p.test(list.get(begin)))
                return begin;
        return -1;
    }

    // x > 0 and y > 0
    public static int gcd(int x, int y) {
        for (int r; (r = x % y) != 0; x = y, y = r) { }
        return y;
    }
}
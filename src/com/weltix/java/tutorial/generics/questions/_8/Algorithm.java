package com.weltix.java.tutorial.generics.questions._8;

import java.util.*;

/**
 * Created by ASUS on 07.08.14.
 */
public final class Algorithm {
    public static <T extends Object & Comparable<? super T>>
    T max(List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (++begin; begin <= end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        return maxElem;
    }
}
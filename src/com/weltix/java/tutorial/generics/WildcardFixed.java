package com.weltix.java.tutorial.generics;

import java.util.List;

/**
 * Created by ASUS on 20.07.14.
 */
public class WildcardFixed {

    void foo(List<?> i) {
        fooHelper(i);
    }

    // Helper method created so that the wildcard can be captured
    // through type inference.
    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }

}
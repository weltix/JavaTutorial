package com.weltix.java.tutorial.generics.questions._3;

/**
 * Created by ASUS on 04.08.14.
 */
public final class Algorithm {
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
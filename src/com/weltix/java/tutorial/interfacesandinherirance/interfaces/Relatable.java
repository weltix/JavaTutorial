package com.weltix.java.tutorial.interfacesandinherirance.interfaces;

/**
 * Created by ASUS on 29.05.14.
 */
public interface Relatable {

    // this (object calling isLargerThan)
    // and other must be instances of
    // the same class returns 1, 0, -1
    // if this is greater than,
    // equal to, or less than other
    public int isLargerThan(Relatable other);
}
package com.weltix.java.tutorial.packages.mygame.shared;

/**
 * Created by ASUS on 26.07.14.
 */
public class Utilities {
    // set DEBUG = false and compile to stop debug messages
    final static boolean DEBUG = true;

    public static void printMsg(String msg) {
        if (DEBUG) {
            System.out.println(msg);
        }
    }
}
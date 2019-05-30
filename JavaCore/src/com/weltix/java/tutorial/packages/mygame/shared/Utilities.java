/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.packages.mygame.shared;

public class Utilities {
    // set DEBUG = false and compile to stop debug messages
    final static boolean DEBUG = true;

    public static void printMsg(String msg) {
        if (DEBUG) {
            System.out.println(msg);
        }
    }
}
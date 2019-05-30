/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.classes.classes.initialization;

public class ObjectFieldsInitOrder {
    static int initialize(String message) {
        System.out.println(message);
        return 0;
    }

    static class A {
        int i0 = initialize("i0");

        int i1;
        { i1 = initialize("i1"); }

        int i2 = initialize("i2");

        int i3;
        A() { i3 = initialize("i3"); }
    }

    static class B extends A {
        int i4 = initialize("i4");

        int i5;
        { i5 = initialize("i5"); }

        int i6;
        B() { i6 = initialize("i6"); }
    }

    public static void main(String[] args) {
        new B();
    }
}
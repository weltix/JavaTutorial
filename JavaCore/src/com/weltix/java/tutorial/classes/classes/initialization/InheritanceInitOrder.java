/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.classes.classes.initialization;

public class InheritanceInitOrder {
    static class A {
        String a;
        A() {
            a = "a";
            System.out.println("a initialized");
            System.out.println("b=" + ((B)this).b);
        }
    }

    static class B extends A {
        String b;
        B() {
            b = "b";
            System.out.println("b initialized");
            System.out.println("b=" + b);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        new B();
    }
}
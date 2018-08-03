package com.weltix.java.tutorial.interfaces_and_inheritance.inheritance.overriding_and_hiding;

/**
 * Created by ASUS on 25.06.14.
 */
public class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
    public static void testStaticInheritance() {
        System.out.println("The static method inherited from Animal");
    }
}
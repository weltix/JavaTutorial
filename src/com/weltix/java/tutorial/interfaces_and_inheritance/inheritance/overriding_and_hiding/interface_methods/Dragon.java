package com.weltix.java.tutorial.interfaces_and_inheritance.inheritance.overriding_and_hiding.interface_methods;

/**
 * Created by ASUS on 25.06.14.
 */
public class Dragon implements EggLayer, FireBreather {
    public static void main (String... args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }
}
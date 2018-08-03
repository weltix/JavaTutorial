package com.weltix.java.tutorial.interfaces_and_inheritance.inheritance.overriding_and_hiding.interface_methods;

/**
 * Created by ASUS on 25.06.14.
 */
public class Pegasus extends Horse implements Flyer, Mythical {
    public static void main(String... args) {
        Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());
    }
}
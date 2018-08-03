package com.weltix.java.tutorial.interfaces_and_inheritance.inheritance.overriding_and_hiding.interface_methods;

/**
 * Created by ASUS on 25.06.14.
 */
public class Mustang extends Horse implements Mammal {
    public static void main(String... args) {
        Mustang myApp = new Mustang();
        System.out.println(myApp.identifyMyself());
    }
}
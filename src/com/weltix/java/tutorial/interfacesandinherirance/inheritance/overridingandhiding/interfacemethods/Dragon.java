package com.weltix.java.tutorial.interfacesandinherirance.inheritance.overridingandhiding.interfacemethods;

/**
 * Created by ASUS on 25.06.14.
 */
public class Dragon implements EggLayer, FireBreather {
    public static void main (String... args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }
}
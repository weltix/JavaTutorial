package com.weltix.java.tutorial.interfacesandinherirance.inheritance.overridingandhiding.interfacemethods;

/**
 * Created by ASUS on 25.06.14.
 */
public class Mustang extends Horse implements Mammal {
    public static void main(String... args) {
        Mustang myApp = new Mustang();
        System.out.println(myApp.identifyMyself());
    }
}
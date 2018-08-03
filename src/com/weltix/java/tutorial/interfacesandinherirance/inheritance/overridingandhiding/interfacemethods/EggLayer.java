package com.weltix.java.tutorial.interfacesandinherirance.inheritance.overridingandhiding.interfacemethods;

/**
 * Created by ASUS on 25.06.14.
 */
public interface EggLayer extends Animal {
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}
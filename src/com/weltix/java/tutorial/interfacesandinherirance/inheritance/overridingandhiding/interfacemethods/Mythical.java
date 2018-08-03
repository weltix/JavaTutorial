package com.weltix.java.tutorial.interfacesandinherirance.inheritance.overridingandhiding.interfacemethods;

/**
 * Created by ASUS on 25.06.14.
 */
public interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
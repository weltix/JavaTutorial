package com.weltix.java.tutorial.interfaces_and_inheritance.inheritance.overriding_and_hiding.interface_methods;

/**
 * Created by ASUS on 25.06.14.
 */
public interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
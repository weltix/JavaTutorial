/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.interfaces_and_inheritance.inheritance.overriding_and_hiding.interface_methods;

public interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
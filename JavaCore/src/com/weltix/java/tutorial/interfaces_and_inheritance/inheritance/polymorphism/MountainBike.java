/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.interfaces_and_inheritance.inheritance.polymorphism;

public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(
            int startCadence,
            int startSpeed,
            int startGear,
            String suspensionType) {
        super(startCadence,
                startSpeed,
                startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension() {
        return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a " +
                getSuspension() + " suspension.");
    }
}
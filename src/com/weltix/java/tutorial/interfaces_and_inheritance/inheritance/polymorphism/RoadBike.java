package com.weltix.java.tutorial.interfaces_and_inheritance.inheritance.polymorphism;

/**
 * Created by ASUS on 27.06.14.
 */
public class RoadBike extends Bicycle {
    // In millimeters (mm)
    private int tireWidth;

    public RoadBike(int startCadence,
                    int startSpeed,
                    int startGear,
                    int newTireWidth) {
        super(startCadence,
                startSpeed,
                startGear);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth() {
        return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth) {
        this.tireWidth = newTireWidth;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The RoadBike" + " has " + getTireWidth() +
                " MM tires.");
    }
}
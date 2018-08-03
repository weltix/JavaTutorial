package com.weltix.java.tutorial.interfaces_and_inheritance.inheritance.polymorphism;

/**
 * Created by ASUS on 27.06.14.
 */
class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public Bicycle(int cadence,
                   int speed,
                   int gear) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

    public void printDescription() {
        System.out.println("\nBike is " + "in gear " + this.gear
                + " with a cadence of " + this.cadence +
                " and travelling at a speed of " + this.speed + ". ");
    }
}
package com.weltix.java.tutorial.obj_orient_prog_concepts.interfaces;

/**
 * Created by ASUS on 31.05.14.
 */
public interface Bicycle {
    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
package com.weltix.java.tutorial.interfacesandinherirance.interfaces.defaultmethods;

import java.lang.*;

/**
 * Created by ASUS on 31.05.14.
 */
public class TestSimpleTimeClient {
    public static void main(String... args) {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println("Current time: " + myTimeClient.toString());
        System.out.println("Time in California: " +
                myTimeClient.getZonedDateTime("Blah blah").toString());
    }
}
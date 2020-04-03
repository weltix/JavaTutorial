/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.platform_environment;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args)
            throws Exception {

        // set up new properties object
        // from file "platformenvironment_myProperties.txt"
        FileInputStream propFile =
                new FileInputStream("files/platformenvironment_myProperties.txt");
        Properties p =
                new Properties(System.getProperties());
        p.load(propFile);

        // set the system properties
        System.setProperties(p);
        // display new properties
        System.getProperties().list(System.out);
    }
}
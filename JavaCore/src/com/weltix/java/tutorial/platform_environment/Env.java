/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.platform_environment;

public class Env {
    public static void main (String[] args) {
        for (String env: args) {
            String value = System.getenv(env);
            if (value != null) {
                System.out.format("%s=%s%n",
                        env, value);
            } else {
                System.out.format("%s is"
                        + " not assigned.%n", env);
            }
        }
    }
}
package com.weltix.java.tutorial.platformenvironment;

/**
 * Created by ASUS on 11.01.15.
 */
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
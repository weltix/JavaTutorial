package com.weltix.java.tutorial.platform_environment;

import java.util.Map;

/**
 * Created by ASUS on 11.01.15.
 */
public class EnvMap {
    public static void main (String[] args) {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
    }
}
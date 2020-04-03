/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.numbers_and_strings.numbers;

public class ExponentialDemo {
    public static void main(String[] args) {
        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of " + "e is %.4f%n",
                Math.E);

        System.out.printf("exp(%.3f) " + "is %.3f%n",
                x, Math.exp(x));

        System.out.printf("log(%.3f) is " + "%.3f%n",
                x, Math.log(x));

        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n",
                x, y, Math.pow(x, y));

        System.out.printf("sqrt(%.3f) is " + "%.3f%n",
                x, Math.sqrt(x));
    }
}
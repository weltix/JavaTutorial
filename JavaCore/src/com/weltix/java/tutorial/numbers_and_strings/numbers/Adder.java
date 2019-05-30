/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.numbers_and_strings.numbers;

public class Adder {
    public static void main(String[] args) {
        int numArgs = args.length;

        //this program requires at least two arguments on the command line
        if (numArgs < 2) {
            System.out.println("This program requires two command-line arguments.");
        } else {
            int sum = 0;

            for (int i = 0; i < numArgs; i++) {
                sum += Integer.valueOf(args[i]).intValue();
            }

            //print the sum
            System.out.println(sum);
        }
    }
}

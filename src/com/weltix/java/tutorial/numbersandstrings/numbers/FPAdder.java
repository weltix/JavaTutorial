package com.weltix.java.tutorial.numbersandstrings.numbers;

import java.text.DecimalFormat;

/**
 * Created by ASUS on 07.07.14.
 */
public class FPAdder {
    public static void main(String[] args) {

        int numArgs = args.length;

        //this program requires at least two arguments on the command line
        if (numArgs < 2) {
            System.out.println("This program requires two command-line arguments.");
        } else {
            double sum = 0.0;

            for (int i = 0; i < numArgs; i++) {
                sum += Double.valueOf(args[i]).doubleValue();
            }

            //format the sum
            DecimalFormat myFormatter = new DecimalFormat("###,###.##");
            String output = myFormatter.format(sum);

            //print the sum
            System.out.println(output);
            System.out.printf("%,.2f", sum);   //another variant
        }
    }
}
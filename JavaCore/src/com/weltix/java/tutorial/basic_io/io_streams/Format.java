/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.basic_io.io_streams;

import java.util.Calendar;

public class Format {
    public static void main(String[] args) {
        System.out.format("%f, %1$+020.10f %n", Math.PI);
        System.out.format("%f, %<+020.10f %n", Math.PI);

        //testing
        Boolean i = false;
        String j = Integer.toHexString(i.hashCode());

        //General conversions
        System.out.format("%1$10.3b %<B %2$h %<H %n", i, j);
        //Character conversions
        System.out.format("%20c %<-20C %n", 'd');
        //Numeric conversions
        System.out.format("%2$,+d       %#o %<x %<#X %n", 30, 34567);
        System.out.format("%(e  %<022E  %<g  %<f      %< 20f     %n", -30.56);
        //Date/Time conversions
        System.out.format("%tc   %n", Calendar.getInstance());
        //Percent and Line separator conversions
        System.out.format("%% %%   %n");

        //Argument Index
        System.out.format("%s   %<s   %S   %1$s   %<S   %s   %s   %S   %s", "1", "2", "3", "4", "5", "6");
    }
}
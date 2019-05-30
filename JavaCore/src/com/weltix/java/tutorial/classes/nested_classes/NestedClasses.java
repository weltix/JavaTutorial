/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.classes.nested_classes;

public class NestedClasses {
    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++)
            d[i] = 100 * Math.random();
        ArrayAlg.StaticNestedClass p = ArrayAlg.minmax(d);
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());
    }
}

class ArrayAlg {
    int i = 5;          //for test access from nested classes below
    static int j = 7;   //for test access from nested classes below

    public class InnerClass {                               //test access from inner class
        static final int i = 3;                             //only static final, no static in inner class

        public InnerClass() {                               //test access from inner class
            System.out.format("For inner class i = %d, j = %d.%n", i, j);   //test access from inner class
        }
    }

    public static class StaticNestedClass {
        private double first;
        private double second;

        public StaticNestedClass(double f, double s) {
            first = f;
            second = s;
            ArrayAlg aa = new ArrayAlg();                                            //test access from static class
            System.out.format("For static nested class i = %d, j = %d.%n", aa.i, j); //test access from static class
            aa.new InnerClass();
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }

    public static StaticNestedClass minmax(double[] values) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new StaticNestedClass(min, max);
    }
}

package com.weltix.java.tutorial.classes.lambdaexpressions;

/**
 * Created by ASUS on 22.05.14.
 */
public class Calculator {

    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {

        Calculator myApp = new Calculator();
        //IntegerMath addition = new IntegerMath() {
        //    public int operation(int a, int b) {
        //        return a + b;
        //    }
        //};
        //IntegerMath subtraction = new IntegerMath() {
        //    public int operation(int a, int b) {
        //        return a - b;
        //    }
        //};
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " +
                myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
                myApp.operateBinary(20, 10, subtraction));
    }
}
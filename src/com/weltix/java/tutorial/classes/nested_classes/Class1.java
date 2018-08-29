package com.weltix.java.tutorial.classes.nested_classes;

/**
 * Created by ASUS on 23.05.14.
 */
public class Class1 {
    protected InnerClass1 ic;
    static int i = 5;

    public Class1() {
        ic = new InnerClass1();
    }

    public void displayStrings() {
        System.out.println(ic.getString() + ".");
        System.out.println(ic.getAnotherString() + ".");
    }

    static public void main(String[] args) {
        Class1 c1 = new Class1();
        c1.displayStrings();
    }

    protected class InnerClass1 {
        public String getString() {
            System.out.format("i = %d%n", i);
            return "InnerClass1: getString invoked";
        }

        public String getAnotherString() {
            return "InnerClass1: getAnotherString invoked";
        }
    }
}
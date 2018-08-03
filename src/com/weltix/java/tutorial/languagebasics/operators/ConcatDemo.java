package com.weltix.java.tutorial.languagebasics.operators;

/**
 * Created by ASUS on 31.05.14.
 */
class ConcatDemo {
    public static void main(String[] args) {
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);
    }
}
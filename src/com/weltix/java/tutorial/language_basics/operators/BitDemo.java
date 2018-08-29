package com.weltix.java.tutorial.language_basics.operators;

/**
 * Created by ASUS on 31.05.14.
 */
class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
    }
}
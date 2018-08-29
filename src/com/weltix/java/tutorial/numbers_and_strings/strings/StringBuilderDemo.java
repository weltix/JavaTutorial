package com.weltix.java.tutorial.numbers_and_strings.strings;

/**
 * Created by ASUS on 11.07.14.
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";

        StringBuilder sb = new StringBuilder(palindrome);

        sb.reverse();  // reverse it

        System.out.println(sb);
    }
}
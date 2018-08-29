package com.weltix.java.tutorial.language_basics.control_flow;

/**
 * Created by ASUS on 31.05.14.
 */
class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}
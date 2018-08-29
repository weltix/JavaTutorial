package com.weltix.java.tutorial.language_basics.control_flow;

/**
 * Created by ASUS on 31.05.14.
 */
class EnhancedForDemo {
    public static void main(String[] args){
        int[] numbers =
                {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
    }
}

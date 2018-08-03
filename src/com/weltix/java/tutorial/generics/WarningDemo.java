package com.weltix.java.tutorial.generics;

/**
 * Created by ASUS on 15.07.14.
 */
public class WarningDemo {
    public static void main(String[] args) {
        Box<Integer> bi;
        bi = createBox();
    }

    static Box createBox() {
        return new Box();
    }
}

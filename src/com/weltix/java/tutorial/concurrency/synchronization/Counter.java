package com.weltix.java.tutorial.concurrency.synchronization;

/**
 * Created by ASUS on 19.10.14.
 */
class Counter {
    private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }

}
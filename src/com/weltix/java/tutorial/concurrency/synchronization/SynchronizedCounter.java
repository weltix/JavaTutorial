package com.weltix.java.tutorial.concurrency.synchronization;

/**
 * Created by ASUS on 19.10.14.
 */
public class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}
package com.weltix.java.tutorial.concurrency.highlevelconcurrencyobjects;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ASUS on 03.12.14.
 */
class AtomicCounter {
    private AtomicInteger c = new AtomicInteger(0);

    public void increment() {
        c.incrementAndGet();
    }

    public void decrement() {
        c.decrementAndGet();
    }

    public int value() {
        return c.get();
    }

}
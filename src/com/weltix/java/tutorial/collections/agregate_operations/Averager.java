package com.weltix.java.tutorial.collections.agregate_operations;

import java.util.function.IntConsumer;

/**
 * Created by ASUS on 09.05.15.
 */
class Averager implements IntConsumer
{
    private int total = 0;
    private int count = 0;

    public double average() {
        return count > 0 ? ((double) total)/count : 0;
    }

    public void accept(int i) { total += i; count++; }
    public void combine(Averager other) {
        total += other.total;
        count += other.count;
    }
}
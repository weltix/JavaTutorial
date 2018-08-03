package com.weltix.java.tutorial.concurrency.guardedblocks;

/**
 * Created by ASUS on 24.10.14.
 */
public class ProducerConsumerExample {
    public static void main(String[] args) {
        Drop drop = new Drop();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
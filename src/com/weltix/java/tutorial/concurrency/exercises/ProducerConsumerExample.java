package com.weltix.java.tutorial.concurrency.exercises;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by ASUS on 03.12.14.
 */
public class ProducerConsumerExample {
    public static void main(String[] args) {
        BlockingQueue<String> drop =
                new SynchronousQueue<String>();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
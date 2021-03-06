/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.concurrency.thread_objects;

public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }

}
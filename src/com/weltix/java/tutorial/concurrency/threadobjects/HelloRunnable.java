package com.weltix.java.tutorial.concurrency.threadobjects;

/**
 * Created by ASUS on 12.10.14.
 */
public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }

}
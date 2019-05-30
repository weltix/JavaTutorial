/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.collections.implementations.deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeSample {
    public static void main(String[] args) {
        ArrayDeque<String> aDeque = new ArrayDeque<> ();

        aDeque.addFirst("tea");
        aDeque.addFirst("milk");
        aDeque.addFirst("coffee");
        aDeque.addLast("sugar");

           /* Iterate through elements in an ArrayDeque instance */
        for( Iterator itr =  aDeque.iterator(); itr.hasNext(); ) {
            System.out.println(itr.next());
        }
        System.out.println();

        aDeque.addFirst("juice");
        aDeque.addLast("honey");

        System.out.println("First Element : " + aDeque.getFirst());
        System.out.println("Last Element : " + aDeque.getLast());

            /* Removal of the Deque Elements */
        System.out.println("First Element(Removed):"+aDeque.removeFirst());
        System.out.println("Last Element Removed:"+aDeque.removeLast());

        System.out.println("\nPopped Element : " + aDeque.pop());
        System.out.println("Size of Array Deque: " + aDeque.size());

    }
}
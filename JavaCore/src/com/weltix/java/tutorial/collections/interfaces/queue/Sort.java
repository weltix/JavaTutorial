/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.collections.interfaces.queue;

import java.util.*;

public class Sort {

    static <E> List<E> heapSort(Collection<E> c) {
        Queue<E> queue = new PriorityQueue<E>(c);
        List<E> result = new ArrayList<E>();

        while (!queue.isEmpty())
            result.add(queue.remove());

        return result;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        System.out.println("Was: " + list);
        System.out.println("Became: " + Sort.heapSort(list));
    }
}

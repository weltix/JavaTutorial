/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.generics;

public interface Pair<K, V> {
    public K getKey();
    public V getValue();
}
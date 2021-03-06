/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.collections.interfaces.object_ordering;

import java.util.Date;

public class Employee {

    private final String name;
    private final long number;
    private final Date hireDate;

    public Employee(String name, long number, Date hireDate) {
        if (name == null || hireDate == null)
            throw new NullPointerException();
        this.name = name;
        this.number = number;
        this.hireDate = hireDate;
    }

    public String name() {
        return name;
    }

    public long number() {
        return number;
    }

    public Date hireDate() {
        return hireDate;
    }

    public String toString() {
        return name + " " + number + " " + hireDate;
    }
}


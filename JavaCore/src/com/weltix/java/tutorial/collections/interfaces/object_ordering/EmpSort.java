/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.collections.interfaces.object_ordering;

import java.util.*;

public class EmpSort {
    static final Comparator<Employee> SENIORITY_ORDER =
            new Comparator<Employee>() {
                public int compare(Employee e1, Employee e2) {
                    int dateCmp = e2.hireDate().compareTo(e1.hireDate());
                    if (dateCmp != 0)
                        return dateCmp;

                    return (e1.number() < e2.number() ? -1 :
                            (e1.number() == e2.number() ? 0 : 1));
                }
            };

    // Employee database
//    static final Collection<Employee> employees = ...;

    public static void main(String[] args) {
        Employee[] employeeArray = {
                new Employee("John Smith", 3, new Date (123595985)),
                new Employee("Tom Rich", 5, new Date (1341243433))
        };

        List<Employee> employees = Arrays.asList(employeeArray);

        List<Employee> e = new ArrayList<Employee>(employees);
        Collections.sort(e, SENIORITY_ORDER);
        System.out.println(e);
    }
}
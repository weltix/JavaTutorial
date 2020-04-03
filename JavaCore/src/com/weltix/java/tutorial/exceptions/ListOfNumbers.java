/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers() {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entered try statement");

            Handler handler = new FileHandler("files/exceptions_ListOfNumbers_OutFile.log");
            Logger.getLogger("").addHandler(handler);
            // code without error
            //out = new PrintWriter(new FileWriter("files/exceptions_ListOfNumbers_OutFile.txt"));
            // or if you want to receive error
            out = new PrintWriter(new FileWriter(""));
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: "
                    + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());

            Logger logger = Logger.getLogger("package.name");
            StackTraceElement elements[] = e.getStackTrace();
            for (int i = 0, n = elements.length; i < n; i++) {
                logger.log(Level.WARNING, elements[i].getMethodName());
            }

            e.printStackTrace(System.out);

        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
               out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public static void main(String[] args) {
        ListOfNumbers lion = new ListOfNumbers();
        lion.writeList();
    }
}
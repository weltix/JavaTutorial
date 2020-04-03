/*
 * Copyright (c) 13.06.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.swing.component;

import javax.swing.*;
/*
 * This pplication extends SpinnerDemo to allow
 * execution of the demo with a cycling Months spinner.
 * Other files required:
 *   SpinnerDemo.java
 *   CyclingSpinnerListModel.java
 *   SpringUtilities.java
 */

public class SpinnerDemo2 extends SpinnerDemo {
    public SpinnerDemo2() {
        super(true); //turn on cycling for the months spinner
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("SpinnerDemo2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new SpinnerDemo2());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }
}
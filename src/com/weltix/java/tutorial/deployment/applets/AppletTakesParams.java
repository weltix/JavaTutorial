/*
 * Copyright (c) 13.08.2018, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.deployment.applets;

import javax.swing.*;

public class AppletTakesParams extends JApplet {
    public void init() {
//      next 3 rows read params from html page which involves applet
        final String  inputStr = getParameter("paramStr");
        final int inputInt = Integer.parseInt(getParameter("paramInt"));
        final String inputOutsideJNLPFile = getParameter("paramOutsideJNLPFile");

        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    createGUI(inputStr, inputInt, inputOutsideJNLPFile);
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't successfully complete");
        }
    }
    private void createGUI(String inputStr, int inputInt, String inputOutsideJNLPFile) {
        String text = "Applet's parameters are -- inputStr: " + inputStr +
                ",   inputInt: " + inputInt +
                ",   paramOutsideJNLPFile: " + inputOutsideJNLPFile;
        JLabel lbl = new JLabel(text);
        add(lbl);
    }
}

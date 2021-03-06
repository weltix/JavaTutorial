/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */
package com.weltix.java.tutorial.deployment.applets.dynamic_tree.appletComponentArch;

import javax.swing.*;

public class DynamicTreeApplet extends JApplet {
    //Called when this applet is loaded into the browser.
    public void init() {
        //Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    createGUI();
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }

    /**
     * Create the GUI. For thread safety, this method should
     * be invoked from the event-dispatching thread.
     */
    private void createGUI() {
        //Create and set up the content pane.
        DynamicTreePanel newContentPane = new DynamicTreePanel();
        newContentPane.setOpaque(true);
        setContentPane(newContentPane);
    }
}

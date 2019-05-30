/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */ 
package com.weltix.java.tutorial.deployment.web_start_applications.dynamic_tree.webstartComponentArch;

import javax.swing.*;

public class DynamicTreeApplication extends JFrame {
    public static void main(String [] args) {
        DynamicTreeApplication app = new DynamicTreeApplication();
        app.createGUI();
    }

    private void createGUI() {
        //Create and set up the content pane.
        DynamicTreePanel newContentPane = new DynamicTreePanel();
        newContentPane.setOpaque(true); 
        setContentPane(newContentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }    
}

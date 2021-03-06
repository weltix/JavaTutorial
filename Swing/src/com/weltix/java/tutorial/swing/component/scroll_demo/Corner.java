/*
 * Copyright (c) 13.06.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.swing.component.scroll_demo;

import javax.swing.*;
import java.awt.*;

/* Corner.java is used by ScrollDemo.java. */

public class Corner extends JComponent {
    protected void paintComponent(Graphics g) {
        // Fill me with dirty brown/orange.
        g.setColor(new Color(230, 163, 4));
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
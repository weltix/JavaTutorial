/*
 * Copyright (c) 13.06.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.swing.component.table_dialog_edit_demo;

/*
 * ColorRenderer.java (compiles with releases 1.2, 1.3, and 1.4) is used by
 * TableDialogEditDemo.java.
 */

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class ColorRenderer extends JLabel
        implements TableCellRenderer {
    Border unselectedBorder = null;
    Border selectedBorder = null;
    boolean isBordered = true;

    public ColorRenderer(boolean isBordered) {
        this.isBordered = isBordered;
        setOpaque(true); //MUST do this for background to show up.
    }

    public Component getTableCellRendererComponent(
            JTable table, Object color,
            boolean isSelected, boolean hasFocus,
            int row, int column) {
        Color newColor = (Color)color;
        setBackground(newColor);
        if (isBordered) {
            if (isSelected) {
                if (selectedBorder == null) {
                    selectedBorder = BorderFactory.createMatteBorder(2,5,2,5,
                            table.getSelectionBackground());
                }
                setBorder(selectedBorder);
            } else {
                if (unselectedBorder == null) {
                    unselectedBorder = BorderFactory.createMatteBorder(2,5,2,5,
                            table.getBackground());
                }
                setBorder(unselectedBorder);
            }
        }

        setToolTipText("RGB value: " + newColor.getRed() + ", "
                + newColor.getGreen() + ", "
                + newColor.getBlue());
        return this;
    }
}
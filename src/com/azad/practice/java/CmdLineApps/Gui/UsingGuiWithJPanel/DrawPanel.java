package com.azad.practice.java.CmdLineApps.Gui.UsingGuiWithJPanel;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    // draws an X from the corners of the panel
    public void paintComponent(Graphics g) {

        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        int width = getWidth(); // total width
        int height = getHeight(); // total height

        // draw a line from the upper-left to the lower-right
        g.drawLine(0, 0, width, height);

        // draw a line from the lower-left to the upper-right
        g.drawLine(0, height, width, 0);
    }
}

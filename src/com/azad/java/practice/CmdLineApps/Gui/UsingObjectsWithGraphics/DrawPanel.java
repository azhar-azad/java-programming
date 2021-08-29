package com.azad.java.practice.CmdLineApps.Gui.UsingObjectsWithGraphics;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

// Program that uses class MyLine
// to draw random lines.
public class DrawPanel extends JPanel {

    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines; // array of lines

    // constructor, creates a panel with random shapes
    public DrawPanel() {

        setBackground(Color.WHITE);

        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        // create lines
        for (int count = 0; count < lines.length; count++) {
            // generate random coordinates
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            // generate random color
            Color color = new Color(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            // add the line to the list of lines to be displayed
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
    }

    // for each shape array, draw the individual shapes
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // draw the lines
        for (MyLine line: lines)
            line.draw(g);
    }
}

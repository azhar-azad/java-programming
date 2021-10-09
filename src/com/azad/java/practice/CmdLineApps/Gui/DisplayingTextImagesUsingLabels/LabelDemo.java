package com.azad.java.practice.CmdLineApps.Gui.DisplayingTextImagesUsingLabels;

import javax.swing.*;
import java.awt.*;

// Demonstrates the use of labels.
public class LabelDemo {

    public static void main(String[] args) {

        // Create a label with plain text
        JLabel northLabel = new JLabel("North");

        // create an icon from an image so we can put it on a JLabel
        ImageIcon labelIcon = new ImageIcon("GUItip.gif");

        // create a label with an Icon instead of text
        JLabel centerLabel = new JLabel(labelIcon);

        // create another label with an Icon
        JLabel southLabel = new JLabel(labelIcon);

        // set the label to display text (as well as an icon)
        southLabel.setText("South");

        // create a frame to hold the labels
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the labels to the frame; the second argument specifies
        // where on the frame to add the label
        app.add(northLabel, BorderLayout.NORTH);
        app.add(centerLabel, BorderLayout.CENTER);
        app.add(southLabel, BorderLayout.SOUTH);

        app.setSize(300, 300);
        app.setVisible(true);
    }
}

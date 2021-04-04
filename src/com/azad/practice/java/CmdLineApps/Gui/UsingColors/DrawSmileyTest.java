package com.azad.practice.java.CmdLineApps.Gui.UsingColors;

import javax.swing.*;

// Test application that displays a smiley face.
public class DrawSmileyTest {

    public static void main(String[] args) {

        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
}

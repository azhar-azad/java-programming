package com.azad.java.practice.CmdLineApps.Gui.UsingObjectsWithGraphics;

import javax.swing.*;

// Creating a JFrame to display a DrawPanel.
public class TestDraw {

    public static void main(String[] args) {

        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}

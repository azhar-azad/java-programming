package com.azad.practice.java.Thread;

// Create a second Thread by extending Thread
class NewThread2 extends Thread {

    NewThread2() {
        // Create a new, second Thread
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
    }

    // This is the entry point for the second Thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child Thread.");
    }
}

public class NewThreadDemo2 {

    public static void main(String[] args) {

        NewThread2 nt2 = new NewThread2(); // create a new Thread

        nt2.start(); // start the Thread

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("PracticeMain Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("PracticeMain Thread interrupted.");
        }
        System.out.println("PracticeMain Thread exiting.");
    }
}

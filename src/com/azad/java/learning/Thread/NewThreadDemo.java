package com.azad.java.learning.Thread;

class NewThread implements Runnable {

    private Thread thread;

    public NewThread() {
        // Create a new, second Thread
        // Passing 'this' as the first argument indicates that we want the new Thread
        // to call the run() method on 'this' object.
        thread = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + thread);
    }

    public Thread getThread() {
        return thread;
    }

    // This is the entry point for the second Thread.
    @Override
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child Thread.");
    }
}

public class NewThreadDemo {

    public static void main(String[] args) {

        NewThread nt = new NewThread(); // create a new Thread

        nt.getThread().start();

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

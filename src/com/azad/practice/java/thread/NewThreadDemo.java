package com.azad.practice.java.thread;

class NewThread implements Runnable {

    private Thread thread;

    public NewThread() {
        // Create a new, second thread
        // Passing 'this' as the first argument indicates that we want the new thread
        // to call the run() method on 'this' object.
        thread = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + thread);
    }

    public Thread getThread() {
        return thread;
    }

    // This is the entry point for the second thread.
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
        System.out.println("Exiting child thread.");
    }
}

public class NewThreadDemo {

    public static void main(String[] args) {

        NewThread nt = new NewThread(); // create a new thread

        nt.getThread().start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}

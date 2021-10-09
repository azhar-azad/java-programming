package com.azad.java.learning.Thread;

// Create multiple threads.
class NewThread3 implements Runnable {

    private String name; // name of Thread
    private Thread thread;

    public NewThread3(String threadName) {
        name = threadName;
        thread = new Thread(this, name);
        System.out.println("New Thread: " + thread);
    }

    public Thread getThread() {
        return thread;
    }

    // This is the entry point for Thread.
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

public class MultiThreadDemo {

    public static void main(String[] args) {

        NewThread3 nt1 = new NewThread3("One");
        NewThread3 nt2 = new NewThread3("Two");
        NewThread3 nt3 = new NewThread3("Three");

        // Start the threads.
        nt1.getThread().start();
        nt2.getThread().start();
        nt3.getThread().start();

        try {
            // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("PracticeMain Thread Interrupted.");
        }
        System.out.println("PracticeMain Thread exiting.");
    }
}

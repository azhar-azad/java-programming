package com.azad.practice.java.Thread;

// Using join() to wait for threads to finish.
class NewThread4 implements Runnable {

    private String name; // name of Thread
    private Thread thread;

    public NewThread4(String threadName) {
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
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}

public class ThreadJoinDemo {

    public static void main(String[] args) {

        NewThread4 nt1 = new NewThread4("One");
        NewThread4 nt2 = new NewThread4("Two");
        NewThread4 nt3 = new NewThread4("Three");

        // Start the threads.
        nt1.getThread().start();
        nt2.getThread().start();
        nt3.getThread().start();

        System.out.println("Thread One is alive: " + nt1.getThread().isAlive());
        System.out.println("Thread Two is alive: " + nt2.getThread().isAlive());
        System.out.println("Thread Three is alive: " + nt3.getThread().isAlive());

        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            nt1.getThread().join();
            nt2.getThread().join();
            nt3.getThread().join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
        }

        System.out.println("Thread One is alive: " + nt1.getThread().isAlive());
        System.out.println("Thread Two is alive: " + nt2.getThread().isAlive());
        System.out.println("Thread Three is alive: " + nt3.getThread().isAlive());

        System.out.println("Main Thread exiting.");
    }
}

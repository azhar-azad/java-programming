package com.azad.practice.java.thread;

// Suspending and resuming a thread the modern way.
class NewThread5 implements Runnable {

    String name; // name of thread
    Thread t;
    boolean suspendFlag;

    NewThread5(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        suspendFlag = false;
    }

    // This is the entry point for thread.
    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

public class SuspendResumeDemo {

    public static void main(String[] args) {

        NewThread5 t1 = new NewThread5("One");
        NewThread5 t2 = new NewThread5("Two");

        t1.t.start();
        t2.t.start();

        try {
            Thread.sleep(1000);
            t1.mysuspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            t1.myresume();
            System.out.println("Resuming thread One");
            t2.mysuspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            t2.myresume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}

package com.azad.java.learning.Thread;

// This program is not synchronized without 'synchronized' keyword on method 'call'.
class Callme {
    /*
     *      Without synchronizing,
     *      the output will be
     *      [Hello[Synchromized[World]
     *      ]
     *      ]
     * */
    synchronized void call (String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000); // by calling sleep(), the call() method allows execution to switch to another Thread.
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {

    String msg;
    Callme target;
    Thread thread;

    public Caller(Callme target, String msg) {
        this.target = target;
        this.msg = msg;
        thread = new Thread(this);
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

public class SynchronizedMethodDemo {

    public static void main(String[] args) {

        Callme target = new Callme();
        Caller caller1 = new Caller(target, "Hello");
        Caller caller2 = new Caller(target, "Synchronized");
        Caller caller3 = new Caller(target, "World");

        // Start the threads.
        caller1.getThread().start();
        caller2.getThread().start();
        caller3.getThread().start();

        // wait for threads to end
        try {
            caller1.getThread().join();
            caller2.getThread().join();
            caller3.getThread().join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

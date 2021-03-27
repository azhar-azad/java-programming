package com.azad.practice.java.thread;

// This program uses a synchronized block.
class Callme2 {
    void call (String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller2 implements Runnable {

    String msg;
    Callme2 target;
    Thread thread;

    public Caller2(Callme2 target, String msg) {
        this.msg = msg;
        this.target = target;
        thread = new Thread(this);
    }

    public Thread getThread() {
        return thread;
    }

    // synchronize calls to call()
    @Override
    public void run() {
        synchronized (target) { // synchronized block
            target.call(msg);
        }
    }
}

public class SynchronizedBlockDemo {

    public static void main(String[] args) {

        Callme2 target = new Callme2();
        Caller2 caller1 = new Caller2(target, "Hello");
        Caller2 caller2 = new Caller2(target, "Synchronized");
        Caller2 caller3 = new Caller2(target, "World");

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

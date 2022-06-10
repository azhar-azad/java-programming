package com.azad.practice.javathread;

public class ThreadState implements Runnable {

    public static Thread t1;
    public static ThreadState threadState;

    @Override
    public void run() {

        A a = new A();
        Thread t2 = new Thread(a);

        // thread t2 is created and is currently in the NEW state
        System.out.println("TS: The state of thread t2 after spawning it: " + t2.getState());
        t2.start();

        // thread t2 is moved to the Runnable state
        System.out.println("TS: The state of thread t2 after invoking the method start() on it: " + t2.getState());

        try {
            // moving the thread t1 to the state timed waiting
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("TS: The state of thread t2 after invoking the method sleep() on it: " + t2.getState());

        try {
            // waiting for thread t2 to complete its execution
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("TS: The state of thread t2 when it has completed it's execution: " + t2.getState());
    }

    public static void main(String[] args) {

        // creating an object of the class ThreadState
        threadState = new ThreadState();
        t1 = new Thread(threadState);

        // thread t1 is spawned
        // The thread t1 is currently in the NEW state
        System.out.println("The state of thread t1 after spawning it: " + t1.getState());

        // invoking the start() method on the thread t1
        t1.start();

        // thread t1 is moved to the Runnable state
        System.out.println("The state of thread t1 after invoking the method start() on it: " + t1.getState());
    }
}

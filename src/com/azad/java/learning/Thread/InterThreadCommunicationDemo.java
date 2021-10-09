package com.azad.java.learning.Thread;

// A correct implementation of a producer and consumer.
class Queue {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }

        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }

        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class Producer2 implements Runnable {

    Queue q;
    Thread t;

    Producer2(Queue q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            q.put(i++);
        }
    }
}

class Consumer2 implements Runnable {

    Queue q;
    Thread t;

    Consumer2(Queue q) {
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class InterThreadCommunicationDemo {

    public static void main(String[] args) {

        Queue q = new Queue();
        Producer2 p = new Producer2(q);
        Consumer2 c = new Consumer2(q);

        // Start the threads
        p.t.start();
        c.t.start();

        System.out.println("Press Control-C to stop.");
    }
}

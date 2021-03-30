package com.azad.practice.java.CustomGenericDS.Queues;

import com.azad.practice.java.CustomGenericDS.LinkedList.EmptyListException;
import com.azad.practice.java.CustomGenericDS.LinkedList.List;

// Queue uses class List.
public class Queue<T> {

    private List<T> queueList;

    // constructor
    public Queue() {
        queueList = new List<>("queue");
    }

    // add object to queue
    public void enqueue(T object) {
        queueList.insertAtBack(object);
    }

    // remove object from queue
    public T dequeue() throws EmptyListException {
        return queueList.removeFromFront();
    }

    // determine if queue is empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    // output queue contents
    public void print() {
        queueList.print();
    }
}

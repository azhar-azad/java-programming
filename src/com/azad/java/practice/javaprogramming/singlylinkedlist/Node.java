package com.azad.practice.javaprogramming.singlylinkedlist;

public class Node {

    private int data;
    private Node next;

    public Node() {
        this.data = Integer.MIN_VALUE;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public int getData() {
        return data;
    }

    public void setData(int element) {
        data = element;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

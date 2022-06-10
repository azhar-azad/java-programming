package com.azad.practice.javaprogramming.singlylinkedlist;

public class SinglyLinkedList {

    private Node head;
    private int length;

    public SinglyLinkedList() {
        head = null;
        length = 0;
    }

    public Node getHead() {
        return head;
    }

    public void insertAtBegin(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
        length++;
    }

    public void insertAtEnd(int data) {
        Node node = new Node(data);
        // if list is empty
        if (head == null) {
            head = node;
        }
        else {
            Node p, q;
            for (p = head; (q = p.getNext()) != null; p = q) {
            }
            p.setNext(node);
        }
        length++;
    }

    public void addNode(int data) {
        Node node = new Node(data);
    }
}

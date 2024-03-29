package com.azad.java.learning.JavaCompleteRef.Jcr07MethodsAndClasses.ArraysRevisited;

public class TestStack {

    public static void main(String[] args) {

        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        // push some numbers onto the stack
        for (int i = 0; i < 5; i++)
            mystack1.push(i);
        for (int i = 0; i < 8; i++)
            mystack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}

/**
     Stack in mystack1:
     4
     3
     2
     1
     0
     Stack in mystack2:
     7
     6
     5
     4
     3
     2
     1
     0
 * */

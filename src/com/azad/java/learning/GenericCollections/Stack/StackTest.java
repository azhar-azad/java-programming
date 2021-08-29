package com.azad.java.learning.GenericCollections.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

// Stack class of package java.util
public class StackTest {

    public static void main(String[] args) {

        Stack<Number> stack = new Stack<>(); // create a stack

        // use push method
        stack.push(12L); // push long value
        System.out.println("Pushed 12L");
        printStack(stack);
        stack.push(34567); // push int value
        System.out.println("Pushed 34567");
        printStack(stack);
        stack.push(1.0F); // push float value
        System.out.println("Pushed 1.0F");
        printStack(stack);
        stack.push(1234.5678); // push double value
        System.out.println("Pushed 1234.5678");
        printStack(stack);

        // remove items from stack
        try {
            Number removedObject = null;

            // pop elements from stack
            while (true) {
                removedObject = stack.pop(); // use pop method
                System.out.printf("Popped %s\n", removedObject);
                printStack(stack);
            }
        } catch (EmptyStackException emptyStackException) {
            emptyStackException.printStackTrace();
        }
    }

    // display Stack contents
    private static void printStack(Stack<Number> stack) {

        if (stack.isEmpty())
            System.out.printf("Stack is empty\n\n"); // the stack is empty
        else
            System.out.printf("Stack contains: %s (top)\n", stack);
    }
}

package com.azad.practice.java.Generic.GenericClasses;

// Passing generic Stack objects to generic methods.
public class StackTest2 {

    public static void main(String[] args) {

        Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Integer[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Create a Stack<Double> and a Stack<Integer>
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();

        // push elements of doubleElements onto doubleStack
        testPush("doubleStack", doubleStack, doubleElements);
        testPop("doubleStack", doubleStack); // pop from doubleStack

        // push elements of integerElements onto integerStack
        testPush("integerStack", integerStack, integerElements);
        testPop("integerStack", integerStack); // pop from doubleStack
    }

    private static <T> void testPush(String name, Stack<T> stack, T[] elements) {

        System.out.printf("\nPushing elements onto %s\n", name);

        // push element onto Stack
        for (T element: elements) {
            System.out.printf("%s ", element);
            stack.push(element);
        }
    }

    private static <T> void testPop(String name, Stack<T> stack) {

        // pop element from Stack
        try {
            System.out.printf("\nPopping elements from %s\n", name);
            T popValue; // store element removed from stack

            // remove all elements from Stack
            while (true) {
                popValue = stack.pop();
                System.out.printf("%s ", popValue);
            }

        } catch (EmptyStackException emptyStackException) {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }
}

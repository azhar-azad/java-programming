package com.azad.java.learning.JavaCompleteRef.Jcr09PackagesAndInterfaces.DefaultInterfaceMethods;

interface IntStack {
    void push(int item); // store an item
    int pop(); // retrieve an item

    // Because clear() has a default, it need not be
    // implemented by a preexisting class that uses IntStack.
    default void clear() {
        System.out.println("clear() not implemented");
    }
}

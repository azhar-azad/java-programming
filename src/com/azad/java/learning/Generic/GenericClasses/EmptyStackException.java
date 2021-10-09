package com.azad.java.learning.Generic.GenericClasses;

// EmptyStackException class declaration.
public class EmptyStackException extends RuntimeException {

    // no-argument constructor
    public EmptyStackException() {
        this("Stack is empty");
    }

    // one-argument constructor
    public EmptyStackException(String message) {
        super(message);
    }
}

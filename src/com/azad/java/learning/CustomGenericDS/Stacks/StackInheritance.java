package com.azad.java.learning.CustomGenericDS.Stacks;

import com.azad.java.learning.CustomGenericDS.LinkedList.EmptyListException;
import com.azad.java.learning.CustomGenericDS.LinkedList.List;

// StackInheritance extends class List.
public class StackInheritance<T> extends List<T> {

    // constructor
    public StackInheritance() {
        super("stack");
    }

    // add object to stack
    public void push(T object) {
        insertAtFront(object);
    }

    // remove object from stack
    public T pop() throws EmptyListException {
        return removeFromFront();
    }
}

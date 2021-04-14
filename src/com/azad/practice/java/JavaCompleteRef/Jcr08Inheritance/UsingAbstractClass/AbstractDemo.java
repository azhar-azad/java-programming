package com.azad.practice.java.JavaCompleteRef.Jcr08Inheritance.UsingAbstractClass;

// A simple demonstrate of abstract.
abstract class A {
    abstract void callme();

    // concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

class B extends A {

    @Override
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}

public class AbstractDemo {

    public static void main(String[] args) {

        B b = new B();

        b.callme();
        b.callmetoo();
    }
}

/**
     B's implementation of callme.
     This is a concrete method.
 * */

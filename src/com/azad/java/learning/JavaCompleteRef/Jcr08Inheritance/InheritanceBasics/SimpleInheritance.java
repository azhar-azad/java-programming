package com.azad.java.learning.JavaCompleteRef.Jcr08Inheritance.InheritanceBasics;

// A simple example of inheritance.
class A {
    int i, j;

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// Create a subclass by extending class A.
class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}

public class SimpleInheritance {

    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        // The superclass may be used by itself.
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();

        // The subclass has access to all public members of
        // its superclass.
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i, j and k in subOb: ");
        subOb.sum();
    }
}

/**
     Contents of superOb:
     i and j: 10 20

     Contents of subOb:
     i and j: 7 8
     k: 9

     Sum of i, j and k in subOb:
     i + j + k: 24
 * */

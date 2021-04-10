package com.azad.practice.java.JavaCompleteRef.Jcr7MethodsAndClasses.UnderstandingStatic;

// Demonstrate static variables, methods, and blocks.
public class UseStatic {

    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String[] args) {

        meth(42);
    }
}

/**
     Static block initialized.
     x = 42
     a = 3
     b = 12
 * */

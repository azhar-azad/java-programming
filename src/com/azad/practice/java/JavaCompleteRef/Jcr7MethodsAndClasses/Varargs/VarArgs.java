package com.azad.practice.java.JavaCompleteRef.Jcr7MethodsAndClasses.Varargs;

// Demonstrate variable-length arguments.
public class VarArgs {

    // vaTest() now uses a vararg.
    static void vaTest(int ...v) {
        System.out.print("Number of args: " + v.length + " Contents: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        // Notice how vaTest() can be called with a
        // variable number of arguments.
        vaTest(10); // 1 arg
        vaTest(1, 2, 3); // 3 arg
        vaTest(); // no arg
    }
}

/**
     Number of args: 1 Contents: 10
     Number of args: 3 Contents: 1 2 3
     Number of args: 0 Contents:
 * */

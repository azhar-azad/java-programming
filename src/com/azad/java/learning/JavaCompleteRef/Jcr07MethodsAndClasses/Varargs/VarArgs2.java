package com.azad.java.learning.JavaCompleteRef.Jcr07MethodsAndClasses.Varargs;

// Use varargs with standard arguments.
public class VarArgs2 {

    // Here, msg is a normal parameter and v is a
    // varargs parameter
    static void vaTest(String msg, int ...v) {
        System.out.print(msg + v.length + " Contents: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No vararg: ");
    }
}

/**
     One vararg: 1 Contents: 10
     Three varargs: 3 Contents: 1 2 3
     No vararg: 0 Contents:
 * */

package com.azad.java.learning.JavaCompleteRef.Jcr05ControlStatements.Iteration;

// Loops may be nested.
class Nested {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}

/**
     ..........
     .........
     ........
     .......
     ......
     .....
     ....
     ...
     ..
     .
 * */

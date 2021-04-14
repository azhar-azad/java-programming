package com.azad.practice.java.JavaCompleteRef.Jcr05ControlStatements.Iteration;

// Declare a loop control variable inside the for.
public class ForTick {

    public static void main(String[] args) {

        // here, n is declared inside of the for loop
        for (int n = 10; n > 0; n--)
            System.out.println("tick " + n);
    }
}

/**
     tick 10
     tick 9
     tick 8
     tick 7
     tick 6
     tick 5
     tick 4
     tick 3
     tick 2
     tick 1
 * */

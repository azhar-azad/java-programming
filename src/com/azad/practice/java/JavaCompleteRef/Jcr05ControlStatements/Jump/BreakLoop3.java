package com.azad.practice.java.JavaCompleteRef.Jcr05ControlStatements.Jump;

// Using break with nested loops.
class BreakLoop3 {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10)
                    break; // terminate loop if j is 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loop complete.");
    }
}

/**
     Pass 0: 0 1 2 3 4 5 6 7 8 9
     Pass 1: 0 1 2 3 4 5 6 7 8 9
     Pass 2: 0 1 2 3 4 5 6 7 8 9
     Loop complete.
 * */

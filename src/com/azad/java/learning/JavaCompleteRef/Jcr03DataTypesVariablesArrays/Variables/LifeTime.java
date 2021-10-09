package com.azad.java.learning.JavaCompleteRef.Jcr03DataTypesVariablesArrays.Variables;

// Demonstrate lifetime of a variable.
public class LifeTime {

    public static void main(String[] args) {

        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; // y is initialized each time block is entered
            System.out.println("y is: " + y); // this always prints -1
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}

/**
     y is: -1
     y is now: 100
     y is: -1
     y is now: 100
     y is: -1
     y is now: 100

 * */
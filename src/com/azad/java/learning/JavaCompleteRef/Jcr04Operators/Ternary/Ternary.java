package com.azad.java.learning.JavaCompleteRef.Jcr04Operators.Ternary;

// Demonstrate ?.
class Ternary {

    public static void main(String[] args) {

        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        k = i < 0 ? -i : i; // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);
    }
}

/**
     Absolute value of 10 is 10
     Absolute value of -10 is 10
 * */

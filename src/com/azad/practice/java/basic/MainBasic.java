package com.azad.practice.java.basic;

import com.azad.practice.java.Utility;

public class MainBasic {

    public static void main(String[] args) {

        /*
        BASIC 1: Fibonacci Series in Java
         */
        System.out.print("Enter steps: ");
        int userChoice = Utility.getIntegerInput(" ");

        // Calling to loop-based fibonacci series generator
        System.out.println(Fibonacci.getFibonacciSeries(userChoice));

        // Calling to recursive fibonacci series generator
        System.out.println(Fibonacci.getFibonacciByRecursion(userChoice - 2, 0, 1, "0 1"));
        /*
        END BASIC 1
         */


    }
}

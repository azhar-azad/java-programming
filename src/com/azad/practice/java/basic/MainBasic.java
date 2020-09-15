package com.azad.practice.java.basic;

import com.azad.practice.java.Utility;

public class MainBasic {

    public static void main(String[] args) {

//        /*
//        BASIC 1: Fibonacci Series in Java
//         */
//        System.out.print("Enter steps: ");
//        int userChoice = Utility.getIntegerInput("Enter a positive integer");
//
//        // Calling to loop-based fibonacci series generator
//        System.out.println(Fibonacci.getFibonacciSeries(userChoice));
//
//        // Calling to recursive fibonacci series generator
//        System.out.println(Fibonacci.getFibonacciByRecursion(userChoice - 2, 0, 1, "0 1"));
//        /*
//        END BASIC 1
//         */

        /*
        BASIC 2: Prime Number Program in Java
         */

        System.out.print("Enter an integer number to check prime: ");
        int number = Utility.getIntegerInput("Enter a positive integer");

        if (PrimeNumber.isPrime(number))
            System.out.println("PRIME");
        else
            System.out.println("NOT PRIME");

        System.out.print("Enter the limit to generate prime number list (e.g. 100): ");
        int limit = Utility.getIntegerInput("Enter a positive integer");

        System.out.println(PrimeNumber.getPrimeNumberList(limit));
        /*
        END BASIC 2
         */


    }
}

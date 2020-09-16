package com.azad.practice.java.basic;

import com.azad.practice.java.Utility;

public class MainBasic {

    public static void main(String[] args) {

        /*
        BASIC 1: Fibonacci Series in Java
         */

        System.out.print("Enter steps: ");
        int userChoice = Utility.getIntegerInput("Enter a positive integer");

        // Calling to loop-based fibonacci series generator
        System.out.println(Fibonacci.getFibonacciSeries(userChoice));

        // Calling to recursive fibonacci series generator
        System.out.println(Fibonacci.getFibonacciByRecursion(userChoice - 2, 0, 1, "0 1"));
        
        /*
        END BASIC 1
         */


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


        /*
        BASIC 3: Palindrome
         */

        System.out.print("Enter something to check if it's palindrome: ");
        String userInput = Utility.getStringInput();

        if (Palindrome.isPalindrome(userInput))
            System.out.println("true");
        else
            System.out.println("false");

        /*
        END BASIC 3
         */



        /*
        BASIC 4: Factorial
         */

        System.out.print("Enter a number to get it's factorial: ");
        int factNum = Utility.getIntegerInput("Enter a positive integer");

        System.out.println(Factorial.getFactorialByLooping(factNum));
        System.out.println(Factorial.getFactorialByRecursion(factNum));

        /*
        END BASIC 4
         */

    }
}

package com.azad.java.learning.Basic;

import com.azad.java.Utility;
import com.azad.java.learning.Basic.basicHelpers.*;

public class MainBasic {

    public static void main(String[] args) {

        /*
        BASIC 1: Fibonacci Series in Java
         */
        System.out.println("\n\nFibonacci Series Problem\n============================\n");

        System.out.print("Enter how many steps the Fibonacci series to go: ");
        int userChoice = Utility.getIntegerInput("Enter a positive integer");

        // Calling to loop-based fibonacci series generator
        System.out.println("\nFibonacci series by iteration: \n" + Fibonacci.getFibonacciSeries(userChoice));

        // Calling to recursive fibonacci series generator
        System.out.println("\nFibonacci series by recursion: \n" + Fibonacci.getFibonacciByRecursion(userChoice - 2, 0, 1, "0 1"));

        /*
        END BASIC 1
         */


        /*
        BASIC 2: Prime Number Program in Java
         */
        System.out.println("\n\nPrime Number Problem\n============================\n");

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
        System.out.println("\n\nPalindrome Problem\n============================\n");

        System.out.print("Enter something to check if it's palindrome: ");
        String userInput = Utility.getStringInput();

        if (Palindrome.isPalindrome(userInput))
            System.out.println("PALINDROME");
        else
            System.out.println("NOT PALINDROME");

        /*
        END BASIC 3
         */



        /*
        BASIC 4: Factorial
         */
        System.out.println("\n\nFactorial Number Problem\n============================\n");

        System.out.print("Enter a number to get it's factorial: ");
        int factNum = Utility.getIntegerInput("Enter a positive integer");

        long factofNum = Factorial.getFactorialByLooping(factNum);
        if (factofNum < 0)
            System.out.println("\nFactorial by iteration: " + Factorial.getFactorialByLooping(factNum));
        else
            System.out.println("\nOut of bound. Please try a smaller number next time.");

        factofNum = Factorial.getFactorialByRecursion(factNum);
        if (factofNum < 0)
            System.out.println("\nFactorial by recursion: " + Factorial.getFactorialByRecursion(factNum));
        else
            System.out.println("\nOut of bound. Please try a smaller number next time.");

        /*
        END BASIC 4
         */


        /*
        BASIC 5: Armstrong Number
         */
        System.out.println("\n\nArmstrong Number Problem\n============================\n");

        System.out.print("Enter a number to check if it's Armstrong number or not: ");
        int armNum = Utility.getIntegerInput("Enter a positive integer");

        if (ArmstrongNumber.isArmstrong(armNum))
            System.out.println(armNum + " is an Armstrong number");
        else
            System.out.println(armNum + " is not an Armstrong number");

        System.out.print("Enter a limit to find all Armstrong number(s): ");
        int armLimit = Utility.getIntegerInput("Enter a positive integer");
        System.out.println("All Armstrong numbers from 0 to " + armLimit + ": " + ArmstrongNumber.getArmstrongNumber(armLimit));

        /*
        END BASIC 5
         */


        /*
        BASIC 6: Random Number
         */

        // show RandomNumber class

        /*
        END BASIC 6
         */
    }
}

package com.azad.practice.java.Recursion;

import java.math.BigInteger;

// Recursive factorial mathod.
public class FactorialCalculator {

    // output factorials for values 0-21
    public static void main(String[] args) {

        // calculate the factorials of 0 through 21 by basic factorial method
        System.out.printf("Factorial of 0-21 by basic method\n");
        for (int counter = 0; counter <= 21; counter++)
            System.out.printf("%d! = %d\n", counter, factorial(counter));

        // calculate the factorials of 0 through 50 by BigInteger factorial method
        System.out.printf("Factorial of 0-50 by BigInteger factorial method\n");
        for (int counter = 0; counter <= 50; counter++)
            System.out.printf("%d! = %d\n", counter, factorial(BigInteger.valueOf(counter)));
    }

    // recursive method factorial (assumes its parameter is >= 0)
    public static long factorial(long number) {

        if (number <= 1) // test for base case
            return 1; // base cases: 0! = 1 and 1! = 1
        else  // recursion step
            return number * factorial(number - 1);
    }

    // recursive method factorial (assumes its parameter is >= 0)
    public static BigInteger factorial(BigInteger number) {

        if (number.compareTo(BigInteger.ONE) <= 0) // test base case
            return BigInteger.ONE; // base cases: 0! = 1 and 1! = 1
        else  // recursion step
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
    }
}

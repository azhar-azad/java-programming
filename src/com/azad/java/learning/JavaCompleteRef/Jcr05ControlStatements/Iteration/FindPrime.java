package com.azad.java.learning.JavaCompleteRef.Jcr05ControlStatements.Iteration;

// Test for primes.
public class FindPrime {

    public static void main(String[] args) {

        int num;
        boolean isPrime;

        num = 97;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num/i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    }
}

/**
     97 is Prime
 * */

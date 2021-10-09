package com.azad.java.learning.Basic.basicHelpers;

public class Factorial {

    public static long getFactorialByLooping(int number) {

        long factorialOfNumber = 1L;

        for (long i = 1L; i <= number; i++) {
            factorialOfNumber *= i;
        }

        return factorialOfNumber;
    }

    public static long getFactorialByRecursion(int number) {

        if (number == 1)
            return 1;

        return number * getFactorialByRecursion(number - 1);
    }
}

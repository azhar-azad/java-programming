package com.azad.practice.java.JavaCompleteRef.Jcr05ControlStatements.Iteration;

// Use a for-each style for loop.
class ForEach {

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3 ,4 ,5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // use for-each for to display and sum the values
        for (int x: nums) {
            System.out.println("Value is: " + x);
            sum += x;
        }

        System.out.println("Summation: " + sum);
    }
}

/**
     Value is: 1
     Value is: 2
     Value is: 3
     Value is: 4
     Value is: 5
     Value is: 6
     Value is: 7
     Value is: 8
     Value is: 9
     Value is: 10
     Summation: 55
 * */

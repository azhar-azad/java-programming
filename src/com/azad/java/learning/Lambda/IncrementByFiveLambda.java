package com.azad.java.learning.Lambda;

public class IncrementByFiveLambda {

    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface = (number) -> number + 5;
        System.out.println(incrementByFiveInterface.incrementByFive(10));
    }
}

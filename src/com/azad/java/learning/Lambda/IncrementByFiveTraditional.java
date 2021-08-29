package com.azad.java.learning.Lambda;

public class IncrementByFiveTraditional implements IncrementByFiveInterface {
    @Override
    public int incrementByFive(int number) {
        return number + 5;
    }

    public static void main(String[] args) {
        IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
        System.out.println(incrementByFiveTraditional.incrementByFive(10));
    }
}

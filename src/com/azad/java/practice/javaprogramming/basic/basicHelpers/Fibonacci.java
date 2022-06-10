package com.azad.practice.javaprogramming.basic.basicHelpers;

public class Fibonacci {

    public static String getFibonacciSeries (int step) {

        int a = 0;
        int b = 1;
        String series = "";

        series += a;
        series += " ";
        series += b;

        for (int i = 0; i < step - 2; i++) {
            int sum = a + b;
            series += (" " + sum);
            a = b;
            b = sum;
        }

        return series;
    }

    public static String getFibonacciByRecursion(int step, int a, int b, String series) {

        // a = 0, b = 1, series = "0 1"

        if (step == 0)
            return series;

        int sum = a + b;
        series += (" " + sum);

        return getFibonacciByRecursion(step - 1, b, sum, series);
    }
}

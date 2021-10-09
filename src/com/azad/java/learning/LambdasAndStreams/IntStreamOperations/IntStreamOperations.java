package com.azad.java.learning.LambdasAndStreams.IntStreamOperations;

import java.util.stream.IntStream;

// Demonstrating IntStream operations.
public class IntStreamOperations {

    public static void main(String[] args) {

        int[] values = { 3, 10, 6, 1, 4, 8, 2, 5, 9, 7 };

        // display original values
        System.out.printf("Original values: ");
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // count, min, max, sum and average of the values
        System.out.printf("\nCount: %d\n", IntStream.of(values).count());
        System.out.printf("Min: %d\n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d\n", IntStream.of(values).max().getAsInt());
        System.out.printf("Sum: %d\n", IntStream.of(values).sum());
        System.out.printf("Average: %.2f\n", IntStream.of(values).average().getAsDouble());

        // sum of values with reduce method
        System.out.printf("\nSum via reduce method: %d\n",
                IntStream.of(values).reduce(0, (sum, value) -> sum + value));

        // sum of squares of values with reduce method
        System.out.printf("Sum of squares with reduce method: %d\n",
                IntStream.of(values).reduce(0, (sumOfSquares, value) -> sumOfSquares + value * value));

        // product of values with reduce method
        System.out.printf("Product via reduce method: %d\n",
                IntStream.of(values).reduce(1, (product, value) -> product * value));

        // even values displayed in sorted order
        System.out.printf("\nEven values displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // odd values multiplied by 10 and displayed in sorted order
        System.out.printf("Odd values multiplied by 10 and displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 != 0)
                .map(value -> value * 10)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // sum range of integers from 1 to 10 exclusive
        System.out.printf("\nSum of integers from 1 to 9: %d\n", IntStream.range(1, 10).sum());

        // sum range of integers from 1 to 10 inclusive
        System.out.printf("\nSum of integers from 1 to 10: %d\n", IntStream.rangeClosed(1, 10).sum());
    }
}

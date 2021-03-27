package com.azad.practice.java.lambda.callable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {

    public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
    public static int totalSumByIntStream = IntStream.rangeClosed(0, 5000).sum();

    public static void main(String[] args) {

        Callable callable1 = () -> {
            int sum = 0;
            for (int i = 0; i < array.length/2; i++) {
                sum += array[i];
            }
            return sum;
        };

        Callable callable2 = () -> {
            int sum = 0;
            for (int i = array.length/2; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable1, callable2);
        List<Future<Integer>> resultList = null;
        try {
            resultList = executorService.invokeAll(taskList);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int threadCount = 0;
        int sum = 0;
        for (Future<Integer> result: resultList) {
            try {
                sum += result.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            try {
                System.out.println("Sum of thread " + ++threadCount + " is: " + result.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum from the callable is: " + sum);
        System.out.println("Correct sum from IntStream is: " + totalSumByIntStream);
        executorService.shutdown();

    }
}

package com.azad.practice.java.basic.basicHelpers;

public class PrimeNumber {

    public static boolean isPrime(int number) {

        if (number <= 1)
            return false;

//        if (Utility.isDouble(Integer.toString(number)))
//            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static String getPrimeNumberList(int limit) {

        if (limit <= 0)
            return "Invalid limit";

        int counter = 0;
        String primeList = " ";
        for (int i = 2; i <= limit; i++) {

            if (isPrime(i)) {
                primeList += (i + " ");
                ++counter;

                if (counter % 5 == 0)
                    primeList += "\n";
            }
        }

        primeList += "\nTotal Prime Numbers from 1 to " + limit + " is " + counter;

        return primeList;
    }
}

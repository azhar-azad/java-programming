package com.azad.practice.java.basic;

public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {

        int sumOfDigitCube = getSumOfDigitCube(number);

        if (sumOfDigitCube == number)
            return true;
        else
            return false;
    }

    public static String getArmstrongNumber(int limit) {

        String numStr = "";

        for (int i = 0; i <= limit; i++) {
            if (isArmstrong(i))
                numStr += (i + " ");
        }

        return numStr;
    }

    private static int getSumOfDigitCube(int number) {

        int sum = 0;

        for (int i = number; i >= 1; i /= 10) {
            int rem = i % 10;
            sum += (rem * rem * rem);
        }

        return sum;
    }
}

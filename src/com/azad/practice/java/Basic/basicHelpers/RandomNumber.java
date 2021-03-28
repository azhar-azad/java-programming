package com.azad.practice.java.Basic.basicHelpers;

import java.util.Random;

public class RandomNumber {

    // Generate with Math.random() method

    // generates only double type random number >= 0.0 and < 1.0
    public static double getRandomByMathRandom() {
        return Math.random();
    }

    // generates double type random number >= MIN and < MAX
    public static double getRandomByMathRandomWithBound(int min, int max) {
        return Math.random() * (max - min + 1) + min;
    }


    // Generate with Random class [ java.util.Random ]

    public static void getRandomByRandomClass() {

        Random random = new Random();

        // generates random integers between 0 to 49
        int nextInt = random.nextInt(50);

        // generates random doubles between 0.0 to 1.0 (exclusively)
        double nextDouble = random.nextDouble();
        float nextFloat = random.nextFloat();

        // generates random long values
        long nextLong = random.nextLong();

        // generates random boolean
        boolean nextBoolean = random.nextBoolean();
    }
}

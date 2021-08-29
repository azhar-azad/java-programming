package com.azad.java.practice.CmdLineApps.RandomGeneration;

import java.security.SecureRandom;

// Shifted and scaled random integers.
public class RandomIntegers {

    public static void main(String[] args) {

        // randomNumbers object will produce secure random numbers
        SecureRandom randomNumber = new SecureRandom();

        // loop 20 times
        for (int counter = 1; counter <= 20; counter++) {
            // pick random integer from 1 to 6
            int face = 1 + randomNumber.nextInt(6);

            System.out.printf("%d ", face); // display generated value

            // if counter is divisible by 5, start a new line of output
            if (counter % 5 == 0)
                System.out.println();
        }
    }
}

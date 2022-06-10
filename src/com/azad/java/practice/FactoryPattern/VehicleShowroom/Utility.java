package com.azad.java.practice.FactoryPattern.VehicleShowroom;

import java.util.Scanner;

public class Utility {

    private static Scanner scanner = new Scanner(System.in);

    public static int getPositiveIntegerInput(int highestPossibleValue) {
        String input = scanner.nextLine();

        if (input.startsWith(" ")) {
            System.out.println("Do not put empty space before input. Try again");
            getPositiveIntegerInput(highestPossibleValue);
        }

        if (input.startsWith("-")) {
            System.out.println("Negative value is invalid in this context. Try again");
            getPositiveIntegerInput(highestPossibleValue);
        }

        if (input.contains(".")) {
            System.out.println("Only integer value is valid. Try again");
            getPositiveIntegerInput(highestPossibleValue);
        }

        int userInput = Integer.parseInt(input);
        if (highestPossibleValue != 0) {
            if (userInput > highestPossibleValue) {
                System.out.println("Invalid choice. Try again");
                getPositiveIntegerInput(highestPossibleValue);
            }
        }

        return userInput;
    }

    public static double getPositiveDoubleInput() {
        String input = scanner.nextLine();

        if (input.startsWith(" ")) {
            System.out.println("Do not put empty space before input. Try again");
            getPositiveDoubleInput();
        }

        if (input.startsWith("-")) {
            System.out.println("Negative value is invalid in this context. Try again");
            getPositiveDoubleInput();
        }

        return Double.parseDouble(input);
    }

    public static String getStringInput() {
        String input = scanner.nextLine();

        if (input.startsWith(" ")) {
            System.out.println("Do not put empty space before input. Try again");
            getStringInput();
        }

        return input;
    }
}

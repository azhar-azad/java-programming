package com.azad.practice.java.Practice.Mod33Encryption;

import java.util.Scanner;

public class Mod33EncryptionMain {

//    public static String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    public static int[] NUMERIC_VALUES = {
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
//            11, 12, 13, 14, 15, 16, 17, 18,
//            19, 20, 21, 22, 23, 24, 25, 26
//    };

    public static void main(String[] args) {

        System.out.println("Mod33 Encryption class");

        System.out.println(getStringWithPadding("C^7") + getStringWithPadding("C^7(mod 33)") + getStringWithPadding("Symbolic"));
        System.out.println("---------------------------------------------");
        for (int i = 1; i <= 26; i++) {
            int C = (i * i * i) % 33;
            long C7 = getNumToThePower7(C);
            int C7Mod33 = getMod33(C7);
            char symbol = getSymbol(C7Mod33);

            System.out.println(getStringWithPadding(C7) + getStringWithPadding(C7Mod33) + symbol);
        }
    }

    public static long getNumToThePower7(int num) {

        long num3 = num * num * num;
        return num3 * num3 * num;
    }

    public static int getMod33(long num) {
        long numMod33 = num % 33;
        return (int) numMod33;
    }

    private static char getSymbol(int numericValue) {
        if (numericValue < 1 || numericValue > 26) {
            System.out.println("Invalid numeric value. Numeric value have to be 1-26");
            return '?';
        }

        return (char)(numericValue + 64);
    }

    private static int getNumericValue(char symbol) {
        if (symbol >= 97) {
            System.out.println("Please input upper case letters.");
            return 0;
//          return symbol - 96;
        }

        return symbol - 64;
    }

    private static String getStringWithPadding(String str) {
        int sizeToAchieve = 15;

        if (str.length() == sizeToAchieve)
            return str;

        String padding = "";
        int paddingSize = sizeToAchieve - str.length();

        for (int i = 0; i < paddingSize; i++)
            padding += " ";

        return str + padding;
    }

    private static String getStringWithPadding(int num) {
        String str = "" + num;

        int sizeToAchieve = 15;

        if (str.length() == sizeToAchieve)
            return str;

        String padding = "";
        int paddingSize = sizeToAchieve - str.length();

        for (int i = 0; i < paddingSize; i++)
            padding += " ";

        return str + padding;
    }

    private static String getStringWithPadding(long num) {
        String str = "" + num;

        int sizeToAchieve = 15;

        if (str.length() == sizeToAchieve)
            return str;

        String padding = "";
        int paddingSize = sizeToAchieve - str.length();

        for (int i = 0; i < paddingSize; i++)
            padding += " ";

        return str + padding;
    }
}

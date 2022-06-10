package com.azad.practice.javaprogramming;

import java.util.Scanner;

public class Utility {

    public static Scanner scanner = new Scanner(System.in);

    // Safe-convert user input to integer value
    public static int getIntegerInput(String msg) {
        String str = scanner.nextLine();
        
        if (isInteger(str))
            return Integer.parseInt(str);
        
        System.out.println(msg);
        return getIntegerInput(msg);
       
    }

    // Safe-convert user input to double value
    public static double getDoubleInput(String msg) {
        String str = scanner.nextLine();
        
        if (isDouble(str))
            return Double.parseDouble(str);
        
        System.out.println(msg);
        return getDoubleInput(msg);
    }

    public static String getStringInput() {
        return scanner.nextLine();
    }
    
    public static char getCharInput(String msg) {
    	String input = getStringInput();
    	
    	if (input.length() == 1) {
    		return input.charAt(0);
    	}
    	
    	System.out.println(msg);
    	return getCharInput(msg);
    }

    // Check if user input is positive-integer or not
    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;

//        if (str.charAt(0) == '-') {
//            System.out.println("Negative value is invalid for this property.");
//            return false;
//        }

        for (; i < length; i++) {
            char c = str.charAt(i);

            if ((c < '0' || c > '9') && c != '-') {
                return false;
            }
        }
        return true;
    }

    // Check if user input is positive-double or not
    public static boolean isDouble(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;

//        if (str.charAt(0) == '-') {
//            System.out.println("Negative value is invalid for this property.");
//            return false;
//        }

        for (; i < length; i++) {
            char c = str.charAt(i);

            if ((c < '0' || c > '9') && c != '.') {
                return false;
            }
        }
        return true;
    }
}

package com.azad.practice.java.string;

import com.azad.practice.java.Utility;
import com.azad.practice.java.basic.basicHelpers.Palindrome;
import com.azad.practice.java.string.stringHelpers.StringDemo;

public class MainString {

    public static void main(String[] args) {

        StringDemo stringDemo = new StringDemo();

        /*
        STRING N:
         */

        /*
        END STRING N
         */


        /*
        STRING 1: Count the total number of characters in a string
         */
//        System.out.println("\n\nString Length Calculate\n============================\n");
//
//        stringDemo.init();
//
//        System.out.println("The length of \'" + stringDemo.getStr() + "\' is " + stringDemo.getStrLength());
        /*
        END STRING 1
         */


        /*
        STRING 2: Count the total number of special characters in a string
         */
//        System.out.println("\n\nCount Total Number of Special Characters in a String\n============================\n");
//
//        stringDemo.init();
//
//        System.out.println("Total number of special characters in \'" + stringDemo.getStr() + "\' is " + stringDemo.getSpecialCharacterCount());
        /*
        END STRING 2
         */


        /*
        STRING 3: Count the number of constants and vowel in string
         */
//        System.out.println("\n\nCount Total Number of Consonants and Vowels in a String\n============================\n");
//
//        stringDemo.init();
//
//        System.out.println("Total number of consonants: " + stringDemo.getConsonantCount() + " and vowels: " + stringDemo.getVowelCount());
        /*
        END STRING 3
         */


        /*
        STRING 4: Check if two strings are anagram
         */
//        System.out.println("\n\nCheck if two Strings are Anagram\n============================\n");
//
//        stringDemo.init2();
//
//        System.out.println(stringDemo.isAnagram() ? "Anagram" : "Not Anagram");
        /*
        END STRING 4
         */


        /*
        STRING 5: Divide a string in N equal parts
         */
        System.out.println("\n\nDivide a String in N equal parts\n============================\n");

        stringDemo.init();
        System.out.print("How many parts: ");
        int part = Utility.getIntegerInput("Not Allowed");

        stringDemo.divideStrEqual(part);
        /*
        END STRING 5
         */
        
        
        
        /*
        STRING N: Check if string is palindrome
         */
//        System.out.println("\n\nCheck if a String is Palindrome or not\n============================\n");
//        
//        stringDemo.init();
//        
//        System.out.println(stringDemo.isPalindrome() ? "Palindrome" : "Not Palindrome");
        /*
        END STRING N
         */
    }
}

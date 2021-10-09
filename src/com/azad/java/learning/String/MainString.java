package com.azad.java.learning.String;

import com.azad.java.Utility;
import com.azad.java.learning.String.stringHelpers.StringDemo;

public class MainString {

    public static void main(String[] args) {

        StringDemo stringDemo = new StringDemo();

        /*
        STRING 1: Count the total number of characters in a String
         */
        System.out.println("\n\nString Length Calculate\n============================\n");

        stringDemo.init();

        System.out.println("The length of \'" + stringDemo.getStr() + "\' is " + stringDemo.getStrLength());
        /*
        END STRING 1
         */


        /*
        STRING 2: Count the total number of special characters in a String
         */
        System.out.println("\n\nCount Total Number of Special Characters in a String\n============================\n");

        stringDemo.init();

        System.out.println("Total number of special characters in \'" + stringDemo.getStr() + "\' is " + stringDemo.getSpecialCharacterCount());
        /*
        END STRING 2
         */


        /*
        STRING 3: Count the number of constants and vowel in String
         */
        System.out.println("\n\nCount Total Number of Consonants and Vowels in a String\n============================\n");

        stringDemo.init();

        System.out.println("Total number of consonants: " + stringDemo.getConsonantCount() + " and vowels: " + stringDemo.getVowelCount());
        /*
        END STRING 3
         */


        /*
        STRING 4: Check if two strings are anagram
         */
        System.out.println("\n\nCheck if two Strings are Anagram\n============================\n");

        stringDemo.init2();

        System.out.println(stringDemo.isAnagram() ? "Anagram" : "Not Anagram");
        /*
        END STRING 4
         */


        /*
        STRING 5: Divide a String in N equal parts
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
        STRING 6: Find all subsets of a String
         */
        System.out.println("\n\nFind all Subsets of a String\n============================\n");

        stringDemo.init();
        
        stringDemo.printSubsets();
        /*
        END STRING 6
         */
        

        /*
        STRING 7: Remove white-spaces from String
         */
        System.out.println("\n\nRemove White-Spaces from String\n============================\n");
        
        stringDemo.init();
        
        System.out.println("String without white-spaces: " + stringDemo.getStrWithoutSpaces());
        /*
        END STRING 7
         */
        
        
        /*
        STRING 8: Toggle upper-lower cases
         */
        System.out.println("\n\nToggle Upper-Lower cases\n============================\n");
        
        stringDemo.init();
        
        System.out.println("String after toggling cases: " + stringDemo.getToggleCases());
        /*
        END STRING 8
         */
       
        
        /*
        STRING 9: Replace spaces with character
         */
        System.out.println("\n\nReplace Spaces with any Character\n============================\n");
        
        stringDemo.init();
        
        System.out.print("Enter the character to replace: ");
        char ch = Utility.getCharInput("Not Allowed");
        
        System.out.println("String after spaces replaced: " + stringDemo.getSpaceReplaced(ch));
        /*
        END STRING 9
         */        
        
        
        /*
        STRING 10: Check if String is palindrome
         */
        System.out.println("\n\nCheck if a String is Palindrome or not\n============================\n");
        
        stringDemo.init();
        
        System.out.println(stringDemo.isPalindrome() ? "Palindrome" : "Not Palindrome");
        /*
        END STRING 10
         */
        
        /*
        STRING 11: Check whether one String is a roation of other
         */
        System.out.println("\n\nCheck whether one String is a Rotation of other\n============================\n");
        
        stringDemo.init2();
         
        System.out.println(stringDemo.isRotation() ? "Rotation" : "Not Rotation");
        /*
        END STRING 11
         */
        
        /*
        STRING 12: Get the characters of maximum and minimum frequency
         */
        System.out.println("\n\nGet the Characters of Maximum and Minimum Frequency\n============================\n");
        
        stringDemo.init();
        stringDemo.setStrCharFrequency();
        
        System.out.println("\nCharacter(s) with maximum frequency: ");
        stringDemo.getMaxFreqCharacter();
        System.out.println("\nCharacter(s) with minimum frequency: ");
        stringDemo.getMinFreqCharacter();
        /*
        END STRING 12
         */
        
        /*
        STRING 13: Reverse a String
         */
        System.out.println("\n\nReverse a String\n============================\n");
        
        stringDemo.init();
        
        System.out.println("Reverse of " + stringDemo.getStr() + " is " + stringDemo.reverseStr());
        /*
        END STRING 13
         */
        
        /*
        STRING 14: Find duplicate characters in a String
         */
        System.out.println("\n\nFind Duplicate Characters\n============================\n");
        
        stringDemo.init();
        stringDemo.setStrCharFrequency();
        stringDemo.setStrCharDuplicates();
        
        System.out.println("Duplicate Characters: ");
        stringDemo.printDuplicateChars();
        /*
        END STRING 14
         */
        
        
        /*
        STRING 15: Find duplicate words in a String
         */
        System.out.println("\n\nFind Duplicate Words\n============================\n");
        
        stringDemo.init();
        stringDemo.setStrWordArray();
        stringDemo.setStrWordFrequency();
        stringDemo.setStrWordDuplicates();
        
        System.out.println("Duplicate Words: ");
        stringDemo.printDuplicateWords();
        /*
        END STRING 15
         */
        
        /*
        STRING 16: Print the frequency of characters
         */
        System.out.println("\n\nPrint Frequency of Characters\n============================\n");
        
        stringDemo.init();
        stringDemo.setStrCharFrequency();
        
        System.out.println("Frequency of characters: ");
        stringDemo.printCharFrequencies();
        /*
        END STRING 16
         */
    }
}

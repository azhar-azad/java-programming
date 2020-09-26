package com.azad.practice.java.array;

import com.azad.practice.java.array.arrayHelpers.Array;

public class MainArray {

    public static void main(String[] args) {

        Array array = new Array();

        /*
        ARRAY 1: Find the frequency of all elements in array
         */
//        System.out.println("\n\nArray elements frequency Problem\n============================\n");
//
//        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
//
//        array.setElements("ALL");
//        array.setFrequencies();
//        array.showFrequencies();
//
//        array.reset();
        /*
        END ARRAY 1
         */


        /*
        ARRAY 2: Find the duplicate elements in array
         */
//        System.out.println("\n\nArray elements duplicates finding Problem\n============================\n");
//
//        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
//        array.setElements("ALL");
//
//        array.setFrequencies();
//        array.setDuplicates();
//        array.showDuplicates();
//
//        array.reset();
        /*
        END ARRAY 2
         */


        /*
        ARRAY 3: Print the elements of the array
         */
//        System.out.println("\n\nArray Elements Printing\n============================\n");
//
//        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
//        array.setElements("ALL");
//
//        array.showElements();
//
//        array.reset();
        /*
        END ARRAY 3
         */


        /*
        ARRAY 4: Print the elements of the array in reverse order
         */
//        System.out.println("\n\nArray Elements Printing (reverse order)\n============================\n");
//
//        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
//        array.setElements("ALL");
//
//        array.setElementsReversed();
//        array.showElementsReversed();
//
//        array.reset();
        /*
        END ARRAY 4
         */


        /*
        ARRAY 5: Print the largest element
         */
//        System.out.println("\n\nArray Largest Element Printing\n============================\n");
//
//        System.out.println("Enter an array of elements(integers only)");
//        array.setElements("NUMBER");
//
//        System.out.println("Largest number is " + array.getLargest());
//
//        array.reset();
        /*
        END ARRAY 5
         */


        /*
        ARRAY 6: Print the smallest element
         */
        System.out.println("\n\nArray Smallest Element Printing\n============================\n");

        System.out.println("Enter an array of elements(integers only)");
        array.setElements("NUMBER");

        System.out.println("Smallest number is " + array.getSmallest());

        array.reset();
        /*
        END ARRAY 6
         */
    }
}

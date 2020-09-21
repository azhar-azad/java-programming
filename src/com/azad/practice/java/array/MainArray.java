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
//        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings.");
//
//        array.setElementArray();
//        array.setFreqArray();
//        array.showFrequencies();
//
//        array.reset();
        /*
        END ARRAY 1
         */


        /*
        ARRAY 2: Find the duplicates elements in array
         */
        System.out.println("\n\nArray elements duplicates finding Problem\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings.");

        array.setElementArray();
        array.setFreqArray();
        array.setDuplicatesArray();
        array.showDuplicates();

        array.reset();
        /*
        END ARRAY 2
         */
    }
}
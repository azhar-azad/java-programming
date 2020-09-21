package com.azad.practice.java.array;

public class MainArray {

    public static void main(String[] args) {

        System.out.println("MainArray");

        /*
        ARRAY 1: Find the frequency of all elements in array
         */
        System.out.println("\n\nArray elements frequency Problem\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings.");
        System.out.println("Stick to the data type i.e. all elements must be of same data type.");

        Array array = new Array();
        array.setElementArray();
        array.setFreqArray();
        array.showFrequencies();
        /*
        END ARRAY 1
         */
    }
}

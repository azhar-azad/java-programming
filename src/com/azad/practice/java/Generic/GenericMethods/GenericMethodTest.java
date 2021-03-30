package com.azad.practice.java.Generic.GenericMethods;

// Printing array elements using generic method printArray.
public class GenericMethodTest {

    public static void main(String[] args) {

        // create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };;

        System.out.printf("Array integerArray contains:\n");
        printArray(intArray); // pass an Integer array
        System.out.printf("\nArray doubleArray contains:\n");
        printArray(doubleArray); // pass an Double array
        System.out.printf("\nArray charArray contains:\n");
        printArray(charArray); // pass an Character array
    }

    // generic method printArray
    public static <T> void printArray(T[] inputArray) {

        // display array elements
        for (T element: inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }
}

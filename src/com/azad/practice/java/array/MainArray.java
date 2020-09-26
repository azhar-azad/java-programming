package com.azad.practice.java.array;

import com.azad.practice.java.Utility;
import com.azad.practice.java.array.arrayHelpers.Array;

public class MainArray {

    public static void main(String[] args) {

        Array array = new Array();

        /*
        ARRAY 1: Find the frequency of all elements in array
         */
        System.out.println("\n\nArray elements frequency Problem\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");

        array.setElements("ALL");
        array.setFrequencies();
        array.showFrequencies();

        array.reset();
        /*
        END ARRAY 1
         */


        /*
        ARRAY 2: Find the duplicate elements in array
         */
        System.out.println("\n\nArray elements duplicates finding Problem\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
        array.setElements("ALL");

        array.setFrequencies();
        array.setDuplicates();
        array.showDuplicates();

        array.reset();
        /*
        END ARRAY 2
         */


        /*
        ARRAY 3: Print the elements of the array
         */
        System.out.println("\n\nArray Elements Printing\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
        array.setElements("ALL");

        array.showElements();

        array.reset();
        /*
        END ARRAY 3
         */


        /*
        ARRAY 4: Print the elements of the array in reverse order
         */
        System.out.println("\n\nArray Elements Printing (reverse order)\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
        array.setElements("ALL");

        array.setElementsReversed();
        array.showElementsReversed();

        array.reset();
        /*
        END ARRAY 4
         */


        /*
        ARRAY 5: Print the largest element
         */
        System.out.println("\n\nArray Largest Element Printing\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
        array.setElements("ALL");

        System.out.println("Largest element is " + array.getLargest());

        array.reset();
        /*
        END ARRAY 5
         */


        /*
        ARRAY 6: Print the smallest element
         */
        System.out.println("\n\nArray Smallest Element Printing\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
        array.setElements("ALL");

        System.out.println("Smallest element is " + array.getSmallest());

        array.reset();
        /*
        END ARRAY 6
         */


        /*
        ARRAY 7: Print number of elements present in array
         */
        System.out.println("\n\nArray Number of Elements Count\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
        array.setElements("ALL");

        System.out.println("Number of elements present is " + array.getElementArrayLength());

        array.reset();
        /*
        END ARRAY 7
         */


        /*
        ARRAY 8: Print sum of all numbers present in array
         */
        System.out.println("\n\nSum of Array Numbers\n============================\n");

        System.out.println("Enter an array of elements(integers only)");
        array.setElements("NUMBER");

        System.out.println("Sum of all numbers is " + array.getSum());

        array.reset();
        /*
        END ARRAY 8
         */


        /*
        ARRAY 9: Sort the array in ascending order
         */
        System.out.println("\n\nArray Sorting (ascending)\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
        array.setElements("ALL");

        array.setElementsSorted("asc");
        array.showElementsSorted();

        array.reset();
        /*
        END ARRAY 9
         */


        /*
        ARRAY 10: Sort the array in descending order
         */
        System.out.println("\n\nArray Sorting (descending)\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
        array.setElements("ALL");

        array.setElementsSorted("desc");
        array.showElementsSorted();

        array.reset();
        /*
        END ARRAY 10
         */


        /*
        ARRAY 11: Find nth largest number in array
         */
        System.out.println("\n\nFind the n-th largest number in array\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
        array.setElements("ALL");
        array.setElementsSorted("desc");

        System.out.print("To find the n-th largest number, enter the value of n: ");
        int nthLargest = Utility.getIntegerInput("Not Allowed");
        System.out.println(nthLargest + "th Largest Element is: " + array.getElement(nthLargest));

        array.reset();
        /*
        END ARRAY 11
         */


        /*
        ARRAY 12: Find nth smallest number in array
         */
        System.out.println("\n\nFind the n-th smallest number in array\n============================\n");

        System.out.println("Enter an array of elements(integers/floating point numbers/characters/strings)");
        array.setElements("ALL");
        array.setElementsSorted("asc");

        System.out.print("To find the n-th smallest number, enter the value of n: ");
        int nthSmallest = Utility.getIntegerInput("Not Allowed");
        System.out.println(nthSmallest + "th Smallest Element is: " + array.getElement(nthSmallest));

        array.reset();
        /*
        END ARRAY 12
         */
    }
}

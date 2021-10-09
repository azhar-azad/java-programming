package com.azad.java.practice.dataStructureProblems;


import java.util.Arrays;

public class DSProblemsMain {

    public static void main(String[] args) {

        Integer[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        findPair(arr, target);
    }

    /**
     * Find a pair with the given sum in an array
     *  Input:
     *      arr = [8, 7, 2, 5, 3, 1]
     *      target = 10
     *  Output:
     *      Pair found (8, 2)
     *      or
     *      Pair found (7, 3)
     *
     *  Input:
     *      arr = [5, 2, 6, 8, 1, 9]
     *      target = 12
     *  Output:
     *      Pair not found
     * */
    private static void findPair(Integer[] arr, int target) {

        System.out.println("\nUsing brute force");
        StringBuilder outputByBruteForce = new StringBuilder();

        // consider each element except the last
        for (int i = 0; i < arr.length - 1; i++) {
            // start from the i'th element until the last element
            for (int j = i + 1; j < arr.length; j++) {
                // if the desired sum is found, append it to output with additional "or" and new line
                if (arr[i] + arr[j] == target) {
                    outputByBruteForce.append("Pair found (" + arr[i] + ", " + arr[j] + ") \nor\n");
                }
            }
        }

        if (outputByBruteForce.length() == 0) {
            // no pair is found
            System.out.println(outputByBruteForce.append("Pair not found").toString());
        }

        if (outputByBruteForce.lastIndexOf("or") == outputByBruteForce.length() - 3) {
            // replacing the last 'or\n' with nothing, to prevent it from printing
            outputByBruteForce.replace(outputByBruteForce.lastIndexOf("or"), outputByBruteForce.length() - 1, "");
        }

        // print the output
        System.out.println(outputByBruteForce.toString());


        System.out.println("\nUsing sorting");
        StringBuilder outputBySortingMethod = new StringBuilder();

        // sort the array in ascending order
        Arrays.sort(arr);

        // maintain two indices pointing to endpoints of the search space
        int low = 0;
        int high = arr.length - 1;

        // reduce the search space 'arr[low...high]' at each iteration of the loop.
        // loop till the search is exhausted
        while (low < high) {

            if (arr[low] + arr[high] == target) {
                // sum found
                outputBySortingMethod.append("Pair found (" + arr[low] + ", " + arr[high] + ") \nor\n");
            }

            // increment 'low' index if the total is less than the desired sum;
            // decrement 'high' index if the total is more than the desired sum
            if (arr[low] + arr[high] < target) {
                low++;
            }
            else {
                high--;
            }
        }

        if (outputBySortingMethod.length() == 0) {
            // no pair is found
            System.out.println(outputBySortingMethod.append("Pair not found").toString());
        }

        if (outputBySortingMethod.lastIndexOf("or") == outputBySortingMethod.length() - 3) {
            // replacing the last 'or\n' with nothing, to prevent it from printing
            outputBySortingMethod.replace(outputBySortingMethod.lastIndexOf("or"), outputBySortingMethod.length() - 1, "");
        }

        // print the output
        System.out.println(outputBySortingMethod.toString());
    }
}

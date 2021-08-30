package com.azad.java.practice.binarySearch;

import com.azad.java.learning.Array.arrayHelpers.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchDemo {

    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(1, 3, 6, 8, 9);
        int itemToSearch = 8;
        int searchItemIndex = binarySearch(items, itemToSearch);

        if (searchItemIndex == -1) {
            System.out.println(itemToSearch + " is not present in the array");
        }
        else {
            System.out.println(itemToSearch + " is occupying the index " + searchItemIndex);
        }
    }

    private static int binarySearch(List<Integer> items, int itemToSearch) {
        int length = items.size();
        int leftIndex = 0;
        int rightIndex = length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;

            if (items.get(midIndex) == itemToSearch)
                return midIndex;

            if (items.get(midIndex) < itemToSearch)
                leftIndex = midIndex + 1;
            else
                rightIndex = midIndex - 1;
        }

        return -1;
    }
}

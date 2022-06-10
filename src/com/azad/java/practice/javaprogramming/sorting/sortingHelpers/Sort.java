package com.azad.practice.javaprogramming.sorting.sortingHelpers;

import com.azad.practice.javaprogramming.Utility;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    private List<Integer> collection = new ArrayList<>();

    public Sort() {
    }

    public void init() {

        System.out.print("How many items: ");
        int itemCount = Utility.getIntegerInput("Error: Please enter integer");

        System.out.println("Enter the numbers: ");
        while (itemCount > 0) {
            int item = Utility.getIntegerInput("Not Allowed");
            collection.add(item);
            --itemCount;
        }
    }

    public void doBubbleSort() {

        for (int i = 0; i < collection.size() - 1; i++) {

            for (int j = 0; j < collection.size() - i - 1; j++) {

                int left = collection.get(j);
                int right = collection.get(j + 1);

                if (left > right) {
                    collection.set(j, right);
                    collection.set(j + 1, left);
                }
            }
        }

        printCollection();
    }

    private void printCollection() {
        for (int item: collection)
            System.out.print(item + " ");
    }
}

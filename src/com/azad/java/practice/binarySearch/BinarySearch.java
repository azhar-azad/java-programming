package com.azad.java.practice.binarySearch;

import java.util.List;

public class BinarySearch<T> implements Comparable<T> {

//    private List<T> items;
//    private T itemToSearch;

    public int binarySearch(List<T> items, T itemToSearch) {
//        int length = items.size();
//        int leftIndex = 0;
//        int rightIndex = length - 1;
//
//        while (leftIndex <= rightIndex) {
//            int midIndex = (leftIndex + rightIndex) / 2;
//
//            if (items.get(midIndex) == itemToSearch)
//                return midIndex;
//
//            T item = items.get(midIndex);
//            if (items.get(midIndex) < itemToSearch)
//                leftIndex = midIndex + 1;
//            else
//                rightIndex = midIndex - 1;
//        }

        return -1;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}

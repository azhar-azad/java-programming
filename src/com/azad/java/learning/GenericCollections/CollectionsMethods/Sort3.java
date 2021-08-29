package com.azad.java.learning.GenericCollections.CollectionsMethods;

import com.azad.java.learning.GenericCollections.CollectionsMethods.helperClasses.Time;
import com.azad.java.learning.GenericCollections.CollectionsMethods.helperClasses.TimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collections method sort with a custom Comparator object.
public class Sort3 {

    public static void main(String[] args) {

        List<Time> list = new ArrayList<>(); // create List

        list.add(new Time(6, 24, 34));
        list.add(new Time(18, 14, 58));
        list.add(new Time(6, 5, 34));
        list.add(new Time(12, 14, 58));
        list.add(new Time(6, 24, 22));

        // output List elements
        System.out.printf("Unsorted array elements:\n%s\n", list);

        // sort in order using a comparator
        Collections.sort(list, new TimeComparator());

        // output List elements
        System.out.printf("Sorted list elements:\n%s\n", list);
    }
}

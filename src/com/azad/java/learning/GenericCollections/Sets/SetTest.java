package com.azad.java.learning.GenericCollections.Sets;

import java.util.*;

// HashSet used to remove duplicate values from array of strings.
public class SetTest {

    public static void main(String[] args) {

        // create and display a List<String>
        String[] colors = { "red", "white", "blue", "green", "gray", "orange",
                            "tan", "white", "cyan", "peach", "gray", "orange" };
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s\n", list);

        // eliminate duplicates then print the unique values
        printNonDuplicates(list);
    }

    // crate a Set from a Collection to eliminate duplicates
    private static void printNonDuplicates(Collection<String> values) {

        // create a HashSet
        Set<String> set = new HashSet<>(values);

        System.out.printf("\nNonduplicates are: ");

        for (String value: set)
            System.out.printf("%s ", value);

        System.out.println();
    }
}

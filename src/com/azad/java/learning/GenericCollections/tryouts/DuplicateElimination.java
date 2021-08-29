package com.azad.java.learning.GenericCollections.tryouts;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a program that reads in a series of first names and eliminates
 * duplicates by storing them in a Set. Allow the user to search for a first name.
 * */
public class DuplicateElimination {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("Enter a series of first names: \n");
        System.out.printf("Press 0 to stop.\n");
        Set<String> firstNameSet = getSet();
        printSet(firstNameSet);
    }

    private static Set<String> getSet() {
        Set<String> firstNameSet = new HashSet<>();
        do {
            String firstName = scanner.next();
            if (firstName.equals("0"))
                break;
            else
                firstNameSet.add(firstName);
        } while (true);

        return firstNameSet;
    }

    private static void printSet(Collection<String> set) {
        for (String element: set) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}

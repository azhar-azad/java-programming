package com.azad.java.learning.FunctionalInterfaces;

import java.util.function.Consumer;

public class MainFunctionalInterfaces {

    public static void main(String[] args) {

        Consumer<String> consumer = (str) -> System.out.println(str.length() + " the value of str: " + str);
        consumer.accept("Azad");

        // Consumer with block statement
        Consumer<Integer> consumer2 = (number) -> {
            System.out.println("num * num = " + number * number);
        };
        consumer2.accept(10);

    }
}

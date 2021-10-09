package com.azad.java.learning.JavaCompleteRef.Jcr17StringHandling.ChangingCase;

// Demonstrate toUpperCase() and toLowerCase().
public class ChangeCase {

    public static void main(String[] args) {

        String s = "This is a test.";

        System.out.println("Original: " + s);

        String upper = s.toUpperCase();
        String lower = s.toLowerCase();

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}

/**
     Original: This is a test.
     Uppercase: THIS IS A TEST.
     Lowercase: this is a test.
 * */

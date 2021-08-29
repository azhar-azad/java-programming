package com.azad.java.learning.JavaCompleteRef.Jcr17StringHandling.StringComparison;

// Demonstrate equals() and equalsIgnoreCase().
public class equalsDemo {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";

        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3));
        System.out.println(s1 + " equals " + s4 + " -> " + s1.equals(s4));
        System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> " + s1.equals(s4));
    }
}

/**
     Hello equals Hello -> true
     Hello equals Good-bye -> false
     Hello equals HELLO -> false
     Hello equalsIgnoreCase HELLO -> false
 * */

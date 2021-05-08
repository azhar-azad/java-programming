package com.azad.practice.java.JavaCompleteRef.Jcr17StringHandling.StringComparison;

// equals() vs ==
public class EqualsNotEqualTo {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = new String(s1);

        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
    }
}

/**
     Hello equals Hello -> true
     Hello == Hello -> false

 NOTE:
    equals( ) method compares the characters inside a String object.
    The == operator compares two object references to see whether they refer to the same instance.
 * */
